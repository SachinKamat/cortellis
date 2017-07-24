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

    @FindBy(xpath = "//*[@id='topNav']/div[2][contains(text(),'auto.full5')]")
    WebElementFacade verifyUser;

    @FindBy(xpath=".//*[@title='Logout']")
    WebElement LogOut;

    public void loginUser() throws InterruptedException {
        getDriver().manage().window().maximize();
        System.out.println("Entering the Username ");
        UserName.sendKeys("auto.full5");
        System.out.println("Entering the Password ");
        Password.sendKeys("Testing@123");
        System.out.println("CLicking on the submit button ");
        SubmitBtn.click();
        Thread.sleep(2000);
    }

    public boolean userIsPresent() {
        return verifyUser.isCurrentlyVisible();
    }

    public void logoutUser() throws InterruptedException {
        System.out.println("Logged Out from the application");
        LogOut.click();
        Thread.sleep(1000);
    }
}
