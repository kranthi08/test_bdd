package DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class PharmacyLookup_LandingPageSelector {

	private By SEARCH_PHARMACYLOOKUP_PHARMACYNPI,SEARCH_PHARMACYLOOKUP_RXNUMBER,SEARCH_BUTTON;
	private By PHARMACYNPI_ERROR_MESSAGE,RXNUMBER_ERROR_MESSAGE,SEARCH_RESULTS_TABLE;
	private By MEMBER_ID,SUBINFO_MEMBER_DETAILS_TABLE,SUBINFO_GROUP_DETAILS_TABLE,MEMBER_ID_LINK,HEADER_SUMMARY;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actMemberDetails = new ArrayList<String>();
	public ArrayList<String> actSubmittedInformation = new ArrayList<String>();
	public ArrayList<String> actHeaderSummary = new ArrayList<String>();
	
	public PharmacyLookup_LandingPageSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		PharmacyLookup_LandingPage_Objects();
	}
	
	private void PharmacyLookup_LandingPage_Objects()
	{		
		SEARCH_PHARMACYLOOKUP_PHARMACYNPI = By.id("pharmacyCallCenterSearchForm:pharmacyNPI");		
		SEARCH_PHARMACYLOOKUP_RXNUMBER = By.id("pharmacyCallCenterSearchForm:rxNumber");		
		SEARCH_BUTTON =By.id("pharmacyCallCenterSearchForm:btnSearch");
		PHARMACYNPI_ERROR_MESSAGE = By.xpath("//input[@id='pharmacyCallCenterSearchForm:pharmacyNPI']/following-sibling::div/span[@class='ui-message-error-icon']");
		RXNUMBER_ERROR_MESSAGE = By.xpath("//input[@id='pharmacyCallCenterSearchForm:rxNumber']/following-sibling::div/span[@class='ui-message-error-icon']");
		SEARCH_RESULTS_TABLE = By.id("pharmacySearchResultForm:pharmacySearchResultTable");
		MEMBER_ID = By.xpath("//div[@id='pharmacySearchResultForm:pharmacySearchResultTable']//tbody/tr[1]/td[2]");
		SUBINFO_MEMBER_DETAILS_TABLE = By.xpath("//table[@class='search-result-submitted-tbl-r1 word-break-tbl']");
		SUBINFO_GROUP_DETAILS_TABLE = By.xpath("//table[@class='search-result-submitted-tbl-r2 word-break-tbl']");
		MEMBER_ID_LINK = By.id("pharmacySearchResultForm:pharmacySearchResultTable:0:claimDetailLink");
		HEADER_SUMMARY = By.xpath("//table[@class='fl docked-info-tbl word-break-tbl']");
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Pharmacy Lookup Landing Page Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public void PharmacyLookup_LandingPage_enterPharmacy_NPI(String strPharmacyNPI) throws Throwable{
		
//		System.out.println("Sreenu : total no of Iframes found are - " + driver.findElements(By.tagName("iframe")).size());
//		System.out.println("Sreenu : total no of htmls found are - " + driver.findElements(By.tagName("html")).size());
//		driver.switchTo().frame(0);
//		System.out.println("Sreenu : switching complted");
		if(!strPharmacyNPI.isEmpty())
		{
		utils.SetTextOnEdit(SEARCH_PHARMACYLOOKUP_PHARMACYNPI, strPharmacyNPI);
		Thread.sleep(1000);
		}
	}
	
	public void PharmacyLookup_LandingPage_enterRx_Number(String strRxNumber) throws Throwable{
		if(!strRxNumber.isEmpty())
		{
		utils.SetTextOnEdit(SEARCH_PHARMACYLOOKUP_RXNUMBER, strRxNumber);
		Thread.sleep(1000);
		}
	}
	
    public void PharmacyLookup_LandingPage_clickOnSearchButton() throws Throwable{
		utils.ClickOnButton(SEARCH_BUTTON);
		utils.GetBusyStatus();
	}
    
 	public String getPharmacyNPIErrorMessage() throws Throwable{
		return utils.GetElementTitle(PHARMACYNPI_ERROR_MESSAGE);    		
	}
 	
 	public String getRxNumberErrorMessage() throws Throwable{
		return utils.GetElementTitle(RXNUMBER_ERROR_MESSAGE);    		
	}	
	
	public void waitUntillPharmacySearchResults() throws Throwable{
		utils.CheckElementPresenceByLocator(SEARCH_RESULTS_TABLE);
		Thread.sleep(1000);
	}
	
	public void verifyPharmacySearchResults() throws Throwable{
		utils.VerifyObjectIsDisplayed(SEARCH_RESULTS_TABLE);
	}
	
	public void Member_Details_MemberID(String strMemberID) throws Throwable{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strMemberID));
	}
	
	public void Member_Details_DateOfBirth(String strDateOfBirth) throws Throwable{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strDateOfBirth));
	}
	
	public void Member_Details_MemberName(String strMemberName) throws Throwable{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strMemberName));
	}
	
	public void Member_Details_Error(String strError) throws Throwable{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strError));
	}
	
	public void Member_Details_Date(String strDate) throws Throwable{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strDate));
	}
	
	public void Member_Details_Time(String strTime) throws Throwable{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strTime));
	}
	
	public void Member_Details_CICSStatus(String strCICSStatus) throws Throwable{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strCICSStatus));
	}
	
	public void Member_Details_CustID(String strCustID) throws Throwable{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strCustID));
	}
	
	public void Member_Details_ClientID(String strClientID) throws Throwable{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strClientID));
	}
	
	public void Member_Details_Group(String strGroup) throws Throwable{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strGroup));
	}
	
	public void Member_Details_ClickOnMemberID() throws Throwable{
		utils.ClickOnButton(MEMBER_ID);
		utils.GetBusyStatus();
	}
	
	public void waitUntillSubmittedInformationDetails() throws Throwable{
		utils.CheckElementPresenceByLocator(SUBINFO_MEMBER_DETAILS_TABLE);
		Thread.sleep(1000);
	}
	
	public void Submitted_Information_FirstName(String strFirstName) throws Throwable{
		actSubmittedInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(SUBINFO_MEMBER_DETAILS_TABLE,strFirstName));
	}
	
	public void Submitted_Information_LastName(String strLastName) throws Throwable{
		actSubmittedInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(SUBINFO_MEMBER_DETAILS_TABLE,strLastName));
	}
	
	public void Submitted_Information_DateOfBirth(String strDateOfBirth) throws Throwable{
		actSubmittedInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(SUBINFO_MEMBER_DETAILS_TABLE,strDateOfBirth));
	}
	
	public void Submitted_Information_PersonCode(String strPersonCode) throws Throwable{
		actSubmittedInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(SUBINFO_MEMBER_DETAILS_TABLE,strPersonCode));
	}
	
	public void Submitted_Information_CardholderID(String strCardholderID) throws Throwable{
		actSubmittedInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(SUBINFO_MEMBER_DETAILS_TABLE,strCardholderID));
	}
	
	public void Submitted_Information_Group(String strGroup) throws Throwable{
		actSubmittedInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(SUBINFO_GROUP_DETAILS_TABLE,strGroup));
	}
	
	public void Submitted_Information_BIN(String strBIN) throws Throwable{
		actSubmittedInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(SUBINFO_GROUP_DETAILS_TABLE,strBIN));
	}
	
	public void Submitted_Information_PCN(String strPCN) throws Throwable{
		actSubmittedInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(SUBINFO_GROUP_DETAILS_TABLE,strPCN));
	}
	
	public void Submitted_Information_Gender(String strGender) throws Throwable{
		actSubmittedInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(SUBINFO_GROUP_DETAILS_TABLE,strGender));
	}
	
	public void Submitted_Information_RelationshipCode(String strRelationshipCode) throws Throwable{
		actSubmittedInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(SUBINFO_GROUP_DETAILS_TABLE,strRelationshipCode));
	}
		
	public void Member_Details_ClickOnMemberIDLink() throws Throwable{
		utils.ClickOnLink(MEMBER_ID_LINK);
		utils.GetBusyStatus();
	}
	
	public void waitUntillHeaderSummary() throws Throwable{
		utils.CheckElementPresenceByLocator(HEADER_SUMMARY);
		Thread.sleep(1000);
	}
	
	public void Header_Summary_CustomerSet(String strCustomerSet) throws Throwable{
		actHeaderSummary.add(utils.RxNovaConnect_WebTable_VerifyRowData(HEADER_SUMMARY,strCustomerSet));
	}
	
	public void Header_Summary_Customer(String strCustomer) throws Throwable{
		actHeaderSummary.add(utils.RxNovaConnect_WebTable_VerifyRowData(HEADER_SUMMARY,strCustomer));
	}
	
	public void Header_Summary_Client(String strClient) throws Throwable{
		actHeaderSummary.add(utils.RxNovaConnect_WebTable_VerifyRowData(HEADER_SUMMARY,strClient));
	}
	
	public void Header_Summary_Group(String strGroup) throws Throwable{
		actHeaderSummary.add(utils.RxNovaConnect_WebTable_VerifyRowData(HEADER_SUMMARY,strGroup));
	}
	
	public void Header_Summary_Gender(String strGender) throws Throwable{
		actHeaderSummary.add(utils.RxNovaConnect_WebTable_VerifyRowData(HEADER_SUMMARY,strGender));
	}
	
	public void Header_Summary_MemberID(String strMemberID) throws Throwable{
		actHeaderSummary.add(utils.RxNovaConnect_WebTable_VerifyRowData(HEADER_SUMMARY,strMemberID));
	}
	
	public void Header_Summary_AltMemberID(String strAltMemberID) throws Throwable{
		actHeaderSummary.add(utils.RxNovaConnect_WebTable_VerifyRowData(HEADER_SUMMARY,strAltMemberID));
	}
	
	public void Header_Summary_FirstName(String strFirstName) throws Throwable{
		actHeaderSummary.add(utils.RxNovaConnect_WebTable_VerifyRowData(HEADER_SUMMARY,strFirstName));
	}
	
	public void Header_Summary_LastName(String strLastName) throws Throwable{
		actHeaderSummary.add(utils.RxNovaConnect_WebTable_VerifyRowData(HEADER_SUMMARY,strLastName));
	}
	
	public void Header_Summary_DOB(String strDOB) throws Throwable{
		actHeaderSummary.add(utils.RxNovaConnect_WebTable_VerifyRowData(HEADER_SUMMARY,strDOB));
	}
	
	public void verifyPharmacyLookupDetail(){
		utils.VerifyObjectIsDisplayed(HEADER_SUMMARY);
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Pharmacy Lookup Landing Page Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
