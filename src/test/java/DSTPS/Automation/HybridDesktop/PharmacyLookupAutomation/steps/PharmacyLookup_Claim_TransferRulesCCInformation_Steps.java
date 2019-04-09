package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common.PharmacyLookup_LandingPage_Steps;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages.PharmacyLookup_Claim_TransferRulesCCInformationSelector;

public class PharmacyLookup_Claim_TransferRulesCCInformation_Steps {

	PharmacyLookup_Claim_TransferRulesCCInformationSelector pharmacyLookup_Claim_TransferRulesCCInformationSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expTransferRulesCCInfo = new ArrayList<String>();
	public SoftAssert transferRulesCCInfoSoft = new SoftAssert();
	
	
	public PharmacyLookup_Claim_TransferRulesCCInformation_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		pharmacyLookup_Claim_TransferRulesCCInformationSelector = new PharmacyLookup_Claim_TransferRulesCCInformationSelector(SharedResource,utils);
	}
	
	public void clickOnTransferRulesCCInfo() throws Throwable{
		pharmacyLookup_Claim_TransferRulesCCInformationSelector.PharmacyLookup_Claim_clickOnTransferRulesCCInfo();
		pharmacyLookup_Claim_TransferRulesCCInformationSelector.waitUnitillTransferRulesCCInfoDetails();
	}
	
	public void verifyTransferRulesCCInfo(Map<String,String> transferRulesCCInfo)throws Throwable {
		 
		String strCustomerNumber = transferRulesCCInfo.get("CustomerNumber");
		String strCustomerName = transferRulesCCInfo.get("CustomerName");
		String strClientNumber = transferRulesCCInfo.get("ClientNumber");
		String strClientName = transferRulesCCInfo.get("ClientName");
		String strGroupNumber = transferRulesCCInfo.get("GroupNumber");
		String strGroupName = transferRulesCCInfo.get("GroupName");
		String strDateTermed = transferRulesCCInfo.get("DateTermed");
		String strAffiliateCustNo = transferRulesCCInfo.get("AffiliateCustNo");
		String strTFNMain = transferRulesCCInfo.get("TFNMain");
		String strTFNMember = transferRulesCCInfo.get("TFNMember");
		String strTFNPreAuth = transferRulesCCInfo.get("TFNPreAuth");
		String strTFNMailOrder = transferRulesCCInfo.get("TFNMailOrder");
		String strTFNContracting = transferRulesCCInfo.get("TFNContracting");		 
		String strTimeZone = transferRulesCCInfo.get("TimeZone");
		String strBusnessHours = transferRulesCCInfo.get("BusnessHours");
		//String strComments = transferRulesCCInfo.get("Comments");
		 		 
		expTransferRulesCCInfo.add(strCustomerNumber);
		expTransferRulesCCInfo.add(strCustomerName);
		expTransferRulesCCInfo.add(strClientNumber);
		expTransferRulesCCInfo.add(strClientName);
		expTransferRulesCCInfo.add(strGroupNumber);
		expTransferRulesCCInfo.add(strGroupName);
		expTransferRulesCCInfo.add(strDateTermed);
		expTransferRulesCCInfo.add(strAffiliateCustNo);
		expTransferRulesCCInfo.add(strTFNMain);
		expTransferRulesCCInfo.add(strTFNMember);
		expTransferRulesCCInfo.add(strTFNPreAuth);
		expTransferRulesCCInfo.add(strTFNMailOrder);
		expTransferRulesCCInfo.add(strTFNContracting);		 
		expTransferRulesCCInfo.add(strTimeZone);
		expTransferRulesCCInfo.add(strBusnessHours);
		//expTransferRulesCCInfo.add(strComments);		 
		
		pharmacyLookup_Claim_TransferRulesCCInformationSelector.Claim_TransferRulesCCInfo_CustomerNumber(strCustomerNumber);
		pharmacyLookup_Claim_TransferRulesCCInformationSelector.Claim_TransferRulesCCInfo_CustomerName(strCustomerName);
		pharmacyLookup_Claim_TransferRulesCCInformationSelector.Claim_TransferRulesCCInfo_ClientNumber(strClientNumber);
		pharmacyLookup_Claim_TransferRulesCCInformationSelector.Claim_TransferRulesCCInfo_ClientName(strClientName);
		pharmacyLookup_Claim_TransferRulesCCInformationSelector.Claim_TransferRulesCCInfo_GroupNumber(strGroupNumber);
		pharmacyLookup_Claim_TransferRulesCCInformationSelector.Claim_TransferRulesCCInfo_GroupName(strGroupName);
		pharmacyLookup_Claim_TransferRulesCCInformationSelector.Claim_TransferRulesCCInfo_DateTermed(strDateTermed);
		pharmacyLookup_Claim_TransferRulesCCInformationSelector.Claim_TransferRulesCCInfo_AffiliateCustNo(strAffiliateCustNo);
		pharmacyLookup_Claim_TransferRulesCCInformationSelector.Claim_TransferRulesCCInfo_TFNMain(strTFNMain);
		pharmacyLookup_Claim_TransferRulesCCInformationSelector.Claim_TransferRulesCCInfo_TFNMember(strTFNMember);
		pharmacyLookup_Claim_TransferRulesCCInformationSelector.Claim_TransferRulesCCInfo_TFNPreAuth(strTFNPreAuth);
		pharmacyLookup_Claim_TransferRulesCCInformationSelector.Claim_TransferRulesCCInfo_TFNMailOrder(strTFNMailOrder);
		pharmacyLookup_Claim_TransferRulesCCInformationSelector.Claim_TransferRulesCCInfo_TFNContracting(strTFNContracting);
		pharmacyLookup_Claim_TransferRulesCCInformationSelector.Claim_TransferRulesCCInfo_TimeZone(strTimeZone);
		pharmacyLookup_Claim_TransferRulesCCInformationSelector.Claim_TransferRulesCCInfo_BusnessHours(strBusnessHours);
		//pharmacyLookup_Claim_TransferRulesCCInformationSelector.Claim_TransferRulesCCInfo_Comments(strComments);
		 		 
			
		for(int i=0;i<expTransferRulesCCInfo.size();i++)
		{
			transferRulesCCInfoSoft.assertEquals(pharmacyLookup_Claim_TransferRulesCCInformationSelector.actTransferRulesCCInfo.get(i), expTransferRulesCCInfo.get(i));
		}		
		transferRulesCCInfoSoft.assertAll();
		
	}	
	
	 
}

