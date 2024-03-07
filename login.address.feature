Feature: Login and create new address

  Scenario: Login
    Given I open the browser
    And   I go to mystore website
    And   I click the sign in button
    When  I type "king252@wp.pl" as email
    And   I enter the password "qwerty"
    And   I click sign in button
    And   I click Addresses button
    And   I click + Create new address button
    When  I type "<alias>" as alias and "<address>" as address and "<city>" as city and "<zip_code>" as zip_code and "<country>" as country and "<phone>" as phone
    Then  I click save button
    Examples:
      | alias | address         | city      | zip_code | country           | phone       | expectedResult      |
      | Home  | 123 Main Street | Liverpool | 12345    | Uited Kingdom     | 555-123-456 | I click save button |






















