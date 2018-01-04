@version:RT#32
@Feature_Navigation
  Feature: Navigation

    @Smoke_Navigation_001 @issue:THEC-1 @issue:THEC-6
    Scenario: Verify filters of 'Deals' datset
      Given I open the application
      When I perform Login operation by entering "sachin.kamat" and "Cortellis@2017"
      Given I perform Quick Search by "paracetamol"
      And I navigate to report type "Deals" on page 'Results'
      And dataset "Deals" is selected on page 'Results'
      And I click on button 'Home' on page header
      Then I verify Home Page is displayed
      Then I logged out from the application

    @Smoke_Navigation_002 @issue:THEC-2 @issue:THEC-5
    Scenario: Verify filters of 'Drugs' datset
      Given I open the application
      When I perform Login operation by entering "RegressionFullUser1" and "Test@123"
      Given I perform Quick Search by "paracetamol"
      And I navigate to report type "Drugs" on page 'Results'
      And dataset "Drugs" is selected on page 'Results'
      And I click on button 'Home' on page header
      Then I verify Home Page is displayed
      Then I logged out from the application