package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class PharmacyLookup_Claim_BenefitsSelector {

	private By BENEFITS_LINK,GENERAL_MEMBER_TABLE,APPLIED_AMOUNTS_TABLE,BALANCES_TABLE;	 
	;	 
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actBenefits = new ArrayList<String>();
 
	public PharmacyLookup_Claim_BenefitsSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		PharmacyLookup_Claim_Benefits_Objects();
	}
	
	private void PharmacyLookup_Claim_Benefits_Objects()
	{		
		BENEFITS_LINK = By.linkText("Benefits");
		GENERAL_MEMBER_TABLE = By.xpath("//table[@class='claim-benefits-tbls claim-benefits-general-member-tbl']");	
		APPLIED_AMOUNTS_TABLE = By.xpath("//table[@class='claim-benefits-tbls claim-benefits-applied-amounts-tbl']");
		BALANCES_TABLE = By.xpath("//table[@class='claim-benefits-tbls claim-benefits-balances-tbl']");
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Benefits Information~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	
	public void PharmacyLookup_Claim_clickOnBenefits() throws Throwable{
		utils.ClickOnLink(BENEFITS_LINK);
		Thread.sleep(1000);
	}
	
	//General Member
	
	public void waitUnitillGeneralMemberDetails() throws Throwable{
		utils.CheckElementPresenceByLocator(GENERAL_MEMBER_TABLE);
		Thread.sleep(1000);
	}
	
	public void Claim_Benefits_CaseID(String strCaseID) throws Throwable{
		actBenefits.add(utils.RxNovaConnect_WebTable_VerifyRowData(GENERAL_MEMBER_TABLE,strCaseID));
	}
	 
	public void Claim_Benefits_HICN(String strHICN) throws Throwable{
		actBenefits.add(utils.RxNovaConnect_WebTable_VerifyRowData(GENERAL_MEMBER_TABLE,strHICN));
	} 
	
	public void Claim_Benefits_CopayFieldUsed(String strCopayFieldUsed) throws Throwable{
		actBenefits.add(utils.RxNovaConnect_WebTable_VerifyRowData(GENERAL_MEMBER_TABLE,strCopayFieldUsed));
	}
	
	public void Claim_Benefits_TierLevel(String strTierLevel) throws Throwable{
		actBenefits.add(utils.RxNovaConnect_WebTable_VerifyRowData(GENERAL_MEMBER_TABLE,strTierLevel));
	}
	
	public void Claim_Benefits_FormularyIndicator(String strFormularyIndicator) throws Throwable{
		actBenefits.add(utils.RxNovaConnect_WebTable_VerifyRowData(GENERAL_MEMBER_TABLE,strFormularyIndicator));
	}
	
	public void Claim_Benefits_PlaceOfService(String strPlaceOfService) throws Throwable{
		actBenefits.add(utils.RxNovaConnect_WebTable_VerifyRowData(GENERAL_MEMBER_TABLE,strPlaceOfService));
	}
	
	public void Claim_Benefits_PatientResidence(String strPatientResidence) throws Throwable{
		actBenefits.add(utils.RxNovaConnect_WebTable_VerifyRowData(GENERAL_MEMBER_TABLE,strPatientResidence));
	}
	
	public void Claim_Benefits_PharmacyServiceType(String strPharmacyServiceType) throws Throwable{
		actBenefits.add(utils.RxNovaConnect_WebTable_VerifyRowData(GENERAL_MEMBER_TABLE,strPharmacyServiceType));
	}
	
	public void Claim_Benefits_DeductibleMessage(String strDeductibleMessage) throws Throwable{
		actBenefits.add(utils.RxNovaConnect_WebTable_VerifyRowData(GENERAL_MEMBER_TABLE,strDeductibleMessage));
	}
	
	public void Claim_Benefits_LICSCode(String strLICSCode) throws Throwable{
		actBenefits.add(utils.RxNovaConnect_WebTable_VerifyRowData(GENERAL_MEMBER_TABLE,strLICSCode));
	}
	
	public void Claim_Benefits_LICSEffectiveDate(String strLICSEffectiveDate) throws Throwable{
		actBenefits.add(utils.RxNovaConnect_WebTable_VerifyRowData(GENERAL_MEMBER_TABLE,strLICSEffectiveDate));
	}
	
	public void Claim_Benefits_InstitutionalCode(String strInstitutionalCode) throws Throwable{
		actBenefits.add(utils.RxNovaConnect_WebTable_VerifyRowData(GENERAL_MEMBER_TABLE,strInstitutionalCode));
	}
	
	public void Claim_Benefits_InstitutionalEffDate(String strInstitutionalEffDate) throws Throwable{
		actBenefits.add(utils.RxNovaConnect_WebTable_VerifyRowData(GENERAL_MEMBER_TABLE,strInstitutionalEffDate));
	}
	
	public void Claim_Benefits_FreeFirstFill(String strFreeFirstFill) throws Throwable{
		actBenefits.add(utils.RxNovaConnect_WebTable_VerifyRowData(GENERAL_MEMBER_TABLE,strFreeFirstFill));
	}
	
	public void Claim_Benefits_CostShareReduction(String strCostShareReduction) throws Throwable{
		actBenefits.add(utils.RxNovaConnect_WebTable_VerifyRowData(GENERAL_MEMBER_TABLE,strCostShareReduction));
	}
	
	public void Claim_Benefits_GracePeriod(String strGracePeriod) throws Throwable{
		actBenefits.add(utils.RxNovaConnect_WebTable_VerifyRowData(GENERAL_MEMBER_TABLE,strGracePeriod));
	}
	
	//Applied Amounts
	
	public void Claim_Benefits_MemberDeductible(String strMemberDeductible) throws Throwable{
		actBenefits.add(utils.RxNovaConnect_WebTable_VerifyRowData(APPLIED_AMOUNTS_TABLE,strMemberDeductible));
	}
	
	public void Claim_Benefits_PlanDeductible(String strPlanDeductible) throws Throwable{
		actBenefits.add(utils.RxNovaConnect_WebTable_VerifyRowData(APPLIED_AMOUNTS_TABLE,strPlanDeductible));
	}
	
	public void Claim_Benefits_DeductibleExcluded(String strDeductibleExcluded) throws Throwable{
		actBenefits.add(utils.RxNovaConnect_WebTable_VerifyRowData(APPLIED_AMOUNTS_TABLE,strDeductibleExcluded));
	}
	
	public void Claim_Benefits_TROOP(String strTROOP) throws Throwable{
		actBenefits.add(utils.RxNovaConnect_WebTable_VerifyRowData(APPLIED_AMOUNTS_TABLE,strTROOP));
	}
	
	public void Claim_Benefits_NonTROOP(String strNonTROOP) throws Throwable{
		actBenefits.add(utils.RxNovaConnect_WebTable_VerifyRowData(APPLIED_AMOUNTS_TABLE,strNonTROOP));
	}
	
	public void Claim_Benefits_LICS(String strLICS) throws Throwable{
		actBenefits.add(utils.RxNovaConnect_WebTable_VerifyRowData(APPLIED_AMOUNTS_TABLE,strLICS));
	}
	
	public void Claim_Benefits_OtherTROOP(String strOtherTROOP) throws Throwable{
		actBenefits.add(utils.RxNovaConnect_WebTable_VerifyRowData(APPLIED_AMOUNTS_TABLE,strOtherTROOP));
	}
	
	public void Claim_Benefits_BenefitStageQualifier(String strBenefitStageQualifier) throws Throwable{
		actBenefits.add(utils.RxNovaConnect_WebTable_VerifyRowData(APPLIED_AMOUNTS_TABLE,strBenefitStageQualifier));
	}
	
	public void Claim_Benefits_BenefitStageAmount(String strBenefitStageAmount) throws Throwable{
		actBenefits.add(utils.RxNovaConnect_WebTable_VerifyRowData(APPLIED_AMOUNTS_TABLE,strBenefitStageAmount));
	}
	
	//Balances
	
	public void Claim_Benefits_SpendingAccRemaining(String strSpendingAccRemaining) throws Throwable{
		actBenefits.add(utils.RxNovaConnect_WebTable_VerifyRowData(BALANCES_TABLE,strSpendingAccRemaining));
	}
	
	public void Claim_Benefits_RemainingBenefit(String strRemainingBenefit) throws Throwable{
		actBenefits.add(utils.RxNovaConnect_WebTable_VerifyRowData(BALANCES_TABLE,strRemainingBenefit));
	}
	
	public void Claim_Benefits_AccumulatedDeductible(String strAccumulatedDeductible) throws Throwable{
		actBenefits.add(utils.RxNovaConnect_WebTable_VerifyRowData(BALANCES_TABLE,strAccumulatedDeductible));
	}
	
	public void Claim_Benefits_RemainingDeductible(String strRemainingDeductible) throws Throwable{
		actBenefits.add(utils.RxNovaConnect_WebTable_VerifyRowData(BALANCES_TABLE,strRemainingDeductible));
	}
 	 	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Benefits Information~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
}
	
	