Feature: PharmacyLookup Search verify Benefits and Eligibility Coverage & Copay

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
      | Miscellaneous->RxNova Connect | 1710927462  | 120005552999 | Member ID^90413000100 | Date of Birth^01/01/1940 | Member Name^MBRNONBRIDGECUST RWT | Error^ | Date^06/06/2019 | Time^10:27:28 | CICS Status^PWE | Cust ID^319 - 0319HUMANA | Client ID^9007 - NBRG--CLNT1 - NONBRG CLIENT--PDP | Group^2 - RWNBRG REGR2 DONT USE REWORK10 |
     
  @Functional
  Scenario Outline: Verify Header details
    Given User in Pharmacy Lookup Search Page and click on Blue arrow at MemberID Field
    Then User verifies the header details     
      | CustomerSet | <CustomerSet> |         
      | Customer		| <Customer>    |
      | Client      | <Client>      |
      | Group       | <Group>   	  |
      | Gender		  | <Gender>      |
      | MemberID    | <MemberID>    | 
      | AltMemberID | <AltMemberID> |
      | FirstName   | <FirstName>   |
      | LastName    | <LastName>    |
      | DOB         | <DOB>         |   
      
    Examples: 
      | CustomerSet          | Customer                    | Client                     | Group                                 | Gender    | MemberID                      | AltMemberID                       | FirstName         | LastName                    | DOB             | 
      | Customer Set:^Humana | Customer:^0319 - 0319HUMANA | Client:^9007 - NBRG--CLNT1	| Group:^RWNBRG REGR2 DONT USE REWORK10	| Gender:^F | Member ID:^000000090413000100	| Alt Member ID:^000000090413000100	| First Name:^RWTC4	| Last Name:^MBRNONBRIDGECUST	| DOB:^01/01/1940 |    
          
  @Functional
  Scenario Outline: Verify Benefits and Eligibility Coverage & Copay
    Given User in Pharmacy Lookup details page   
    Then User click on Benefits Eligibility icon     
    Then User click on Coverage & Copay     
    Then User verifies Coverage & Copay details     
      | CoverageCode1 	     | <CoverageCode1>        |         
      | CoverageCode2 		   | <CoverageCode2>        |
      | Description   		   | <Description>          |
      | StartDate				     | <StartDate>            |         
      | CoverageFlag  		   | <CoverageFlag>   	    |
      | Priority					   | <Priority>             |
      | ConditionDescription | <ConditionDescription> |         
      | CopayField     			 | <CopayField>   	      |
      | CopayValues1		  	 | <CopayValues1>         |         
      | CopayValues2			 	 | <CopayValues2>   	    |
      | CopayValues3			 	 | <CopayValues3>   	    |
      | CopayValues4			 	 | <CopayValues4>   	    |        
      | CopayValues5			 	 | <CopayValues5>   	    |
      | CopayValues6			 	 | <CopayValues6>   	    |
      | CopayValues7			 	 | <CopayValues7>   	    |
      | CopayValues8			 	 | <CopayValues8>   	    |  
       
    Examples: 
      | CoverageCode1          | CoverageCode2          | Description  | StartDate             | CoverageFlag                       | Priority  | ConditionDescription   | CopayField   | CopayValues1                                                                    | CopayValues2                                                                       | CopayValues3                                                                    | CopayValues4                                                                       | CopayValues5                                                 | CopayValues6                                                 | CopayValues7                                                 | CopayValues8                                                  |
      | Coverage Code 1^RWNBRG | Coverage Code 2^RXNOV2 | Description^ | Start Date^01/01/2015 | Coverage Flag^R - Indicates RxNova | Priority^ | Condition Description^ | Copay Field^ | Default mail-order brand^Mail Order Brand^$12.00^0.00%^A - Copay + Coinsurance^ | Default mail-order generic^Mail Order Generic^$8.00^0.00%^A - Copay + Coinsurance^ | Default non-mail-order brand^Retail Brand^$10.00^0.00%^A - Copay + Coinsurance^ | Default non-mail-order generic^Retail Generic^$6.00^0.00%^A - Copay + Coinsurance^ | 1^Part D DD1 costshare^$30.00^0.00%^A - Copay + Coinsurance^ | 2^Part D IC1 costshare^$30.00^0.00%^A - Copay + Coinsurance^ | 3^Part D CG1 costshare^$30.00^0.00%^A - Copay + Coinsurance^ | 4^Part D CAT costshare^$6.35^+ 5.00%^A - Copay + Coinsurance^ |  
  
  
  
  
  
  
  
  
  
  
   