Feature: LogOut Feature
  Background:
    Given I have navigated to Rami Levi
    And On Rami Levi home page - I click login
    When On login popup - I login with user 'fesalsadi@gmail.com' and password '123456789'
  Scenario: LogOut
#    Given I have navigated to Rami Levi
#    And I login with user 'fesalsadi@gmail.com' and password '123456789' using Api
    When On Main Page sign out from account
    Then On Rami Levi home page - 'התחברות'