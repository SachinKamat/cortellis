package com.techmahindra.pages;


import jxl.common.Assert;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * Created by RY00485964 on 7/24/2017.
 */
public class ResultsPage extends PageObject {

    private static final String XPATH_TEMPLATE_REPOT_TYPE_BY_NAME = ".//*[@id='searchResultTypes']//a[contains(text(), '%s')]";

    private static final String XPATH_RESULTS_VIEW_TEMPLATE =
            "//*[@class='switchResultView']/*[normalize-space()='List']";

    @FindBy(xpath = ".//*[@id='searchResultTypes']/li[contains(@class, 'sel')]/a")
    WebElementFacade selectedReportType;

    private final String REFINE_BLOCK_XPATH_TEMPLATE = ".//*[@class='filterPnl']//span[contains(text(),'%s')]/../..";

    public boolean selectDataset(String reportType) throws Exception {
        boolean flag = false;
        try {
            if (reportType.toLowerCase().equals("pipeline compare")) {
                getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_REPOT_TYPE_BY_NAME, reportType)));
                waitUntilResultsAreLoaded();
                flag = true;
            } else {
                getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_REPOT_TYPE_BY_NAME, reportType)));
                waitUntilResultsAreLoaded();
                flag = true;
            }
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

    private boolean isLoading() {
        WebElement element = null;
        String cssLocator = "img[src *= 'loading.gif'], .pageLoader, .filterLoader>img";
        String script = "return $('" + cssLocator.replaceAll("'", "\"").replaceAll(":eq(0)", "") + "').first()[0];";
        element = (WebElement) ((JavascriptExecutor) getDriver()).executeScript(script.replaceAll("\r\n", ""));
        if (element == null)
            return false;
        else
            return true;
    }

    public void waitUntilResultsAreLoaded() throws Exception {
        int intTimeForException = 20;
        while (isLoading() && intTimeForException != 0) {
            --intTimeForException;
            Thread.sleep(1000);
        }
    }

    public void clickViewList() throws Exception{
        getDriver().findElement(By.xpath(".//a[@title='List View']")).click();
        waitUntilResultsAreLoaded();
    }

    public String getSelectedDatasetName() throws InterruptedException {
        Thread.sleep(8000);
       // ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", selectedReportType);
        return selectedReportType.getText().replaceAll("\\s+\\(\\d+\\)$", "");
    }

    public boolean isFilterGroupDisplayed(String name) throws Exception{
        WebElement filterSection = getDriver().findElement(By.xpath(String.format(REFINE_BLOCK_XPATH_TEMPLATE, name)));
       // ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", filterSection);
        Actions action=new Actions(getDriver());
        action.keyDown(Keys.ARROW_DOWN);
        Thread.sleep(4000);
        return getDriver().findElement(By.xpath(String.format(REFINE_BLOCK_XPATH_TEMPLATE, name))).isDisplayed();
    }

//    public boolean checkDataOfListView()
//    {
//        boolean flag=false;
//        try {
//            if (TableViewLink != null) {
//                TableViewLink.click();
//                WebDriverUtils.waitForElementLoading(10);
//                flag = !resultSetLinks.isEmpty();
//            }
//        }catch (Exception e){
//            grsReport.addSubStep(flag,"Issue in Table View "+e.getMessage(),!flag);
//        }

}
