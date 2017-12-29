package com.techmahindra.StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import com.techmahindra.pages.HomePage;
import com.techmahindra.pages.LoginPage;
import com.techmahindra.pages.User;

import java.io.FileInputStream;
import java.util.Properties;

import static com.techmahindra.pages.User.userdata;

/**
 * Created by SK00447696 on 2/14/2017.
 */
public class LoginSteps {

    @Steps
    LoginPage loginpage;
    @Steps
    HomePage homepage;
    @Steps
    User user;


    @Then("^Login performed successfully$")
    public void loginPerformedSuccessfully() throws Throwable {
        Thread.sleep(1000);
       if(!loginpage.userIsPresent()){
           System.out.println("User Verification Failure");
           Assert.assertEquals(true,false);
       }else{
           System.out.println("Verified the user Successfully");
       }
    }

    @Given("^I open the application$")
    public void iOpenTheApplication() throws Throwable {
        user.opens_home_page();
    }

    @When("^I perform Login operation by entering username and password$")
    public void iPerformLoginOperationByEnteringUsernameAndPassword() throws Throwable {
        String usernameKey=userdata+"Username";
        String passwordKey=userdata+"Password";
        Properties prop=new Properties();
        prop.load(new FileInputStream("Credentials.properties"));
        String userName = (String)prop.get(usernameKey);
        String passWord= (String)prop.get(passwordKey);
        System.out.println("UserName "+usernameKey+" Password "+passwordKey);
        loginpage.loginUser(userName,passWord);
    }

    @Then("^I logged out from the application$")
    public void iLoggedOutFromTheApplication() throws Throwable {
        Thread.sleep(1000);
       loginpage.logoutUser();
    }
    @And("^I click on button 'Home' on page header$")
    public void iClickOnButtonHomeOnPageHeader() throws Throwable {
        homepage.clickButtonHome();
    }

    @Then("^I verify Home Page is displayed$")
    public void iVerifyHomePageIsDisplayed() throws Throwable {
        homepage.isHomePageDisplayed();
    }
}
