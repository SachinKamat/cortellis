package com.techmahindra.StepDefinition;

import com.techmahindra.pages.LoginPage;
import com.techmahindra.pages.QuickSearch;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

/**
 * Created by RY00485964 on 7/24/2017.
 */
public class QuickSearchSteps {

    @Steps
    QuickSearch quickSearch;

    @Given("^I perform Quick Search by \"([^\"]*)\"$")
    public void iPerformQuickSearchBy(String string) throws Throwable {
        //Thread.sleep(3000);
        boolean actual=quickSearch.setSearchQuery(string);
        System.out.println("actual-->"+actual);
    }
}
