Feature: Searching

  @Example
  Scenario Outline: Search a product
    Given I am on the Home page
    When I search for the product <product>
    Then The results page is displayed
    And The results contains the element <productName>

    Examples:
      | product | productName |
      | Dresses | Dress       |
