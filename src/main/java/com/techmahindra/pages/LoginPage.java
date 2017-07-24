package com.techmahindra.pages;

import com.gargoylesoftware.htmlunit.html.DomElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

/**
 * Created by SK00447696 on 2/14/2017.
 */
public class LoginPage extends PageObject{
    @FindBy(xpath = "//*[@id='username']")
    WebElementFacade UserName;

    @FindBy(xpath="//*[@id='password']")
    WebElementFacade Password;

    @FindBy(xpath="//*[@name='submit']")
    WebElementFacade SubmitBtn;

    @FindBy(xpath = "//*[@id='topNav']/div[2][contains(text(),'RegressionFullUser')]")
    WebElementFacade verifyUser;

    @FindBy(xpath=".//*[@title='Logout']")
    WebElement LogOut;

    HomePage homePage;

    public void loginUser() throws InterruptedException {
        getDriver().manage().window().maximize();
        login();
        int counter=0;
        String currentURL = getDriver().getCurrentUrl().toLowerCase();
        while ((currentURL.contains("kickout")  && counter < 4)){
            homePage.open();
            Thread.sleep(2000);
            login();
            currentURL = getDriver().getCurrentUrl().toLowerCase();
            counter++;
        }
    }

    public boolean userIsPresent() {
        return verifyUser.isCurrentlyVisible();
    }

    public void logoutUser() throws InterruptedException {
        System.out.println("Logged Out from the application");
        LogOut.click();
        Thread.sleep(1000);
    }

    public void login() throws InterruptedException {
        System.out.println("Entering the Username ");
        UserName.sendKeys("RegressionFullUser3");
        System.out.println("Entering the Password ");
        Password.sendKeys("Test@123");
        System.out.println("CLicking on the submit button ");
        SubmitBtn.click();
        Thread.sleep(2000);
    }
}
