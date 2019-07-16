Feature: PharmacyLookup search verify Drug Utilization Review Response Details

    Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   | |
      | password | |
      | region   | |

  @Functional
  Scenario Outline: Pharmacy Lookup search with valid data
    Given User in Landing Page, he selects the application from menu
      | menu | <ApplicationMenu> |
    Then User search for existing pharmacy by entering details in Pharmacy Lookup
      | PharmacyNPI | <PharmacyNPI> |
      | RxNumber    | <RxNumber>    |
    Then Member details should be displayed
      | MemberID    | <MemberID>    |
      | DateOfBirth | <DateOfBirth> |
      | MemberName  | <MemberName>  |
      | Error       | <Error>       |
      | Date        | <Date>        |
      | Time        | <Time>        |
      | CICSStatus  | <CICSStatus>  |
      | CustID      | <CustID>      |
      | ClientID    | <ClientID>    |
      | Group       | <Group>       |

    Examples: 
      | ApplicationMenu               | PharmacyNPI | RxNumber     | MemberID              | DateOfBirth              | MemberName                       | Error  | Date            | Time          | CICSStatus      | CustID                   | ClientID                                          | Group                                    |
      | Miscellaneous->RxNova Connect |  1710927462 | 120005552999 | Member ID^90413000100 | Date of Birth^01/01/1940 | Member Name^MBRNONBRIDGECUST RWT | Error^ | Date^01/16/2020 | Time^10:27:28 | CICS Status^PWE | Cust ID^319 - 0319HUMANA | Client ID^9007 - NBRG--CLNT1 - NONBRG CLIENT--PDP | Group^2 - RWNBRG REGR2 DONT USE REWORK10 |

  @Functional
  Scenario Outline: Verify Header details
    Given User in Pharmacy Lookup Search Page and click on Blue arrow at MemberID Field
    Then User verifies the header details
      | CustomerSet | <CustomerSet> |
      | Customer    | <Customer>    |
      | Client      | <Client>      |
      | Group       | <Group>       |
      | Gender      | <Gender>      |
      | MemberID    | <MemberID>    |
      | AltMemberID | <AltMemberID> |
      | FirstName   | <FirstName>   |
      | LastName    | <LastName>    |
      | DOB         | <DOB>         |

    Examples: 
      | CustomerSet          | Customer                    | Client                     | Group                                 | Gender    | MemberID                      | AltMemberID                       | FirstName         | LastName                    | DOB             |
      | Customer Set:^Humana | Customer:^0319 - 0319HUMANA | Client:^9007 - NBRG--CLNT1 | Group:^RWNBRG REGR2 DONT USE REWORK10 | Gender:^F | Member ID:^000000090413000100 | Alt Member ID:^000000090413000100 | First Name:^RWTC4 | Last Name:^MBRNONBRIDGECUST | DOB:^01/01/1940 |
       
  @Functional
  Scenario Outline: Verify Drug Utilization Review Response Details
    Given User in Pharmacy Lookup details page
    Then User click on Drug Utilization Review Response Details in Claim screen
    Then User verifies Drug Utilization Review Response Details    
    	| SeverityCode    	 | <SeverityCode>      |         
      | Monograph          | <Monograph>         |
      | Hansten            | <Hansten>           |
      | Dif                | <Dif>  	           |
      | InteventionCode    | <InteventionCode>   | 
      | OutcomeCode        | <OutcomeCode>       |
      | Claim              | <Claim>             |
      | DrugName           | <DrugName>          |
      | DateFilled         | <DateFilled>        |
      | MetricQuantity     | <MetricQuantity>    |
      | SafetyEditID       | <SafetyEditID>      |
      | DURProtocolID      | <DURProtocolID>     |
      | FreeformMessageID  | <FreeformMessageID> |
      | PharmacyID         | <PharmacyID>        |
      | ServProviderIDQlfr | <ServProviderIDQlfr>|
      | PharmacyNPI        | <PharmacyNPI>       |
      | PharmacyName       | <PharmacyName>      |
      | PrescriberID       | <PrescriberID>      |
      | PrescriberIDQlflr  | <PrescriberIDQlflr> |
      | PrescriberNPI      | <PrescriberNPI>     |
      | PrescriberName     | <PrescriberName>    |
      | DURFreeTextMessage | <DURFreeTextMessage>|
      | DURAddTextMessage  | <DURAddTextMessage> |
             
    Examples: 
      | SeverityCode   | Monograph  | Hansten  | Dif  | InteventionCode   | OutcomeCode   | Claim  | DrugName   | DateFilled   | MetricQuantity   | SafetyEditID    | DURProtocolID    | FreeformMessageID    | PharmacyID   | ServProviderIDQlfr          | PharmacyNPI   | PharmacyName   | PrescriberID   | PrescriberIDQlflr        | PrescriberNPI   | PrescriberName   | DURFreeTextMessage     | DURAddTextMessage            |   
      |	Severity Code^ | Monograph^ | Hansten^ | Dif^ | Intevention Code^ | Outcome Code^ | Claim^ | Drug Name^ | Date Filled^ | Metric Quantity^ | Safety Edit ID^ | DUR Protocol ID^ | Freeform Message ID^ | Pharmacy ID^ | Serv Provider ID Qualifier^ | Pharmacy NPI^ | Pharmacy Name^ | Prescriber ID^ | Prescriber ID Qualifier^ | Prescriber NPI^ | Prescriber Name^ | DUR Free Text Message^ | DUR Additional Text Message^ |                                                                                                                                           

  
  
  
  
  
  
  
  
  
  
  
  
   