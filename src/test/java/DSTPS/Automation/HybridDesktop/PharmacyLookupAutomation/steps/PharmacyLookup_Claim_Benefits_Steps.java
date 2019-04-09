package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common.PharmacyLookup_LandingPage_Steps;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages.PharmacyLookup_Claim_BenefitsSelector;

public class PharmacyLookup_Claim_Benefits_Steps {

	PharmacyLookup_Claim_BenefitsSelector pharmacyLookup_Claim_BenefitsSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expBenefits = new ArrayList<String>();
	public SoftAssert benefitsSoft = new SoftAssert();
	
	
	public PharmacyLookup_Claim_Benefits_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		pharmacyLookup_Claim_BenefitsSelector = new PharmacyLookup_Claim_BenefitsSelector(SharedResource,utils);
	}
	
	public void clickOnBenefits() throws Throwable{
		pharmacyLookup_Claim_BenefitsSelector.PharmacyLookup_Claim_clickOnBenefits();
		pharmacyLookup_Claim_BenefitsSelector.waitUnitillGeneralMemberDetails();
	}
	
	public void verifyBenefits(Map<String,String> benefits)throws Throwable {
		 
		String strCaseID = benefits.get("CaseID");
		String strHICN  = benefits.get("HICN");
		String strCopayFieldUsed  = benefits.get("CopayFieldUsed");
		String strTierLevel  = benefits.get("TierLevel");
		String strFormularyIndicator  = benefits.get("FormularyIndicator");
		String strPlaceOfService  = benefits.get("PlaceOfService");
		String strPatientResidence  = benefits.get("PatientResidence");
		String strPharmacyServiceType  = benefits.get("PharmacyServiceType");
		String strDeductibleMessage  = benefits.get("DeductibleMessage");
		String strLICSCode  = benefits.get("LICSCode");
		String strLICSEffectiveDate  = benefits.get("LICSEffectiveDate");
		String strInstitutionalCode  = benefits.get("InstitutionalCode");
		String strInstitutionalEffDate  = benefits.get("InstitutionalEffDate");
		String strFreeFirstFill  = benefits.get("FreeFirstFill");
		String strCostShareReduction  = benefits.get("CostShareReduction");
		String strGracePeriod  = benefits.get("GracePeriod");
		String strMemberDeductible  = benefits.get("MemberDeductible");
		String strPlanDeductible  = benefits.get("PlanDeductible");
		String strDeductibleExcluded  = benefits.get("DeductibleExcluded");
		String strTROOP  = benefits.get("TROOP");
		String strNonTROOP  = benefits.get("NonTROOP");
		String strLICS  = benefits.get("LICS");
		String strOtherTROOP  = benefits.get("OtherTROOP");
		String strBenefitStageQualifier  = benefits.get("BenefitStageQualifier");
		String strBenefitStageAmount  = benefits.get("BenefitStageAmount");
		String strSpendingAccRemaining  = benefits.get("SpendingAccRemaining");
		String strRemainingBenefit  = benefits.get("RemainingBenefit");
		String strAccumulatedDeductible  = benefits.get("AccumulatedDeductible");
		String strRemainingDeductible  = benefits.get("RemainingDeductible"); 
		 		 
		expBenefits.add(strCaseID);
		expBenefits.add(strHICN);  
		expBenefits.add(strCopayFieldUsed);
		expBenefits.add(strTierLevel);
		expBenefits.add(strFormularyIndicator);
		expBenefits.add(strPlaceOfService);
		expBenefits.add(strPatientResidence);
		expBenefits.add(strPharmacyServiceType);
		expBenefits.add(strDeductibleMessage);
		expBenefits.add(strLICSCode);
		expBenefits.add(strLICSEffectiveDate);
		expBenefits.add(strInstitutionalCode);
		expBenefits.add(strInstitutionalEffDate);
		expBenefits.add(strFreeFirstFill);
		expBenefits.add(strCostShareReduction);
		expBenefits.add(strGracePeriod);
		expBenefits.add(strMemberDeductible);
		expBenefits.add(strPlanDeductible);
		expBenefits.add(strDeductibleExcluded);
		expBenefits.add(strTROOP);
		expBenefits.add(strNonTROOP);
		expBenefits.add(strLICS);
		expBenefits.add(strOtherTROOP);
		expBenefits.add(strBenefitStageQualifier);
		expBenefits.add(strBenefitStageAmount);
		expBenefits.add(strSpendingAccRemaining);
		expBenefits.add(strRemainingBenefit);
		expBenefits.add(strAccumulatedDeductible);
		expBenefits.add(strRemainingDeductible);
		
		pharmacyLookup_Claim_BenefitsSelector.Claim_Benefits_CaseID(strCaseID); 
		pharmacyLookup_Claim_BenefitsSelector.Claim_Benefits_HICN(strHICN);
		pharmacyLookup_Claim_BenefitsSelector.Claim_Benefits_CopayFieldUsed(strCopayFieldUsed);
		pharmacyLookup_Claim_BenefitsSelector.Claim_Benefits_TierLevel(strTierLevel);
		pharmacyLookup_Claim_BenefitsSelector.Claim_Benefits_FormularyIndicator(strFormularyIndicator);
		pharmacyLookup_Claim_BenefitsSelector.Claim_Benefits_PlaceOfService(strPlaceOfService);
		pharmacyLookup_Claim_BenefitsSelector.Claim_Benefits_PatientResidence(strPatientResidence);
		pharmacyLookup_Claim_BenefitsSelector.Claim_Benefits_PharmacyServiceType(strPharmacyServiceType);
		pharmacyLookup_Claim_BenefitsSelector.Claim_Benefits_DeductibleMessage(strDeductibleMessage);
		pharmacyLookup_Claim_BenefitsSelector.Claim_Benefits_LICSCode(strLICSCode);
		pharmacyLookup_Claim_BenefitsSelector.Claim_Benefits_LICSEffectiveDate(strLICSEffectiveDate);
		pharmacyLookup_Claim_BenefitsSelector.Claim_Benefits_InstitutionalCode(strInstitutionalCode);
		pharmacyLookup_Claim_BenefitsSelector.Claim_Benefits_InstitutionalEffDate(strInstitutionalEffDate);
		pharmacyLookup_Claim_BenefitsSelector.Claim_Benefits_FreeFirstFill(strFreeFirstFill);
		pharmacyLookup_Claim_BenefitsSelector.Claim_Benefits_CostShareReduction(strCostShareReduction);
		pharmacyLookup_Claim_BenefitsSelector.Claim_Benefits_GracePeriod(strGracePeriod);
		pharmacyLookup_Claim_BenefitsSelector.Claim_Benefits_MemberDeductible(strMemberDeductible);
		pharmacyLookup_Claim_BenefitsSelector.Claim_Benefits_PlanDeductible(strPlanDeductible);
		pharmacyLookup_Claim_BenefitsSelector.Claim_Benefits_DeductibleExcluded(strDeductibleExcluded);
		pharmacyLookup_Claim_BenefitsSelector.Claim_Benefits_TROOP(strTROOP);
		pharmacyLookup_Claim_BenefitsSelector.Claim_Benefits_NonTROOP(strNonTROOP);
		pharmacyLookup_Claim_BenefitsSelector.Claim_Benefits_LICS(strLICS);
		pharmacyLookup_Claim_BenefitsSelector.Claim_Benefits_OtherTROOP(strOtherTROOP);
		pharmacyLookup_Claim_BenefitsSelector.Claim_Benefits_BenefitStageQualifier(strBenefitStageQualifier);
		pharmacyLookup_Claim_BenefitsSelector.Claim_Benefits_BenefitStageAmount(strBenefitStageAmount);
		pharmacyLookup_Claim_BenefitsSelector.Claim_Benefits_SpendingAccRemaining(strSpendingAccRemaining);
		pharmacyLookup_Claim_BenefitsSelector.Claim_Benefits_RemainingBenefit(strRemainingBenefit);
		pharmacyLookup_Claim_BenefitsSelector.Claim_Benefits_AccumulatedDeductible(strAccumulatedDeductible);
		pharmacyLookup_Claim_BenefitsSelector.Claim_Benefits_RemainingDeductible(strRemainingDeductible);
				 		 
			
		for(int i=0;i<expBenefits.size();i++)
		{
			benefitsSoft.assertEquals(pharmacyLookup_Claim_BenefitsSelector.actBenefits.get(i), expBenefits.get(i));
		}		
		benefitsSoft.assertAll();
		
	}	
	
	 
}

