Feature: PharmacyLookup Search verify Call Notes Call Notes

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
      | Group       | <Group>  	    |
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
  Scenario Outline: Verify Call Notes_Call Notes 
    Given User in Pharmacy Lookup details page    
    Then User click on Call Notes icon     
    Then User provides details in Add New Call Notes screen and click on Save Notes button     
      | AddNewType		 | <AddNewType>     |         
      | AddNewStatus	 | <AddNewStatus>   |
      | AddNewComments | <AddNewComments> |     
    Then User verifies Previous Call Notes Comments            
      | PrevCallNotesComment |<PrevCallNotesComment> |  
    Then User verify Previous Call Notes details
    	| Date	 | <Date>   |         
      | Time 	 | <Time>		|
      | Type   | <Type>   |
	    | Status | <Status>	|
      | UserID | <UserID> |      
       
    Examples: 
      | AddNewType | AddNewStatus | AddNewComments     | PrevCallNotesComment | Type         | Status              | 
      | I - MAC    | 1 - Resolved | Call Notes Comment | Call Notes Comment   | Type^I - MAC | Status^1 - Resolved |  
  
  
  
  
  
  
  
  
   