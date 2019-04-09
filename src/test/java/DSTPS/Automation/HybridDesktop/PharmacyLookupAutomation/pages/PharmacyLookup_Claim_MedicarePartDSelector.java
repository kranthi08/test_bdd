package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class PharmacyLookup_Claim_MedicarePartDSelector {

	private By MEDICARE_PARTD_LINK, MEDICARE_PARTD_TABLE;
		
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actMedicarePartD = new ArrayList<String>();
 
	public PharmacyLookup_Claim_MedicarePartDSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		PharmacyLookup_Claim_MedicarePartD_Objects();
	}
	
	private void PharmacyLookup_Claim_MedicarePartD_Objects()
	{			 
		
		MEDICARE_PARTD_LINK = By.linkText("Medicare Part D");
		MEDICARE_PARTD_TABLE = By.xpath("//table[@class='claim-drug-info-tbls medicare-part-d-info-tbls']");	
		 	 		 
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Medicare Part D~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	
	// Medicare Part D
	
	public void PharmacyLookup_Claim_clickOnMedicarePartD() throws Throwable{
		utils.ClickOnLink(MEDICARE_PARTD_LINK);
		Thread.sleep(1000);
	}
	
	public void waitUnitillMedicarePartD() throws Throwable{
		utils.CheckElementPresenceByLocator(MEDICARE_PARTD_TABLE);
		Thread.sleep(1000);
	}
	
	public void Claim_MedicarePartD_AlternateBusinessFlag(String strAlternateBusinessFlag) throws Throwable{
		actMedicarePartD.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEDICARE_PARTD_TABLE,strAlternateBusinessFlag));
	}
	
	public void Claim_MedicarePartD_NonTrOOPEligPLROAmt(String strNonTrOOPEligPLROAmt) throws Throwable{
		actMedicarePartD.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEDICARE_PARTD_TABLE,strNonTrOOPEligPLROAmt));
	}
	
	public void Claim_MedicarePartD_TotalCoveredDrugCost(String strTotalCoveredDrugCost) throws Throwable{
		actMedicarePartD.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEDICARE_PARTD_TABLE,strTotalCoveredDrugCost));
	}
	
	public void Claim_MedicarePartD_GrossDrugCostAboveOOPThreshold(String strGrossDrugCostAboveOOPThreshold) throws Throwable{
		actMedicarePartD.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEDICARE_PARTD_TABLE,strGrossDrugCostAboveOOPThreshold));
	}
	
	public void Claim_MedicarePartD_LICSEffectiveDate(String strLICSEffectiveDate) throws Throwable{
		actMedicarePartD.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEDICARE_PARTD_TABLE,strLICSEffectiveDate));
	}
	
	public void Claim_MedicarePartD_MTMEffectiveDate(String strMTMEffectiveDate) throws Throwable{
		actMedicarePartD.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEDICARE_PARTD_TABLE,strMTMEffectiveDate));
	}
	
	public void Claim_MedicarePartD_PlaceofService(String strPlaceofService) throws Throwable{
		actMedicarePartD.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEDICARE_PARTD_TABLE,strPlaceofService));
	}
	
	public void Claim_MedicarePartD_PlanType(String strPlanType) throws Throwable{
		actMedicarePartD.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEDICARE_PARTD_TABLE,strPlanType));
	}
	
	public void Claim_MedicarePartD_TransitionLetter(String strTransitionLetter) throws Throwable{
		actMedicarePartD.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEDICARE_PARTD_TABLE,strTransitionLetter));
	}
	
	public void Claim_MedicarePartD_TrOOPEligibleFlag(String strTrOOPEligibleFlag) throws Throwable{
		actMedicarePartD.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEDICARE_PARTD_TABLE,strTrOOPEligibleFlag));
	}
	
	public void Claim_MedicarePartD_OtherTrOOPAmount(String strOtherTrOOPAmount) throws Throwable{
		actMedicarePartD.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEDICARE_PARTD_TABLE,strOtherTrOOPAmount));
	}
	
	public void Claim_MedicarePartD_ReportedGapDiscount(String strReportedGapDiscount) throws Throwable{
		actMedicarePartD.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEDICARE_PARTD_TABLE,strReportedGapDiscount));
	}
	
	public void Claim_MedicarePartD_GrossDrugCostBelowOOPThreshold(String strGrossDrugCostBelowOOPThreshold) throws Throwable{
		actMedicarePartD.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEDICARE_PARTD_TABLE,strGrossDrugCostBelowOOPThreshold));
	}
	
	public void Claim_MedicarePartD_LICSAmount(String strLICSAmount) throws Throwable{
		actMedicarePartD.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEDICARE_PARTD_TABLE,strLICSAmount));
	}
	
	public void Claim_MedicarePartD_InstitutionalCode(String strInstitutionalCode) throws Throwable{
		actMedicarePartD.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEDICARE_PARTD_TABLE,strInstitutionalCode));
	}
	
	public void Claim_MedicarePartD_PatientLocationCode(String strPatientLocationCode) throws Throwable{
		actMedicarePartD.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEDICARE_PARTD_TABLE,strPatientLocationCode));
	}
	
	public void Claim_MedicarePartD_SupplementalIndicator(String strSupplementalIndicator) throws Throwable{
		actMedicarePartD.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEDICARE_PARTD_TABLE,strSupplementalIndicator));
	}
	
	public void Claim_MedicarePartD_TransitionCode(String strTransitionCode) throws Throwable{
		actMedicarePartD.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEDICARE_PARTD_TABLE,strTransitionCode));
	}
	
	public void Claim_MedicarePartD_TrOOPAppliedAmount(String strTrOOPAppliedAmount) throws Throwable{
		actMedicarePartD.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEDICARE_PARTD_TABLE,strTrOOPAppliedAmount));
	}
	
	public void Claim_MedicarePartD_TrOOPAccumulationAmount(String strTrOOPAccumulationAmount) throws Throwable{
		actMedicarePartD.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEDICARE_PARTD_TABLE,strTrOOPAccumulationAmount));
	}
	
	public void Claim_MedicarePartD_FDADefStatus(String strFDADefStatus) throws Throwable{
		actMedicarePartD.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEDICARE_PARTD_TABLE,strFDADefStatus));
	}
	
	public void Claim_MedicarePartD_FreeFirstFillIndicator(String strFreeFirstFillIndicator) throws Throwable{
		actMedicarePartD.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEDICARE_PARTD_TABLE,strFreeFirstFillIndicator));
	}
	
	public void Claim_MedicarePartD_LICSCode(String strLICSCode) throws Throwable{
		actMedicarePartD.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEDICARE_PARTD_TABLE,strLICSCode));
	}
	
	public void Claim_MedicarePartD_MTMCode(String strMTMCode) throws Throwable{
		actMedicarePartD.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEDICARE_PARTD_TABLE,strMTMCode));
	}
	
	public void Claim_MedicarePartD_InstitutionalEffectiveDate(String strInstitutionalEffectiveDate) throws Throwable{
		actMedicarePartD.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEDICARE_PARTD_TABLE,strInstitutionalEffectiveDate));
	}
	
	public void Claim_MedicarePartD_PatientResidence(String strPatientResidence) throws Throwable{
		actMedicarePartD.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEDICARE_PARTD_TABLE,strPatientResidence));
	}
	
	public void Claim_MedicarePartD_ProcessedasIndicator(String strProcessedasIndicator) throws Throwable{
		actMedicarePartD.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEDICARE_PARTD_TABLE,strProcessedasIndicator));
	}
		 	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Medicare Part D~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
}
	
	