Feature: PharmacyLookup Search verify Formulary Drug Results

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
      | Error       | <Error>       |
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
      | Customer Set:^Humana | Customer:^0319 - 0319HUMANA | Client:^9007 - NBRG--CLNT1	| Group:^RWNBRG REGR2 DONT USE REWORK10	| Gender:^F | Member ID:^000000090413000100	| Alt Member ID:^000000090413000100	| First Name:^RWTC4	| Last Name:^MBRNONBRIDGECUST	| DOB:^01/01/1940 |
          
  @Functional
  Scenario Outline: Verify Formulary Drug Results 
    Given User in Pharmacy Lookup details page    
    Then User click on Formulary icon     
    Then User verifies Drug Results details     
      | NDC			    | <NDC>         |         
      | BrandName		| <BrandName>   |
      | GenericName | <GenericName> |
      | GCN		      | <GCN>         |
      | DrugName		| <DrugName>    |
      | GI		      | <GI>          |
      | GPI		      | <GPI>         |
      | PkgSize		  | <PkgSize>     |
      
    Examples: 
      | NDC  | BrandName   | GenericName   | GCN  | DrugName   | GI  | GPI  | PkgSize   |   
      | NDC^ | Brand Name^ | Generic Name^ | GCN^ | Drug Name^ | GI^ | GPI^ | Pkg Size^ |
     
  @Functional
  Scenario Outline: Verify Claim Test Details
    Given User in Formulary Details page    
    Then User click on Claim Test button verifies the Claim Test Entry details in Claim Home Screen
      | Type            | <Type>						|         
      | TransactionType | <TransactionType> |
      | PreviousClaimID | <PreviousClaimID> |
          
    Examples: 
      | Type             | TransactionType            | PreviousClaimID        | 
      | Type:^Claim test | Transaction type:^Standard | Previous claim ID:^N/A | 

  
  
  
  
  
  
  
  
  
  
  
  
   