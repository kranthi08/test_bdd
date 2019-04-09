package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class PharmacyLookup_Claim_TransferRulesCCInformationSelector {

	private By TRANSFER_RULES_CCINFO_LINK,CUSTOMERINFO_TABLE,AFFILIATE_CUSTOMER_NUMBER_TABLE;
	private By CONTACT_MAIN_TABLE,CONTACT_MEMBER_TABLE,CONTACT_PREAUTH_TABLE,CONTACT_MAILORDER_TABLE,CONTACT_CONTRACTIN_TABLE,CONTACT_TIMES_TABLE;
	 
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actTransferRulesCCInfo = new ArrayList<String>();
 
	public PharmacyLookup_Claim_TransferRulesCCInformationSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		PharmacyLookup_Claim_Pricing_Objects();
	}
	
	private void PharmacyLookup_Claim_Pricing_Objects()
	{		
		TRANSFER_RULES_CCINFO_LINK = By.linkText("Transfer Rules & Customer Contact Information");
		CUSTOMERINFO_TABLE = By.xpath("//table[@class='line-height-1p8 claim-transfer-tbls claim-transfer-general-tbl']");	
		AFFILIATE_CUSTOMER_NUMBER_TABLE = By.xpath("//table[@class='ui-widget claim-transfer-tbls claim-customer-info-general-tbl']");	
		CONTACT_MAIN_TABLE = By.xpath("//table[@class='claim-contact-info-toll-general-tbl']");
		CONTACT_MEMBER_TABLE = By.xpath("(//table[@class='claim-contact-info-toll-general-second-tbl'])[1]");
		CONTACT_PREAUTH_TABLE = By.xpath("(//table[@class='claim-contact-info-toll-general-second-tbl'])[2]");
		CONTACT_MAILORDER_TABLE = By.xpath("(//table[@class='claim-contact-info-toll-general-second-tbl'])[3]");
		CONTACT_CONTRACTIN_TABLE = By.xpath("(//table[@class='claim-contact-info-toll-general-second-tbl'])[4]");
		CONTACT_TIMES_TABLE = By.xpath("//table[@class='line-height-1p8 claim-transfer-tbls claim-contact-info-tbl']");
	 		 
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Transfer Rules and CC Information~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	
	// Transfer Rules and CC Information
	
	public void PharmacyLookup_Claim_clickOnTransferRulesCCInfo() throws Throwable{
		utils.ClickOnLink(TRANSFER_RULES_CCINFO_LINK);
		Thread.sleep(1000);
	}
	
	public void waitUnitillTransferRulesCCInfoDetails() throws Throwable{
		utils.CheckElementPresenceByLocator(CUSTOMERINFO_TABLE);
		Thread.sleep(1000);
	}
	
	public void Claim_TransferRulesCCInfo_CustomerNumber(String strCustomerNumber) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(CUSTOMERINFO_TABLE,strCustomerNumber));
	}
	public void Claim_TransferRulesCCInfo_CustomerName(String strCustomerName) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(CUSTOMERINFO_TABLE,strCustomerName));
	}
	public void Claim_TransferRulesCCInfo_ClientNumber(String strClientNumber) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(CUSTOMERINFO_TABLE,strClientNumber));
	}
	public void Claim_TransferRulesCCInfo_ClientName(String strClientName) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(CUSTOMERINFO_TABLE,strClientName));
	}
	public void Claim_TransferRulesCCInfo_GroupNumber(String strGroupNumber) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(CUSTOMERINFO_TABLE,strGroupNumber));
	}
	public void Claim_TransferRulesCCInfo_GroupName(String strGroupName) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(CUSTOMERINFO_TABLE,strGroupName));
	}
	public void Claim_TransferRulesCCInfo_DateTermed(String strDateTermed) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(CUSTOMERINFO_TABLE,strDateTermed));
	}
	public void Claim_TransferRulesCCInfo_AffiliateCustNo(String strAffiliateCustNo) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(AFFILIATE_CUSTOMER_NUMBER_TABLE,strAffiliateCustNo));
	}
	public void Claim_TransferRulesCCInfo_TFNMain(String strTFNMain) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(CONTACT_MAIN_TABLE,strTFNMain));
	}
	public void Claim_TransferRulesCCInfo_TFNMember(String strTFNMember) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(CONTACT_MEMBER_TABLE,strTFNMember));
	}
	public void Claim_TransferRulesCCInfo_TFNPreAuth(String strTFNPreAuth) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(CONTACT_PREAUTH_TABLE,strTFNPreAuth));
	}
	public void Claim_TransferRulesCCInfo_TFNMailOrder(String strTFNMailOrder) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(CONTACT_MAILORDER_TABLE,strTFNMailOrder));
	}
	public void Claim_TransferRulesCCInfo_TFNContracting(String strTFNContracting) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(CONTACT_CONTRACTIN_TABLE,strTFNContracting));
	}
	
	public void Claim_TransferRulesCCInfo_TimeZone(String strTimeZone) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(CONTACT_TIMES_TABLE,strTimeZone));
	}
	public void Claim_TransferRulesCCInfo_BusnessHours(String strBusnessHours) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(CONTACT_TIMES_TABLE,strBusnessHours));
	}
/*	public void Claim_TransferRulesCCInfo_Comments(String strComments) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(TRANSFER_RULES_CCINFO_TABLE,strComments));
	}*/
	 
	
	 	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Transfer Rules and CC Information~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
}
	
	