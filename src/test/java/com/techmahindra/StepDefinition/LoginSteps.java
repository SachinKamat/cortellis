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
        loginpage.loginUser();
    }

    @Then("^I logged out from the application$")
    public void iLoggedOutFromTheApplication() throws Throwable {
        Thread.sleep(1000);
       loginpage.logoutUser();
    }

    @Given("^I logged in as a \"([^\"]*)\" user with access to \"([^\"]*)\" project$")
    public void iLoggedInAsAUserWithAccessToProject(String arg0, String arg1) throws Throwable {

    }

    @And("^I click on link 'Advanced Search' on panel 'Quick Search'$")
    public void iClickOnLinkAdvancedSearchOnPanelQuickSearch() throws Throwable {

    }

    @And("^'Advanced Search' is displayed as home page$")
    public void advancedSearchIsDisplayedAsHomePage() throws Throwable {

    }

    @Then("^I click on tab \"([^\"]*)\" on page 'Advanced Search'$")
    public void iClickOnTabOnPageAdvancedSearch(String arg0) throws Throwable {

    }

    @And("^I select option \"([^\"]*)\" in drop-down 'Select' in row (\\d+) on page 'Advanced Search'$")
    public void iSelectOptionInDropDownSelectInRowOnPageAdvancedSearch(String arg0, int arg1) throws Throwable {

    }

    @And("^I verify that the checkbox 'Link to Agreement Type' is present on page 'Advanced Search'$")
    public void iVerifyThatTheCheckboxLinkToAgreementTypeIsPresentOnPageAdvancedSearch() throws Throwable {

    }

    @And("^I verify that the checkbox 'Link to Agreement Type' is not present on page 'Advanced Search'$")
    public void iVerifyThatTheCheckboxLinkToAgreementTypeIsNotPresentOnPageAdvancedSearch() throws Throwable {

    }

    @And("^I verify that the text \"([^\"]*)\" is present on page 'Advanced Search'$")
    public void iVerifyThatTheTextIsPresentOnPageAdvancedSearch(String arg0) throws Throwable {

    }

    @And("^I verify that the checkbox 'Link to Agreement Type' is not active on page 'Advanced Search'$")
    public void iVerifyThatTheCheckboxLinkToAgreementTypeIsNotActiveOnPageAdvancedSearch() throws Throwable {

    }

    @And("^I click on button \"([^\"]*)\" 'List' in row (\\d+) on page 'Advanced Search'$")
    public void iClickOnButtonListInRowOnPageAdvancedSearch(String arg0, int arg1) throws Throwable {

    }

    @Then("^Advanced Search \"([^\"]*)\" popup should appear$")
    public void advancedSearchPopupShouldAppear(String arg0) throws Throwable {

    }

    @And("^I enter text \"([^\"]*)\" in input box on panel 'Advanced Search' pop-up$")
    public void iEnterTextInInputBoxOnPanelAdvancedSearchPopUp(String arg0) throws Throwable {

    }

    @Then("^I click on button 'Look up' on pop-up 'Advanced Search'$")
    public void iClickOnButtonLookUpOnPopUpAdvancedSearch() throws Throwable {

    }

    @And("^I select \"([^\"]*)\" from 'Select from those listed below' box on pop-up 'Advanced Search'$")
    public void iSelectFromSelectFromThoseListedBelowBoxOnPopUpAdvancedSearch(String arg0) throws Throwable {

    }

    @And("^I click on button 'Apply' on pop-up 'Advanced Search'$")
    public void iClickOnButtonApplyOnPopUpAdvancedSearch() throws Throwable {

    }

    @And("^I click on button 'Search' on page 'Advanced Search'$")
    public void iClickOnButtonSearchOnPageAdvancedSearch() throws Throwable {

    }

    @Then("^Only report type \"([^\"]*)\" is available on 'Results' page$")
    public void onlyReportTypeIsAvailableOnResultsPage(String arg0) throws Throwable {

    }

    @And("^I memorize the value from column \"([^\"]*)\" from the results page$")
    public void iMemorizeTheValueFromColumnFromTheResultsPage(String arg0) throws Throwable {

    }

    @And("^I verify that the results displayed have the 'Transaction type' value \"([^\"]*)\" with no linked agreement type$")
    public void iVerifyThatTheResultsDisplayedHaveTheTransactionTypeValueWithNoLinkedAgreementType(String arg0) throws Throwable {

    }

    @And("^I memorize the values from column 'Agreement Type' and 'Deal Transaction Type' from the results page$")
    public void iMemorizeTheValuesFromColumnAgreementTypeAndDealTransactionTypeFromTheResultsPage() throws Throwable {

    }

    @Then("^I verify that the results displayed contains Transaction Type\"([^\"]*)\" and external Agreement Type value \"([^\"]*)\"$")
    public void iVerifyThatTheResultsDisplayedContainsTransactionTypeAndExternalAgreementTypeValue(String arg0, String arg1) throws Throwable {

    }

    @And("^I verify that the results displayed contains Transaction Type\"([^\"]*)\" or linked Agreement Type value \"([^\"]*)\"$")
    public void iVerifyThatTheResultsDisplayedContainsTransactionTypeOrLinkedAgreementTypeValue(String arg0, String arg1) throws Throwable {

    }

    @And("^I verify that the results displayed contains Transaction SubType \"([^\"]*)\" or linked Agreement Type value to the Transaction sub type value selected$")
    public void iVerifyThatTheResultsDisplayedContainsTransactionSubTypeOrLinkedAgreementTypeValueToTheTransactionSubTypeValueSelected(String arg0) throws Throwable {

    }

    @And("^I verify that the results displayed contains Transaction Type\"([^\"]*)\" and Agreement Type value \"([^\"]*)\" or the agreement type value \"([^\"]*)\"$")
    public void iVerifyThatTheResultsDisplayedContainsTransactionTypeAndAgreementTypeValueOrTheAgreementTypeValue(String arg0, String arg1, String arg2) throws Throwable {

    }

    @Then("^the filters group \"([^\"]*)\" should be displayed in the Filters Panel on the Search Results page$")
    public void theFiltersGroupShouldBeDisplayedInTheFiltersPanelOnTheSearchResultsPage(String arg0) throws Throwable {

    }

    @And("^I click 'Show all filters' link under the filters menu 'Agreement Type' on the Search Results page$")
    public void iClickShowAllFiltersLinkUnderTheFiltersMenuAgreementTypeOnTheSearchResultsPage() throws Throwable {

    }

    @And("^I verify that the following 'Agreement Type' filter names are displayed in 'Show all filters' pop up$")
    public void iVerifyThatTheFollowingAgreementTypeFilterNamesAreDisplayedInShowAllFiltersPopUp() throws Throwable {

    }

    @And("^I click 'Cancel' on pop-up 'Show all filters'$")
    public void iClickCancelOnPopUpShowAllFilters() throws Throwable {

    }

    @Then("^I verify that the results displayed contains Transaction Type\"([^\"]*)\" and external Agreement Type value \"([^\"]*)\" or Linked Agreement type values \"([^\"]*)\" or \"([^\"]*)\"$")
    public void iVerifyThatTheResultsDisplayedContainsTransactionTypeAndExternalAgreementTypeValueOrLinkedAgreementTypeValuesOr(String arg0, String arg1, String arg2, String arg3) throws Throwable {

    }

    @Then("^I check the filter option \"([^\"]*)\" on pop-up 'Show all filters'$")
    public void iCheckTheFilterOptionOnPopUpShowAllFilters(String arg0) throws Throwable {

    }

    @And("^I click on 'Apply' button in filters pop-up$")
    public void iClickOnApplyButtonInFiltersPopUp() throws Throwable {

    }

    @And("^Then I verify that the results displayed contains Transaction Type \"([^\"]*)\" or \"([^\"]*)\" or \"([^\"]*)\" and external agreement Type value \"([^\"]*)\"$")
    public void thenIVerifyThatTheResultsDisplayedContainsTransactionTypeOrOrAndExternalAgreementTypeValue(String arg0, String arg1, String arg2, String arg3) throws Throwable {

    }

    @And("^I verify that the checkbox 'Link to Agreement Type' is active on page 'Advanced Search'$")
    public void iVerifyThatTheCheckboxLinkToAgreementTypeIsActiveOnPageAdvancedSearch() throws Throwable {

    }

    @And("^I verify that the checkbox 'Link to Agreement Type' is 'Selected' by default on page 'Advanced Search'$")
    public void iVerifyThatTheCheckboxLinkToAgreementTypeIsSelectedByDefaultOnPageAdvancedSearch() throws Throwable {

    }

    @And("^I click on 'X' mark on 'Deal Transaction Type' input box$")
    public void iClickOnXMarkOnDealTransactionTypeInputBox() throws Throwable {

    }

    @And("^I verify that \"([^\"]*)\" option is available in the 'Select' drop down on Advanced Search page$")
    public void iVerifyThatOptionIsAvailableInTheSelectDropDownOnAdvancedSearchPage(String arg0) throws Throwable {

    }

    @And("^I verify that \"([^\"]*)\" option is not available in the 'Select' drop down on Advanced Search page$")
    public void iVerifyThatOptionIsNotAvailableInTheSelectDropDownOnAdvancedSearchPage(String arg0) throws Throwable {

    }

    @And("^I verify that \"([^\"]*)\" option is after \"([^\"]*)\" option in the 'Select' drop down on Advanced Search page$")
    public void iVerifyThatOptionIsAfterOptionInTheSelectDropDownOnAdvancedSearchPage(String arg0, String arg1) throws Throwable {

    }

    @And("^I verify that \"([^\"]*)\" is separated from \"([^\"]*)\" by a delimiter \"([^\"]*)\"$")
    public void iVerifyThatIsSeparatedFromByADelimiter(String arg0, String arg1, String arg2) throws Throwable {

    }

    @And("^I verify the following fields are available on Advanced Search page under 'Drug Regulatory Designation':$")
    public void iVerifyTheFollowingFieldsAreAvailableOnAdvancedSearchPageUnderDrugRegulatoryDesignation() throws Throwable {

    }

    @And("^I verify 'Select box' is present in \"([^\"]*)\" field of Deals Advanced search$")
    public void iVerifySelectBoxIsPresentInFieldOfDealsAdvancedSearch(String arg0) throws Throwable {

    }

    @And("^I check 'select box' is unchecked by default in \"([^\"]*)\" field of Deals Advanced search$")
    public void iCheckSelectBoxIsUncheckedByDefaultInFieldOfDealsAdvancedSearch(String arg0) throws Throwable {

    }

    @And("^I click on 'selection box' in \"([^\"]*)\" of Deals Advanced search$")
    public void iClickOnSelectionBoxInOfDealsAdvancedSearch(String arg0) throws Throwable {

    }

    @And("^I verify that the drug name is appended with 'regulatory status' values 'Orphan or Fast track'$")
    public void iVerifyThatTheDrugNameIsAppendedWithRegulatoryStatusValuesOrphanOrFastTrack() throws Throwable {

    }

    @Then("^I verify that the drug name is appended with \"([^\"]*)\" on 'Deal Results' page$")
    public void iVerifyThatTheDrugNameIsAppendedWithOnDealResultsPage(String arg0) throws Throwable {

    }
}
