Feature: PharmacyLookup Search verify Transfer Rules CC Information

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
      | Miscellaneous->RxNova Connect |  1710927462 | 120005552999 | Member ID^90413000100 | Date of Birth^01/01/1940 | Member Name^MBRNONBRIDGECUST RWT | Error^ | Date^01/16/2020 | Time^14:20:39 | CICS Status^PWE | Cust ID^319 - 0319HUMANA | Client ID^9007 - NBRG--CLNT1 - NONBRG CLIENT--PDP | Group^2 - RWNBRG REGR2 DONT USE REWORK10 |

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
  Scenario Outline: Verify Transfer Rules CC Information
    Given User in Pharmacy Lookup details page
    Then User click on Transfer Rules CC Information in Claim screen  
    Then User verifies the Transfer Rules CC Information            
      | CustomerNumber     | <CustomerNumber>    |
      | CustomerName       | <CustomerName>      |
      | ClientNumber       | <ClientNumber>  	   |
      | ClientName         | <ClientName>        | 
      | GroupNumber        | <GroupNumber>       |
      | GroupName          | <GroupName>         |
      | DateTermed         | <DateTermed>        |
      | AffiliateCustNo    | <AffiliateCustNo>   |
      | TFNMain            | <TFNMain>           |
      | TFNMember          | <TFNMember>         |
      | TFNPreAuth         | <TFNPreAuth>        |
      | TFNMailOrder       | <TFNMailOrder>      |
      | TFNContracting     | <TFNContracting>    |      
      | TimeZone           | <TimeZone>          |
      | BusnessHours       | <BusnessHours>      |
      | Comments           | <Comments>          |
             
    Examples: 
      | CustomerNumber       | CustomerName              | ClientNumber        | ClientName                                     | GroupNumber     | GroupName                                  | DateTermed    | AffiliateCustNo                | TFNMain             | TFNMember            | TFNPreAuth            | TFNMailOrder             | TFNContracting            |  TimeZone       | BusnessHours            | Comments                           |
      | Customer number:^319 | Customer name:^0319HUMANA | Client number:^9007 |  Client name:^NBRG--CLNT1 - NONBRG CLIENT--PDP | Group number:^2 | Group name:^RWNBRG REGR2 DONT USE REWORK10 | Date termed:^ | Affiliate Customer number:^320 | Main:^800-448-6262  | Member:^800-448-6262 | PreAuth:^800-555-2546 | Mail Order:^800-379-0092 | Contracting:^888-204-8349 |  Time Zone:^EST | Business Hours:^8am-8pm | Hours listed are Member Time Zone  |   

  
  
  
  
  
  
  
  
  
  
  
  
   