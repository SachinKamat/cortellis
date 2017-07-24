package com.techmahindra.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * Created by SK00447696 on 2/14/2017.
 */
@DefaultUrl("https://stable.cortellis.int.clarivate.com")
public class HomePage extends PageObject{

    @FindBy(css = "a.primarynav__home")
    WebElementFacade buttonHome;

    @FindBy(xpath = ".//span[1][@class='navText' and contains(text(),'Home')]")
    WebElementFacade homePage;

    public void clickButtonHome() throws InterruptedException {
        {
            buttonHome.click();
            // WebDriverUtils.waitForElementLoading(5);
            Thread.sleep(3000);
        }
    }

    public boolean isHomePageDisplayed() {
        if (!homePage.isDisplayed()) {
            return true;
        }
        else return false;
    }
}
