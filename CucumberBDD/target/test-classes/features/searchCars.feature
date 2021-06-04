@Search-Cars
Feature: To verify working of search cars page
  I want to use this template for my feature file

  @search-cars-positive
  Scenario: Verify search cars page
    Given User is at home page "https://www.carsguide.com.au/" of cars guide website
    When user move to menu
      | Menu        |
      | buy + sell  |
      | Search Cars |
    And click on "Search Cars" link
    And select "BMW" from anyMake dropdown
    And select "1 Series" from Any Model dropdown
    And select "NSW - Sydney" from Location dropdown
    And select "$10,000" from Price(Max) dropdown
    And click on Find_my_next_car button
    Then search results should be displayed
    And page title should be "Bmw 1 Series Under 10000 for Sale Sydney NSW | carsguide"
