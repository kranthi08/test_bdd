Feature: PharmacyLookup Search verify Reimbursement Reimbursement Results

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
	     | Customer		 | <Customer>    |
	     | Client      | <Client>      |
	     | Group       | <Group>  	   |
	     | Gender			 | <Gender>      |
	     | MemberID    | <MemberID>    | 
	     | AltMemberID | <AltMemberID> |
	     | FirstName   | <FirstName>   |
	     | LastName    | <LastName>    |
	     | DOB         | <DOB>         |      
      
    Examples: 
      | CustomerSet          | Customer                    | Client                     | Group                                 | Gender    | MemberID                      | AltMemberID                       | FirstName         | LastName                    | DOB             | 
      | Customer Set:^Humana | Customer:^0319 - 0319HUMANA | Client:^9007 - NBRG--CLNT1	| Group:^RWNBRG REGR2 DONT USE REWORK10	| Gender:^F | Member ID:^000000090413000100	| Alt Member ID:^000000090413000100	| First Name:^RWTC4	| Last Name:^MBRNONBRIDGECUST	| DOB:^01/01/1940 |
          
   @Functional
   Scenario Outline: Verify Reimbursement_Reimbursement Results 
     Given User in Pharmacy Lookup details page    
     Then User click on Reimbursement icon      
     Then User verifies Reimbursement Results details     
       | RPAccount         | <RPAccount>         |         
       | RPPayment			   | <RPPayment>      	 |
       | RPStatus   		   | <RPStatus>          |
       | RPPaymentDate     | <RPPaymentDate>     |
       | RPFinancialDate   | <RPFinancialDate>   |
       | RPReplacement     | <RPReplacement>     |
       | RPOriginalPayment | <RPOriginalPayment> |
       | RPAmount          | <RPAmount>          |
       | RPName            | <RPName>            |         
       | RPAddress			   | <RPAddress>      	 |
       | RPCity    		     | <RPCity>            |
       | RPState           | <RPState>           |
       | RPZip					   | <RPZip>             |
       | RPReasonCode      | <RPReasonCode>      |
       | RPPaymentAmount   | <RPPaymentAmount>   |
       | RPPIPaymentDate   | <RPPIPaymentDate>   | 
       | RPClearedAmount   | <RPClearedAmount>   |
       | RPClearedDate     | <RPClearedDate>     |
       | RPVariance        | <RPVariance>        | 
       | RPVoidDate        | <RPVoidDate>        |        
       | RPComments        | <RPComments>        |
       | RPFillDate				 | <RPFillDate>        |
       | RPLabelName       | <RPLabelName>       |
       | RPClaimStatus     | <RPClaimStatus>     |
       | RPPharmacyName		 | <RPPharmacyName>    |
       | RAWPFillDate			 | <RAWPFillDate>      |
       | RAWPLabelName     | <RAWPLabelName>     |
       | RAWPClaimStatus   | <RAWPClaimStatus>   |
       | RAWPPharmacyName	 | <RAWPPharmacyName>  |
       | RDFillDate				 | <RDFillDate>  			 |
       | RDLabelName       | <RDLabelName>       |
       | RDClaimStatus     | <RDClaimStatus>     |
       | RDPharmacyName		 | <RDPharmacyName>    |     
          
    Examples: 
      | RPAccount | RPPayment  | RPStatus | RPPaymentDate | RPFinancialDate | RPReplacement | RPOriginalPayment   | RPAmount | RPName | RPAddress | RPCity | RPState | RPZip | RPReasonCode | RPPaymentAmount | RPPIPaymentDate | RPClearedAmount | RPClearedDate | RPVariance | RPVoidDate | RPComments | RPFillDate | RPLabelName | RPClaimStatus | RPPharmacyName | RAWPFillDate | RAWPLabelName | RAWPClaimStatus | RAWPPharmacyName | RDFillDate | RDLabelName | RDClaimStatus | RDPharmacyName |
      | Account^  | Payment #^ | Status^  | Payment Date^ | Financial Date^ | Replacement^  | Original Payment #^ | Amount^  | Name^  | Address^  | City^  | State^  | ZIP^  | Reason code^ | Payment amount^ | Payment date^   | Cleared amount^ | Cleared date^ | Variance^  | Void date^ | Comments^  | Fill Date^ | Label Name^ | Claim Status^ | Pharmacy Name^ | Fill Date^   | Label Name^   | Claim Status^   | Pharmacy Name^   | Fill Date^ | Label Name^ | Claim Status^ | Pharmacy Name^ | 
  
  
  
   