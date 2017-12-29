package com.techmahindra.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by SK00447696 on 2/15/2017.
 */
public class User extends ScenarioSteps {
    HomePage homePage;
    public static int userdata=1;

    @Step
    public void opens_home_page() {
        homePage.open();
    }

}
