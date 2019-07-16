Feature: PharmacyLookup Search verify Benefits and Eligibility B&E Detail

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
  Scenario Outline: Verify Benefits and Eligibility B&E Details
    Given User in Pharmacy Lookup details page    
    Then User click on Benefits Eligibility icon      
    Then User verifies Benefits & Elegibility details     
      | MemberID				      | <MemberID>              |         
      | AltMemberID				    | <AltMemberID>           |
      | FirstName					    | <FirstName>             |
      | LastName				      | <LastName>              |
      | MI                    | <MI>                    |         
      | CustomerSet				    | <CustomerSet>   	      |
      | Customer					    | <Customer>              |
      | Client					  		| <Client>                |         
      | Group							 		| <Group>   	            |
      | EligibilityStatus	 		| <EligibilityStatus>     |
      | DOB							  		| <DOB>                   |
      | DeceasedDate          | <DeceasedDate>          |         
      | Gender						 		| <Gender>   	            |
      | Relationship			    | <Relationship>          |
      | MedicareBeneficiaryID | <MedicareBeneficiaryID> |
      | CaseId					      | <CaseId>                |         
      | CardHolderFirstName   | <CardHolderFirstName>   |
      | CardHolderLastName	  | <CardHolderLastName>    |
      | CardHolderMI          | <CardHolderMI>          |
      | CardReissueDate		    | <CardReissueDate>       |         
      | CardReissueReason  		| <CardReissueReason>   	|
      | Line1								  | <Line1>                 |
      | Line2			 		        | <Line2>                 |         
      | Line3				 			    | <Line3>              	  |
      | City								  | <City>   								|
      | State								  | <State>     					  |         
      | Zip 								  | <Zip>   							  |
      | Country							  | <Country>               |
      | Phone				          | <Phone>                 |
      | Email                 | <Email>                 |    
      | MiscData1             | <MiscData1>   	        |
      | MiscData2						  | <MiscData2>             |
      | MiscData3             | <MiscData3>             |         
      | DateTimeAdded				  | <DateTimeAdded>   	    |
      | DeviceOperatorAdded   | <DeviceOperatorAdded>   |
      | DateTimeUpdated       | <DateTimeUpdated>       |         
      | DeviceOperatorUpdated	| <DeviceOperatorUpdated> |
      
    Examples:       
      | MemberID                      | AltMemberID	                      | FirstName	        | LastName                    | MI   | CustomerSet          | Customer                 | Client                   | Group                                 | DOB             | DeceasedDate    | Gender    | Relationship                 | MedicareBeneficiaryID     | CaseId	                     | CardHolderFirstName | CardHolderLastName | CardHolderMI | CardReissueDate	   | CardReissueReason  	 | Line1	  | Line2    | Line3    | City	 | State   | Zip             | Country   | Phone	  | Email   | MiscData1     | MiscData2     | MiscData3     | DateTimeAdded                        | DeviceOperatorAdded                 | DateTimeUpdated     | DeviceOperatorUpdated	   |
      | Member ID:^000000090413000100 | Alt Member ID:^000000090413000100 | First Name:^RWTC4 | Last Name:^MBRNONBRIDGECUST | MI:^ | Customer Set:^Humana | Customer:^319 0319HUMANA | Client:^9007 NBRG--CLNT1 | Group:^RWNBRG REGR2 DONT USE REWORK10 |	DOB:^01/01/1940 | Deceased Date:^ | Gender:^F | Relationship:^1 - Cardholder | Medicare Beneficiary ID:^ | Case ID:^000000000904130001 | First Name:^        | Last Name:^        | MI:^         | Card Reissue Date:^ | Card Reissue Reason:^ | Line 1:^ | Line 2:^ | Line 3:^ | City:^ | State:^ | ZIP:^00000-0000 | Country:^ | Phone:^	| Email:^ | Misc Data 1:^ | Misc Data 2:^ | Misc Data 3:^ | Date/Time Added:^04/13/2019!09:37:44 | Device/Operator Added:^I36033B9!M8X | Date/Time Updated:^ | Device/Operator Updated:^ |   
      
  @Functional
  Scenario Outline: Verify Additional Eligibility Details
    Given User in Benefits & Eligibility Details page    
    Then User click on View Additional Eligibility Dates icon and verifies Additional Eligibility Dates
      | MemberID				      | <MemberID>              |         
      | AltMemberID				    | <AltMemberID>           |
      | FirstName					    | <FirstName>             |
      | LastName				      | <LastName>              |
      | MI                    | <MI>                    |         
      | CustomerSet				    | <CustomerSet>   	      |
      | Customer					    | <Customer>              |
      | Client					  		| <Client>                |         
      | Group							 		| <Group>   	            |
      | MemEligbilityStart		| <MemEligbilityStart>    |
      | MemEligbilityEnd			| <MemEligbilityEnd>      |         
      | MemEligbilityProcess	| <MemEligbilityProcess>  |
      | GrpEligbilityStart		| <GrpEligbilityStart>    |
      | GrpEligbilityEnd			| <GrpEligbilityEnd>      |         
      | GrpEligbilityProcess	| <GrpEligbilityProcess>  |
      | CliEligbilityStart		| <CliEligbilityStart>    |
      | CliEligbilityEnd			| <CliEligbilityEnd>      |         
      | CliEligbilityProcess	| <CliEligbilityProcess>  |
      | CusEligbilityStart		| <CusEligbilityStart>    |
      | CusEligbilityEnd			| <CusEligbilityEnd>      |         
      | CusEligbilityProcess	| <CusEligbilityProcess>  |
      
    Examples:       
      | MemberID                      | AltMemberID	                      | FirstName	        | LastName                    | MI   | CustomerSet          | Customer                 | Client                   | Group                                 | MemEligbilityStart | MemEligbilityEnd | MemEligbilityProcess    | GrpEligbilityStart | GrpEligbilityEnd | GrpEligbilityProcess    | CliEligbilityStart | CliEligbilityEnd | CliEligbilityProcess    | CusEligbilityStart | CusEligbilityEnd | CusEligbilityProcess    |
      | Member ID:^000000090413000100 | Alt Member ID:^000000090413000100 | First Name:^RWTC4 | Last Name:^MBRNONBRIDGECUST | MI:^ | Customer Set:^Humana | Customer:^319 0319HUMANA | Client:^9007 NBRG--CLNT1 | Group:^RWNBRG REGR2 DONT USE REWORK10 | Start^01/01/2015   | End^No end date  | Process Date^04/13/2019 | Start^01/01/2014   | End^No end date  | Process Date^06/29/2017 | Start^01/01/2004   | End^No end date  | Process Date^09/07/2018 | Start^01/01/2000   | End^No end date  | Process Date^12/27/2018 |
      
  @Functional
  Scenario Outline: Verify Member ID Details
    Given User in Benefits & Eligibility Details page
    Then User click on MemberID details link and verifies the Member details in Member Home Screen 
      | MasterCustomerSet     | <MasterCustomerSet>     |         
      | CustomerName          | <CustomerName>          |
      | ClientName            | <ClientName>            |
      | ExternalGroupID       | <ExternalGroupID>       |         
      | InternalGroupID       | <InternalGroupID>   	  |
      | MemberID              | <MemberID>              |
      | MemberLastFirstName		| <MemberLastFirstName>   |         
      | DateOfBirth						| <DateOfBirth>           |
      | Gender								| <Gender>                |
      | ActiveEffDateRange		| <ActiveEffDateRange>    |         
      | Test									| <Test>                  |  
      
    Examples: 
      | MasterCustomerSet           | CustomerName                   | ClientName                              | ExternalGroupID                                   | InternalGroupID      | MemberID               | MemberLastFirstName                       | DateOfBirth               | Gender             | ActiveEffDateRange                                    | Test     | 
      | Master customer set:^Humana | Customer name:^0319-0319HUMANA | Client name:^09007-NBRG--CLNT1 - NONBRG | External Group ID:^RWNBRG REGR2 DONT USE REWORK10 | Internal Group ID:^2 | Member ID:^90413000100 | Member: Last First^MBRNONBRIDGECUST RWTC4 | Date of birth:^01/01/1940 | Gender:^F - Female | Active effective date range:^01/01/2015 - No end date | Test:^No |
  
  
  
  
  
  
  
  
  
  
  
   