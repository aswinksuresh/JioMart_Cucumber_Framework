Feature: Validate High to Low sort on Price
  Scenario: verify High to Low sort on Price
    Given User opens website
    Then verify user is on home page
    When user search by keyword
    Then verify search results are displayed
    When user set the sort from high to low
    Then verify current option is changed