Feature: PharmacyLookup search verify Pricing

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
  Scenario Outline: Verify Pricing
    Given User in Pharmacy Lookup details page
    Then User click on Pricing in Claim screen    
    Then User verifies Pricing    
    	| BaseCopayAmt    	         | <BaseCopayAmt>                |         
      | BaseCoinsAmt               | <BaseCoinsAmt>                |
      | AmtAppliedToPeriodicDed    | <AmtAppliedToPeriodicDed>     |
      | AmtExceededProcBenefitMax  | <AmtExceededProcBenefitMax>   |
      | AmtAttributedToProcssorFee | <AmtAttributedToProcssorFee>  | 
      | AmtAttributedToSalesTax    | <AmtAttributedToSalesTax>     |
      | AmtAttributedToCoverageGap | <AmtAttributedToCoverageGap>  |
      | HealthPlanFundedAmt        | <HealthPlanFundedAmt>         |
      | MemberPaidDifference       | <MemberPaidDifference>        |
      | AttrToNetSelection         | <AttrToNetSelection>          |
      | AttrToBrandDrug            | <AttrToBrandDrug>             |
      | AttrToNonPrefFormulary     | <AttrToNonPrefFormulary>      |
      | AttrToNonPrefFormularyBrand| <AttrToNonPrefFormularyBrand> |
      | TotalPatientPay            | <TotalPatientPay>             |
      | HRAAmount                  | <HRAAmount>                   |
      | FSAAmount                  | <FSAAmount>                   |
      | HSAAmount                  | <HSAAmount>                   |
      | ADJAmount                  | <ADJAmount>                   |
      | SPAPAmount                 | <SPAPAmount>                  |
      | TotalMemberPaidToPharmacy  | <TotalMemberPaidToPharmacy>   |
      | IngredientCost             | <IngredientCost>              |
      | DispenseFee                | <DispenseFee>                 |
      | IncentiveAmount            | <IncentiveAmount>             |
      | OtherAmountPaid            | <OtherAmountPaid>             |
      | FlatSalesTax               | <FlatSalesTax>                |
      | PercentageSalesTax         | <PercentageSalesTax>          |
      | PPTotalPatientPay          | <PPTotalPatientPay>           |
      | TotalOtherPayerAmount      | <TotalOtherPayerAmount>       |
      | OtherPayer                 | <OtherPayer>                  |
      | RxCostIngredientCost       | <RxCostIngredientCost>        |
      | RxCostDispenseFee          | <RxCostDispenseFee>           |
      | RxCostIncentiveAmount      | <RxCostIncentiveAmount>       |
      | RxCostOtherAmountPaid      | <RxCostOtherAmountPaid>       |
      | RxCostFlatSalesTax         | <RxCostFlatSalesTax>          |
      | RxCostPercentageSalesTax   | <RxCostPercentageSalesTax>    |
      | TotalPlanPaid              | <TotalPlanPaid>               |
      | TotalOtherPayer            | <TotalOtherPayer>             |      
      | TotalRxCost                | <TotalRxCost>                 |      
       
    Examples: 
      | BaseCopayAmt            | BaseCoinsAmt                  | AmtAppliedToPeriodicDed                      | AmtExceededProcBenefitMax                   | AmtAttributedToProcssorFee               | AmtAttributedToSalesTax               | AmtAttributedToCoverageGap               | HealthPlanFundedAmt             | MemberPaidDifference         | AttrToNetSelection                    | AttrToBrandDrug                | AttrToNonPrefFormulary                      | AttrToNonPrefFormularyBrand                       | TotalPatientPay           | HRAAmount        | FSAAmount        | HSAAmount        | ADJAmount        | SPAPAmount        | TotalMemberPaidToPharmacy           | IngredientCost        | DispenseFee        | IncentiveAmount        | OtherAmountPaid         | FlatSalesTax         | PercentageSalesTax         | PPTotalPatientPay       | TotalOtherPayerAmount          | OtherPayer        | RxCostIngredientCost  | RxCostDispenseFee  | RxCostIncentiveAmount  | RxCostOtherAmountPaid   | RxCostFlatSalesTax   | RxCostPercentageSalesTax   | TotalPlanPaid					 | TotalOtherPayer          |TotalRxCost          |
	    | Base copay amount^$6.00 | Base coinsurance amount^$0.00 | Amount applied to periodic deductible^$0.00  | Amount exceeded processed benefit max^$0.00 | Amount attributed to processor fee^$0.00 | Amount attributed to sales tax^$0.00  | Amount attributed to coverage gap^$0.00  | Health plan funded amount^$0.00 | Member paid difference^$0.00 | Attributed to network selection^$0.00 | Attributed to brand drug^$0.00 | Attributed to non-preferred formulary^$0.00 | Attributed to non-preferred formulary brand^$0.00 |  Total patient pay:^$6.00 | HRA amount^$0.00 | FSA amount^$0.00 | HSA amount^$0.00 | ADJ amount^$0.00 | SPAP amount^$0.00 | Total member paid to pharmacy^$6.00 | Ingredient cost^$9.37 | Dispense fee^$0.00 | Incentive amount^$0.00 | Other amount paid^$0.00 | Flat sales tax^$0.00 | Percentage sales tax^$0.00 | Total patient pay^$6.00 | Total other payer amount^$0.00 | Other payer^$0.00 | Ingredient cost^$9.37 | Dispense fee^$0.00 | Incentive amount^$0.00 | Other amount paid^$0.00 | Flat sales tax^$0.00 | Percentage sales tax^$0.00 | Total plan paid:^$3.37 | Total other payer:^$0.00 |Total Rx cost:^$9.37 | 
 
   
  
  
  
  
  
  
  
  
  
   