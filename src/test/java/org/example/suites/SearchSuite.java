package org.example.suites;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/search.feature", plugin = {"pretty"}, tags = {"@Example"})
public class SearchSuite {
}
