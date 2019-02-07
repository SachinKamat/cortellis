Feature:Smoke

@Smoke_verify_search_001 @issue:COR-1
    Scenario: Verify Search operation
      Given I open the application
      When  I perform Login operation by entering username and password
      Given I perform Quick Search by "paracetamol"
      And   I navigate to report type "Drugs" on page 'Results'
