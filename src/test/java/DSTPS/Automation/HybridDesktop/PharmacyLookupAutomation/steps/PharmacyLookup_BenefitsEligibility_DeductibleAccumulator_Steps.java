package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages.PharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector;

public class PharmacyLookup_BenefitsEligibility_DeductibleAccumulator_Steps {

	PharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expBEDeductAccumDetails = new ArrayList<String>();
	public SoftAssert deductAccumDetailsSoft = new SoftAssert();
	
	public PharmacyLookup_BenefitsEligibility_DeductibleAccumulator_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector = new PharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector(SharedResource,utils);
	}
	
	public void clickOnDeductibleAccumulator() throws Throwable{
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.clickOnDeductibleAndAccumulatorLink();
	}
	
	public void verifyDeductibleAccumulatorDetails(Map<String,String> deductibleAccumulatorDetails)throws Throwable {
		String strABPStart = deductibleAccumulatorDetails.get("ABPStart");
		String strABPEnd = deductibleAccumulatorDetails.get("ABPEnd");		
		String strABPLevel = deductibleAccumulatorDetails.get("ABPLevel");
		String strACAccumulatorID = deductibleAccumulatorDetails.get("ACAccumulatorID");
		String strACStart = deductibleAccumulatorDetails.get("ACStart");		
		String strACEnd = deductibleAccumulatorDetails.get("ACEnd");
		String strACIndicator = deductibleAccumulatorDetails.get("ACIndicator");
		String strAAType = deductibleAccumulatorDetails.get("AAType");		
		String strAAName = deductibleAccumulatorDetails.get("AAName");
		String strAAMedicalRx = deductibleAccumulatorDetails.get("AAMedicalRx");
		String strAANetwork = deductibleAccumulatorDetails.get("AANetwork");		
		String strAARetailMailOrder = deductibleAccumulatorDetails.get("AARetailMailOrder");
		String strAABrandGeneric = deductibleAccumulatorDetails.get("AABrandGeneric");
		String strAACSRIndicator = deductibleAccumulatorDetails.get("AACSRIndicator");		
		String strAACSRComparison = deductibleAccumulatorDetails.get("AACSRComparison");
		String strAARenewal = deductibleAccumulatorDetails.get("AARenewal");
		String strIAIndividualLimit = deductibleAccumulatorDetails.get("IAIndividualLimit");		
		String strIAMemberPaid = deductibleAccumulatorDetails.get("IAMemberPaid");
		String strIAAmountToMeet = deductibleAccumulatorDetails.get("IAAmountToMeet");
		String strIAPlanPaid = deductibleAccumulatorDetails.get("IAPlanPaid");		
		String strIAExcludedAmount = deductibleAccumulatorDetails.get("IAExcludedAmount");
		String strIAPLRO = deductibleAccumulatorDetails.get("IAPLRO");
		String strIAClaims = deductibleAccumulatorDetails.get("IAClaims");		
		String strIAMetDate = deductibleAccumulatorDetails.get("IAMetDate");
		String strFAFamilyLimit = deductibleAccumulatorDetails.get("FAFamilyLimit");		
		String strFAFamilyPaid = deductibleAccumulatorDetails.get("FAFamilyPaid");
		String strFAAmountToMeet = deductibleAccumulatorDetails.get("FAAmountToMeet");
		String strFAPlanPaid = deductibleAccumulatorDetails.get("FAPlanPaid");		
		String strFAExcludedAmount = deductibleAccumulatorDetails.get("FAExcludedAmount");
		String strFAClaims = deductibleAccumulatorDetails.get("FAClaims");		
		String strFAMetDate = deductibleAccumulatorDetails.get("FAMetDate");
				
		expBEDeductAccumDetails.add(strABPStart);
		expBEDeductAccumDetails.add(strABPEnd);
		expBEDeductAccumDetails.add(strABPLevel);
		expBEDeductAccumDetails.add(strACAccumulatorID);
		expBEDeductAccumDetails.add(strACStart);
		expBEDeductAccumDetails.add(strACEnd);
		expBEDeductAccumDetails.add(strACIndicator);
		expBEDeductAccumDetails.add(strAAType);
		expBEDeductAccumDetails.add(strAAName);
		expBEDeductAccumDetails.add(strAAMedicalRx);
		expBEDeductAccumDetails.add(strAANetwork);
		expBEDeductAccumDetails.add(strAARetailMailOrder);
		expBEDeductAccumDetails.add(strAABrandGeneric);
		expBEDeductAccumDetails.add(strAACSRIndicator);
		expBEDeductAccumDetails.add(strAACSRComparison);
		expBEDeductAccumDetails.add(strAARenewal);
		expBEDeductAccumDetails.add(strIAIndividualLimit);
		expBEDeductAccumDetails.add(strIAMemberPaid);
		expBEDeductAccumDetails.add(strIAAmountToMeet);
		expBEDeductAccumDetails.add(strIAPlanPaid);
		expBEDeductAccumDetails.add(strIAExcludedAmount);
		expBEDeductAccumDetails.add(strIAPLRO);
		expBEDeductAccumDetails.add(strIAClaims);
		expBEDeductAccumDetails.add(strIAMetDate);
		expBEDeductAccumDetails.add(strFAFamilyLimit);
		expBEDeductAccumDetails.add(strFAFamilyPaid);
		expBEDeductAccumDetails.add(strFAAmountToMeet);
		expBEDeductAccumDetails.add(strFAPlanPaid);
		expBEDeductAccumDetails.add(strFAExcludedAmount);
		expBEDeductAccumDetails.add(strFAClaims);
		expBEDeductAccumDetails.add(strFAMetDate);
		
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.waitUntillDeductibleAndAccumulator();
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_AccumulatorBenefitPeriod_Start(strABPStart);
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_AccumulatorBenefitPeriod_End(strABPEnd);
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_AccumulatorBenefitPeriod_Level(strABPLevel);
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_AccumulatorComponent_AccumulatorID(strACAccumulatorID);
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_AccumulatorComponent_Start(strACStart);
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_AccumulatorComponent_End(strACEnd);
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_AccumulatorComponent_Indicator(strACIndicator);
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_AccumulatorAmounts_Type(strAAType);
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_AccumulatorAmounts_Name(strAAName);
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_AccumulatorAmounts_MedicalOrRx(strAAMedicalRx);
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_AccumulatorAmounts_Network(strAANetwork);
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_AccumulatorAmounts_RetailOrMailOrder(strAARetailMailOrder);
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_AccumulatorAmounts_BrandOrGeneric(strAABrandGeneric);
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_AccumulatorAmounts_CSRIndicator(strAACSRIndicator);
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_AccumulatorAmounts_CSRComparison(strAACSRComparison);
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_AccumulatorAmounts_Renewal(strAARenewal);
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_IndividualAccumulations_IndividualLimit(strIAIndividualLimit);
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_IndividualAccumulations_MemberPaid(strIAMemberPaid);
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_IndividualAccumulations_AmountToMeet(strIAAmountToMeet);
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_IndividualAccumulations_PlanPaid(strIAPlanPaid);
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_IndividualAccumulations_ExcludedAmount(strIAExcludedAmount);
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_IndividualAccumulations_PLRO(strIAPLRO);
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_IndividualAccumulations_Claims(strIAClaims);
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_IndividualAccumulations_MetDate(strIAMetDate);
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_FamilyAccumulations_FamilyLimit(strFAFamilyLimit);
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_FamilyAccumulations_FamilyPaid(strFAFamilyPaid);
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_FamilyAccumulations_AmountToMeet(strFAAmountToMeet);
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_FamilyAccumulations_PlanPaid(strFAPlanPaid);
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_FamilyAccumulations_ExcludedAmount(strFAExcludedAmount);
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_FamilyAccumulations_Claims(strFAClaims);
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_FamilyAccumulations_MetDate(strFAMetDate);
					
		for(int i=0;i<expBEDeductAccumDetails.size();i++)
		{
			deductAccumDetailsSoft.assertEquals(pharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector.actBEDeductAccumDetails.get(i), expBEDeductAccumDetails.get(i));
		}		
		deductAccumDetailsSoft.assertAll();
	}
}

