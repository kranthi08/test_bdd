Feature: PharmacyLookup search verify Medicare Part D

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
  Scenario Outline: Verify Medicare Part D
    Given User in Pharmacy Lookup details page
    Then User click on Medicare Part D in Claim screen 
    Then User verifies Medicare Part D    
    	| AlternateBusinessFlag          | <AlternateBusinessFlag>          |         
      | NonTrOOPEligPLROAmt            | <NonTrOOPEligPLROAmt>            |
      | TotalCoveredDrugCost           | <TotalCoveredDrugCost>           |
      | GrossDrugCostAboveOOPThreshold | <GrossDrugCostAboveOOPThreshold> |
      | LICSEffectiveDate              | <LICSEffectiveDate>              | 
      | MTMEffectiveDate               | <MTMEffectiveDate>               |
      | PlaceofService                 | <PlaceofService>                 |
      | PlanType                       | <PlanType>                       |
      | TransitionLetter               | <TransitionLetter>               |
      | TrOOPEligibleFlag              | <TrOOPEligibleFlag>              |
      | OtherTrOOPAmount               | <OtherTrOOPAmount>               |
      | ReportedGapDiscount            | <ReportedGapDiscount>            |
      | GrossDrugCostBelowOOPThreshold | <GrossDrugCostBelowOOPThreshold> |
      | LICSAmount                     | <LICSAmount>                     |
      | InstitutionalCode              | <InstitutionalCode>              |
      | PatientLocationCode            | <PatientLocationCode>            |
      | SupplementalIndicator          | <SupplementalIndicator>          |
      | TransitionCode                 | <TransitionCode>                 |
      | TrOOPAppliedAmount             | <TrOOPAppliedAmount>             |
      | TrOOPAccumulationAmount        | <TrOOPAccumulationAmount>        |
      | FDADefStatus                   | <FDADefStatus>                   |
      | FreeFirstFillIndicator         | <FreeFirstFillIndicator>         |
      | LICSCode                       | <LICSCode>                       |
      | MTMCode                        | <MTMCode>                        |
      | InstitutionalEffectiveDate     | <InstitutionalEffectiveDate>     |
      | PatientResidence               | <PatientResidence>               |
      | ProcessedasIndicator           | <ProcessedasIndicator>           |
             
    Examples: 
      | AlternateBusinessFlag     | NonTrOOPEligPLROAmt           | TotalCoveredDrugCost          | GrossDrugCostAboveOOPThreshold                      | LICSEffectiveDate    | MTMEffectiveDate    | PlaceofService    | PlanType   | TransitionLetter   | TrOOPEligibleFlag     | OtherTrOOPAmount         | ReportedGapDiscount         | GrossDrugCostBelowOOPThreshold                      | LICSAmount        | InstitutionalCode   | PatientLocationCode    | SupplementalIndicator   | TransitionCode   | TrOOPAppliedAmount         | TrOOPAccumulationAmount         | FDADefStatus    | FreeFirstFillIndicator     | LICSCode   | MTMCode   | InstitutionalEffectiveDate    | PatientResidence    | ProcessedasIndicator    | 
	    | Alternate Business Flag^N | Non-TrOOP Elig/PLRO Amt^$0.00 | Total Covered Drug Cost^$0.00 | Gross Drug Cost Above Out of Pocket Threshold^$0.00 | LICS Effective Date^ | MTM Effective Date^ | Place of Sevice^1 | Plan Type^ | Transition Letter^ | TrOOP Eligible Flag^N | Other TrOOP Amount^$0.00 | Reported Gap Discount^$0.00 | Gross Drug Cost Below Out of Pocket Threshold^$0.00 | LICS Amount^$0.00 | Institutional code^ | Patient Location Code^ | Supplemental Indicator^ | Transition Code^ | TrOOP Applied Amount^$0.00 | TrOOP Accumulation Amount^$0.00 | FDA Def Status^ | Free First Fill Indicator^ | LICS Code^ | MTM Code^ | Institutional Effective Date^ | 	Patient Residence^ | Processed as Indicator^ |  

  
  
  
  
  
  
  
  
  
  
  
  
   