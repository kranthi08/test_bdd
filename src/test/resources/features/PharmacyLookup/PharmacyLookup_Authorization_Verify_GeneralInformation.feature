#Author: DSTPS Automation team - Hyd

Feature: PharmacyLookup Search verify Authorization General Information

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   | dt79655 |
      | password | shiv123 |
      | region   | DR1     |

  @Functional
  Scenario Outline: Pharmacy Lookup search with valid data
    Given User in Landing Page, he selects the application from menu    
     | menu | <ApplicationMenu> |      
    Then User search for existing pharmacy by entering details in Pharmacy Lookup    
    	| PharmacyNPI | <PharmacyNPI> |
    	| RxNumber		| <RxNumber>    |    	
    Then Member details should be displayed    
      | MemberID    | <MemberID>    |
      | DateOfBirth | <DateOfBirth> |
      | MemberName  | <MemberName>  |
      | Error       | <Error>      	|
      | Date				| <Date>      	|
      | Time        | <Time>        |
      | CICSStatus  | <CICSStatus>  |
      | CustID      | <CustID>      |
      | ClientID    | <ClientID>    |
      | Group       | <Group>       |
            
    Examples: 
      | ApplicationMenu               | PharmacyNPI | RxNumber     | MemberID              | DateOfBirth              | MemberName                       | Error  | Date            | Time          | CICSStatus      | CustID                   | ClientID                                          | Group                                    |
      | Miscellaneous->RxNova Connect | 1710927462  | 120005442999 | Member ID^90413000100 | Date of Birth^01/01/1940 | Member Name^MBRNONBRIDGECUST RWT | Error^ | Date^06/06/2019 | Time^10:27:28 | CICS Status^PWE | Cust ID^319 - 0319HUMANA | Client ID^9007 - NBRG--CLNT1 - NONBRG CLIENT--PDP | Group^2 - RWNBRG REGR2 DONT USE REWORK10 |
      
     
  @Functional
  Scenario Outline: Verify Header details
    Given User in Pharmacy Lookup Search Page and click on Blue arrow at MemberID Field         
    Then User verifies the header details     
      | CustomerSet | <CustomerSet> |         
      | Customer		| <Customer>    |
      | Client      | <Client>      |
      | Group      	| <Group>  	    |
      | Gender			| <Gender>      |
      | MemberID    | <MemberID>    | 
      | AltMemberID | <AltMemberID> |
      | FirstName   | <FirstName>   |
      | LastName    | <LastName>    |
      | DOB         | <DOB>         |  
            
    Examples: 
      | CustomerSet          | Customer                    | Client                     | Group                                 | Gender    | MemberID                      | AltMemberID                       | FirstName         | LastName                    | DOB             | 
      | Customer Set:^Humana | Customer:^0319 - 0319HUMANA | Client:^9007 - NBRG--CLNT1	| Group:^RWNBRG REGR2 DONT USE REWORK10	| Gender:^F | Member ID:^000000090413000100	| Alt Member ID:^000000090413000100	| First Name:^RWTC4	| Last Name:^MBRNONBRIDGECUST	| DOB:^01/01/1940 |   
          
  @Functional
  Scenario Outline: Verify Formulary General Information 
    Given User in Pharmacy Lookup details page    
    Then User click on Authorization icon     
    Then User click on General Information in Authorization screen     
    Then User verifies Authorization General Information details     
      | AuthID	           | <AuthID>             |         
      | Status			       | <Status>      	      |
      | AuthType 		       | <AuthType>           |
      | RxNumber           | <RxNumber>           |
      | EffectiveDate      | <EffectiveDate>      |
      | RefillsAllowed     | <RefillsAllowed>     |
      | EndDate            | <EndDate>            |
      | FillsUsed          | <FillsUsed>          |
      | Compound				   | <Compound>           |         
      | DedInclude/Exclude | <DedInclude/Exclude> |
      | RuleType   		     | <RuleType>           |
      | DedMaxOverride     | <DedMaxOverride>     |
      | MetricDecimalQty   | <MetricDecimalQty>   |
      | NetworkIndicator   | <NetworkIndicator>   |
      | DaysSupply         | <DaysSupply>         |
      | DollarAmount			 | <DollarAmount>       |
      | LICSLevel					 | <LICSLevel>          |         
      | MedPartDType			 | <MedPartDType>       |
      | TierValue					 | <TierValue>       	  |
      | Phases						 | <Phases>             |
      | Type							 | <Type>               |
      | BrandOverrideType  | <BrandOverrideType>  |
      | BrandOverrideValue | <BrandOverrideValue> |
      | MultiplierUse			 | <MultiplierUse>      |
      | GenOverrideType    | <GenOverrideType>    |         
      | GenOverrideValue	 | <GenOverrideValue>   |
      | MultiplierUse      | <MultiplierUse>      |
      | DrugLevel					 | <DrugLevel>          |
      | DrugValue					 | <DrugValue>          |
      | DrugName					 | <DrugName>           |
      | Errors					   | <Errors>             |
      | ErrorCategory1		 | <ErrorCategory1>     |
      | ErrorCategory2		 | <ErrorCategory2>     |
      | ErrorCategory3		 | <ErrorCategory3>     |
      | ErrorCategory4		 | <ErrorCategory4>     |
      | ErrorCategory5		 | <ErrorCategory5>     |
      | ErrorCategory6		 | <ErrorCategory6>     |
      | ErrorCategory7		 | <ErrorCategory7>     |
      | ErrorCategory8		 | <ErrorCategory8>     |
      | ErrorCategory9		 | <ErrorCategory9>     |
      | ErrorCategory10		 | <ErrorCategory10>    |
      | ErrorCategory11		 | <ErrorCategory11>    |
      | ErrorCategory12		 | <ErrorCategory12>    |
      
    Examples: 
      | AuthID   | Status	 | AuthType   | RxNumber   | EffectiveDate   | RefillsAllowed   | EndDate   | FillsUsed   | Compound  | DedInclude/Exclude          | RuleType   | DedMaxOverride           | MetricDecimalQty         | NetworkIndicator   | DaysSupply   | DollarAmount   | LICSLevel   | MedPartDType     | TierValue   | Phases  | Type  | BrandOverrideType    | BrandOverrideValue    | MultiplierUse   | GenOverrideType        | GenOverrideValue        | MultiplierUse   | DrugLevel   | DrugValue   | DrugName	  | Errors  | ErrorCategory1 | ErrorCategory2 | ErrorCategory3 | ErrorCategory4 | ErrorCategory5 | ErrorCategory6 | ErrorCategory7 | ErrorCategory8 | ErrorCategory9 | ErrorCategory10 | ErrorCategory11 | ErrorCategory12 |
      | Auth ID^ | Status^ | Auth type^ | Rx number^ | Effective date^ | Refills allowed^ | End date^ | Fills used^ | Compound^ | Deductible include/exclude^ | Rule type^ | Deductible max override^ | Metric decimal quantity^ | Network indicator^ | Days supply^ | Dollar amount^ | LICS level^ | Med Part D type^ | Tier value^ | Phases^ | Type^ | Brand Override Type^ | Brand Override Value^ | Multiplier Use^ | Generic Override Type^ | Generic Override Value^ | Multiplier Use^ | Drug Level^ | Drug Value^ | Drug Name^ | Errors^ |                |                |                |                |                |                |                |                |                |                 |                 |                 | 
  
  
  
  
  
  
  
  
   