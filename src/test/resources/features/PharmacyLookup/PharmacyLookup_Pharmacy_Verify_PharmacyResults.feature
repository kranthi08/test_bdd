Feature: PharmacyLookup Search verify Pharmacy Pharmacy Results

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
      | ApplicationMenu               | PharmacyNPI | RxNumber     | MemberID              | DateOfBirth              | MemberName                       | Error  | Date            | Time          | CICSStatus      | CustID                    | ClientID                                          | Group                                    |
      | Miscellaneous->RxNova Connect | 1710927462  | 120005552999 | Member ID^90413000100 | Date of Birth^01/01/1940 | Member Name^MBRNONBRIDGECUST RWT | Error^ | Date^01/16/2020 | Time^10:27:28 | CICS Status^PWE | Cust ID^319 - 0319HUMANA  | Client ID^9007 - NBRG--CLNT1 - NONBRG CLIENT--PDP | Group^2 - RWNBRG REGR2 DONT USE REWORK10 |
      
     
  @Functional
  Scenario Outline: Verify Header details
	  Given User in Pharmacy Lookup Search Page and click on Blue arrow at MemberID Field         
	  Then User verifies the header details      
	    | CustomerSet | <CustomerSet> |         
	    | Customer		| <Customer>    |
	    | Client      | <Client>      |
	    | Group       | <Group>  	    |
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
  Scenario Outline: Verify Pharmacy_Pharmacy Results 
    Given User in Pharmacy Lookup details page    
    Then User click on Pharmacy icon     
    Then User provides details and click on search for Network Pharmacies     
      | City  | <City>  |         
      | State	| <State> |
      | Zip		| <Zip>   |     
      | NPI		| <NPI>   |     
    Then User verifies Pharmacy Results details       
      | PRPharmacyName		    | <PRPharmacyName>        |          
      | PRNPI								  | <PRNPI>   						  |
      | PRAddress						  | <PRAddress> 				    |
      | PRCity						    | <PRCity>       			    |         
      | PRState							  | <PRState>   					  |
      | PRZipCode						  | <PRZipCode>    			    |
      | PRGILegalBusinessName | <PRGILegalBusinessName> |         
      | PRGIName							| <PRGIName>   	          |
      | PRGINCPDPID						| <PRGINCPDPID>           |
      | PRGINPIID							| <PRGINPIID>             |         
      | PRGIMedicareID				| <PRGIMedicareID>   	    |
      | PRGIStoreNumber				| <PRGIStoreNumber>       |
      | PRGIDoctorsName				| <PRGIDoctorsName>       |         
      | PRGILanguageCodes			| <PRGILanguageCodes>   	|
      | PRGIDispenseClassCode	| <PRGIDispenseClassCode> |
      | PRGIPriProvTypeCode   | <PRGIPriProvTypeCode>   |         
      | PRGISecProvTypeCode		| <PRGISecProvTypeCode>   |
      | PRGITerProvTypeCode		| <PRGITerProvTypeCode>   |
      | LocationAddress1      | <LocationAddress1>      |         
      | LocationAddress2	    | <LocationAddress2>   	  |
      | LocationCity          | <LocationCity>          |
      | LocationState		      | <LocationState>         |         
      | LocationZIP     	    | <LocationZIP>   	      |
      | LocationPhone         | <LocationPhone>         |
      | LocationExtension     | <LocationExtension>     |         
      | LocationFax				    | <LocationFax>   	      |
      | LocationEmail			    | <LocationEmail>         |
      | LocationCrossStDir    | <LocationCrossStDir>    |         
      | PRS24HourOperation 	  | <PRS24HourOperation>   	|
      | PRSProvideHours       | <PRSProvideHours>       |
      | PRSAcceptsEPresc    	| <PRSAcceptsEPresc>   	  |
      | PRSDeliveryService    | <PRSDeliveryService>    |
      | PRSComService         | <PRSComService>   	    |
      | PRSDriveUpWindow      | <PRSDriveUpWindow>      |
      | PRSDurableMedEquip    | <PRSDurableMedEquip>   	|
      | PRSWalkInClinic       | <PRSWalkInClinic>       |
      | PRS24HourEmerService  | <PRS24HourEmerService>  |
      | PRSMultiDoseComPkg    | <PRSMultiDoseComPkg>    |
      | PRSImmunProvided      | <PRSImmunProvided>   	  |
      | PRSHandicappedAcces   | <PRSHandicappedAcces>   |
      | PRS340BStatus       	| <PRS340BStatus>   	    |
      | PRSCDoorFacility      | <PRSCDoorFacility>      |
       
    Examples: 
      | City | State | Zip    | NPI | PRPharmacyName | PRNPI | PRAddress | PRCity | PRState | PRZipCode | PRGILegalBusinessName | PRGIName | PRGINCPDPID | PRGINPIID | PRGIMedicareID | PRGIStoreNumber | PRGIDoctorsName | PRGILanguageCodes | PRGIDispenseClassCode | PRGIPriProvTypeCode         | PRGISecProvTypeCode           | PRGITerProvTypeCode          | LocationAddress1 | LocationAddress2 | LocationCity | LocationState | LocationZIP | LocationPhone | LocationExtension | LocationFax | LocationEmail | LocationCrossStDir     | PRS24HourOperation | PRSProvideHours | PRSAcceptsEPresc        | PRSDeliveryService | PRSComService        | PRSDriveUpWindow | PRSDurableMedEquip         | PRSWalkInClinic | PRS24HourEmerService       | PRSMultiDoseComPkg               | PRSImmunProvided        | PRSHandicappedAcces     | PRS340BStatus | PRSCDoorFacility      |    
      |      |       | 123456 |     | Pharmacy Name^ | NPI^  | Address^  | City^  | State^  | Zip Code^ | Legal business name^  | Name^    | NCPDP ID^   | NPI ID^   | Medicare ID^   | Store number^   | Doctor's name^  | Language code(s)^ | Dispense class code^  | Primary provider type code^ | Secondary provider type code^ | Tertiary provider type code^ | Address 1^       | Address 2^       | City^        | State^        | ZIP^        | Phone^        | Extension^        | Fax^        | Email^        | Cross St / Directions^ | 24 hour operation^ | Provider hours^ | Accepts ePrescriptions^ | Delivery service^  | Compounding service^ | Drive-up window^ | Durable medical equipment^ | Walk-in clinic^ | 24-hour emergency service^ | Multi-dose compliance packaging^ | Immunizations provided^ | Handicapped accessible^ | 340B status^  | Closed door facility^ |  

  
  
  
  
  
  
  
  
  
  
  
  
   