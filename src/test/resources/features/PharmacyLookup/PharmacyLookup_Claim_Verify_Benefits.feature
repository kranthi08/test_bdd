Feature: PharmacyLookup search verify Benefits

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
      | Miscellaneous->RxNova Connect |  1710927462 | 120005442999 | Member ID^90413000100 | Date of Birth^01/01/1940 | Member Name^MBRNONBRIDGECUST RWT | Error^ | Date^06/06/2019 | Time^10:27:28 | CICS Status^PWE | Cust ID^319 - 0319HUMANA | Client ID^9007 - NBRG--CLNT1 - NONBRG CLIENT--PDP | Group^2 - RWNBRG REGR2 DONT USE REWORK10 |

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
  Scenario Outline: Verify Benefits
    Given User in Pharmacy Lookup details page
    Then User click on Benefits in Claim screen 
    Then User verifies Benefits    
    	| CaseID    	           | <CaseID>                 |         
      | HICN                   | <HICN>                   |
      | CopayFieldUsed         | <CopayFieldUsed>         |
      | TierLevel              | <TierLevel>              |
      | FormularyIndicator     | <FormularyIndicator>     | 
      | PlaceOfService         | <PlaceOfService>         |
      | PatientResidence       | <PatientResidence>       |
      | PharmacyServiceType    | <PharmacyServiceType>    |
      | DeductibleMessage      | <DeductibleMessage>      |       
      | LICSCode               | <LICSCode>               |
      | LICSEffectiveDate      | <LICSEffectiveDate>      |
      | InstitutionalCode      | <InstitutionalCode>      |
      | InstitutionalEffDate   | <InstitutionalEffDate>   |
      | FreeFirstFill          | <FreeFirstFill>          |
      | CostShareReduction     | <CostShareReduction>     |
      | GracePeriod            | <GracePeriod>            |
      | MemberDeductible       | <MemberDeductible>       |
      | PlanDeductible         | <PlanDeductible>         |
      | DeductibleExcluded     | <DeductibleExcluded>     |
      | TROOP                  | <TROOP>                  |
      | NonTROOP               | <NonTROOP>               |
      | LICS                   | <LICS>                   |
      | OtherTROOP             | <OtherTROOP>             |
      | BenefitStageQualifier  | <BenefitStageQualifier>  |
      | BenefitStageAmount     | <BenefitStageAmount>     |       
      | SpendingAccRemaining   | <SpendingAccRemaining>   |
      | RemainingBenefit       | <RemainingBenefit>       |
      | AccumulatedDeductible  | <AccumulatedDeductible>  |
      | RemainingDeductible    | <RemainingDeductible>    |      
       
    Examples: 
      | CaseID                     | HICN  | CopayFieldUsed      | TierLevel     | FormularyIndicator    | PlaceOfService     | PatientResidence   | PharmacyServiceType      | DeductibleMessage   | LICSCode   | LICSEffectiveDate     | InstitutionalCode   | InstitutionalEffDate          | FreeFirstFill    | CostShareReduction    | GracePeriod   | MemberDeductible        | PlanDeductible        | DeductibleExcluded        | TROOP       | NonTROOP        | LICS       | OtherTROOP        | BenefitStageQualifier    | BenefitStageAmount         | SpendingAccRemaining             | RemainingBenefit        | AccumulatedDeductible        | RemainingDeductible        |                          
	    | Case ID^000000000904130001 | HICN^ | Copay field used^51 | Tier level^00 | Formulary indicator^1 | Place of service^1 | Patient residence^ | Pharmacy service type^01 | Deductible message^ | LICS code^ | 	LICS effective date^ | Institutional code^ | Institutional effective date^ | Free first fill^ | Cost share reduction^ | Grace period^ | Member deductible^$0.00 | Plan deductible^$0.00 | Deductible excluded^$0.00 | TROOP^$0.00 | Non TROOP^$0.00 | LICS^$0.00 | Other TROOP^$0.00 | Benefit stage qualifier^ | Benefit stage amount^$0.00 | Spending account remaining^$0.00 | Remaining benefit^$0.00 | Accumulated deductible^$0.00 | Remaining deductible^$0.00 | 

  
  
  
  
  
  
  
  
  
  
  
  
   