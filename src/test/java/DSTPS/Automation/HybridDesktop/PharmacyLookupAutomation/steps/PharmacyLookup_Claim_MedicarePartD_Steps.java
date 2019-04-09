package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common.PharmacyLookup_LandingPage_Steps;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages.PharmacyLookup_Claim_MedicarePartDSelector;

public class PharmacyLookup_Claim_MedicarePartD_Steps {

	PharmacyLookup_Claim_MedicarePartDSelector pharmacyLookup_Claim_MedicarePartDSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expMedicarePartD = new ArrayList<String>();
	public SoftAssert medicarePartDSoft = new SoftAssert();
	
	
	public PharmacyLookup_Claim_MedicarePartD_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		pharmacyLookup_Claim_MedicarePartDSelector = new PharmacyLookup_Claim_MedicarePartDSelector(SharedResource,utils);
	}
	
	public void clickOnMedicarePartD() throws Throwable{
		pharmacyLookup_Claim_MedicarePartDSelector.PharmacyLookup_Claim_clickOnMedicarePartD();
		pharmacyLookup_Claim_MedicarePartDSelector.waitUnitillMedicarePartD();
	}
	
	public void verifyMedicarePartD(Map<String,String> medicarePartD)throws Throwable {
		 
		String strAlternateBusinessFlag = medicarePartD.get("AlternateBusinessFlag");
		String strNonTrOOPEligPLROAmt = medicarePartD.get("NonTrOOPEligPLROAmt");
		String strTotalCoveredDrugCost = medicarePartD.get("TotalCoveredDrugCost");
		String strGrossDrugCostAboveOOPThreshold = medicarePartD.get("GrossDrugCostAboveOOPThreshold");
		String strLICSEffectiveDate = medicarePartD.get("LICSEffectiveDate");
		String strMTMEffectiveDate = medicarePartD.get("MTMEffectiveDate");
		String strPlaceofService = medicarePartD.get("PlaceofService");
		String strPlanType = medicarePartD.get("PlanType");
		String strTransitionLetter = medicarePartD.get("TransitionLetter");
		String strTrOOPEligibleFlag = medicarePartD.get("TrOOPEligibleFlag");
		String strOtherTrOOPAmount = medicarePartD.get("OtherTrOOPAmount");
		String strReportedGapDiscount = medicarePartD.get("ReportedGapDiscount");
		String strGrossDrugCostBelowOOPThreshold = medicarePartD.get("GrossDrugCostBelowOOPThreshold");
		String strLICSAmount = medicarePartD.get("LICSAmount");
		String strInstitutionalCode = medicarePartD.get("InstitutionalCode");
		String strPatientLocationCode = medicarePartD.get("PatientLocationCode");
		String strSupplementalIndicator = medicarePartD.get("SupplementalIndicator");
		String strTransitionCode = medicarePartD.get("TransitionCode");
		String strTrOOPAppliedAmount = medicarePartD.get("TrOOPAppliedAmount");
		String strTrOOPAccumulationAmount = medicarePartD.get("TrOOPAccumulationAmount");
		String strFDADefStatus = medicarePartD.get("FDADefStatus");
		String strFreeFirstFillIndicator = medicarePartD.get("FreeFirstFillIndicator");
		String strLICSCode = medicarePartD.get("LICSCode");
		String strMTMCode = medicarePartD.get("MTMCode");
		String strInstitutionalEffectiveDate = medicarePartD.get("InstitutionalEffectiveDate");
		String strPatientResidence = medicarePartD.get("PatientResidence");
		String strProcessedasIndicator = medicarePartD.get("ProcessedasIndicator");		 
		 		 
		expMedicarePartD.add(strAlternateBusinessFlag);
		expMedicarePartD.add(strNonTrOOPEligPLROAmt);
		expMedicarePartD.add(strTotalCoveredDrugCost);
		expMedicarePartD.add(strGrossDrugCostAboveOOPThreshold);
		expMedicarePartD.add(strLICSEffectiveDate);
		expMedicarePartD.add(strMTMEffectiveDate);
		expMedicarePartD.add(strPlaceofService);
		expMedicarePartD.add(strPlanType);
		expMedicarePartD.add(strTransitionLetter);
		expMedicarePartD.add(strTrOOPEligibleFlag);
		expMedicarePartD.add(strOtherTrOOPAmount);
		expMedicarePartD.add(strReportedGapDiscount);
		expMedicarePartD.add(strGrossDrugCostBelowOOPThreshold);
		expMedicarePartD.add(strLICSAmount);
		expMedicarePartD.add(strInstitutionalCode);
		expMedicarePartD.add(strPatientLocationCode);
		expMedicarePartD.add(strSupplementalIndicator);
		expMedicarePartD.add(strTransitionCode);
		expMedicarePartD.add(strTrOOPAppliedAmount);
		expMedicarePartD.add(strTrOOPAccumulationAmount);
		expMedicarePartD.add(strFDADefStatus);
		expMedicarePartD.add(strFreeFirstFillIndicator);
		expMedicarePartD.add(strLICSCode);
		expMedicarePartD.add(strMTMCode);
		expMedicarePartD.add(strInstitutionalEffectiveDate);
		expMedicarePartD.add(strPatientResidence);
		expMedicarePartD.add(strProcessedasIndicator);		 
		
		pharmacyLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_AlternateBusinessFlag(strAlternateBusinessFlag);
		pharmacyLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_NonTrOOPEligPLROAmt(strNonTrOOPEligPLROAmt);
		pharmacyLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_TotalCoveredDrugCost(strTotalCoveredDrugCost);
		pharmacyLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_GrossDrugCostAboveOOPThreshold(strGrossDrugCostAboveOOPThreshold);
		pharmacyLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_LICSEffectiveDate(strLICSEffectiveDate);
		pharmacyLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_MTMEffectiveDate(strMTMEffectiveDate);
		pharmacyLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_PlaceofService(strPlaceofService);
		pharmacyLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_PlanType(strPlanType);
		pharmacyLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_TransitionLetter(strTransitionLetter);
		pharmacyLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_TrOOPEligibleFlag(strTrOOPEligibleFlag);
		pharmacyLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_OtherTrOOPAmount(strOtherTrOOPAmount);
		pharmacyLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_ReportedGapDiscount(strReportedGapDiscount);
		pharmacyLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_GrossDrugCostBelowOOPThreshold(strGrossDrugCostBelowOOPThreshold);
		pharmacyLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_LICSAmount(strLICSAmount);
		pharmacyLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_InstitutionalCode(strInstitutionalCode);
		pharmacyLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_PatientLocationCode(strPatientLocationCode);
		pharmacyLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_SupplementalIndicator(strSupplementalIndicator);
		pharmacyLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_TransitionCode(strTransitionCode);
		pharmacyLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_TrOOPAppliedAmount(strTrOOPAppliedAmount);
		pharmacyLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_TrOOPAccumulationAmount(strTrOOPAccumulationAmount);
		pharmacyLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_FDADefStatus(strFDADefStatus);
		pharmacyLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_FreeFirstFillIndicator(strFreeFirstFillIndicator);
		pharmacyLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_LICSCode(strLICSCode);
		pharmacyLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_MTMCode(strMTMCode);
		pharmacyLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_InstitutionalEffectiveDate(strInstitutionalEffectiveDate);
		pharmacyLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_PatientResidence(strPatientResidence);
		pharmacyLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_ProcessedasIndicator(strProcessedasIndicator);
		 
			
		for(int i=0;i<expMedicarePartD.size();i++)
		{
			medicarePartDSoft.assertEquals(pharmacyLookup_Claim_MedicarePartDSelector.actMedicarePartD.get(i), expMedicarePartD.get(i));
		}		
		medicarePartDSoft.assertAll();
		
	}	
	
	 
}

