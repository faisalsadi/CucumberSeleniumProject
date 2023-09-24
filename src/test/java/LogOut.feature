Feature: LogOut Feature
#  Background:
#    Given I’m on the Rami-Levy site
  Scenario: LogOut
    Given I have navigated to Rami Levi
    And On Rami Levi home page - I click login
    When On login popup - I login with user 'fesalsadi@gmail.com' and password '123456789'
    When On Main Page sign out from account
    Then On Rami Levi home page - 'התחברות'