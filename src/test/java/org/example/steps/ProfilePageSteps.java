package org.example.steps;

import cucumber.api.java.en.Then;
import org.example.pages.ProfilePage;

public class ProfilePageSteps {

    private ProfilePage profilePage;

    @Then("^I should be taken to the Profile page$")
    public void i_should_be_taken_to_the_Home_page() {
        profilePage.checkProfilePage();
    }

}
