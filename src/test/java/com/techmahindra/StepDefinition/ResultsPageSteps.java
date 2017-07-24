package com.techmahindra.StepDefinition;

import com.techmahindra.pages.ResultsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

/**
 * Created by RY00485964 on 7/24/2017.
 */
public class ResultsPageSteps {

    @Steps
    ResultsPage resultsPage;

    @And("^I navigate to report type \"([^\"]*)\" on page 'Results'$")
    public void iNavigateToReportTypeOnPageResults(String dataset) throws Throwable {
        boolean actual=false;
        if (dataset != null)
            actual=resultsPage.selectDataset(dataset);
        System.out.println("actual-->"+actual);
    }

    @And("^I click on button 'List view' on page 'Results'$")
    public void iClickOnButtonListViewOnPageResults() throws Throwable {
        resultsPage.clickViewList();
    }

    @And("^dataset \"([^\"]*)\" is selected on page 'Results'$")
    public void datasetIsSelectedOnPageResults(String dataset) throws Throwable {
        String actual = resultsPage.getSelectedDatasetName();
        boolean result = actual.equals(dataset);
        System.out.println("actual-->"+result);
    }

    @Then("^the filters group \"([^\"]*)\" should be displayed in the Filters Panel on the Search Results page$")
    public void theFiltersGroupShouldBeDisplayedInTheFiltersPanelOnTheSearchResultsPage(String filterGroup) throws Throwable {
        boolean actual=resultsPage.isFilterGroupDisplayed(filterGroup);
        System.out.println("actual-->"+actual);
    }

    @And("^I click on button 'List view' on page 'Results' and check for the data$")
    public void iClickOnButtonListViewOnPageResultsAndCheckForTheData() throws Throwable {

    }
}
