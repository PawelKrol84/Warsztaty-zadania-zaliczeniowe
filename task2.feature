Feature: Buy test

  Scenario: shopping in mystore website
    Given I am logged in mystore page
    And   I go to the clothes page
    And   I choose Hummingbird Printed Sweater
    And   I choose size M
    And   I choose five pieces
    When  I click add to cart button
    And   I click proceed to checkout button
    And   I click proceed to checkout button two
    And   I click continue button
    And   I click continue button two
    Then  I click the options Pay by Check
    And   I click I agree to the terms of service and will adhere to them unconditionally.
    And   I click place order button











