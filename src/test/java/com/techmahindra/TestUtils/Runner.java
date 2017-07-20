package com.techmahindra.TestUtils;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;


/**
 * Created by SK00447696 on 2/14/2017.
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(format = {"pretty","html:target/cucumber-htmlreport","junit:target/cucumber-junit-report/cuc.xml"},features={"src/test/resources/features/"}
        , glue = {"com.techmahindra"})
public class Runner{}

//@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(format = {"pretty","html:target/cucumber-htmlreport","junit:target/cucumber-junit-report/cuc.xml"},
//        glue = {"com.techmahindra"}, features = {"src/test/resources/features/"}, tags = {"@Feature_LS31004_CDI_Orphan_and_Fast_drug_advance_search"})
//public class Runner{}

