Feature: Validate Cart
  Scenario Outline: verify cart
    Given User opens website
    Then verify user is on home page
    And user scroll to quick grocery picks
    When user click on view all of quick grocery picks
    Then verify user is on view all page of quick grocery
    When user clicks add to cart button of first product
    Then verify added to cart message is displayed
    And verify the cart icon quantity is "<quantity>"
    When user click on cart link icon
    Then  verify user is on cart page
    And verify the cart quantity
    Examples:
    |quantity|
    |    1    |
    |    2     |
    |     3   |