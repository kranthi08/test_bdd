package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class PharmacyLookup_Pharmacy_ResultsSelector {

	private By PHARMACY_CITY,PHARMACY_STATE,PHARMACY_ZIP,PHARMACY_NPI;
	private By PHARMACY_SEARCH_BUTTON,PHARMACY_CLOSE_BUTTON;
	private By PHARMACY_RESULTS_TABLE,PHARMACY_GENINFO_TABLE;
	private By PHARMACY_LOCATION_TABLE,PHARMACY_SERVICES_TABLE;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actPharmacyResults = new ArrayList<String>();
	
	public PharmacyLookup_Pharmacy_ResultsSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		PharmacyLookup_Pharmacy_Results_Objects();
	}
	
	private void PharmacyLookup_Pharmacy_Results_Objects()
	{		
		PHARMACY_CITY = By.id("selectPharmacyDialogForm:city");
		PHARMACY_STATE = By.id("selectPharmacyDialogForm:state");
		PHARMACY_ZIP = By.id("selectPharmacyDialogForm:zip");
		PHARMACY_NPI = By.id("selectPharmacyDialogForm:npiPharmacyId");
		PHARMACY_SEARCH_BUTTON = By.id("selectPharmacyDialogForm:btnSearch");
		PHARMACY_CLOSE_BUTTON = By.xpath("//table[@id='selectPharmacyDialogForm:pharmacySearchPanel']//span[text()='Close']");
		PHARMACY_RESULTS_TABLE = By.id("pharmacyForm:pharmacyResultTable");
		PHARMACY_GENINFO_TABLE = By.xpath("//*[@class='fl word-break-tbl custom-tbls pharmacy-general-information-tbl']");
		PHARMACY_LOCATION_TABLE = By.xpath("//*[@class='fl word-break-tbl custom-tbls pharmacy-location-tbl']");
		PHARMACY_SERVICES_TABLE = By.xpath("//*[@class='fl custom-tbls pharmacy-services-tbl']");		
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Pharmacy Results Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	// Pharmacy Search
	
	public void Pharmacy_enterCity(String strCity) throws Throwable{
		if(!strCity.isEmpty())
		{
		utils.SetTextOnEdit(PHARMACY_CITY,strCity);
		Thread.sleep(1000);
		}
	}
	
	public void Pharmacy_selectState(String strState) throws Throwable{
		if(!strState.isEmpty())
		{
		utils.SelectItemFromWebList(PHARMACY_STATE, strState);
		Thread.sleep(2000);
		}
	}
	
	public void Pharmacy_enterZip(String strZip) throws Throwable{
		if(!strZip.isEmpty())
		{
		utils.SetTextOnEdit(PHARMACY_ZIP,strZip);
		Thread.sleep(1000);
		}
	}
	
	public void Pharmacy_enterNPI(String strNPI) throws Throwable{
		if(!strNPI.isEmpty())
		{
		utils.SetTextOnEdit(PHARMACY_NPI,strNPI);
		Thread.sleep(1000);
		}
	}
	
	public void Pharmacy_clickOnSearchButton() throws Throwable{
		utils.ClickOnButton(PHARMACY_SEARCH_BUTTON);
		Thread.sleep(1000);
		}
	
	public void Pharmacy_clickOnCloseButton() throws Throwable{
		utils.ClickOnButton(PHARMACY_CLOSE_BUTTON);
		Thread.sleep(1000);
		}
	
	public void waitUntillPharmacyResults() throws Throwable{
		utils.CheckElementPresenceByLocator(PHARMACY_RESULTS_TABLE);
		Thread.sleep(1000);
	}
	
	// Pharmacy Results
	
	public void Pharmacy_Results_PharmacyName(String strPRPharmacyName) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(PHARMACY_RESULTS_TABLE,strPRPharmacyName));
	}
	
	public void Pharmacy_Results_NPI(String strPRNPI) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(PHARMACY_RESULTS_TABLE,strPRNPI));
	}
	
	public void Pharmacy_Results_Address(String strPRAddress) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(PHARMACY_RESULTS_TABLE,strPRAddress));
	}
	
	public void Pharmacy_Results_City(String strPRCity) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(PHARMACY_RESULTS_TABLE,strPRCity));
	}
	
	public void Pharmacy_Results_State(String strPRState) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(PHARMACY_RESULTS_TABLE,strPRState));
	}
	
	public void Pharmacy_Results_ZipCode(String strPRZipCode) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(PHARMACY_RESULTS_TABLE,strPRZipCode));
	}
	
	// Pharmacy Results - General Information
	
	public void Pharmacy_Results_GI_LegalBusinessName(String strPRGILegalBusinessName) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_GENINFO_TABLE,strPRGILegalBusinessName));
	}
	
	public void Pharmacy_Results_GI_Name(String strPRGIName) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_GENINFO_TABLE,strPRGIName));
	}
	
	public void Pharmacy_Results_GI_NCPDPID(String strPRGINCPDPID) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_GENINFO_TABLE,strPRGINCPDPID));
	}
	
	public void Pharmacy_Results_GI_NPIID(String strPRGINPIID) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_GENINFO_TABLE,strPRGINPIID));
	}
	
	public void Pharmacy_Results_GI_MedicareID(String strPRGIMedicareID) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_GENINFO_TABLE,strPRGIMedicareID));
	}
	
	public void Pharmacy_Results_GI_StoreNumber(String strPRGIStoreNumber) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_GENINFO_TABLE,strPRGIStoreNumber));
	}
	
	public void Pharmacy_Results_GI_DoctorsName(String strPRGIDoctorsName) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_GENINFO_TABLE,strPRGIDoctorsName));
	}
	
	public void Pharmacy_Results_GI_LanguageCodes(String strPRGILanguageCodes) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_GENINFO_TABLE,strPRGILanguageCodes));
	}
	
	public void Pharmacy_Results_GI_DispenseClassCode(String strPRGIDispenseClassCode) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_GENINFO_TABLE,strPRGIDispenseClassCode));
	}
	
	public void Pharmacy_Results_GI_PriProvTypeCode(String strPRGIPriProvTypeCode) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_GENINFO_TABLE,strPRGIPriProvTypeCode));
	}
	
	public void Pharmacy_Results_GI_SecProvTypeCode(String strPRGISecProvTypeCode) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_GENINFO_TABLE,strPRGISecProvTypeCode));
	}
	
	public void Pharmacy_Results_GI_TerProvTypeCode(String strPRGITerProvTypeCode) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_GENINFO_TABLE,strPRGITerProvTypeCode));
	}
	
	// Pharmacy Results - Location
	
	
	public void Pharmacy_Results_Location_Address1(String strLocationAddress1) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_LOCATION_TABLE,strLocationAddress1));
	}
	
	public void Pharmacy_Results_Location_Address2(String strLocationAddress2) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_LOCATION_TABLE,strLocationAddress2));
	}
	
	public void Pharmacy_Results_Location_City(String strLocationCity) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_LOCATION_TABLE,strLocationCity));
	}
	
	public void Pharmacy_Results_Location_State(String strLocationState) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_LOCATION_TABLE,strLocationState));
	}
	
	public void Pharmacy_Results_Location_Zip(String strLocationZIP) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_LOCATION_TABLE,strLocationZIP));
	}
	
	public void Pharmacy_Results_Location_Phone(String strLocationPhone) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_LOCATION_TABLE,strLocationPhone));
	}
	
	public void Pharmacy_Results_Location_Extension(String strLocationExtension) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_LOCATION_TABLE,strLocationExtension));
	}
	
	public void Pharmacy_Results_Location_Fax(String strLocationFax) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_LOCATION_TABLE,strLocationFax));
	}
	
	public void Pharmacy_Results_Location_Email(String strLocationEmail) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_LOCATION_TABLE,strLocationEmail));
	}
	
	public void Pharmacy_Results_Location_CrossStDirection(String strLocationCrossStDir) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_LOCATION_TABLE,strLocationCrossStDir));
	}
	
	// Pharmacy Results - Services
	
	public void Pharmacy_Results_Services_24HrOperation(String strPRS24HourOperation) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_SERVICES_TABLE,strPRS24HourOperation));
	}
	
	public void Pharmacy_Results_Services_ProvideHours(String strPRSProvideHours) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_SERVICES_TABLE,strPRSProvideHours));
	}
	
	public void Pharmacy_Results_Services_AcceptsePrescriptions(String strPRSAcceptsEPresc) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_SERVICES_TABLE,strPRSAcceptsEPresc));
	}
	
	public void Pharmacy_Results_Services_DeliveryService(String strPRSDeliveryService) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_SERVICES_TABLE,strPRSDeliveryService));
	}
	
	public void Pharmacy_Results_Services_CompoundService(String strPRSComService) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_SERVICES_TABLE,strPRSComService));
	}
	
	public void Pharmacy_Results_Services_DriveUpWindow(String strPRSDriveUpWindow) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_SERVICES_TABLE,strPRSDriveUpWindow));
	}
	
	public void Pharmacy_Results_Services_DurableMedEquipment(String strPRSDurableMedEquip) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_SERVICES_TABLE,strPRSDurableMedEquip));
	}
	
	public void Pharmacy_Results_Services_WalkInClinic(String strPRSWalkInClinic) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_SERVICES_TABLE,strPRSWalkInClinic));
	}
	
	public void Pharmacy_Results_Services_24HrEmergencyService(String strPRS24HourEmerService) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_SERVICES_TABLE,strPRS24HourEmerService));
	}
	
	public void Pharmacy_Results_Services_MultiDoseComPkg(String strPRSMultiDoseComPkg) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_SERVICES_TABLE,strPRSMultiDoseComPkg));
	}
	
	public void Pharmacy_Results_Services_ImmunProvided(String strPRSImmunProvided) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_SERVICES_TABLE,strPRSImmunProvided));
	}
	
	public void Pharmacy_Results_Services_HandicappedAcces(String strPRSHandicappedAcces) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_SERVICES_TABLE,strPRSHandicappedAcces));
	}
	
	public void Pharmacy_Results_Services_340BStatus(String strPRS340BStatus) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_SERVICES_TABLE,strPRS340BStatus));
	}
	
	public void Pharmacy_Results_Services_ClosedDoorFacility(String strPRSCDoorFacility) throws Throwable{
		actPharmacyResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_SERVICES_TABLE,strPRSCDoorFacility));
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Pharmacy Results Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
