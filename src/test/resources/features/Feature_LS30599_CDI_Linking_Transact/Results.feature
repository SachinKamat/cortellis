@Feature_Smoke
Feature:Deals

  @Smoke_Deal_001
  Scenario: Verify results of 'Deals' dataset
    Given I open the application
    When I perform Login operation by entering username and password
    And I perform Quick Search by "paracetamol"
    And I navigate to report type "Deals" on page 'Results'
    And dataset "Deals" is selected on page 'Results'
    And I click on button 'List view' on page 'Results'
    Then I logged out from the application

  @Smoke_Drugs_001
  Scenario: Verify results of 'Drugs' dataset
    Given I open the application
    When I perform Login operation by entering username and password
    And I perform Quick Search by "paracetamol"
    And I navigate to report type "Drugs" on page 'Results'
    And dataset "Drugs" is selected on page 'Results'
    And I click on button 'List view' on page 'Results'
    Then I logged out from the application





