package com.ericsson.ei.rules;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/functionaltests/resources/features/rulesHandler.feature", glue = {
        "com.ericsson.ei.rules" }, plugin = { "pretty", "html:target/cucumber-reports/TestRulesHandlerRunner" })
public class RulesHandlerTestRunner {

}