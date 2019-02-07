package com.techmahindra.TestUtils;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(format = {"pretty","html:target/cucumber-htmlreport","junit:target/cucumber-junit-report/cuc.xml"},features={"src/test/resources/features/"}
        , glue = {"com.techmahindra"},tags = {"@Smoke_verify_search_001"})
public class Runner{}

