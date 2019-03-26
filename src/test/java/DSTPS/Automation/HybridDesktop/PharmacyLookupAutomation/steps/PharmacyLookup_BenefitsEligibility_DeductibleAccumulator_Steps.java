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
		String strABPStart = deductibleAccumulatorDetails.get("BeginDate");
		String strABPEnd = deductibleAccumulatorDetails.get("Indicator");		
		String strABPLevel = deductibleAccumulatorDetails.get("ProcessDate");
		String strACAccumulatorID = deductibleAccumulatorDetails.get("BeginDate");
		String strACStart = deductibleAccumulatorDetails.get("Indicator");		
		String strACEnd = deductibleAccumulatorDetails.get("ProcessDate");
		String strACIndicator = deductibleAccumulatorDetails.get("BeginDate");
		String strAAType = deductibleAccumulatorDetails.get("Indicator");		
		String strAAName = deductibleAccumulatorDetails.get("ProcessDate");
		String strAAMedicalRx = deductibleAccumulatorDetails.get("BeginDate");
		String strAANetwork = deductibleAccumulatorDetails.get("Indicator");		
		String strAARetailMailOrder = deductibleAccumulatorDetails.get("ProcessDate");
		String strAABrandGeneric = deductibleAccumulatorDetails.get("BeginDate");
		String strAACSRIndicator = deductibleAccumulatorDetails.get("Indicator");		
		String strAACSRComparison = deductibleAccumulatorDetails.get("ProcessDate");
		String strAARenewal = deductibleAccumulatorDetails.get("BeginDate");
		String strIAIndividualLimit = deductibleAccumulatorDetails.get("Indicator");		
		String strIAMemberPaid = deductibleAccumulatorDetails.get("ProcessDate");
		String strIAAmountToMeet = deductibleAccumulatorDetails.get("BeginDate");
		String strIAPlanPaid = deductibleAccumulatorDetails.get("Indicator");		
		String strIAExcludedAmount = deductibleAccumulatorDetails.get("ProcessDate");
		String strIAPLRO = deductibleAccumulatorDetails.get("BeginDate");
		String strIAClaims = deductibleAccumulatorDetails.get("Indicator");		
		String strIAMetDate = deductibleAccumulatorDetails.get("ProcessDate");
		String strFAFamilyLimit = deductibleAccumulatorDetails.get("Indicator");		
		String strFAFamilyPaid = deductibleAccumulatorDetails.get("ProcessDate");
		String strFAAmountToMeet = deductibleAccumulatorDetails.get("BeginDate");
		String strFAPlanPaid = deductibleAccumulatorDetails.get("Indicator");		
		String strFAExcludedAmount = deductibleAccumulatorDetails.get("ProcessDate");
		String strFAClaims = deductibleAccumulatorDetails.get("Indicator");		
		String strFAMetDate = deductibleAccumulatorDetails.get("ProcessDate");
				
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
		deductAccumDetailsSoft = null;
	}
}

