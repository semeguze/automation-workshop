package org.example.steps.baseSteps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pages.AuthPage;
import org.example.pages.base.BasePage;

public class BasePageSteps {

    private BasePage basePage;
    private AuthPage authPage;

    @Before(value = "@Logged", order = 1)
    public void logInBeforeStart() {
        System.out.println("---------------- HOLI ---------------");
        authPage.open();
        authPage.enterUsernameCredential("sebas");
        authPage.enterPasswordCredential("mesa");
    }

    @Given("^I am on any page$")
    public void iAmOnAnyPage() {
        basePage.open();
    }

    @When("^I click on the sign in button$")
    public void i_click_on_the_sign_in_button() {
        basePage.clickOnTheSignInButton();
    }

    @Then("^I should see the \"([^\"]*)\" button in the top right corner$")
    public void iShouldSeeInTheTopRightCorner(String expectedText) {
        basePage.validateSignOutButton();
    }

}
