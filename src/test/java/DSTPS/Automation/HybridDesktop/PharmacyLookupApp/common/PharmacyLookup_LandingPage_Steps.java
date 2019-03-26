package DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;

public class PharmacyLookup_LandingPage_Steps {

	PharmacyLookup_LandingPageSelector pharmacyLookup_LandingPageSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expMemberDetails = new ArrayList<String>();
	public ArrayList<String> expSubmittedInformation = new ArrayList<String>();
	public ArrayList<String> expHeaderSummary = new ArrayList<String>();
	public SoftAssert verifyErrorMessageSoft = new SoftAssert();
	public SoftAssert memberDetailsSoft = new SoftAssert();
	public SoftAssert submittedInfoSoft = new SoftAssert();
	public SoftAssert headerSummarySoft = new SoftAssert();
	
	public PharmacyLookup_LandingPage_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		pharmacyLookup_LandingPageSelector = new PharmacyLookup_LandingPageSelector(SharedResource,utils);
	}
	
	public void searchPharmacyLookUp(Map<String,String> searchDetails)throws Throwable {
		String strPharmacyNPI = searchDetails.get("PharmacyNPI");
		String strRxNumber = searchDetails.get("RxNumber");
		
		pharmacyLookup_LandingPageSelector.PharmacyLookup_LandingPage_enterPharmacy_NPI(strPharmacyNPI);
		pharmacyLookup_LandingPageSelector.PharmacyLookup_LandingPage_enterRx_Number(strRxNumber);
		pharmacyLookup_LandingPageSelector.PharmacyLookup_LandingPage_clickOnSearchButton();
		Thread.sleep(2000);
	}
	
	public void verifyErrorMessage(Map<String,String> errorMessage)throws Throwable {
		String strPharmacyNPIError = errorMessage.get("PharmacyNPIErrorMessage");
		String strRxNumberError = errorMessage.get("RxNumberErorrMessage");
		
		//Assert.assertTrue(pharmacyLookup_LandingPageSelector.getPharmacyNPIErrorMessage().contains(strPharmacyNPIError));
		//Assert.assertTrue(pharmacyLookup_LandingPageSelector.getRxNumberErrorMessage().contains(strRxNumberError));
        
		verifyErrorMessageSoft.assertEquals(pharmacyLookup_LandingPageSelector.getPharmacyNPIErrorMessage(), strPharmacyNPIError);
		verifyErrorMessageSoft.assertEquals(pharmacyLookup_LandingPageSelector.getRxNumberErrorMessage(), strRxNumberError);
		verifyErrorMessageSoft.assertAll();
		verifyErrorMessageSoft = null;
	}
	
	public void verifyPharmacySearchResults() throws Throwable {
		pharmacyLookup_LandingPageSelector.waitUntillPharmacySearchResults();
		pharmacyLookup_LandingPageSelector.verifyPharmacySearchResults();
	}
	
	public void verifyMemberDetails(Map<String,String> memberDetails) throws Throwable {
		String strMemberID = memberDetails.get("MemberID");
		String strDateOfBirth = memberDetails.get("DateOfBirth");
		String strMemberName = memberDetails.get("MemberName");
		String strError = memberDetails.get("Error");
		String strDate = memberDetails.get("Date");
		String strTime = memberDetails.get("Time");
		String strCICSStatus = memberDetails.get("CICSStatus");
		String strCustID = memberDetails.get("CustID");
		String strClientID = memberDetails.get("ClientID");
		String strGroup = memberDetails.get("Group");
		
		expMemberDetails.add(strMemberID);
		expMemberDetails.add(strDateOfBirth);
		expMemberDetails.add(strMemberName);
		expMemberDetails.add(strError);
		expMemberDetails.add(strDate);
		expMemberDetails.add(strTime);
		expMemberDetails.add(strCICSStatus);
		expMemberDetails.add(strCustID);
		expMemberDetails.add(strClientID);
		expMemberDetails.add(strGroup);
		
		pharmacyLookup_LandingPageSelector.waitUntillPharmacySearchResults();
		pharmacyLookup_LandingPageSelector.Member_Details_MemberID(strMemberID);
		pharmacyLookup_LandingPageSelector.Member_Details_DateOfBirth(strDateOfBirth);
		pharmacyLookup_LandingPageSelector.Member_Details_MemberName(strMemberName);
		pharmacyLookup_LandingPageSelector.Member_Details_Error(strError);
		pharmacyLookup_LandingPageSelector.Member_Details_Date(strDate);
		pharmacyLookup_LandingPageSelector.Member_Details_Time(strTime);
		pharmacyLookup_LandingPageSelector.Member_Details_CICSStatus(strCICSStatus);
		pharmacyLookup_LandingPageSelector.Member_Details_CustID(strCustID);
		pharmacyLookup_LandingPageSelector.Member_Details_ClientID(strClientID);
		pharmacyLookup_LandingPageSelector.Member_Details_Group(strGroup);
		
		for(int i=0;i<expMemberDetails.size();i++)
		{
			memberDetailsSoft.assertEquals(pharmacyLookup_LandingPageSelector.actMemberDetails.get(i), expMemberDetails.get(i));
		}		
		memberDetailsSoft.assertAll();
		memberDetailsSoft = null;
		
	}
	
	
	public void verifySubmittedInformation(Map<String,String> submittedInformation) throws Throwable {
		String strFirstName = submittedInformation.get("FirstName");
		String strLastName = submittedInformation.get("LastName");
		String strDateOfBirth = submittedInformation.get("DateOfBirth");
		String strPersonCode = submittedInformation.get("PersonCode");
		String strCardholderID = submittedInformation.get("CardholderID");
		String strGroup = submittedInformation.get("Group");
		String strBIN = submittedInformation.get("BIN");
		String strPCN = submittedInformation.get("PCN");
		String strGender = submittedInformation.get("Gender");
		String strRelationshipCode = submittedInformation.get("RelationshipCode");
		
		expSubmittedInformation.add(strFirstName);
		expSubmittedInformation.add(strLastName);
		expSubmittedInformation.add(strDateOfBirth);
		expSubmittedInformation.add(strPersonCode);
		expSubmittedInformation.add(strCardholderID);
		expSubmittedInformation.add(strGroup);
		expSubmittedInformation.add(strBIN);
		expSubmittedInformation.add(strPCN);
		expSubmittedInformation.add(strGender);
		expSubmittedInformation.add(strRelationshipCode);
		
		pharmacyLookup_LandingPageSelector.Member_Details_ClickOnMemberID();
		pharmacyLookup_LandingPageSelector.waitUntillSubmittedInformationDetails();
		pharmacyLookup_LandingPageSelector.Submitted_Information_FirstName(strFirstName);
		pharmacyLookup_LandingPageSelector.Submitted_Information_LastName(strLastName);
		pharmacyLookup_LandingPageSelector.Submitted_Information_DateOfBirth(strDateOfBirth);
		pharmacyLookup_LandingPageSelector.Submitted_Information_PersonCode(strPersonCode);
		pharmacyLookup_LandingPageSelector.Submitted_Information_CardholderID(strCardholderID);
		pharmacyLookup_LandingPageSelector.Submitted_Information_Group(strGroup);
		pharmacyLookup_LandingPageSelector.Submitted_Information_BIN(strBIN);
		pharmacyLookup_LandingPageSelector.Submitted_Information_PCN(strPCN);
		pharmacyLookup_LandingPageSelector.Submitted_Information_Gender(strGender);
		pharmacyLookup_LandingPageSelector.Submitted_Information_RelationshipCode(strRelationshipCode);
		
		for(int i=0;i<expSubmittedInformation.size();i++)
		{
			submittedInfoSoft.assertEquals(pharmacyLookup_LandingPageSelector.actSubmittedInformation.get(i), expSubmittedInformation.get(i));
		}		
		submittedInfoSoft.assertAll();
		submittedInfoSoft = null;
	}
	
	
	public void clickOnMemberIDLink() throws Throwable{
		pharmacyLookup_LandingPageSelector.Member_Details_ClickOnMemberIDLink();
		utils.GetBusyStatus();
	}
	
	public void verifyHeaderDetails(Map<String,String> headerDetails) throws Throwable {
		String strCustomerSet = headerDetails.get("CustomerSet");
		String strCustomer = headerDetails.get("Customer");
		String strClient = headerDetails.get("Client");
		String strGroup = headerDetails.get("Group");
		String strGender = headerDetails.get("Gender");
		String strMemberID = headerDetails.get("MemberID");
		String strAltMemberID = headerDetails.get("AltMemberID");
		String strFirstName = headerDetails.get("FirstName");
		String strLastName = headerDetails.get("LastName");
		String strDOB = headerDetails.get("DOB");
		
		expHeaderSummary.add(strCustomerSet);
		expHeaderSummary.add(strCustomer);
		expHeaderSummary.add(strClient);
		expHeaderSummary.add(strGroup);
		expHeaderSummary.add(strGender);
		expHeaderSummary.add(strMemberID);
		expHeaderSummary.add(strAltMemberID);
		expHeaderSummary.add(strFirstName);
		expHeaderSummary.add(strLastName);
		expHeaderSummary.add(strDOB);
		
		pharmacyLookup_LandingPageSelector.waitUntillHeaderSummary();
		pharmacyLookup_LandingPageSelector.Header_Summary_CustomerSet(strCustomerSet);
		pharmacyLookup_LandingPageSelector.Header_Summary_Customer(strCustomer);
		pharmacyLookup_LandingPageSelector.Header_Summary_Client(strClient);
		pharmacyLookup_LandingPageSelector.Header_Summary_Group(strGroup);
		pharmacyLookup_LandingPageSelector.Header_Summary_Gender(strGender);
		pharmacyLookup_LandingPageSelector.Header_Summary_MemberID(strMemberID);
		pharmacyLookup_LandingPageSelector.Header_Summary_AltMemberID(strAltMemberID);
		pharmacyLookup_LandingPageSelector.Header_Summary_FirstName(strFirstName);
		pharmacyLookup_LandingPageSelector.Header_Summary_LastName(strLastName);
		pharmacyLookup_LandingPageSelector.Header_Summary_DOB(strDOB);
		
		for(int i=0;i<expHeaderSummary.size();i++)
		{
			headerSummarySoft.assertEquals(pharmacyLookup_LandingPageSelector.actHeaderSummary.get(i), expHeaderSummary.get(i));
		}		
		headerSummarySoft.assertAll();
		headerSummarySoft = null;
	}
	
	public void verifyPharmacyLookupDetail(){
		pharmacyLookup_LandingPageSelector.verifyPharmacyLookupDetail();
	}
}

