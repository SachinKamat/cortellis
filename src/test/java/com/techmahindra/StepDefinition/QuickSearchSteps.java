package com.techmahindra.StepDefinition;

import com.techmahindra.pages.QuickSearch;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;


public class QuickSearchSteps {

    @Steps
    QuickSearch quickSearch;

    @Given("^I perform Quick Search by \"([^\"]*)\"$")
    public void iPerformQuickSearchBy(String string) throws Throwable {
        Thread.sleep(3000);
        boolean actual=quickSearch.setSearchQuery(string);
        System.out.println("actual-->"+actual);
    }
}
