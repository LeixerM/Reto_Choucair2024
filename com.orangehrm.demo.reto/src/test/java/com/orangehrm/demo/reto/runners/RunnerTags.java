package com.orangehrm.demo.reto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
        tags = "@test",
        glue = "com.orangehrm.demo.reto.stepdefinitions",
        snippets = SnippetType.CAMELCASE)


public class RunnerTags {

}
