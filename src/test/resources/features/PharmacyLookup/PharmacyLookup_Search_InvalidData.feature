Feature: PharmacyLookup Search with Invalid Data

   Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   | |
      | password | |
      | region   | |

  @Functional
  Scenario Outline: Pharmacy Lookup Search with Invalid Data
    Given User in Landing Page, he selects the application from menu
      | menu | <ApplicationMenu> |
    When User click on search button in Pharmacy Lookup with blank Pharmacy NPI and Rx Number fields
      | PharmacyNPI | <PharmacyNPI> |
      | RxNumber    | <RxNumber>    |
    Then verifies the red X error messages
      | PharmacyNPIErrorMessage | <PharmacyNPIErrorMessage> |
      | RxNumberErorrMessage    | <RxNumberErorrMessage>    |

    Examples: 
      | ApplicationMenu               | PharmacyNPI | RxNumber | PharmacyNPIErrorMessage                               | RxNumberErorrMessage                                  |
      | Miscellaneous->RxNova Connect |             |          | Required field(s) are missing information. (AMCC0001) | Required field(s) are missing information. (AMCC0001) |
