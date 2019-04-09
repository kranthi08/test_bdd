package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class PharmacyLookup_Claim_DrugUtillizationReviewResponseDetailsSelector {

	private By DRUG_UTILIZATION_REVIEW_RESPONSE_DETAILS_LINK,DUR_TABLE,INTERACTING_PRESCRIPTION_DATA_TABLE,DUR_MESSAGES_TABLE;
	 	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actTransferRulesCCInfo = new ArrayList<String>();
 
	public PharmacyLookup_Claim_DrugUtillizationReviewResponseDetailsSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		PharmacyLookup_Claim_Pricing_Objects();
	}
	
	private void PharmacyLookup_Claim_Pricing_Objects()
	{		
		DRUG_UTILIZATION_REVIEW_RESPONSE_DETAILS_LINK = By.linkText("Drug Utilization Review (DUR) Response Details");
		DUR_TABLE = By.xpath("//table[@class='claim-dur-tbls claim-drug-dur-info-tbl']");	
		INTERACTING_PRESCRIPTION_DATA_TABLE = By.xpath("//table[@class='claim-dur-tbls claim-drug-interaction-tbl']");	
		DUR_MESSAGES_TABLE = By.id("claimSelectionForm:claimDetailAccordionPanel:durMessagesTable");		 
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Drug Utillization Review Response Details~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	
	// DUR Info 
	
	public void PharmacyLookup_Claim_clickOnDrugUtillizationReviewResponseDetails() throws Throwable{
		utils.ClickOnLink(DRUG_UTILIZATION_REVIEW_RESPONSE_DETAILS_LINK);
		Thread.sleep(1000);
	}
	
	public void waitUnitillDURInfo() throws Throwable{
		utils.CheckElementPresenceByLocator(DUR_TABLE);
		Thread.sleep(1000);
	}
	
	public void Claim_DrugUtillizationReviewResponseDetails_SeverityCode(String strSeverityCode) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(DUR_TABLE,strSeverityCode));
	}	
	
	public void Claim_DrugUtillizationReviewResponseDetails_Monograph(String strMonograph) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(DUR_TABLE,strMonograph));
	}
	
	public void Claim_DrugUtillizationReviewResponseDetails_Hansten(String strHansten) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(DUR_TABLE,strHansten));
	}
	
	public void Claim_DrugUtillizationReviewResponseDetails_Dif(String strDif) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(DUR_TABLE,strDif));
	}
	
	public void Claim_DrugUtillizationReviewResponseDetails_InteventionCode(String strInteventionCode) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(DUR_TABLE,strInteventionCode));
	}
	
	public void Claim_DrugUtillizationReviewResponseDetails_OutcomeCode(String strOutcomeCode) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(DUR_TABLE,strOutcomeCode));
	}
	
	// Interacting Prescription Data
	
	public void Claim_DrugUtillizationReviewResponseDetails_Claim(String strClaim) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(INTERACTING_PRESCRIPTION_DATA_TABLE,strClaim));
	}
	
	public void Claim_DrugUtillizationReviewResponseDetails_DrugName(String strDrugName) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(INTERACTING_PRESCRIPTION_DATA_TABLE,strDrugName));
	}
	
	public void Claim_DrugUtillizationReviewResponseDetails_DateFilled(String strDateFilled) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(INTERACTING_PRESCRIPTION_DATA_TABLE,strDateFilled));
	}
	
	public void Claim_DrugUtillizationReviewResponseDetails_MetricQuantity(String strMetricQuantity) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(INTERACTING_PRESCRIPTION_DATA_TABLE,strMetricQuantity));
	}
	
	public void Claim_DrugUtillizationReviewResponseDetails_SafetyEditID(String strSafetyEditID) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(INTERACTING_PRESCRIPTION_DATA_TABLE,strSafetyEditID));
	}
	
	public void Claim_DrugUtillizationReviewResponseDetails_DURProtocolID(String strDURProtocolID) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(INTERACTING_PRESCRIPTION_DATA_TABLE,strDURProtocolID));
	}
	
	public void Claim_DrugUtillizationReviewResponseDetails_FreeformMessageID(String strFreeformMessageID) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(INTERACTING_PRESCRIPTION_DATA_TABLE,strFreeformMessageID));
	}
	
	public void Claim_DrugUtillizationReviewResponseDetails_PharmacyID(String strPharmacyID) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(INTERACTING_PRESCRIPTION_DATA_TABLE,strPharmacyID));
	}
	
	public void Claim_DrugUtillizationReviewResponseDetails_ServProviderIDQlfr(String strServProviderIDQlfr) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(INTERACTING_PRESCRIPTION_DATA_TABLE,strServProviderIDQlfr));
	}
	
	public void Claim_DrugUtillizationReviewResponseDetails_PharmacyNPI(String strPharmacyNPI) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(INTERACTING_PRESCRIPTION_DATA_TABLE,strPharmacyNPI));
	}
	
	public void Claim_DrugUtillizationReviewResponseDetails_PharmacyName(String strPharmacyName) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(INTERACTING_PRESCRIPTION_DATA_TABLE,strPharmacyName));
	}
	
	public void Claim_DrugUtillizationReviewResponseDetails_PrescriberID(String strPrescriberID) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(INTERACTING_PRESCRIPTION_DATA_TABLE,strPrescriberID));
	}
	
	public void Claim_DrugUtillizationReviewResponseDetails_PrescriberIDQlflr(String strPrescriberIDQlflr) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(INTERACTING_PRESCRIPTION_DATA_TABLE,strPrescriberIDQlflr));
	}
	
	public void Claim_DrugUtillizationReviewResponseDetails_PrescriberNPI(String strPrescriberNPI) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(INTERACTING_PRESCRIPTION_DATA_TABLE,strPrescriberNPI));
	}
	
	public void Claim_DrugUtillizationReviewResponseDetails_PrescriberName(String strPrescriberName) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifyRowData(INTERACTING_PRESCRIPTION_DATA_TABLE,strPrescriberName));
	}
	
	// DUR Messages
	
	public void Claim_DrugUtillizationReviewResponseDetails_DURFreeTextMessage(String strDURFreeTextMessage) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(DUR_MESSAGES_TABLE,strDURFreeTextMessage));
	}
	
	public void Claim_DrugUtillizationReviewResponseDetails_DURAddTextMessage(String strDURAddTextMessage) throws Throwable{
		actTransferRulesCCInfo.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(DUR_MESSAGES_TABLE,strDURAddTextMessage));
	}
	 	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Drug Utillization Review Response Details~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
}
	
	