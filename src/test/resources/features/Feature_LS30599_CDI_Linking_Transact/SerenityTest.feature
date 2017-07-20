@issue:LS-31642
Feature: Login operation
  Scenario: Login Operation
    Given I open the application
    When I perform Login operation by entering username and password
    Then Login performed successfully
    Then I logged out from the application

  Scenario: Login Operation second
    Given I open the application
    When I perform Login operation by entering username and password
    Then Login performed successfully
    Then I logged out from the application