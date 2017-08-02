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
        , glue = {"com.techmahindra"}, tags = "@Smoke_Drugs_001")
public class Runner{}

