Feature: Account

  In order to ...
  As a ....
  I want ....

  @Smoke
  Scenario: Navigate to the Log In Page
    Given I am on the Home page
    When I click on the sign in button
    Then I see the Authorization page


  Scenario Outline: Log In
    Given I am on the Authentication page of the Next Experience website
    And I enter <username> in the username
    And I enter <password> in the password
    When I press the login button
    Then I should be taken to the Profile page
    And I should see the "Sign Out" button in the top right corner

    Examples:
      | username                     | password   |
      | "sebastest@email.com"        | "password" |
      | "un_correo_112233@gmail.com" | "passw123" |