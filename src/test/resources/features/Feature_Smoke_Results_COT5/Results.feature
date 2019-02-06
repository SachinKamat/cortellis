
@version:RT#32
@Feature_Smoke
Feature:Smoke

  @Smoke_Deal_001 @Acceptance @issue:THEC-3 @issue:THEC-8 @test
  Scenario: Verify results of 'Deals' dataset
    Given I open the application
    When  I perform Login operation by entering "FullUserShockwave" and "Test@123"
    And   I perform Quick Search by "paracetamol"
    And   I navigate to report type "Deals" on page 'Results'
    And   dataset "Deals" is selected on page 'Results'
    And   I click on button 'List view' on page 'Results'
    Then  I logged out from the application

  @Smoke_Drugs_001 @Acceptance @issue:THEC-4 @issue:THEC-7
  Scenario: Verify results of 'Drugs' dataset
    Given I open the application
    When  I perform Login operation by entering "FullUserShockwave" and "Test@123"
    And   I perform Quick Search by "paracetamol"
    And   I navigate to report type "Drugs" on page 'Results'
    And   dataset "Drugs" is selected on page 'Results'
    And   I click on button 'List view' on page 'Results'
    Then  I logged out from the application





