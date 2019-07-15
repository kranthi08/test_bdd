Feature: PharmacyLookup search verify Drug Information

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
      | Miscellaneous->RxNova Connect |  1710927462 | 120005552999 | Member ID^90413000100 | Date of Birth^01/01/1940 | Member Name^MBRNONBRIDGECUST RWT | Error^ | Date^06/06/2019 | Time^10:27:28 | CICS Status^PWE | Cust ID^319 - 0319HUMANA | Client ID^9007 - NBRG--CLNT1 - NONBRG CLIENT--PDP | Group^2 - RWNBRG REGR2 DONT USE REWORK10 |

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
  Scenario Outline: Verify Drug Information
    Given User in Pharmacy Lookup details page
    Then User click on Drug Information in Claim screen
    Then User verifies Drug Information    
    	| GenericIndicator         | <GenericIndicator>         |         
      | GenericPriceInedicator   | <GenericPriceInedicator>   |
      | GCN                      | <GCN>                      |
      | GCNSequenceNumber        | <GCNSequenceNumber>        |
      | MEDID                    | <MEDID>                    | 
      | HICLSequenceNumber       | <HICLSequenceNumber>       |
      | AHFSCode                 | <AHFSCode>                 |
      | DEACode                  | <DEACode>                  |
      | Manufacturer             | <Manufacturer>             |
      | GenericTherapeuticClass  | <GenericTherapeuticClass>  |
      | StandardTherapeuticClass | <StandardTherapeuticClass> |
      | SpecificTherapeuticClass | <SpecificTherapeuticClass> |
      | EnhancedTherapeuticClass | <EnhancedTherapeuticClass> |
      | DrugClass                | <DrugClass>                |
      | DrugCategory             | <DrugCategory>             |
      | RxCUI                    | <RxCUI>                    |
      | OrangeBookIndicator      | <OrangeBookIndicator>      |
      | NDCMaintenanceIndicator  | <NDCMaintenanceIndicator>  |
      | DosageStrength           | <DosageStrength>           |
      | DosageFormCode           | <DosageFormCode>           |
      | UnitOfMeasure            | <UnitOfMeasure>            |
      | PackageSize              | <PackageSize>              |
      | RouteCode                | <RouteCode>                |       
       
    Examples: 
      | GenericIndicator        | GenericPriceInedicator          | GCN       | GCNSequenceNumber          | MEDID         | HICLSequenceNumber        | AHFSCode         | DEACode    | Manufacturer       | GenericTherapeuticClass      | StandardTherapeuticClass      | SpecificTherapeuticClass             | EnhancedTherapeuticClass    | DrugClass    | DrugCategory    | RxCUI          | OrangeBookIndicator      | NDCMaintenanceIndicator     | DosageStrength        | DosageFormCode      | UnitOfMeasure      | PackageSize          | RouteCode    |             
      |Generic indicator (GI)^1 | Generic price indicator (GPI)^1 | GCN^16617 | GCN sequence number^046134 | MED ID^150775 | HICL sequence number^1651 | AHFS code^281604 | DEA code^0 | Manufacturer^MYLAN | Generic therapeutic class^80 | Standard therapeutic class^11 | Specific therapeutic class (STC)^H2U | Enhanced therapeutic class^ | Drug class^F | Drug category^0 | RxCUI^01298870 | Orange Book indicator^ZC | NDC maintenance indicator^Y | Dosage strength^75 MG | Dosage form code^TA | Unit of measure^EA | Package size^100.000 | Route code^1 |

  
  
  
  
  
  
  
  
  
  
  
  
   