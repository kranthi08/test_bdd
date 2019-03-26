package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class PharmacyLookup_BenefitsEligibility_DetailSelector {

	private By BEDETAIL_TABLE,BEDETAIL_MEMBER_TABLE,BEDETAIL_CARDREISSUE_TABLE;
	private By BEDETAIL_ADDRESS_TABLE,BEDETAIL_MISCINFO_TABLE,BEDETAIL_MAINTENANCEINFO_TABLE;
	private By BEDETAIL_VIEWADDELIGBLDATES_LINK,AED_MEMBERELIGIBILITYDATES_TABLE,AED_GROUPELIGIBILITYDATES_TABLE;
	private By AED_CLIENTELIGIBILITYDATES_TABLE,AED_CUSTOMERELIGIBILITYDATES_TABLE,AED_CLOSE_BUTTON;
	private By BEDETAIL_MEMBERID_LINK,MEMBER_HEADER_SUMMARY,MEMBER_HEADER_DATE;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actBenefitsEligibilityDetail = new ArrayList<String>();
	public ArrayList<String> actAdditionalEligibilityDates = new ArrayList<String>();
	public ArrayList<String> actMemberIDDetails = new ArrayList<String>();
	
	public PharmacyLookup_BenefitsEligibility_DetailSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		PharmacyLookup_BenefitsEligibility_Detail_Objects();
	}
	
	private void  PharmacyLookup_BenefitsEligibility_Detail_Objects()
	{		
		BEDETAIL_TABLE = By.xpath("//table[@class='word-break-tbl benefits-member-tbl']");
		BEDETAIL_MEMBER_TABLE = By.xpath("//table[@class='word-break-tbl benefits-detail-tbl-col2']"); 		
		BEDETAIL_CARDREISSUE_TABLE = By.xpath("//table[@class='word-break-tbl benefits-detail-tbl-col4']");
		BEDETAIL_ADDRESS_TABLE = By.xpath("//table[@class='word-break-tbl benefits-detail-tbl-col3']");
		BEDETAIL_MISCINFO_TABLE = By.xpath("//table[@class='fl word-break-tbl benefits-detail-tbl-col5']");
		BEDETAIL_MAINTENANCEINFO_TABLE = By.xpath("//table[@class='fl clearfix word-break-tbl benefits-detail-tbl-col6']");
		BEDETAIL_VIEWADDELIGBLDATES_LINK = By.linkText("View Additional Eligibility Dates");
		AED_MEMBERELIGIBILITYDATES_TABLE = By.id("benefitsSelectionForm:addtionalMemberDateRanges");
		AED_GROUPELIGIBILITYDATES_TABLE = By.id("benefitsSelectionForm:addtionalGroupDateRanges");
		AED_CLIENTELIGIBILITYDATES_TABLE = By.id("benefitsSelectionForm:addtionalClientDateRanges");
		AED_CUSTOMERELIGIBILITYDATES_TABLE = By.id("benefitsSelectionForm:addtionalCustomerDateRanges");
		AED_CLOSE_BUTTON = By.id("benefitsSelectionForm:closeBtn");
		BEDETAIL_MEMBERID_LINK = By.xpath("//table[@class='word-break-tbl benefits-member-tbl']//tr[1]/td[2]/a");
		MEMBER_HEADER_SUMMARY = By.id("memberViewUpdateForm:memberHeaderSummaryPanel");
		MEMBER_HEADER_DATE = By.id("memberViewUpdateForm:memberHeaderDatePanel");
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Benefits & Eligibility Detail Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void BenefitsEligibility_BEDetail_MemberID(String strMemberID) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strMemberID));
	}
	
	public void BenefitsEligibility_BEDetail_AltMemberID(String strAltMemberID) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strAltMemberID));
	}
	
	public void BenefitsEligibility_BEDetail_FirstName(String strFirstName) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strFirstName));
	}
	
	public void BenefitsEligibility_BEDetail_LastName(String strLastName) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strLastName));
	}
	
	public void BenefitsEligibility_BEDetail_MI(String strMI) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strMI));
	}
	
	public void BenefitsEligibility_BEDetail_CustomerSet(String strCustomerSet) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strCustomerSet));
	}
	
	public void BenefitsEligibility_BEDetail_Customer(String strCustomer) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strCustomer));
	}
	
	public void BenefitsEligibility_BEDetail_Client(String strClient) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strClient));
	}
	
	public void BenefitsEligibility_BEDetail_Group(String strGroup) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strGroup));
	}
	
	public void BenefitsEligibility_BEDetail_DOB(String strDOB) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MEMBER_TABLE,strDOB));
	}
	
	public void BenefitsEligibility_BEDetail_DeceasedDate(String strDeceasedDate) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MEMBER_TABLE,strDeceasedDate));
	}
	
	public void BenefitsEligibility_BEDetail_Gender(String strGender) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MEMBER_TABLE,strGender));
	}
	
	public void BenefitsEligibility_BEDetail_Relationship(String strRelationship) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MEMBER_TABLE,strRelationship));
	}
	
	public void BenefitsEligibility_BEDetail_MedicareBeneficiaryID(String strMedicareBeneficiaryID) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MEMBER_TABLE,strMedicareBeneficiaryID));
	}
	
	public void BenefitsEligibility_BEDetail_CaseID(String strCaseID) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MEMBER_TABLE,strCaseID));
	}
	
	// Cardholder Information
	
	public void BenefitsEligibility_BEDetail_CardHolderFirstName(String strCardHolderFirstName) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MEMBER_TABLE,strCardHolderFirstName));
	}
	
	public void BenefitsEligibility_BEDetail_CardHolderLastName(String strCardHolderLastName) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MEMBER_TABLE,strCardHolderLastName));
	}
	
	public void BenefitsEligibility_BEDetail_CardHolderMI(String strCardHolderMI) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MEMBER_TABLE,strCardHolderMI));
	}
	
	public void BenefitsEligibility_BEDetail_CardReissueDate(String strCardReissueDate) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_CARDREISSUE_TABLE,strCardReissueDate));
	}
	
	public void BenefitsEligibility_BEDetail_CardReissueReason(String strCardReissueReason) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_CARDREISSUE_TABLE,strCardReissueReason));
	}
	
	// Address
	
	public void BenefitsEligibility_BEDetail_Line1(String strLine1) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_ADDRESS_TABLE,strLine1));
	}
	
	public void BenefitsEligibility_BEDetail_Line2(String strLine2) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_ADDRESS_TABLE,strLine2));
	}
	
	public void BenefitsEligibility_BEDetail_Line3(String strLine3) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_ADDRESS_TABLE,strLine3));
	}
	
	public void BenefitsEligibility_BEDetail_City(String strCity) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_ADDRESS_TABLE,strCity));
	}
	
	public void BenefitsEligibility_BEDetail_State(String strState) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_ADDRESS_TABLE,strState));
	}
	
	public void BenefitsEligibility_BEDetail_ZIP(String strZIP) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_ADDRESS_TABLE,strZIP));
	}
	
	public void BenefitsEligibility_BEDetail_Country(String strCountry) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_ADDRESS_TABLE,strCountry));
	}
	
	public void BenefitsEligibility_BEDetail_Phone(String strPhone) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_ADDRESS_TABLE,strPhone));
	}
	
	public void BenefitsEligibility_BEDetail_Email(String strEmail) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_ADDRESS_TABLE,strEmail));
	}
	
	// Miscellaneous Information
	
	public void BenefitsEligibility_BEDetail_MiscData1(String strMiscData1) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MISCINFO_TABLE,strMiscData1));
	}
	
	public void BenefitsEligibility_BEDetail_MiscData2(String strMiscData2) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MISCINFO_TABLE,strMiscData2));
	}
	
	public void BenefitsEligibility_BEDetail_MiscData3(String strMiscData3) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MISCINFO_TABLE,strMiscData3));
	}
	
	// Maintenance Information
	
	public void BenefitsEligibility_BEDetail_DateOrTimeAdded(String strDateOrTimeAdded) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MAINTENANCEINFO_TABLE,strDateOrTimeAdded));
	}
	
	public void BenefitsEligibility_BEDetail_DeviceOrOperatorAdded(String strDeviceOrOperatorAdded) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MAINTENANCEINFO_TABLE,strDeviceOrOperatorAdded));
	}
	
	public void BenefitsEligibility_BEDetail_DateOrTimeUpdated(String strDateOrTimeUpdated) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MAINTENANCEINFO_TABLE,strDateOrTimeUpdated));
	}
	
	public void BenefitsEligibility_BEDetail_DeviceOrOperatorUpdated(String strDeviceOrOperatorUpdated) throws Throwable{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MAINTENANCEINFO_TABLE,strDeviceOrOperatorUpdated));
	}
	
	// View Additional Eligibility Dates
	
	public void BenefitsEligibility_BEDetail_clickOnViewAdditionalEligibilityDatesLink() throws Throwable{
		utils.ClickOnLink(BEDETAIL_VIEWADDELIGBLDATES_LINK);
		utils.GetBusyStatus();
	}
	
	public void waitUntillAdditionalEligibilityDates() throws Throwable{
		utils.CheckElementPresenceByLocator(AED_MEMBERELIGIBILITYDATES_TABLE);
		Thread.sleep(1000);
	}
	
	public void BenefitsEligibility_AED_MemberID(String strMemberID) throws Throwable{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strMemberID));
	}
	
	public void BenefitsEligibility_AED_AltMemberID(String strAltMemberID) throws Throwable{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strAltMemberID));
	}
	
	public void BenefitsEligibility_AED_FirstName(String strFirstName) throws Throwable{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strFirstName));
	}
	
	public void BenefitsEligibility_AED_LastName(String strLastName) throws Throwable{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strLastName));
	}
	
	public void BenefitsEligibility_AED_MI(String strMI) throws Throwable{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strMI));
	}
	
	public void BenefitsEligibility_AED_CustomerSet(String strCustomerSet) throws Throwable{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strCustomerSet));
	}
	
	public void BenefitsEligibility_AED_Customer(String strCustomer) throws Throwable{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strCustomer));
	}
	
	public void BenefitsEligibility_AED_Client(String strClient) throws Throwable{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strClient));
	}
	
	public void BenefitsEligibility_AED_Group(String strGroup) throws Throwable{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strGroup));
	}
	
	// Member Eligibility Dates
	
	public void BenefitsEligibility_AED_MemberStartDate(String strMemberStartDate) throws Throwable{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AED_MEMBERELIGIBILITYDATES_TABLE,strMemberStartDate));
	}
	
	public void BenefitsEligibility_AED_MemberEndDate(String strMemberEndDate) throws Throwable{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AED_MEMBERELIGIBILITYDATES_TABLE,strMemberEndDate));
	}
	
	public void BenefitsEligibility_AED_MemberProcessDate(String strMemberProcessDate) throws Throwable{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AED_MEMBERELIGIBILITYDATES_TABLE,strMemberProcessDate));
	}
	
	// Group Eligibility Dates
	
	public void BenefitsEligibility_AED_GroupStartDate(String strGroupStartDate) throws Throwable{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AED_GROUPELIGIBILITYDATES_TABLE,strGroupStartDate));
	}
	
	public void BenefitsEligibility_AED_GroupEndDate(String strGroupEndDate) throws Throwable{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AED_GROUPELIGIBILITYDATES_TABLE,strGroupEndDate));
	}
	
	public void BenefitsEligibility_AED_GroupProcessDate(String strGroupProcessDate) throws Throwable{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AED_GROUPELIGIBILITYDATES_TABLE,strGroupProcessDate));
	}
	
	// Client Eligibility Dates
	
	public void BenefitsEligibility_AED_ClientStartDate(String strClientStartDate) throws Throwable{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AED_CLIENTELIGIBILITYDATES_TABLE,strClientStartDate));
	}
	
	public void BenefitsEligibility_AED_ClientEndDate(String strClientEndDate) throws Throwable{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AED_CLIENTELIGIBILITYDATES_TABLE,strClientEndDate));
	}
	
	public void BenefitsEligibility_AED_ClientProcessDate(String strClientProcessDate) throws Throwable{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AED_CLIENTELIGIBILITYDATES_TABLE,strClientProcessDate));
	}
	
	// Customer Eligibility Dates
	
	public void BenefitsEligibility_AED_CustomerStartDate(String strCustomerStartDate) throws Throwable{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AED_CUSTOMERELIGIBILITYDATES_TABLE,strCustomerStartDate));
	}
	
	public void BenefitsEligibility_AED_CustomerEndDate(String strCustomerEndDate) throws Throwable{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AED_CUSTOMERELIGIBILITYDATES_TABLE,strCustomerEndDate));
	}
	
	public void BenefitsEligibility_AED_CustomerProcessDate(String strCustomerProcessDate) throws Throwable{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AED_CUSTOMERELIGIBILITYDATES_TABLE,strCustomerProcessDate));
	}
	
	public void BenefitsEligibility_AED_clickOnCloseButton() throws Throwable{
		utils.ClickOnButton(AED_CLOSE_BUTTON);
		utils.GetBusyStatus();
	}
	
	public void BenefitsEligibility_BEDetail_clickOnMemberIDLink() throws Throwable{
		utils.ClickOnLink(BEDETAIL_MEMBERID_LINK);
		utils.GetBusyStatus();
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Benefits & Eligibility Detail Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~MemberID Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void verifyMemberIDDetails() throws Throwable{
		try
		{
			utils.SwithToMostRecentWindow();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println("The window is not available for switching");
		}
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		utils.CheckElementPresenceByLocator(MEMBER_HEADER_SUMMARY);		
	}
	
	public void Member_MasterCustomerSet(String strMCS) throws Throwable{
		actMemberIDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowColumnData(MEMBER_HEADER_SUMMARY,strMCS));
	}
	
	public void Member_CustomerName(String strCustomerName) throws Throwable{
		actMemberIDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowColumnData(MEMBER_HEADER_SUMMARY,strCustomerName));
	}
	
	public void Member_ClientName(String strClientName) throws Throwable{
		actMemberIDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowColumnData(MEMBER_HEADER_SUMMARY,strClientName));
	}
	
	public void Member_ExternalGroupID(String strExternalGroupID) throws Throwable{
		actMemberIDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowColumnData(MEMBER_HEADER_SUMMARY,strExternalGroupID));
	}
	
	public void Member_InternalGroupID(String strInternalGroupID) throws Throwable{
		actMemberIDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowColumnData(MEMBER_HEADER_SUMMARY,strInternalGroupID));
	}
	
	public void Member_MemberID(String strMemberID) throws Throwable{
		actMemberIDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowColumnData(MEMBER_HEADER_DATE,strMemberID));
	}
	
	public void Member_MemberLastFirst(String strMemberLastFirst) throws Throwable{
		actMemberIDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowColumnData(MEMBER_HEADER_DATE,strMemberLastFirst));
	}
	
	public void Member_DOB(String strDOB) throws Throwable{
		actMemberIDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowColumnData(MEMBER_HEADER_DATE,strDOB));
	}
	
	public void Member_Gender(String strGender) throws Throwable{
		actMemberIDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowColumnData(MEMBER_HEADER_DATE,strGender));
	}
	
	public void Member_ActiveEffDateRange(String strActiveEffDateRange) throws Throwable{
		actMemberIDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowColumnData(MEMBER_HEADER_DATE,strActiveEffDateRange));
	}
	
	public void Member_Test(String strTest) throws Throwable{
		actMemberIDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowColumnData(MEMBER_HEADER_DATE,strTest));
	}
	
	public void closeRxNovaMember() throws InterruptedException
	{
		driver.findElement(By.linkText("Close Window")).click();
		Thread.sleep(2000);	
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~MemberID Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
}
