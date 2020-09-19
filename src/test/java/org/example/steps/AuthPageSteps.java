package org.example.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pages.AuthPage;
import org.example.steps.baseSteps.BasePageSteps;

public class AuthPageSteps {

    private AuthPage authPage;

    @Given("^I am on the Authentication page of the Next Experience website$")
    public void iAmOnTheAuthenticationPageOfTheNextExperienceWebsite() {
        authPage.open();
    }

    @Given("^I enter \"([^\"]*)\" in the username$")
    public void iEnterInTheUsername(String username) {
        authPage.enterUsernameCredential(username);
    }

    @Given("^I enter \"([^\"]*)\" in the password$")
    public void iEnterInThePassword(String password) {
        authPage.enterPasswordCredential(password);
    }

    @When("^I press the login button$")
    public void iPressTheLoginButton() {
        authPage.checkLoginData();
        authPage.performTheSignInAction();
    }

    @Then("^I see the Authorization page$")
    public void iSeeTheAuthorizationPage() {
        authPage.checkAuthPage();
    }

}
