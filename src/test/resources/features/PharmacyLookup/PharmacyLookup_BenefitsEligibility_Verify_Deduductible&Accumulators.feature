Feature: PharmacyLookup Search verify Benefits and Eligibility Deductible & Accumulators

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
      | Miscellaneous->RxNova Connect | 1710927462  | 120005552999 | Member ID^90413000100 | Date of Birth^01/01/1940 | Member Name^MBRNONBRIDGECUST RWT | Error^ | Date^01/16/2020 | Time^10:27:28 | CICS Status^PWE | Cust ID^319 - 0319HUMANA | Client ID^9007 - NBRG--CLNT1 - NONBRG CLIENT--PDP | Group^2 - RWNBRG REGR2 DONT USE REWORK10 | 
      
     
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
  Scenario Outline: Verify Benefits and Eligibility Deductible & Accumulators
    Given User in Pharmacy Lookup details page    
    Then User click on Benefits Eligibility icon     
    Then User click on Deductible & Accumulators     
    Then User verifies Deductible & Accumulators details     
      | ABPStart 				  | <ABPStart>          |         
      | ABPEnd					  | <ABPEnd>            |
      | ABPLevel				  | <ABPLevel>          |
      | ACAccumulatorID	  | <ACAccumulatorID>   |         
      | ACStart						| <ACStart>   	      |
      | ACEnd							| <ACEnd>             |
      | ACIndicator			  | <ACIndicator>       |         
      | AAType						| <AAType>   	        |
      | AAName						| <AAName>            |
      | AAMedicalRx				| <AAMedicalRx>       |         
      | AANetwork					| <AANetwork>   	    |
      | AARetailMailOrder	| <AARetailMailOrder> |
      | AABrandGeneric		| <AABrandGeneric>    |         
      | AACSRIndicator		| <AACSRIndicator>    |
      | AACSRComparison		| <AACSRComparison>   |
      | AARenewal					| <AARenewal>         |         
      | IAIndividualLimit | <IAIndividualLimit> |
      | IAMemberPaid			| <IAMemberPaid>      |
      | IAAmountToMeet		| <IAAmountToMeet>    |         
      | IAPlanPaid				| <IAPlanPaid>        |
      | IAExcludedAmount	| <IAExcludedAmount>  |
      | IAPLRO						| <IAPLRO>     			  |         
      | IAClaims					| <IAClaims>   				|
      | IAMetDate					| <IAMetDate>         |
      | FAFamilyLimit     | <FAFamilyLimit>     |         
      | FAFamilyPaid	    | <FAFamilyPaid>   	  |
      | FAAmountToMeet		| <FAAmountToMeet>    |
      | FAPlanPaid		    | <FAPlanPaid>        |         
      | FAExcludedAmount	| <FAExcludedAmount>  |
      | FAClaims					| <FAClaims>          |
      | FAMetDate 				| <FAMetDate>         |                
      
    Examples: 
      | ABPStart | ABPEnd | ABPLevel | ACAccumulatorID | ACStart | ACEnd | ACIndicator | AAType | AAName | AAMedicalRx | AANetwork | AARetailMailOrder  | AABrandGeneric | AACSRIndicator | AACSRComparison | AARenewal | IAIndividualLimit | IAMemberPaid | IAAmountToMeet  | IAPlanPaid | IAExcludedAmount | IAPLRO | IAClaims  | IAMetDate | FAFamilyLimit | FAFamilyPaid | FAAmountToMeet  | FAPlanPaid | FAExcludedAmount | FAClaims  | FAMetDate |
      | Start^   | End^   | Level^   | Accumulator ID^ | Start^  | End^  | Indicator^  | Type^  | Name^  | Medical/Rx^ | Network^  | Retail/Mail Order^ | Brand/Generic^ | CSR Indicator^ | CSR Comparison^ | Renewal^  | Individual limit^ | Member paid^ | Amount to meet^ | Plan paid^ | Excluded amount^ | PLRO^  | # Claims^ | Met date^ | Family limit^ | Family paid^ | Amount to meet^ | Plan paid^ | Excluded amount^ | # Claims^ | Met date^ | 

  
  
  
  
  
  
  
  
  
  
  
  
   