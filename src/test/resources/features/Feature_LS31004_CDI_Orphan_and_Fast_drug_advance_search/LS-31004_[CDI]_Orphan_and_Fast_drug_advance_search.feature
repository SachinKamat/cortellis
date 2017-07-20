@Rampart @Feature_LS-31004_[CDI]_Orphan_and_Fast_drug_advance_search
Feature: This story covers for the addition of a new drop down field ( and two sub fields ) to Deal's advance search


  @Acceptance @issue:LS-31004_001 @specific_user
  Scenario: A new drop down field is added and labeled as : Drug Regulatory Designations
        Given I logged in as a "DealsExtended" user with access to "Rampart" project
        And I click on link 'Advanced Search' on panel 'Quick Search'
        And 'Advanced Search' is displayed as home page
        Then I click on tab "Deals" on page 'Advanced Search'
        And I verify that "Drug Regulatory Designations" option is available in the 'Select' drop down on Advanced Search page



  @Acceptance @issue:LS-31004_002 @specific_user
  Scenario: A new drop down field is added and labeled as : Drug Regulatory Designations - not available for basic user
        Given I logged in as a "BasicUser" user with access to "Rampart" project
        And I click on link 'Advanced Search' on panel 'Quick Search'
        And 'Advanced Search' is displayed as home page
        Then I click on tab "Deals" on page 'Advanced Search'
        And I verify that "Drug Regulatory Designations" option is not available in the 'Select' drop down on Advanced Search page
    

  @Acceptance @issue:LS-31004_003 @specific_user
  Scenario: The field is added after 'Drug Phase' ( with ---- line as it has two sub fields inside)
        Given I logged in as a "DealsExtended" user with access to "Rampart" project
        And I click on link 'Advanced Search' on panel 'Quick Search'
        And 'Advanced Search' is displayed as home page
        Then I click on tab "Deals" on page 'Advanced Search'
        And I verify that "Drug Regulatory Designations" option is available in the 'Select' drop down on Advanced Search page
        And I verify that "Drug Regulatory Designations" option is after "Drug Phase" option in the 'Select' drop down on Advanced Search page
        And I verify that "Drug Regulatory Designations" is separated from "Drug Phase" by a delimiter "----"


  @Acceptance @issue:LS-31004_004 @specific_user
  Scenario: Selecting the new fields opens up a area with two new Boolean fields :Deal has Orphan Status,Deal has FAST Track status
        Given I logged in as a "DealsExtended" user with access to "Rampart" project
        And I click on link 'Advanced Search' on panel 'Quick Search'
        And 'Advanced Search' is displayed as home page
        Then I click on tab "Deals" on page 'Advanced Search'
        And I verify that "Drug Regulatory Designations" option is available in the 'Select' drop down on Advanced Search page
        And I select option "Drug Regulatory Designations" in drop-down 'Select' in row 1 on page 'Advanced Search'
        And I verify the following fields are available on Advanced Search page under 'Drug Regulatory Designation':
          |Deal has Orphan Status|
          |Deal has FAST Track status|


  @Acceptance @issue:LS-31004_005 @specific_user
  Scenario: These sub fields are tick box selection fields
        Given I logged in as a "DealsExtended" user with access to "Rampart" project
        And I click on link 'Advanced Search' on panel 'Quick Search'
        And 'Advanced Search' is displayed as home page
        Then I click on tab "Deals" on page 'Advanced Search'
        And I verify that "Drug Regulatory Designations" option is available in the 'Select' drop down on Advanced Search page
        And I select option "Drug Regulatory Designations" in drop-down 'Select' in row 1 on page 'Advanced Search'
        And I verify the following fields are available on Advanced Search page under 'Drug Regulatory Designation':
          |Deal has Orphan Status|
          |Deal has FAST Track status|
        And I verify 'Select box' is present in "Orphan Status" field of Deals Advanced search
        And I verify 'Select box' is present in "FAST Track status" field of Deals Advanced search


  @Acceptance @issue:LS-31004_006 @specific_user
  Scenario: The default mode for the selection box is un-ticked
        Given I logged in as a "DealsExtended" user with access to "Rampart" project
        And I click on link 'Advanced Search' on panel 'Quick Search'
        And 'Advanced Search' is displayed as home page
        Then I click on tab "Deals" on page 'Advanced Search'
        And I verify that "Drug Regulatory Designations" option is available in the 'Select' drop down on Advanced Search page
        And I select option "Drug Regulatory Designations" in drop-down 'Select' in row 1 on page 'Advanced Search'
        And I check 'select box' is unchecked by default in "Orphan Status" field of Deals Advanced search
        And I check 'select box' is unchecked by default in "FAST Track status" field of Deals Advanced search



  @Acceptance @issue:LS-31004_007 @specific_user
    Scenario: Verify on results on result page when both the Regulatory designation check box is selected
        Given I logged in as a "DealsExtended" user with access to "Rampart" project
        And I click on link 'Advanced Search' on panel 'Quick Search'
        And 'Advanced Search' is displayed as home page
        Then I click on tab "Deals" on page 'Advanced Search'
        And I verify that "Drug Regulatory Designations" option is available in the 'Select' drop down on Advanced Search page
        And I select option "Drug Regulatory Designations" in drop-down 'Select' in row 1 on page 'Advanced Search'
        And I verify the following fields are available on Advanced Search page under 'Drug Regulatory Designation':
          |Deal has Orphan Status|
          |Deal has FAST Track status|
        And I verify 'Select box' is present in "Orphan Status" field of Deals Advanced search
        And I verify 'Select box' is present in "FAST Track status" field of Deals Advanced search
        And I click on 'selection box' in "Orphan Status" of Deals Advanced search
        And I click on 'selection box' in "FAST Track status" of Deals Advanced search
        And I click on button 'Search' on page 'Advanced Search'
        Then Only report type "Deals" is available on 'Results' page
        And I memorize the value from column "Drugs" from the results page
        And I verify that the drug name is appended with 'regulatory status' values 'Orphan or Fast track'


  @Acceptance @issue:LS-31004_008 @specific_user
  Scenario Outline: Verify on results on result page when both any one Regulatory designation check box is selected
    Given I logged in as a "DealsExtended" user with access to "Rampart" project
    And I click on link 'Advanced Search' on panel 'Quick Search'
    And 'Advanced Search' is displayed as home page
    Then I click on tab "Deals" on page 'Advanced Search'
    And I verify that "Drug Regulatory Designations" option is available in the 'Select' drop down on Advanced Search page
    And I select option "Drug Regulatory Designations" in drop-down 'Select' in row 1 on page 'Advanced Search'
    And I verify the following fields are available on Advanced Search page under 'Drug Regulatory Designation':
      |Deal has Orphan Status|
      |Deal has FAST Track status|
    And I verify 'Select box' is present in "<regulatoryDesignationInput>" field of Deals Advanced search
    And I click on 'selection box' in "<regulatoryDesignationInput>" of Deals Advanced search
    And I click on button 'Search' on page 'Advanced Search'
    Then Only report type "Deals" is available on 'Results' page
    And I memorize the value from column "Drugs" from the results page
    Then I verify that the drug name is appended with "<regulatoryDesignationInput>" on 'Deal Results' page

    Examples:
    |regulatoryDesignationInput|
    |Orphan Status|
    |Fast Track Status|
