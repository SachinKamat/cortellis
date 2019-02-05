package com.techmahindra.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.techmahindra.pages.User.userdata;

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

    public void loginUser(String UserName,String Password) throws InterruptedException {
        getDriver().manage().window().maximize();
        login(UserName,Password);
        int counter=0;
        String currentURL = getDriver().getCurrentUrl().toLowerCase();
        while ((currentURL.contains("kickout")  && counter < 4)){
            homePage.open();
            Thread.sleep(2000);
            login(UserName,Password);
            currentURL = getDriver().getCurrentUrl().toLowerCase();
            counter++;
        }
        userdata=userdata+1;
    }

    public boolean userIsPresent() {
        return verifyUser.isCurrentlyVisible();
    }

    public void logoutUser() throws InterruptedException {
        System.out.println("Logged Out from the application");
        Actions actions = new Actions(getDriver());
        actions.moveToElement(getDriver().findElement(By.xpath("//*[@id='profileButton']"))).build().perform();
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", getDriver().findElement(org.openqa.selenium.By.xpath(".//*[contains(@class,'ng-binding') and contains(text(),'Sign out')]")));
        Thread.sleep(1000);
    }

    public void login(String Name,String Pwd) throws InterruptedException {
        System.out.println("Entering the Username ");
        UserName.sendKeys(Name);
        System.out.println("Entering the Password ");
        Password.sendKeys(Pwd);
        System.out.println("CLicking on the submit button ");
        SubmitBtn.click();
        Thread.sleep(2000);
    }
}
