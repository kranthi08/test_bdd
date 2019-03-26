package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class PharmacyLookup_Authorization_GISelector {

	private By GENERALINFORMATION_LINK,AUTHORIZATION_GI_GENERAL_TABLE;
	private By AUTHORIZATION_GI_OVRDINFO_TABLE,AUTHORIZATION_GI_PHASERESULTS_TABLE;
	private By AUTHORIZATION_GI_DRUGINFO_TABLE,AUTHORIZATION_GI_ERRORINFO_TABLE;
	private By AUTHORIZATION_GI_EC1,AUTHORIZATION_GI_EC2,AUTHORIZATION_GI_EC3;
	private By AUTHORIZATION_GI_EC4,AUTHORIZATION_GI_EC5,AUTHORIZATION_GI_EC6;
	private By AUTHORIZATION_GI_EC7,AUTHORIZATION_GI_EC8,AUTHORIZATION_GI_EC9;
	private By AUTHORIZATION_GI_EC10,AUTHORIZATION_GI_EC11,AUTHORIZATION_GI_EC12;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actAuthGenInfoDetails = new ArrayList<String>();
	
	public PharmacyLookup_Authorization_GISelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		PharmacyLookup_Authorization_GI_Objects();
	}
	
	private void PharmacyLookup_Authorization_GI_Objects()
	{		
		GENERALINFORMATION_LINK = By.linkText("General Information");
		AUTHORIZATION_GI_GENERAL_TABLE = By.id("priorAuthForm:priorAuthAccordionPanel:authGeneralInformationPanel");
		AUTHORIZATION_GI_OVRDINFO_TABLE = By.id("priorAuthForm:priorAuthAccordionPanel:authOverrideInformationPanel");
		AUTHORIZATION_GI_PHASERESULTS_TABLE = By.id("priorAuthForm:priorAuthAccordionPanel:rxnovaAuthPhaseResultTable");
		AUTHORIZATION_GI_DRUGINFO_TABLE = By.id("priorAuthForm:priorAuthAccordionPanel:drugInformationTable");
		AUTHORIZATION_GI_ERRORINFO_TABLE = By.id("priorAuthForm:priorAuthAccordionPanel:errorsTable");
		AUTHORIZATION_GI_EC1 = By.xpath("//table[@class='claim-drug-info-tbls prior-auth-error-code-tbl prior-auth-categories-tbl']/tbody/tr[1]/td[1]");
		AUTHORIZATION_GI_EC2 = By.xpath("//table[@class='claim-drug-info-tbls prior-auth-error-code-tbl prior-auth-categories-tbl']/tbody/tr[1]/td[2]");
		AUTHORIZATION_GI_EC3 = By.xpath("//table[@class='claim-drug-info-tbls prior-auth-error-code-tbl prior-auth-categories-tbl']/tbody/tr[1]/td[3]");
		AUTHORIZATION_GI_EC4 = By.xpath("//table[@class='claim-drug-info-tbls prior-auth-error-code-tbl prior-auth-categories-tbl']/tbody/tr[1]/td[4]");
		AUTHORIZATION_GI_EC5 = By.xpath("//table[@class='claim-drug-info-tbls prior-auth-error-code-tbl prior-auth-categories-tbl']/tbody/tr[1]/td[5]");
		AUTHORIZATION_GI_EC6 = By.xpath("//table[@class='claim-drug-info-tbls prior-auth-error-code-tbl prior-auth-categories-tbl']/tbody/tr[1]/td[6]");
		AUTHORIZATION_GI_EC7 = By.xpath("//table[@class='claim-drug-info-tbls prior-auth-error-code-tbl prior-auth-categories-tbl']/tbody/tr[2]/td[1]");
		AUTHORIZATION_GI_EC8 = By.xpath("//table[@class='claim-drug-info-tbls prior-auth-error-code-tbl prior-auth-categories-tbl']/tbody/tr[2]/td[2]");
		AUTHORIZATION_GI_EC9 = By.xpath("//table[@class='claim-drug-info-tbls prior-auth-error-code-tbl prior-auth-categories-tbl']/tbody/tr[2]/td[3]");
		AUTHORIZATION_GI_EC10 = By.xpath("//table[@class='claim-drug-info-tbls prior-auth-error-code-tbl prior-auth-categories-tbl']/tbody/tr[2]/td[4]");
		AUTHORIZATION_GI_EC11 = By.xpath("//table[@class='claim-drug-info-tbls prior-auth-error-code-tbl prior-auth-categories-tbl']/tbody/tr[2]/td[5]");
		AUTHORIZATION_GI_EC12 = By.xpath("//table[@class='claim-drug-info-tbls prior-auth-error-code-tbl prior-auth-categories-tbl']/tbody/tr[2]/td[6]");
	}                         
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Authorization General Information Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void Authorization_clickOnGeneralInformation() throws Throwable{
		utils.ClickOnLink(GENERALINFORMATION_LINK);
		utils.GetBusyStatus();
	}
	
	public void waitUntillGeneralInformation() throws Throwable{
		utils.CheckElementPresenceByLocator(AUTHORIZATION_GI_GENERAL_TABLE);
		Thread.sleep(1000);
	}
	
	// General
	
	public void Authorization_GI_AuthID(String strAuthID) throws Throwable{
		actAuthGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(AUTHORIZATION_GI_GENERAL_TABLE,strAuthID));
	}
	
	public void Authorization_GI_Status(String strStatus) throws Throwable{
		actAuthGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(AUTHORIZATION_GI_GENERAL_TABLE,strStatus));
	}
	
	public void Authorization_GI_AuthType(String strAuthType) throws Throwable{
		actAuthGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(AUTHORIZATION_GI_GENERAL_TABLE,strAuthType));
	}
	
	public void Authorization_GI_RxNumber(String strRxNumber) throws Throwable{
		actAuthGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(AUTHORIZATION_GI_GENERAL_TABLE,strRxNumber));
	}
	
	public void Authorization_GI_EffectiveDate(String strEffectiveDate) throws Throwable{
		actAuthGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(AUTHORIZATION_GI_GENERAL_TABLE,strEffectiveDate));
	}
	
	public void Authorization_GI_RefillsAllowed(String strRefillsAllowed) throws Throwable{
		actAuthGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(AUTHORIZATION_GI_GENERAL_TABLE,strRefillsAllowed));
	}
	
	public void Authorization_GI_EndDate(String strEndDate) throws Throwable{
		actAuthGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(AUTHORIZATION_GI_GENERAL_TABLE,strEndDate));
	}
	
	public void Authorization_GI_FillsUsed(String strFillsUsed) throws Throwable{
		actAuthGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(AUTHORIZATION_GI_GENERAL_TABLE,strFillsUsed));
	}
	
	public void Authorization_GI_Compound(String strCompound) throws Throwable{
		actAuthGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(AUTHORIZATION_GI_GENERAL_TABLE,strCompound));
	}
	
	// Override Information
	
	public void Authorization_GI_OvrdInfo_DeductibleIncludeOrExclude(String strDedIncludeOrExclude) throws Throwable{
		actAuthGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(AUTHORIZATION_GI_OVRDINFO_TABLE,strDedIncludeOrExclude));
	}
	
	public void Authorization_GI_OvrdInfo_RuleType(String strRuleType) throws Throwable{
		actAuthGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(AUTHORIZATION_GI_OVRDINFO_TABLE,strRuleType));
	}
	
	public void Authorization_GI_OvrdInfo_DeductibleMaxOverride(String strDedMaxOverride) throws Throwable{
		actAuthGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(AUTHORIZATION_GI_OVRDINFO_TABLE,strDedMaxOverride));
	}
	
	public void Authorization_GI_OvrdInfo_MetricDecimalQuantity(String strMetDecQuantity) throws Throwable{
		actAuthGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(AUTHORIZATION_GI_OVRDINFO_TABLE,strMetDecQuantity));
	}
	
	public void Authorization_GI_OvrdInfo_NWIndicator(String strNWIndicator) throws Throwable{
		actAuthGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(AUTHORIZATION_GI_OVRDINFO_TABLE,strNWIndicator));
	}
	
	public void Authorization_GI_OvrdInfo_DaysSupply(String strDaysSupply) throws Throwable{
		actAuthGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(AUTHORIZATION_GI_OVRDINFO_TABLE,strDaysSupply));
	}
	
	public void Authorization_GI_OvrdInfo_DollorAmount(String strDollorAmount) throws Throwable{
		actAuthGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(AUTHORIZATION_GI_OVRDINFO_TABLE,strDollorAmount));
	}
	
	public void Authorization_GI_OvrdInfo_LICSLevel(String strLICSLevel) throws Throwable{
		actAuthGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(AUTHORIZATION_GI_OVRDINFO_TABLE,strLICSLevel));
	}
	
	public void Authorization_GI_OvrdInfo_MedPartDType(String strMedPartDType) throws Throwable{
		actAuthGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(AUTHORIZATION_GI_OVRDINFO_TABLE,strMedPartDType));
	}
	
	public void Authorization_GI_OvrdInfo_TierValue(String strTierValue) throws Throwable{
		actAuthGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(AUTHORIZATION_GI_OVRDINFO_TABLE,strTierValue));
	}
	
	// Authorization Phases 
	
	public void Authorization_GI_OvrdInfo_Phases(String strPhases) throws Throwable{
		actAuthGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(AUTHORIZATION_GI_PHASERESULTS_TABLE,strPhases));
	}
	
	public void Authorization_GI_OvrdInfo_Type(String strType) throws Throwable{
		actAuthGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(AUTHORIZATION_GI_PHASERESULTS_TABLE,strType));
	}
	
	public void Authorization_GI_OvrdInfo_BrandOverrideType(String strBrandOvrdType) throws Throwable{
		actAuthGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(AUTHORIZATION_GI_PHASERESULTS_TABLE,strBrandOvrdType));
	}
	
	public void Authorization_GI_OvrdInfo_BrandOverrideValue(String strBrandOvrdValue) throws Throwable{
		actAuthGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(AUTHORIZATION_GI_PHASERESULTS_TABLE,strBrandOvrdValue));
	}
	
	public void Authorization_GI_OvrdInfo_BrandMultiplierUse(String strBrandMultiplierUse) throws Throwable{
		actAuthGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(AUTHORIZATION_GI_PHASERESULTS_TABLE,strBrandMultiplierUse));
	}
	
	public void Authorization_GI_OvrdInfo_GenericOverrideType(String strGenOvrdType) throws Throwable{
		actAuthGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(AUTHORIZATION_GI_PHASERESULTS_TABLE,strGenOvrdType));
	}
	
	public void Authorization_GI_OvrdInfo_GenericOverrideValue(String strGenOvrdValue) throws Throwable{
		actAuthGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(AUTHORIZATION_GI_PHASERESULTS_TABLE,strGenOvrdValue));
	}
	
	public void Authorization_GI_OvrdInfo_GenericMultiplierUse(String strGenMultiplierUse) throws Throwable{
		actAuthGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(AUTHORIZATION_GI_PHASERESULTS_TABLE,strGenMultiplierUse));
	}
	
	// Drug Information
	
	public void Authorization_GI_DrugInfo_DrugLevel(String strDrugLevel) throws Throwable{
		actAuthGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(AUTHORIZATION_GI_DRUGINFO_TABLE,strDrugLevel));
	}
	
	public void Authorization_GI_DrugInfo_DrugValue(String strDrugValue) throws Throwable{
		actAuthGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(AUTHORIZATION_GI_DRUGINFO_TABLE,strDrugValue));
	}
	
	public void Authorization_GI_DrugInfo_DrugName(String strDrugName) throws Throwable{
		actAuthGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(AUTHORIZATION_GI_DRUGINFO_TABLE,strDrugName));
	}
	
	// Errors
	
	public void Authorization_GI_Errors(String strErrors) throws Throwable{
		actAuthGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AUTHORIZATION_GI_ERRORINFO_TABLE,strErrors));
	}
	
	// Error Categories
	
	public void Authorization_GI_ErrorCategory1() throws Throwable{
		actAuthGenInfoDetails.add(utils.GetElementText(AUTHORIZATION_GI_EC1));
	}
	
	public void Authorization_GI_ErrorCategory2() throws Throwable{
		actAuthGenInfoDetails.add(utils.GetElementText(AUTHORIZATION_GI_EC2));
	}
	
	public void Authorization_GI_ErrorCategory3() throws Throwable{
		actAuthGenInfoDetails.add(utils.GetElementText(AUTHORIZATION_GI_EC3));
	}
	
	public void Authorization_GI_ErrorCategory4() throws Throwable{
		actAuthGenInfoDetails.add(utils.GetElementText(AUTHORIZATION_GI_EC4));
	}
	
	public void Authorization_GI_ErrorCategory5() throws Throwable{
		actAuthGenInfoDetails.add(utils.GetElementText(AUTHORIZATION_GI_EC5));
	}
	
	public void Authorization_GI_ErrorCategory6() throws Throwable{
		actAuthGenInfoDetails.add(utils.GetElementText(AUTHORIZATION_GI_EC6));
	}
	
	public void Authorization_GI_ErrorCategory7() throws Throwable{
		actAuthGenInfoDetails.add(utils.GetElementText(AUTHORIZATION_GI_EC7));
	}
	
	public void Authorization_GI_ErrorCategory8() throws Throwable{
		actAuthGenInfoDetails.add(utils.GetElementText(AUTHORIZATION_GI_EC8));
	}
	
	public void Authorization_GI_ErrorCategory9() throws Throwable{
		actAuthGenInfoDetails.add(utils.GetElementText(AUTHORIZATION_GI_EC9));
	}
	
	public void Authorization_GI_ErrorCategory10() throws Throwable{
		actAuthGenInfoDetails.add(utils.GetElementText(AUTHORIZATION_GI_EC10));
	}
	
	public void Authorization_GI_ErrorCategory11() throws Throwable{
		actAuthGenInfoDetails.add(utils.GetElementText(AUTHORIZATION_GI_EC11));
	}
	
	public void Authorization_GI_ErrorCategory12() throws Throwable{
		actAuthGenInfoDetails.add(utils.GetElementText(AUTHORIZATION_GI_EC12));
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Authorization General Information Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
}
