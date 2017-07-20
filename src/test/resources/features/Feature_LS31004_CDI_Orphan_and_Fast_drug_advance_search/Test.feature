@issue:LS-31642
Feature: Test operation
  Scenario: Test Operation
    Given I open the application
    When I perform Login operation by entering username and password
    Then Login performed successfully
    Then I logged out from the application