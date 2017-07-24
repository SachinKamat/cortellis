package com.techmahindra.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by RY00485964 on 7/24/2017.
 */
public class QuickSearch extends PageObject {
    @Steps
    LoginPage loginpage;

    @FindBy(xpath = ".//*[@id='pageheader']//a[@title='Search' or @title='SEARCH']")
    WebElementFacade buttonSearch;

    @FindBy(id = "qs")
    WebElementFacade queryString;

    @FindBy(xpath = ".//*[@id='gt-content-inner-cortellis']//span[@class='navText']")
    WebElementFacade labelCurrentPageName;

    public boolean setSearchQuery(String searchQuery) throws Exception {
        try {
            queryString.setWindowFocus();
            queryString.click();
            queryString.clear();
            queryString.sendKeys(searchQuery);
            submit();
//            Wait<WebDriver> wait =new WebDriverWait(getDriver(), 120);
//            wait.until(ExpectedConditions.visibilityOf(labelCurrentPageName));
//            return labelCurrentPageName.getText().equalsIgnoreCase("Search Results");
            return true;
      }catch (Exception e){
            return false;
        }
    }

    public void submit(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        buttonSearch.click();
        try {
            TimeUnit.SECONDS.sleep(15);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
