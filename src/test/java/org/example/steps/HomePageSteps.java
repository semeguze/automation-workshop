package org.example.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.example.pages.HomePage;

public class HomePageSteps {

    private HomePage homePage;

    @Given("^I am on the Home page$")
    public void iAmOnTheHomePage() {
        homePage.open();
    }

}
