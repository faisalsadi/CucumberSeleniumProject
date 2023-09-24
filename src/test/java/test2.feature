Feature: Cart
#  Background:
#    Given I’m on the Rami-Levy site
  Scenario: Add item to cart
    Given I have navigated to Rami Levi
    And On Rami Levi home page - I click login
    When On login popup - I login with user 'fesalsadi@gmail.com' and password '123456789'
    When I click on add item 'שוקו טרה בבקבוק'
    Then Item "שוקו מועשר בבקבוק 1 ליטר" is in the cart
