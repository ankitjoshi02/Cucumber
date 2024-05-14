Feature: Search product and order

  @regression @sanity
  Scenario: End to end Scenario
    Given user redirected to th login page
    When user enteres email as "ankit11@dsfds.com" and pssword as "Test@123"
    And click on sign in button
    And enter enteres item name as "pants" select pants as "pants for mens"
    And click on item
    And select size, color and qty
    And clicks on Add to cart
    And click on cart
    And click on Proceed to checkout button
    And user enteres the details state as "Florida" and country as "Togo" info
    And click on next button
    And user click on Place your Order button
    Then user should redirected to confirmation page
