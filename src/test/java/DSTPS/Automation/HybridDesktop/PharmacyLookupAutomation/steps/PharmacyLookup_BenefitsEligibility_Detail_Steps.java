package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages.PharmacyLookup_BenefitsEligibility_DetailSelector;

public class PharmacyLookup_BenefitsEligibility_Detail_Steps {

	PharmacyLookup_BenefitsEligibility_DetailSelector pharmacyLookup_BenefitsEligibility_DetailSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expBenefitsEligibilityDetail = new ArrayList<String>();
	public ArrayList<String> expAdditionalEligibilityDates = new ArrayList<String>();
	public ArrayList<String> expMemberIDDetails = new ArrayList<String>();	
	public SoftAssert benefitsEligibilityDetailSoft = new SoftAssert();
	public SoftAssert additionalEligibilityDatesSoft = new SoftAssert();
	public SoftAssert memberIDDetailsSoft = new SoftAssert();
	
	public PharmacyLookup_BenefitsEligibility_Detail_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		pharmacyLookup_BenefitsEligibility_DetailSelector = new PharmacyLookup_BenefitsEligibility_DetailSelector(SharedResource,utils);
	}
	
	public void verifyBenefitsEligibilityDetails(Map<String,String> benefitsEligibilityDetails)throws Throwable {
		String strMemberID = benefitsEligibilityDetails.get("MemberID");
		String strAltMemberID = benefitsEligibilityDetails.get("AltMemberID");		
		String strFirstName = benefitsEligibilityDetails.get("FirstName");		
		String strLastName = benefitsEligibilityDetails.get("LastName");
		String strMI = benefitsEligibilityDetails.get("MI");
		String strCustomerSet = benefitsEligibilityDetails.get("CustomerSet");
		String strCustomer = benefitsEligibilityDetails.get("Customer");
		String strClient = benefitsEligibilityDetails.get("Client");
		String strGroup = benefitsEligibilityDetails.get("Group");
		String strDOB = benefitsEligibilityDetails.get("DOB");
		String strDeceasedDate = benefitsEligibilityDetails.get("DeceasedDate");		
		String strGender = benefitsEligibilityDetails.get("Gender");		
		String strRelationship = benefitsEligibilityDetails.get("Relationship");
		String strMedicareBeneficiaryID = benefitsEligibilityDetails.get("MedicareBeneficiaryID");
		String strCaseID = benefitsEligibilityDetails.get("CaseId");
		String strCardHolderFirstName = benefitsEligibilityDetails.get("CardHolderFirstName");		
		String strCardHolderLastName = benefitsEligibilityDetails.get("CardHolderLastName");
		String strCardHolderMI = benefitsEligibilityDetails.get("CardHolderMI");
		String strCardReissueDate = benefitsEligibilityDetails.get("CardReissueDate");
		String strCardReissueReason = benefitsEligibilityDetails.get("CardReissueReason");		
		String strLine1 = benefitsEligibilityDetails.get("Line1");		
		String strLine2 = benefitsEligibilityDetails.get("Line2");
		String strLine3 = benefitsEligibilityDetails.get("Line3");
		String strCity = benefitsEligibilityDetails.get("City");
		String strState = benefitsEligibilityDetails.get("State");
		String strZIP = benefitsEligibilityDetails.get("Zip");
		String strCountry = benefitsEligibilityDetails.get("Country");
		String strPhone = benefitsEligibilityDetails.get("Phone");
		String strEmail = benefitsEligibilityDetails.get("Email");		
		String strMiscData1 = benefitsEligibilityDetails.get("MiscData1");		
		String strMiscData2 = benefitsEligibilityDetails.get("MiscData2");
		String strMiscData3 = benefitsEligibilityDetails.get("MiscData3");		
		String strDateOrTimeAdded = benefitsEligibilityDetails.get("DateTimeAdded");
		String strDeviceOrOperatorAdded = benefitsEligibilityDetails.get("DeviceOperatorAdded");
		String strDateOrTimeUpdated = benefitsEligibilityDetails.get("DateTimeUpdated");
		String strDeviceOrOperatorUpdated = benefitsEligibilityDetails.get("DeviceOperatorUpdated");
		
		expBenefitsEligibilityDetail.add(strMemberID);
		expBenefitsEligibilityDetail.add(strAltMemberID);
		expBenefitsEligibilityDetail.add(strFirstName);
		expBenefitsEligibilityDetail.add(strLastName);
		expBenefitsEligibilityDetail.add(strMI);
		expBenefitsEligibilityDetail.add(strCustomerSet);
		expBenefitsEligibilityDetail.add(strCustomer);
		expBenefitsEligibilityDetail.add(strClient);
		expBenefitsEligibilityDetail.add(strGroup);
		expBenefitsEligibilityDetail.add(strDOB);
		expBenefitsEligibilityDetail.add(strDeceasedDate);
		expBenefitsEligibilityDetail.add(strGender);
		expBenefitsEligibilityDetail.add(strRelationship);
		expBenefitsEligibilityDetail.add(strMedicareBeneficiaryID);
		expBenefitsEligibilityDetail.add(strCaseID);
		expBenefitsEligibilityDetail.add(strCardHolderFirstName);
		expBenefitsEligibilityDetail.add(strCardHolderLastName);
		expBenefitsEligibilityDetail.add(strCardHolderMI);
		expBenefitsEligibilityDetail.add(strCardReissueDate);
		expBenefitsEligibilityDetail.add(strCardReissueReason);
		expBenefitsEligibilityDetail.add(strLine1);
		expBenefitsEligibilityDetail.add(strLine2);
		expBenefitsEligibilityDetail.add(strLine3);
		expBenefitsEligibilityDetail.add(strCity);
		expBenefitsEligibilityDetail.add(strState);
		expBenefitsEligibilityDetail.add(strZIP);
		expBenefitsEligibilityDetail.add(strCountry);
		expBenefitsEligibilityDetail.add(strPhone);
		expBenefitsEligibilityDetail.add(strEmail);
		expBenefitsEligibilityDetail.add(strMiscData1);
		expBenefitsEligibilityDetail.add(strMiscData2);
		expBenefitsEligibilityDetail.add(strMiscData3);
		expBenefitsEligibilityDetail.add(strDateOrTimeAdded);
		expBenefitsEligibilityDetail.add(strDeviceOrOperatorAdded);
		expBenefitsEligibilityDetail.add(strDateOrTimeUpdated);
		expBenefitsEligibilityDetail.add(strDeviceOrOperatorUpdated);
		
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_MemberID(strMemberID);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_AltMemberID(strAltMemberID);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_FirstName(strFirstName);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_LastName(strLastName);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_MI(strMI);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_CustomerSet(strCustomerSet);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_Customer(strCustomer);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_Client(strClient);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_Group(strGroup);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_DOB(strDOB);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_DeceasedDate(strDeceasedDate);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_Gender(strGender);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_Relationship(strRelationship);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_MedicareBeneficiaryID(strMedicareBeneficiaryID);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_CaseID(strCaseID);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_CardHolderFirstName(strCardHolderFirstName);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_CardHolderLastName(strCardHolderLastName);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_CardHolderMI(strCardHolderMI);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_CardReissueDate(strCardReissueDate);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_CardReissueReason(strCardReissueReason);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_Line1(strLine1);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_Line2(strLine2);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_Line3(strLine3);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_City(strCity);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_State(strState);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_ZIP(strZIP);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_Country(strCountry);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_Phone(strPhone);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_Email(strEmail);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_MiscData1(strMiscData1);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_MiscData2(strMiscData2);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_MiscData3(strMiscData3);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_DateOrTimeAdded(strDateOrTimeAdded);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_DeviceOrOperatorAdded(strDeviceOrOperatorAdded);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_DateOrTimeUpdated(strDateOrTimeUpdated);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_DeviceOrOperatorUpdated(strDeviceOrOperatorUpdated);
			
		for(int i=0;i<expBenefitsEligibilityDetail.size();i++)
		{
			benefitsEligibilityDetailSoft.assertEquals(pharmacyLookup_BenefitsEligibility_DetailSelector.actBenefitsEligibilityDetail.get(i), expBenefitsEligibilityDetail.get(i));
		}		
		benefitsEligibilityDetailSoft.assertAll();
	}
	
	
	public void verifyAdditionalEligibilityDatesDetails(Map<String,String> addEligblDatesDetails) throws Throwable{
		String strMemberID = addEligblDatesDetails.get("MemberID");
		String strAltMemberID = addEligblDatesDetails.get("AltMemberID");		
		String strFirstName = addEligblDatesDetails.get("FirstName");		
		String strLastName = addEligblDatesDetails.get("LastName");
		String strMI = addEligblDatesDetails.get("MI");
		String strCustomerSet = addEligblDatesDetails.get("CustomerSet");
		String strCustomer = addEligblDatesDetails.get("Customer");
		String strClient = addEligblDatesDetails.get("Client");
		String strGroup = addEligblDatesDetails.get("Group");
		String strMemberStartDate = addEligblDatesDetails.get("MemEligbilityStart");
		String strMemberEndDate = addEligblDatesDetails.get("MemEligbilityEnd");		
		String strMemberProcessDate = addEligblDatesDetails.get("MemEligbilityProcess");		
		String strGroupStartDate = addEligblDatesDetails.get("GrpEligbilityStart");
		String strGroupEndDate = addEligblDatesDetails.get("GrpEligbilityEnd");
		String strGroupProcessDate = addEligblDatesDetails.get("GrpEligbilityProcess");
		String strClientStartDate = addEligblDatesDetails.get("CliEligbilityStart");		
		String strClientEndDate = addEligblDatesDetails.get("CliEligbilityEnd");		
		String strClientProcessDate = addEligblDatesDetails.get("CliEligbilityProcess");
		String strCustomerStartDate = addEligblDatesDetails.get("CusEligbilityStart");
		String strCustomerEndDate = addEligblDatesDetails.get("CusEligbilityEnd");
		String strCustomerProcessDate = addEligblDatesDetails.get("CusEligbilityProcess");
		
		expAdditionalEligibilityDates.add(strMemberID);
		expAdditionalEligibilityDates.add(strAltMemberID);
		expAdditionalEligibilityDates.add(strFirstName);
		expAdditionalEligibilityDates.add(strLastName);
		expAdditionalEligibilityDates.add(strMI);
		expAdditionalEligibilityDates.add(strCustomerSet);
		expAdditionalEligibilityDates.add(strCustomer);
		expAdditionalEligibilityDates.add(strClient);
		expAdditionalEligibilityDates.add(strGroup);		
		expAdditionalEligibilityDates.add(strMemberStartDate);
		expAdditionalEligibilityDates.add(strMemberEndDate);
		expAdditionalEligibilityDates.add(strMemberProcessDate);
		expAdditionalEligibilityDates.add(strGroupStartDate);
		expAdditionalEligibilityDates.add(strGroupEndDate);
		expAdditionalEligibilityDates.add(strGroupProcessDate);
		expAdditionalEligibilityDates.add(strClientStartDate);
		expAdditionalEligibilityDates.add(strClientEndDate);
		expAdditionalEligibilityDates.add(strClientProcessDate);
		expAdditionalEligibilityDates.add(strCustomerStartDate);
		expAdditionalEligibilityDates.add(strCustomerEndDate);
		expAdditionalEligibilityDates.add(strCustomerProcessDate);
		
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_clickOnViewAdditionalEligibilityDatesLink();
		pharmacyLookup_BenefitsEligibility_DetailSelector.waitUntillAdditionalEligibilityDates();
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_MemberID(strMemberID);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_AltMemberID(strAltMemberID);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_FirstName(strFirstName);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_LastName(strLastName);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_MI(strMI);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_CustomerSet(strCustomerSet);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_Customer(strCustomer);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_Client(strClient);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_Group(strGroup);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_MemberStartDate(strMemberStartDate);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_MemberEndDate(strMemberEndDate);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_MemberProcessDate(strMemberProcessDate);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_GroupStartDate(strGroupStartDate);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_GroupEndDate(strGroupEndDate);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_GroupProcessDate(strGroupProcessDate);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_ClientStartDate(strClientStartDate);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_ClientEndDate(strClientEndDate);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_ClientProcessDate(strClientProcessDate);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_CustomerStartDate(strCustomerStartDate);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_CustomerEndDate(strCustomerEndDate);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_CustomerProcessDate(strCustomerProcessDate);
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_clickOnCloseButton();
		
		for(int i=0;i<expAdditionalEligibilityDates.size();i++)
		{
			additionalEligibilityDatesSoft.assertEquals(pharmacyLookup_BenefitsEligibility_DetailSelector.actAdditionalEligibilityDates.get(i), expAdditionalEligibilityDates.get(i));
		}		
		additionalEligibilityDatesSoft.assertAll();
	}
	
	
	public void verifyMemberIDDetails(Map<String,String> memberIDDetails) throws Throwable{
		String strMCS = memberIDDetails.get("MasterCustomerSet");
		String strCustomerName = memberIDDetails.get("CustomerName");		
		String strClientName = memberIDDetails.get("ClientName");		
		String strExternalGroupID = memberIDDetails.get("ExternalGroupID");
		String strInternalGroupID = memberIDDetails.get("InternalGroupID");
		String strMemberID = memberIDDetails.get("MemberID");
		String strMemberLastFirst = memberIDDetails.get("MemberLastFirstName");		
		String strDOB = memberIDDetails.get("DateOfBirth");		
		String strGender = memberIDDetails.get("Gender");
		String strActiveEffDateRange = memberIDDetails.get("ActiveEffDateRange");
		String strTest = memberIDDetails.get("Test");
		
		expMemberIDDetails.add(strMCS);
		expMemberIDDetails.add(strCustomerName);
		expMemberIDDetails.add(strClientName);
		expMemberIDDetails.add(strExternalGroupID);
		expMemberIDDetails.add(strInternalGroupID);
		expMemberIDDetails.add(strMemberID);
		expMemberIDDetails.add(strMemberLastFirst);
		expMemberIDDetails.add(strDOB);
		expMemberIDDetails.add(strGender);
		expMemberIDDetails.add(strActiveEffDateRange);
		expMemberIDDetails.add(strTest);		
		
		pharmacyLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_clickOnMemberIDLink();
		pharmacyLookup_BenefitsEligibility_DetailSelector.verifyMemberIDDetails();
		pharmacyLookup_BenefitsEligibility_DetailSelector.Member_MasterCustomerSet(strMCS);
		pharmacyLookup_BenefitsEligibility_DetailSelector.Member_CustomerName(strCustomerName);
		pharmacyLookup_BenefitsEligibility_DetailSelector.Member_ClientName(strClientName);
		pharmacyLookup_BenefitsEligibility_DetailSelector.Member_ExternalGroupID(strExternalGroupID);
		pharmacyLookup_BenefitsEligibility_DetailSelector.Member_InternalGroupID(strInternalGroupID);
		pharmacyLookup_BenefitsEligibility_DetailSelector.Member_MemberID(strMemberID);
		pharmacyLookup_BenefitsEligibility_DetailSelector.Member_MemberLastFirst(strMemberLastFirst);
		pharmacyLookup_BenefitsEligibility_DetailSelector.Member_DOB(strDOB);
		pharmacyLookup_BenefitsEligibility_DetailSelector.Member_Gender(strGender);
		pharmacyLookup_BenefitsEligibility_DetailSelector.Member_ActiveEffDateRange(strActiveEffDateRange);
		pharmacyLookup_BenefitsEligibility_DetailSelector.Member_Test(strTest);
		pharmacyLookup_BenefitsEligibility_DetailSelector.closeRxNovaMember();
		
		for(int i=0;i<expMemberIDDetails.size();i++)
		{
			memberIDDetailsSoft.assertEquals(pharmacyLookup_BenefitsEligibility_DetailSelector.actMemberIDDetails.get(i), expMemberIDDetails.get(i));
		}		
		memberIDDetailsSoft.assertAll();
	}
}

