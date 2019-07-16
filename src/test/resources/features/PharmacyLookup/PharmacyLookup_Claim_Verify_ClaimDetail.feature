Feature: PharmacyLookup Search verify Claim Details

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
     
      | CustomerSet    		 | <CustomerSet>       |         
      | Customer		       | <Customer>          |
      | Client             | <Client>            |
      | Group      	       | <Group>  	         |
      | Gender						 | <Gender>            |
      | MemberID           | <MemberID>          | 
      | AltMemberID        | <AltMemberID>       |
      | FirstName          | <FirstName>         |
      | LastName           | <LastName>          |
      | DOB                | <DOB>               |    
      
    Examples: 
      | CustomerSet          | Customer                    | Client                     | Group                                 | Gender    | MemberID                      | AltMemberID                       | FirstName         | LastName                    | DOB             | 
      | Customer Set:^Humana | Customer:^0319 - 0319HUMANA | Client:^9007 - NBRG--CLNT1	| Group:^RWNBRG REGR2 DONT USE REWORK10	| Gender:^F | Member ID:^000000090413000100	| Alt Member ID:^000000090413000100	| First Name:^RWTC4	| Last Name:^MBRNONBRIDGECUST	| DOB:^01/01/1940 |          
      
       
  @Functional
  Scenario Outline: Verify Claim Details  
    Given User in Pharmacy Lookup details page    
    Then User verifies the Claim details    
    	| MemberID    | <MemberID>    |         
      | DateOfBirth | <DateOfBirth> |
      | Gender      | <Gender>      |
      | Customer    | <Customer>  	|
      | Client      | <Client>      | 
      | Group       | <Group>       |
      
    Examples: 
      | MemberID           						 | DateOfBirth     | Gender    | Customer                 | Client                                        | Group                                   |  
      | Member ID:^000000090413000100  | DOB:^01/01/1940 | Gender:^F | Customer:^319 0319HUMANA | Client:^9007 NBRG--CLNT1 - NONBRG CLIENT--PDP | Group:^2/RWNBRG REGR2 DONT USE REWORK10 |     
      
    
  @Functional
  Scenario Outline: Verify Claim Information  
    Given User in Pharmacy Lookup details page    
    Then User verifies the Claim Information details     
      | Status   		       | <Status>            |         
      | PharmacyID   		   | <PharmacyID>   	   |
      | PharmacyQlfr       | <PharmacyQlfr>      |
      | RxNo    	         | <RxNo>  	           |
      | POSNo              | <POSNo>             | 
      | ClaimNo            | <ClaimNo>           |
      | DateFilled         | <DateFilled>        |
      | DateWritten        | <DateWritten>       |     
      | DateReversed       | <DateReversed>    	 |
      | DateAdded          | <DateAdded>         |
      | TimeAdded   		   | <TimeAdded>         |         
      | DateUpdated   		 | <DateUpdated>   	   |
      | TimeUpdated        | <TimeUpdated>       |
      | RxOrigin    	     | <RxOrigin>  	       |
      | Source             | <Source>            | 
      | Version            | <Version>           |
      
    Examples: 
      | Status         | PharmacyID              | PharmacyQlfr      | RxNo               | POSNo                | ClaimNo                  | DateFilled              | DateWritten              | DateReversed   | DateAdded              | TimeAdded            |DateUpdated   | TimeUpdated            | RxOrigin     |Source       | Version     |
      | Status:^10-PWE | Pharmacy ID:^1710927462 | Pharmacy Qlfr:^01 | Rx #:^120005552999 | POS #:^19-157-000041 | Claim #:^19-557-000041-1 | Date Filled:^11/10/2018 | Date Written:^10/10/2018 | Date Reversed:^| Date Added:^01/16/2020 | Time Added:^10:27:28 |Date Updated:^| Time Updated:^00:00:00 | Rx Origin:^1 | Source:^POS | Version:^D0 |
      
         
  @Functional
  Scenario Outline: Verify Drug Override Information  
    Given User in Pharmacy Lookup details page    
    Then User verifies the Drug Override Information details     
      | NDC   		         | <NDC>               |         
      | LabelName   		   | <LabelName>   	     |
      | GenericName        | <GenericName>       |
      | DaysSupply	       | <DaysSupply>  	     |
      | Quantity           | <Quantity>          | 
      | DAW                | <DAW>               |
      | NewRefill          | <NewRefill>         |
      | Compound           | <Compound>          |     
      | DrugDiscount       | <DrugDiscount>    	 |
      | SpecialtyDrugFlag  | <SpecialtyDrugFlag> |
      | ResAuthNumber   	 | <ResAuthNumber>     |         
      | PreAuthNumber		   | <PreAuthNumber>   	 |
      | CustAuthNumber     | <CustAuthNumber>    |
      | PriorAuthNumberSub | <PriorAuthNumberSub>|
      | ClinicalSupportID  | <ClinicalSupportID> | 
      | SubmissionClarCode | <SubmissionClarCode>|
      | OtherCoverage   	 | <OtherCoverage>     |         
      | DURInterven   		 | <DURInterven>   	   |
      | DURConflict        | <DURConflict>       |
      | DUROutcome	       | <DUROutcome>  	     |
      | PostPay2           | <PostPay2>          | 
      | PostPay3           | <PostPay3>          |
      | PostPay4           | <PostPay4>          |
      
    Examples:   
      | NDC                | LabelName                            | GenericName                   | DaysSupply      | Quantity        | DAW    | NewRefill     | Compound    | DrugDiscount   | SpecialtyDrugFlag      | ResAuthNumber                     | PreAuthNumber              | CustAuthNumber                    | PriorAuthNumberSub                    | ClinicalSupportID    | SubmissionClarCode               | OtherCoverage     | DURInterven      | DURConflict      | DUROutcome      | PostPay2     | PostPay3    | PostPay4      |
      | NDC:^00378-0092-01 | Label Name:^MAPROTILINE 75 MG TABLET | Generic Name:^MAPROTILINE HCL | Days Supply:^30 | Quantity:^4.000 | DAW:^0 | New/Refill:^0 | Compound:^1 | Drug Discount:^| Specialty Drug Flag:^N | Restricted Authorization Number:^ | Pre-Authorization Number:^ | Customized Authorization Number:^ | Prior Authorization Number Submitted:^| Clinical Support ID:^| Submission Clarification Code:^1 | Other Coverage:^1 | DUR Interven:^00 | DUR Conflict:^NA | DUR Outcome:^1B | Post Pay 2:^ | Post Pay 3:^| Post Pay 4:^D |    
      
  @Functional
  Scenario Outline: Verify Pharmacy Prescriber Information   
    Given User in Pharmacy Lookup details page    
    Then User verifies the Pharmacy Prescriber Information details     
      | PharmacyName   		 | <PharmacyName>      |         
      | Address 		       | <Address>   	       |
      | City               | <City>              |
      | State	             | <State>  	         |
      | ZIP                | <ZIP>               | 
      | Phone              | <Phone>             |
      | Affiliation        | <Affiliation>       |
      | Chain              | <Chain>             |     
      | PharmacyNetwork    | <PharmacyNetwork>   |
      | PrescriberID       | <PrescriberID>      |
      | PrescriberQlfr   	 | <PrescriberQlfr>    |         
      | PrescriberName	   | <PrescriberName>    |
      | FillRecInterval    | <FillRecInterval>   |       
      
    Examples: 
      | PharmacyName                        | Address                         | City          | State     | ZIP        | Phone                | Affiliation          | Chain    | PharmacyNetwork        | PrescriberID              | PrescriberQlfr     |PrescriberName             | FillRecInterval             |  
      | Pharmacy Name:^HUMANA PHARMACY, INC.| Address:^4302 WEST BUCKEYE ROAD | City:^PHOENIX | State:^AZ | ZIP:^85043 | Phone:^(800)379-0092 | Affiliation:^0000000 | Chain:^0 | Pharmacy Network:^0184 | Prescriber ID:^1053398768 | Prescriber Qlfr:^01|Prescriber Name:^OTTO BURKY| Fill Received Interval:^999 | 
      
  @Functional
  Scenario Outline: Verify Claim Pricing Information  
    Given User in Pharmacy Lookup details page      
    Then User verifies the Claim Pricing Information details     
      | PlanPaid   		     | <PlanPaid>          |         
      | PatientPaid 		   | <PatientPaid>   	   |
      | AWPCost            | <AWPCost>           |
      | MACIngrCost        | <MACIngrCost>  	   |
      | UCAmount           | <UCAmount>          | 
      | WACAmount          | <WACAmount>         |
      | PriceSource        | <PriceSource>       |
      | SubIngrCost        | <SubIngrCost>       |     
      | DispenseFee        | <DispenseFee>       |
      | SalesTax           | <SalesTax>          |
      | IncentiveAmount  	 | <IncentiveAmount>   |         
      | Copay              | <Copay>             |
      | Total              | <Total>             |      
     #Then User verifies the Claim History button is active and enabled          
     #Then User verifies the Reverse Claim button is active and enabled       
       
    Examples: 
      | PlanPaid         | PatientPaid         | AWPCost         | MACIngrCost          | UCAmount              | WACAmount         | PriceSource       | SubIngrCost            | DispenseFee         | SalesTax         | IncentiveAmount         | Copay        | Total          |  
      | Plan Paid:^$3.37 | Patient Paid:^$6.00 | AWP Cost:^$9.37 | MAC Ingr Cost:^$0.00 | U & C Amount:^$305.00 | WAC Amount:^$7.50 | Price Source:^AWP | Sub Ingr Cost:^$305.00 | Dispense Fee:^$0.00 | Sales Tax:^$0.00 | Incentive Amount:^$0.00 | Copay:^$0.00 | Total:^$305.00 |

  
  
  
  
  
  
  
  
  
  
  
  
   