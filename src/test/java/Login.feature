#Feature: The is a feature
#
#  Scenario: Scenario 1
#    When User enter credentials
#      | username   | password |
#      | testuser_1 | Test@123 |
#      | testuser_2 | Test@456 |
#
#    Scenario Outline: Scenario 2
#      Given Print "<param>"
#
#      Examples:
#      |param|
#      |this |
#      |that |
#
#      Scenario: Test Context
#        When Put 'Something' in context key 'Thing'
#        Then Context key 'Thing' has value 'Something'
Feature: Login Feature
#  Background:
#    Given I’m on the Rami-Levy site
  Scenario: Login Success
    Given I have navigated to Rami Levi
    And On Rami Levi home page - I click login
    When On login popup - I login with user 'fesalsadi@gmail.com' and password '123456789'
    Then On Rami Levi home page - 'faisal'

  Scenario: Failed Login
    Given I have navigated to Rami Levi
    And On Rami Levi home page - I click login
    When On login popup - I login with user 'fesalsadi@gmail.com' and password '123'
    Then I am still at login popup

  Scenario: Api Login
    Given I have navigated to Rami Levi
    And I login with user 'fesalsadi@gmail.com' and password '123456789' using Api
    Then On Rami Levi home page - 'faisal'




