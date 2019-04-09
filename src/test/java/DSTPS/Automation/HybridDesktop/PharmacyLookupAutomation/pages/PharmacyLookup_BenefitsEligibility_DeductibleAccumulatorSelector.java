package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class PharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector {

	private By BE_DEDUCTIBLEACCUMULATOR_LINK,BE_ACCUMULATORBENEFITPERIOD_TABLE,BE_ACCUMULATORCOMPONENT_TABLE;
	private By BE_ACCUMULATORAMOUNTS_TABLE,BE_INDIVIDUALACCUMULATIONS_TABLE,BE_FAMILYACCUMULATIONS_TABLE;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actBEDeductAccumDetails = new ArrayList<String>();
	
	public PharmacyLookup_BenefitsEligibility_DeductibleAccumulatorSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		PharmacyLookup_BenefitsEligibility_DeductibleAccumulator_Objects();
	}
	
	private void  PharmacyLookup_BenefitsEligibility_DeductibleAccumulator_Objects()
	{		
		BE_DEDUCTIBLEACCUMULATOR_LINK = By.linkText("Deductible & Accumulators");
		BE_ACCUMULATORBENEFITPERIOD_TABLE = By.xpath("//*[@class='ui-datatable ui-widget fl custom-dt benefits-accumulator-period-dt']");
		BE_ACCUMULATORCOMPONENT_TABLE = By.id("benefitsSelectionForm:benefitsAccordionPanel:accumulatorComponentPanel");
		BE_ACCUMULATORAMOUNTS_TABLE = By.id("benefitsSelectionForm:benefitsAccordionPanel:accumulatorSummaryAmountsPanel");
		BE_INDIVIDUALACCUMULATIONS_TABLE = By.xpath("//table[@class='fl custom-tbls accumulator-amount-tbl']");
		BE_FAMILYACCUMULATIONS_TABLE = By.xpath("//table[@class='fl custom-tbls accumulator-amount-tb2 ml10']");
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Benefits & Eligibility Deductible & Accumulators Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void clickOnDeductibleAndAccumulatorLink() throws Throwable{
		utils.ClickOnLink(BE_DEDUCTIBLEACCUMULATOR_LINK);
		utils.GetBusyStatus();
	}
	
	public void waitUntillDeductibleAndAccumulator() throws Throwable{
		utils.CheckElementPresenceByLocator(BE_ACCUMULATORBENEFITPERIOD_TABLE);
		Thread.sleep(1000);
	}
	
	// Accumulator Benefit Period
	
	public void BenefitsEligibility_AccumulatorBenefitPeriod_Start(String strABPStart) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_ACCUMULATORBENEFITPERIOD_TABLE,strABPStart));
	}
	
	public void BenefitsEligibility_AccumulatorBenefitPeriod_End(String strABPEnd) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_ACCUMULATORBENEFITPERIOD_TABLE,strABPEnd));
	}
	
	public void BenefitsEligibility_AccumulatorBenefitPeriod_Level(String strABPLevel) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_ACCUMULATORBENEFITPERIOD_TABLE,strABPLevel));
	}
	
	// Accumulator Component
	
	public void BenefitsEligibility_AccumulatorComponent_AccumulatorID(String strACAccumulatorID) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_ACCUMULATORCOMPONENT_TABLE,strACAccumulatorID));
	}
	
	public void BenefitsEligibility_AccumulatorComponent_Start(String strACStart) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_ACCUMULATORCOMPONENT_TABLE,strACStart));
	}
	
	public void BenefitsEligibility_AccumulatorComponent_End(String strACEnd) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_ACCUMULATORCOMPONENT_TABLE,strACEnd));
	}
	
	public void BenefitsEligibility_AccumulatorComponent_Indicator(String strACIndicator) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_ACCUMULATORCOMPONENT_TABLE,strACIndicator));
	}
	
	// Accumulator Amounts	
	
	public void BenefitsEligibility_AccumulatorAmounts_Type(String strAAType) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_ACCUMULATORAMOUNTS_TABLE,strAAType));
	}
	
	public void BenefitsEligibility_AccumulatorAmounts_Name(String strAAName) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_ACCUMULATORAMOUNTS_TABLE,strAAName));
	}
	
	public void BenefitsEligibility_AccumulatorAmounts_MedicalOrRx(String strAAMedicalRx) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_ACCUMULATORAMOUNTS_TABLE,strAAMedicalRx));
	}
	
	public void BenefitsEligibility_AccumulatorAmounts_Network(String strAANetwork) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_ACCUMULATORAMOUNTS_TABLE,strAANetwork));
	}
	
	public void BenefitsEligibility_AccumulatorAmounts_RetailOrMailOrder(String strAARetailMailOrder) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_ACCUMULATORAMOUNTS_TABLE,strAARetailMailOrder));
	}
	
	public void BenefitsEligibility_AccumulatorAmounts_BrandOrGeneric(String strAABrandGeneric) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_ACCUMULATORAMOUNTS_TABLE,strAABrandGeneric));
	}
	
	public void BenefitsEligibility_AccumulatorAmounts_CSRIndicator(String strAACSRIndicator) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_ACCUMULATORAMOUNTS_TABLE,strAACSRIndicator));
	}
	
	public void BenefitsEligibility_AccumulatorAmounts_CSRComparison(String strAACSRComparison) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_ACCUMULATORAMOUNTS_TABLE,strAACSRComparison));
	}
	
	public void BenefitsEligibility_AccumulatorAmounts_Renewal(String strAARenewal) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_ACCUMULATORAMOUNTS_TABLE,strAARenewal));
	}
	
	// Individual Accumulations	
	
	public void BenefitsEligibility_IndividualAccumulations_IndividualLimit(String strIAIndividualLimit) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_INDIVIDUALACCUMULATIONS_TABLE,strIAIndividualLimit));
	}
	
	public void BenefitsEligibility_IndividualAccumulations_MemberPaid(String strIAMemberPaid) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_INDIVIDUALACCUMULATIONS_TABLE,strIAMemberPaid));
	}
	
	public void BenefitsEligibility_IndividualAccumulations_AmountToMeet(String strIAAmountToMeet) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_INDIVIDUALACCUMULATIONS_TABLE,strIAAmountToMeet));
	}
	
	public void BenefitsEligibility_IndividualAccumulations_PlanPaid(String strIAPlanPaid) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_INDIVIDUALACCUMULATIONS_TABLE,strIAPlanPaid));
	}
	
	public void BenefitsEligibility_IndividualAccumulations_ExcludedAmount(String strIAExcludedAmount) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_INDIVIDUALACCUMULATIONS_TABLE,strIAExcludedAmount));
	}
	
	public void BenefitsEligibility_IndividualAccumulations_PLRO(String strIAPLRO) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_INDIVIDUALACCUMULATIONS_TABLE,strIAPLRO));
	}
	
	public void BenefitsEligibility_IndividualAccumulations_Claims(String strIAClaims) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_INDIVIDUALACCUMULATIONS_TABLE,strIAClaims));
	}
	
	public void BenefitsEligibility_IndividualAccumulations_MetDate(String strIAMetDate) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_INDIVIDUALACCUMULATIONS_TABLE,strIAMetDate));
	}
	
	// Family Accumulations
	
	public void BenefitsEligibility_FamilyAccumulations_FamilyLimit(String strFAFamilyLimit) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_FAMILYACCUMULATIONS_TABLE,strFAFamilyLimit));
	}
	
	public void BenefitsEligibility_FamilyAccumulations_FamilyPaid(String strFAFamilyPaid) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_FAMILYACCUMULATIONS_TABLE,strFAFamilyPaid));
	}
	
	public void BenefitsEligibility_FamilyAccumulations_AmountToMeet(String strFAAmountToMeet) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_FAMILYACCUMULATIONS_TABLE,strFAAmountToMeet));
	}
	
	public void BenefitsEligibility_FamilyAccumulations_PlanPaid(String strFAPlanPaid) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_FAMILYACCUMULATIONS_TABLE,strFAPlanPaid));
	}
	
	public void BenefitsEligibility_FamilyAccumulations_ExcludedAmount(String strFAExcludedAmount) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_FAMILYACCUMULATIONS_TABLE,strFAExcludedAmount));
	}
	
	public void BenefitsEligibility_FamilyAccumulations_Claims(String strFAClaims) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_FAMILYACCUMULATIONS_TABLE,strFAClaims));
	}
	
	public void BenefitsEligibility_FamilyAccumulations_MetDate(String strFAMetDate) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_INDIVIDUALACCUMULATIONS_TABLE,strFAMetDate));
	}	
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Benefits & Eligibility Deductible & Accumulators Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
