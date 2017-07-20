@Rampart @Feature_LS-30599_[CDI]_Linking_Transact_on_type_to_Agreement_type_searching_in_advance_search
Feature: The proposed solution links transaction types to agreement types, allowing migrated users to select more familiar Transaction type terms,
  and then system to auto-select the corresponding ( based on a map) agreement types and use in search.



  @Acceptance @issue:LS-30599_001 @specific_user
  Scenario: Under 'Deal Type' area, below Transaction Type, a new line with a selection box appears( Design is similar to 'Link to highest status' under drug tab, Current development status field)
    Given I logged in as a "DealsExtended" user with access to "Rampart" project
    And I click on link 'Advanced Search' on panel 'Quick Search'
    And 'Advanced Search' is displayed as home page
    Then I click on tab "Deals" on page 'Advanced Search'
    And I select option "Deal Type" in drop-down 'Select' in row 1 on page 'Advanced Search'
    And I verify that the checkbox 'Link to Agreement Type' is present on page 'Advanced Search'


  @Acceptance @issue:LS-30599_002 @specific_user
  Scenario: Link to Agreement Type checkbox is absent for basic user
    Given I logged in as a "BasicUser" user with access to "Rampart" project
    And I click on link 'Advanced Search' on panel 'Quick Search'
    And 'Advanced Search' is displayed as home page
    Then I click on tab "Deals" on page 'Advanced Search'
    And I select option "Deal Type" in drop-down 'Select' in row 1 on page 'Advanced Search'
    And I verify that the checkbox 'Link to Agreement Type' is not present on page 'Advanced Search'


  @Acceptance @issue:LS-30599_003 @specific_user
  Scenario: The new line reads as : Link to Agreement Type
    Given I logged in as a "DealsExtended" user with access to "Rampart" project
    And I click on link 'Advanced Search' on panel 'Quick Search'
    And 'Advanced Search' is displayed as home page
    Then I click on tab "Deals" on page 'Advanced Search'
    And I select option "Deal Type" in drop-down 'Select' in row 1 on page 'Advanced Search'
    And I verify that the checkbox 'Link to Agreement Type' is present on page 'Advanced Search'
    And I verify that the text "Link to Agreement Type" is present on page 'Advanced Search'

  @Acceptance @issue:LS-30599_004 @specific_user
  Scenario: Selection box appears to the right of the line with default mode always as deselected ( on first visit or reloading the page)
    Given I logged in as a "DealsExtended" user with access to "Rampart" project
    And I click on link 'Advanced Search' on panel 'Quick Search'
    And 'Advanced Search' is displayed as home page
    Then I click on tab "Deals" on page 'Advanced Search'
    And I select option "Deal Type" in drop-down 'Select' in row 1 on page 'Advanced Search'
    And I verify that the checkbox 'Link to Agreement Type' is present on page 'Advanced Search'
    And I verify that the checkbox 'Link to Agreement Type' is not active on page 'Advanced Search'


  @Acceptance @issue:LS-30599_005 @specific_user
  Scenario Outline: to verify the results after search (select a transaction type id with no linked agreement types and check for the transaction type values)
    Given I logged in as a "DealsExtended" user with access to "Rampart" project
    And I click on link 'Advanced Search' on panel 'Quick Search'
    And 'Advanced Search' is displayed as home page
    Then I click on tab "Deals" on page 'Advanced Search'
    And I select option "Deal Type" in drop-down 'Select' in row 1 on page 'Advanced Search'
    And I verify that the checkbox 'Link to Agreement Type' is present on page 'Advanced Search'
    And I click on button "Deal Transaction Type" 'List' in row 1 on page 'Advanced Search'
    Then Advanced Search "Deal Transaction Type" popup should appear
    And I enter text "<transactiontypeValue>" in input box on panel 'Advanced Search' pop-up
    Then I click on button 'Look up' on pop-up 'Advanced Search'
    And I select "<transactiontypeValue>" from 'Select from those listed below' box on pop-up 'Advanced Search'
    And I click on button 'Apply' on pop-up 'Advanced Search'
    And I click on button 'Search' on page 'Advanced Search'
    Then Only report type "Deals" is available on 'Results' page
    And I memorize the value from column "Deal Transaction Type" from the results page
    And I verify that the results displayed have the 'Transaction type' value "<transactiontypeValue>" with no linked agreement type

    Examples:
      |transactiontypeValue|
      |Co-Promotion Only|


  @Acceptance @issue:LS-30599_006 @specific_user
  Scenario Outline: to verify the results after search (Select a transaction type id with no linked agreement types and another agreement type and check for the transaction type and agreement type values)
      #transaction type id with no linked agreement types and another agreement type : TR= N AND AG=C
    Given I logged in as a "DealsExtended" user with access to "Rampart" project
    And I click on link 'Advanced Search' on panel 'Quick Search'
    And 'Advanced Search' is displayed as home page
    Then I click on tab "Deals" on page 'Advanced Search'
    And I select option "Deal Type" in drop-down 'Select' in row 1 on page 'Advanced Search'
    And I verify that the checkbox 'Link to Agreement Type' is present on page 'Advanced Search'
    And I click on button "Deal Transaction Type" 'List' in row 1 on page 'Advanced Search'
    Then Advanced Search "Deal Transaction Type" popup should appear
    And I enter text "<transactiontypeValue>" in input box on panel 'Advanced Search' pop-up
    Then I click on button 'Look up' on pop-up 'Advanced Search'
    And I select "<transactiontypeValue>" from 'Select from those listed below' box on pop-up 'Advanced Search'
    And I click on button 'Apply' on pop-up 'Advanced Search'
    And I click on button "Agreement Type" 'List' in row 1 on page 'Advanced Search'
    Then Advanced Search "Agreement Type" popup should appear
    And I select "<agreementtypevalue>" from 'Select from those listed below' box on pop-up 'Advanced Search'
    And I click on button 'Apply' on pop-up 'Advanced Search'
    And I click on button 'Search' on page 'Advanced Search'
    Then Only report type "Deals" is available on 'Results' page
    And I memorize the values from column 'Agreement Type' and 'Deal Transaction Type' from the results page
    Then I verify that the results displayed contains Transaction Type"<transactiontypeValue>" and external Agreement Type value "<agreementtypevalue>"


    Examples:
      |transactiontypeValue|agreementtypevalue|
      |Royalty Buyout|Drug - Funding|

  @Acceptance @issue:LS-30599_007 @specific_user
  Scenario Outline: to verify the results after search (select a transaction type id with linked agreement types and check for the transaction type and agreement type values)
      #// transaction type id with linked agreement type : TR= A OR AG=B
    Given I logged in as a "DealsExtended" user with access to "Rampart" project
    And I click on link 'Advanced Search' on panel 'Quick Search'
    And 'Advanced Search' is displayed as home page
    Then I click on tab "Deals" on page 'Advanced Search'
    And I select option "Deal Type" in drop-down 'Select' in row 1 on page 'Advanced Search'
    And I verify that the checkbox 'Link to Agreement Type' is present on page 'Advanced Search'
    And I click on button "Deal Transaction Type" 'List' in row 1 on page 'Advanced Search'
    Then Advanced Search "Deal Transaction Type" popup should appear
    And I enter text "<transactiontypeValue>" in input box on panel 'Advanced Search' pop-up
    Then I click on button 'Look up' on pop-up 'Advanced Search'
#      And I click on 'Look-Up List' tab on pop-up 'Advanced Search'
#      Then I verify that "<transactiontypeValue>" data is present in 'Look-up List' tab
    And I select "<transactiontypeValue>" from 'Select from those listed below' box on pop-up 'Advanced Search'
    And I click on button 'Apply' on pop-up 'Advanced Search'
    And I click on button 'Search' on page 'Advanced Search'
    Then Only report type "Deals" is available on 'Results' page
    And I memorize the values from column 'Agreement Type' and 'Deal Transaction Type' from the results page
    And I verify that the results displayed contains Transaction Type"<transactiontypeValue>" or linked Agreement Type value "<linkedAgreementType>"

    Examples:
      |transactiontypeValue|linkedAgreementType|
      |Grant|Drug - Funding|


  @Acceptance @issue:LS-30599_008 @specific_user
  Scenario Outline: to verify the results after search (Select a transaction sub-type id with linked agreement types and check for the transaction type and agreement type values)
    Given I logged in as a "DealsExtended" user with access to "Rampart" project
    And I click on link 'Advanced Search' on panel 'Quick Search'
    And 'Advanced Search' is displayed as home page
    Then I click on tab "Deals" on page 'Advanced Search'
    And I select option "Deal Type" in drop-down 'Select' in row 1 on page 'Advanced Search'
    And I verify that the checkbox 'Link to Agreement Type' is present on page 'Advanced Search'
    And I click on button "Deal Transaction Type" 'List' in row 1 on page 'Advanced Search'
    Then Advanced Search "Deal Transaction Type" popup should appear
    And I enter text "<transactionsubtypeValue>" in input box on panel 'Advanced Search' pop-up
    Then I click on button 'Look up' on pop-up 'Advanced Search'
    And I select "<transactionsubtypeValue>" from 'Select from those listed below' box on pop-up 'Advanced Search'
    And I click on button 'Apply' on pop-up 'Advanced Search'
    And I click on button 'Search' on page 'Advanced Search'
    Then Only report type "Deals" is available on 'Results' page
    And I memorize the values from column 'Agreement Type' and 'Deal Transaction Type' from the results page
    And I verify that the results displayed contains Transaction SubType "<transactionsubtypeValue>" or linked Agreement Type value to the Transaction sub type value selected


    Examples:
      |transactionsubtypeValue|
      |Basic License (Licensee takes over)|


  @Acceptance @issue:LS-30599_009 @specific_user
  Scenario Outline: to verify the results after search (Select a transaction type id with linked agreement types along with another agreement type id and check for the transaction and agreement type values)
 #   // if transaction A is linked to Agreement type B and external agreement type C is selected , then result should be (TR= A AND AG=C) OR AG= B
    Given I logged in as a "DealsExtended" user with access to "Rampart" project
    And I click on link 'Advanced Search' on panel 'Quick Search'
    And 'Advanced Search' is displayed as home page
    Then I click on tab "Deals" on page 'Advanced Search'
    And I select option "Deal Type" in drop-down 'Select' in row 1 on page 'Advanced Search'
    And I verify that the checkbox 'Link to Agreement Type' is present on page 'Advanced Search'
    And I click on button "Deal Transaction Type" 'List' in row 1 on page 'Advanced Search'
    Then Advanced Search "Deal Transaction Type" popup should appear
    And I enter text "<transactiontypeValue>" in input box on panel 'Advanced Search' pop-up
    Then I click on button 'Look up' on pop-up 'Advanced Search'
    And I select "<transactiontypeValue>" from 'Select from those listed below' box on pop-up 'Advanced Search'
    And I click on button 'Apply' on pop-up 'Advanced Search'
    And I click on button "Agreement Type" 'List' in row 1 on page 'Advanced Search'
    Then Advanced Search "Agreement Type" popup should appear
    And I select "<agreementtypevalue>" from 'Select from those listed below' box on pop-up 'Advanced Search'
    And I click on button 'Apply' on pop-up 'Advanced Search'
    And I click on button 'Search' on page 'Advanced Search'
    Then Only report type "Deals" is available on 'Results' page
    And I memorize the values from column 'Agreement Type' and 'Deal Transaction Type' from the results page
    And I verify that the results displayed contains Transaction Type"<transactiontypeValue>" and Agreement Type value "Drug - Funding" or the agreement type value "<agreementtypevalue>"
    Then the filters group "Agreement Type" should be displayed in the Filters Panel on the Search Results page
    And I click 'Show all filters' link under the filters menu 'Agreement Type' on the Search Results page
    And I verify that the following 'Agreement Type' filter names are displayed in 'Show all filters' pop up
      |<linkedAgreementType>|
      |<agreementtypevalue>|
    And I click 'Cancel' on pop-up 'Show all filters'

    Examples:
      |transactiontypeValue|agreementtypevalue|linkedAgreementType|
      |Grant|Drug - CRADA|Drug - Funding|
      |Grant|Technology - Other Proprietary|Drug - Funding|


  @Acceptance @issue:LS-30599_010 @specific_user
  Scenario Outline: to verify the results after search (Select a transaction type id with 2 linked agreement types and another agreement type and check for the transaction type and agreement type values)
    #transaction type id with 2 linked agreement types and another agreement type : (TR= D AND AG=C) OR AG= F OR AG=H
    Given I logged in as a "DealsExtended" user with access to "Rampart" project
    And I click on link 'Advanced Search' on panel 'Quick Search'
    And 'Advanced Search' is displayed as home page
    Then I click on tab "Deals" on page 'Advanced Search'
    And I select option "Deal Type" in drop-down 'Select' in row 1 on page 'Advanced Search'
    And I verify that the checkbox 'Link to Agreement Type' is present on page 'Advanced Search'
    And I click on button "Deal Transaction Type" 'List' in row 1 on page 'Advanced Search'
    Then Advanced Search "Deal Transaction Type" popup should appear
    And I enter text "<transactiontypeValue>" in input box on panel 'Advanced Search' pop-up
    Then I click on button 'Look up' on pop-up 'Advanced Search'
    And I select "<transactiontypeValue>" from 'Select from those listed below' box on pop-up 'Advanced Search'
    And I click on button 'Apply' on pop-up 'Advanced Search'
    And I click on button "Agreement Type" 'List' in row 1 on page 'Advanced Search'
    Then Advanced Search "Agreement Type" popup should appear
    And I select "<agreementtypevalue>" from 'Select from those listed below' box on pop-up 'Advanced Search'
    And I click on button 'Apply' on pop-up 'Advanced Search'
    And I click on button 'Search' on page 'Advanced Search'
    Then Only report type "Deals" is available on 'Results' page
    And I memorize the values from column 'Agreement Type' and 'Deal Transaction Type' from the results page
    Then I verify that the results displayed contains Transaction Type"<transactiontypeValue>" and external Agreement Type value "<agreementtypevalue>" or Linked Agreement type values "<LinkedAgreementValue1>" or "<LinkedAgreementValue2>"
    Then the filters group "Agreement Type" should be displayed in the Filters Panel on the Search Results page
    And I click 'Show all filters' link under the filters menu 'Agreement Type' on the Search Results page
    And I verify that the following 'Agreement Type' filter names are displayed in 'Show all filters' pop up
      |<agreementtypevalue>|
      |<LinkedAgreementValue1>|
      |<LinkedAgreementValue2>|
    And I click 'Cancel' on pop-up 'Show all filters'

    Examples:
      |transactiontypeValue|agreementtypevalue|LinkedAgreementValue1|LinkedAgreementValue2|
      |Distribution|Patent - Non-Exclusive Rights|Drug - Commercialization License|Drug - Manufacturing/Supply|


  @Acceptance @issue:LS-30599_011 @specific_user
  Scenario Outline: to verify the results after search (Select multiple transaction type ids with linked agreement types and check for the transaction and agreement type values)
      # // If multiple transaction types and external agreement type is selected : ((TR=A OR TR=D OR TR=N) AND AG=C)) OR AG=B OR AG= F OR AG= H
    Given I logged in as a "DealsExtended" user with access to "Rampart" project
    And I click on link 'Advanced Search' on panel 'Quick Search'
    And 'Advanced Search' is displayed as home page
    Then I click on tab "Deals" on page 'Advanced Search'
    And I select option "Deal Type" in drop-down 'Select' in row 1 on page 'Advanced Search'
    And I verify that the checkbox 'Link to Agreement Type' is present on page 'Advanced Search'
    And I click on button "Deal Transaction Type" 'List' in row 1 on page 'Advanced Search'
    Then Advanced Search "Deal Transaction Type" popup should appear
    And I enter text "<transactiontypeValue1>" in input box on panel 'Advanced Search' pop-up
    Then I click on button 'Look up' on pop-up 'Advanced Search'
    And I select "<transactiontypeValue1>" from 'Select from those listed below' box on pop-up 'Advanced Search'
    And I enter text "<transactiontypeValue2>" in input box on panel 'Advanced Search' pop-up
    Then I click on button 'Look up' on pop-up 'Advanced Search'
    And I select "<transactiontypeValue2>" from 'Select from those listed below' box on pop-up 'Advanced Search'
    And I enter text "<transactiontypeValue3>" in input box on panel 'Advanced Search' pop-up
    Then I click on button 'Look up' on pop-up 'Advanced Search'
    And I select "<transactiontypeValue3>" from 'Select from those listed below' box on pop-up 'Advanced Search'
    And I click on button 'Apply' on pop-up 'Advanced Search'
    And I click on button "Agreement Type" 'List' in row 1 on page 'Advanced Search'
    Then Advanced Search "Agreement Type" popup should appear
    And I select "<externalAgreementType>" from 'Select from those listed below' box on pop-up 'Advanced Search'
    And I click on button 'Apply' on pop-up 'Advanced Search'
    And I click on button 'Search' on page 'Advanced Search'
    Then Only report type "Deals" is available on 'Results' page
    Then the filters group "Agreement Type" should be displayed in the Filters Panel on the Search Results page
    And I click 'Show all filters' link under the filters menu 'Agreement Type' on the Search Results page
    And I verify that the following 'Agreement Type' filter names are displayed in 'Show all filters' pop up
      |<externalAgreementType>|
      |<linkedAgreementType1>|
      |<linkedAgreementType2>|
      |<linkedAgreementType3>|
    Then I check the filter option "<externalAgreementType>" on pop-up 'Show all filters'
    And I click on 'Apply' button in filters pop-up
    And I memorize the values from column 'Agreement Type' and 'Deal Transaction Type' from the results page
    And Then I verify that the results displayed contains Transaction Type "<transactiontypeValue1>" or "<transactiontypeValue2>" or "<transactiontypeValue3>" and external agreement Type value "<externalAgreementType>"


    Examples:
      |transactiontypeValue1|transactiontypeValue2|transactiontypeValue3|externalAgreementType|linkedAgreementType1|linkedAgreementType2|linkedAgreementType3|
      |Grant|Supply Only|Joint Venture|Drug - CRADA|Drug - Funding|Drug - Manufacturing/Supply|Company - Joint Venture|

  @Acceptance @issue:LS-30599_012 @specific_user
  Scenario Outline: The Line and the selection box is in-active( in grey mode) if no Transaction types are selected
    Given I logged in as a "DealsExtended" user with access to "Rampart" project
    And I click on link 'Advanced Search' on panel 'Quick Search'
    And 'Advanced Search' is displayed as home page
    Then I click on tab "Deals" on page 'Advanced Search'
    And I select option "Deal Type" in drop-down 'Select' in row 1 on page 'Advanced Search'
    And I verify that the checkbox 'Link to Agreement Type' is present on page 'Advanced Search'
    And I verify that the checkbox 'Link to Agreement Type' is not active on page 'Advanced Search'
    And I click on button "Deal Transaction Type" 'List' in row 1 on page 'Advanced Search'
    Then Advanced Search "Deal Transaction Type" popup should appear
    And I enter text "<transactiontypeValue>" in input box on panel 'Advanced Search' pop-up
    Then I click on button 'Look up' on pop-up 'Advanced Search'
    And I select "<transactiontypeValue>" from 'Select from those listed below' box on pop-up 'Advanced Search'
    And I click on button 'Apply' on pop-up 'Advanced Search'
    And I verify that the checkbox 'Link to Agreement Type' is active on page 'Advanced Search'

    Examples:
      |transactiontypeValue|
      |Authorized Generic  |



  @Acceptance @issue:LS-30599_013 @specific_user
  Scenario Outline: When all transaction types are removed( deleted), the line also becomes in active
    Given I logged in as a "DealsExtended" user with access to "Rampart" project
    And I click on link 'Advanced Search' on panel 'Quick Search'
    And 'Advanced Search' is displayed as home page
    Then I click on tab "Deals" on page 'Advanced Search'
    And I select option "Deal Type" in drop-down 'Select' in row 1 on page 'Advanced Search'
    And I verify that the checkbox 'Link to Agreement Type' is present on page 'Advanced Search'
    And I verify that the checkbox 'Link to Agreement Type' is not active on page 'Advanced Search'
    And I click on button "Deal Transaction Type" 'List' in row 1 on page 'Advanced Search'
    Then Advanced Search "Deal Transaction Type" popup should appear
    And I enter text "<transactiontypeValue>" in input box on panel 'Advanced Search' pop-up
    Then I click on button 'Look up' on pop-up 'Advanced Search'
    And I select "<transactiontypeValue>" from 'Select from those listed below' box on pop-up 'Advanced Search'
    And I click on button 'Apply' on pop-up 'Advanced Search'
    And I verify that the checkbox 'Link to Agreement Type' is active on page 'Advanced Search'
    And I verify that the checkbox 'Link to Agreement Type' is 'Selected' by default on page 'Advanced Search'
    And I click on 'X' mark on 'Deal Transaction Type' input box
    And I verify that the checkbox 'Link to Agreement Type' is not active on page 'Advanced Search'

    Examples:
      |transactiontypeValue|
      |Authorized Generic  |
