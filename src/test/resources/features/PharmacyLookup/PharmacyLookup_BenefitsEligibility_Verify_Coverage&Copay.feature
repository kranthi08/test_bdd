Feature: PharmacyLookup Search verify Benefits and Eligibility Coverage & Copay

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   | dt79655 |
      | password | sg12345 |
      | region   | DR1     |

  @Functional
  Scenario Outline: Pharmacy Lookup search with valid data
    Given User in Landing Page, he selects the application from menu
    
      | menu 							 | <ApplicationMenu>   |
      
    Then User search for existing pharmacy by entering details in Pharmacy Lookup
    
    	| PharmacyNPI        | <PharmacyNPI>       |
    	| RxNumber				   | <RxNumber>          |
    	
    Then Member details should be displayed
    
      | MemberID           | <MemberID>          |
      | DateOfBirth        | <DateOfBirth>       |
      | MemberName         | <MemberName>        |
      | Error              | <Error>      	     |
      | Date				       | <Date>      	       |
      | Time               | <Time>              |
      | CICSStatus         | <CICSStatus>        |
      | CustID             | <CustID>            |
      | ClientID           | <ClientID>          |
      | Group              | <Group>             |  
      
    Examples: 
      | ApplicationMenu               | PharmacyNPI | RxNumber     | MemberID               | DateOfBirth                | MemberName                  | Error   | Date             | Time           | CICSStatus       | CustID                  | ClientID                         | Group                                   |
      | Miscellaneous->RxNova Connect | 1710927462  | 120005442999 | Member ID:^90413000100 | Date of Birth:^01/01/1940  | Member Name:^MBRNONBRIDGEC… | Error:^ | Date:^06/06/2019 | Time:^10:27:28 | CICS Status:^PWE | Cust ID:^319-0319HUMANA | Client ID:^9007-NBRG--CLIENT-PDP | Group:^2-RWNBRG REGR2 DONT USE REWORK10 |
     
   @Functional
   Scenario Outline: Verify Header details
   Given User in Pharmacy Lookup Search Page and click on Blue arrow at MemberID Fiels
         
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
    Scenario Outline: Verify Benefits and Eligibility Coverage & Copay
     Given User in Pharmacy Lookup details page
    
     Then User click on Benefits Eligibility icon 
     
     Then User click on Coverage & Copay
     
     Then User verifies Coverage & Copay details
     
      | CoverageCode1 	      | <CoverageCode1>         |         
      | CoverageCode2 		    | <CoverageCode2>         |
      | Description   		    | <Description>           |
      | StartDate				      | <StartDate>             |         
      | CoverageFlag  		    | <CoverageFlag>   	      |
      | Priority					    | <Priority>              |
      | ConditionDescription	| <ConditionDescription>  |         
      | CopayField     				| <CopayField>   	        |
      | CopayValues      	 		| <CopayValues>           |
      | CVCopayField		  		| <CVCopayField>          |         
      | CVDescription			 		| <CVDescription>   	    |
      | CVCopay						    | <CVCopay>               |
      | CVCoinsurance		      | <CVCoinsurance>         |         
      | CVProcessingOption    | <CVProcessingOption>    |
      | CVMaxCopay            | <CVMaxCopay>            | 
       
    Examples: 
      | ApplicationMenu         | BenefitCustomerSet    | TrackingID    | Customer | Client | CoverageCode1  | CoverageCode2 | Status        | EffectiveDate   | CopayAssignments | CopayLimits | CopayMultipliers | CopayValues | PerformSWRPProcessing | PerformSPAPProcessing | PerformMMEProcessing  | DispensingLimits   | DrugCoverage | RefillToSoon  | ErrorOverrides  | DedProcessing | MAC     | PostPayReporting | PharmacyComponent |  GenericIndicator   | CustMiscIndicator1 | CustMiscIndicator2 |  CustMiscIndicator3  | CustMiscIndicator4  | CustMiscIndicator5  |  CustMiscIndicator6 |CustMiscIndicator7|CustMiscIndicator8|CustMiscIndicator9|CustMiscIndicator10|PlanType                  |DispenseFeeBrand|DispenseFeeGeneric|CAEAmount| AccBenefitStartDate|AccBenefitEndDate|AccComponentID|AccStartDate       |AccEndDate    | 
      | Benefits->Coverage Code | QTPHybrid_Benefit     | Test TrackID  | 1501     | 1      | 252266         | 662522        | Ready for Use |01/01/2019       |  COVGCA          | COVGCL      | COVGCM           | COVGCV      | No                    | No                    | No                    | COVGDL             | COVGDC       | COVGRTS       | COVGEO          | COVGDP        | COVGMAC | COVGPP           | HYBRID01          | Generic Available   | 1                  | 1                  |  1                   | 1                   | 1                   |  1                  |1                 |1                 |1                 |1                  |EA (ENHANCED ALTERNATIVE) |1               |1                 |1        | 01/01/2019         |12/31/2019       |HYBACCUM      |01/01/2019         |12/31/2019    | 

  
  
  
  
  
  
  
  
  
  
  
  
   