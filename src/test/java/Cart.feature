Feature: Cart
#  Background:
#    Given I’m on the Rami-Levy site
  Scenario: Add item to cart
    Given I have navigated to Rami Levi
    And I login with user 'fesalsadi@gmail.com' and password '123456789' using Api
    When I click on add item 'שוקו טרה בבקבוק'
    Then Item "שוקו מועשר בבקבוק 1 ליטר" is in the cart

  Scenario: Remove item from cart
    Given I have navigated to Rami Levi
    And I login with user 'fesalsadi@gmail.com' and password '123456789' using Api
    And I click on add item before remove 'שוקו טרה בבקבוק'
    When I click on remove item 'הפחת 1 יחידות משוקו טרה בבקבוק מסל הקניות'
    Then Item "שוקו מועשר בבקבוק 1 ליטר כמות 1 יחידות סך הכל לתשלום 10.90 שקלים" is not in the cart

  Scenario: Add item to cart Api
    Given I have navigated to Rami Levi
    And On Rami Levi home page - I click login
    When On login popup - I login with user 'fesalsadi@gmail.com' and password '123456789'
    When I add '1' item of 'שוקו טרה בבקבוק' using api
    Then Item "שוקו מועשר בבקבוק 1 ליטר" is in the cart

  Scenario: Empty cart Api
    Given I have navigated to Rami Levi
    And On Rami Levi home page - I click login
    When On login popup - I login with user 'fesalsadi@gmail.com' and password '123456789'
    When I add '1' item of 'שוקו טרה בבקבוק' using api
    When I  empty cart using Api
    Then Item "שוקו מועשר בבקבוק 1 ליטר כמות 1 יחידות סך הכל לתשלום 10.90 שקלים" is not in the cart
