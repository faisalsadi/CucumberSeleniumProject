Feature: Search
  Scenario: Search item
    Given I have navigated to Rami Levi
    When I login with user 'fesalsadi@gmail.com' and password '123456789' using Api
    When On Search field - I search for 'אסם'
    Then I am in 'אסם' search page