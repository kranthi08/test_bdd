Feature: PharmacyLookup Search verify Benefits and Eligibility Part D

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
  Scenario Outline: Verify Benefits and Eligibility Part D
    Given User in Pharmacy Lookup details page    
    Then User click on Benefits Eligibility icon      
    Then User click on Part D     
    Then User verifies Part D details     
      | CMSMemberSSN		      | <CMSMemberSSN>          |         
      | CMSSpouseSSN			    | <CMSSpouseSSN>          |
      | CMSHealthInsClaimNo   | <CMSHealthInsClaimNo>   |
      | CMSRRBenefitNumber    | <CMSRRBenefitNumber>    |         
      | CMSMaritalStatus	    | <CMSMaritalStatus>   	  |
      | CMSIncome             | <CMSIncome>             |
      | CMSMedicaidID					| <CMSMedicaidID>         |         
      | CMSDatesStart 		 		| <CMSDatesStart>   	    |
      | CMSDatesEnd				 		| <CMSDatesEnd>           |
      | PartDProgramType	 		| <PartDProgramType>      |         
      | PartDProgramValue	 		| <PartDProgramValue>   	|
      | PartDProgramStatus    | <PartDProgramStatus>    |
      | PartDProgramConractID | <PartDProgramConractID> |         
      | PartDProgramIndicator | <PartDProgramIndicator> |
      | PartDProgramStart			| <PartDProgramStart>     |
      | PartDProgramEnd				| <PartDProgramEnd>       |         
      | PartDProgramPorcDate  | <PartDProgramPorcDate>	|
      | PartDSType  				  | <PartDSType>            |
      | PartDSRxTypeCode	    | <PartDSRxTypeCode>      |         
      | PartDSRxGroupID 	    | <PartDSRxGroupID>       |
      | PartDSRxBIN     		  | <PartDSRxBIN>   				|
      | PartDSRxPCN     		  | <PartDSRxPCN>     		  |         
      | PartDSRxMemberID		  | <PartDSRxMemberID>   	  |
      | PartDSRxPersonCode	  | <PartDSRxPersonCode>    |
      | PartDSRxHelpDesk      | <PartDSRxHelpDesk>      |         
      | PartDSStart           | <PartDSStart>   	      |
      | PartDSEnd          	  | <PartDSEnd>             |                
      
    Examples: 
      | CMSMemberSSN | CMSSpouseSSN | CMSHealthInsClaimNo            | CMSRRBenefitNumber       | CMSMaritalStatus | CMSIncome | CMSMedicaidID | CMSDatesStart | CMSDatesEnd | PartDProgramType | PartDProgramValue | PartDProgramStatus | PartDProgramConractID | PartDProgramIndicator | PartDProgramStart | PartDProgramEnd | PartDProgramPorcDate | PartDSType | PartDSRxTypeCode | PartDSRxGroupID | PartDSRxBIN | PartDSRxPCN | PartDSRxMemberID | PartDSRxPersonCode | PartDSRxHelpDesk | PartDSStart | PartDSEnd |
	    | Member SSN^  | Spouse SSN^  | Health insurance claim number^ | Railroad benefit number^ | Marital status^  | Income^   | Medicaid ID^  | Start^        | End^        | Type^            | Value^            | Status^            | Contract ID^          | Indicator^            | Start^            | End^            | Process Date^        | Type^      | Rx Type Code^    | Rx Group ID^    | Rx BIN^     | Rx PCN^     | Rx Member ID^    | Rx Person Code^    | Rx Help Desk^    | Start^      | End^      | 

  
  
  
  
  
  
  
  
  
  
  
  
   