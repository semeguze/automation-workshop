package org.example.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pages.SearchResultsPage;

public class SearchResultsPageSteps {

    private SearchResultsPage searchResultsPage;

    @Then("^The results page is displayed$")
    public void theResultsPageIsDisplayed() {
        searchResultsPage.validateSearchPerformed();
    }

    @And("^The results contains the element ([^\"]*)$")
    public void theFirstResultElementContainsTheProductName(String product) {
        searchResultsPage.validateProductExists(product);
    }
}
