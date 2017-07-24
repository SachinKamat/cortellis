@Feature_Navigation
  Feature: Navigation

    @Smoke_Navigation_001
    Scenario: Verify filters of 'Deals' datset
      Given I open the application
      When I perform Login operation by entering username and password
      Given I perform Quick Search by "paracetamol"
      And I navigate to report type "Deals" on page 'Results'
      And dataset "Deals" is selected on page 'Results'
      And I click on button 'Home' on page header
      Then I verify Home Page is displayed
      Then I logged out from the application

    @Smoke_Navigation_002
    Scenario: Verify filters of 'Drugs' datset
      Given I open the application
      When I perform Login operation by entering username and password
      Given I perform Quick Search by "paracetamol"
      And I navigate to report type "Drugs" on page 'Results'
      And dataset "Drugs" is selected on page 'Results'
      And I click on button 'Home' on page header
      Then I verify Home Page is displayed
      Then I logged out from the application