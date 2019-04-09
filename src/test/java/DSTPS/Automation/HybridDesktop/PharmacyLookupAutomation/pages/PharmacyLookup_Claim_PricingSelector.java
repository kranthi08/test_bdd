package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class PharmacyLookup_Claim_PricingSelector {

	private By CLAIM_PRICING_LINK,PRICING_TABLE,TOTAL_PATIENT_PAY_TABLE,TOTAL_MEMBER_PAID_TO_PHARMACY_TABLE,PLAN_PAY_TABLE,OTHER_PAYER_TABLE;
	private By RX_COST_TABLE,TOTAL_PLAN_PAID_TABLE,TOTAL_OTHER_PAYER_TABLE,TOTAL_RX_COST_TABLE;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actPricing = new ArrayList<String>();
 
	public PharmacyLookup_Claim_PricingSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		PharmacyLookup_Claim_Pricing_Objects();
	}
	
	private void PharmacyLookup_Claim_Pricing_Objects()
	{		
		CLAIM_PRICING_LINK = By.linkText("Pricing");
		PRICING_TABLE = By.xpath("//table[@class='claim-pricing-tbls claim-pricing-patient-pay-tbl']");
		TOTAL_PATIENT_PAY_TABLE = By.xpath("//table[@class='claim-pricing-total-tbls claim-pricing-total-patient-pay-tbl']");
		TOTAL_MEMBER_PAID_TO_PHARMACY_TABLE = By.xpath("//table[@class='claim-pricing-total-tbls claim-pricing-total-paid-to-pharmacy-tbl']");
		PLAN_PAY_TABLE = By.xpath("//table[@class='claim-pricing-tbls claim-pricing-plan-pay-tbl']");
		OTHER_PAYER_TABLE = By.xpath("//table[@class='claim-pricing-tbls claim-pricing-other-payer-tbl']");
		RX_COST_TABLE = By.xpath("//table[@class='claim-pricing-tbls claim-pricing-rx-cost-tbl']");
		TOTAL_PLAN_PAID_TABLE = By.xpath("//table[@class='claim-pricing-total-tbls claim-pricing-total-plan-paid-tbl']");
		TOTAL_OTHER_PAYER_TABLE = By.xpath("//table[@class='claim-pricing-total-tbls claim-pricing-total-other-payer-tbl']");
		TOTAL_RX_COST_TABLE = By.xpath("//table[@class='claim-pricing-total-tbls claim-pricing-total-rx-cost-tbl']");		
		
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Claim Detail Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	
	// Pricing
	
	public void PharmacyLookup_Claim_clickOnPricing() throws Throwable{
		utils.ClickOnLink(CLAIM_PRICING_LINK);
		Thread.sleep(1000);
	}
	
	public void waitUnitillPricingDetails() throws Throwable{
		utils.CheckElementPresenceByLocator(PRICING_TABLE);
		Thread.sleep(1000);
	}
	//RxNovaConnect_WebTable_VerifyRowDataWithThreeCols
	public void Claim_Pricing_BaseCopayAmt(String strBaseCopayAmt) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(PRICING_TABLE,strBaseCopayAmt));
	}
	
	public void Claim_Pricing_BaseCoinsAmt(String strBaseCoinsAmt) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(PRICING_TABLE,strBaseCoinsAmt));
	}
	
	public void Claim_Pricing_AmtAppliedToPeriodicDed(String strAmtAppliedToPeriodicDed) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(PRICING_TABLE,strAmtAppliedToPeriodicDed));
	}
	
	public void Claim_Pricing_AmtExceededProcBenefitMax(String strAmtExceededProcBenefitMax) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(PRICING_TABLE,strAmtExceededProcBenefitMax));
	}
	
	public void Claim_Pricing_AmtAttributedToProcssorFee(String strAmtAttributedToProcssorFee) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(PRICING_TABLE,strAmtAttributedToProcssorFee));
	}
	
	public void Claim_Pricing_AmtAttributedToSalesTax(String strAmtAttributedToSalesTax) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(PRICING_TABLE,strAmtAttributedToSalesTax));
	}
	
	public void Claim_Pricing_AmtAttributedToCoverageGap(String strAmtAttributedToCoverageGap) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(PRICING_TABLE,strAmtAttributedToCoverageGap));
	}
	
	public void Claim_Pricing_HealthPlanFundedAmt(String strHealthPlanFundedAmt) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(PRICING_TABLE,strHealthPlanFundedAmt));
	}
	
	public void Claim_Pricing_MemberPaidDifference(String strMemberPaidDifference) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(PRICING_TABLE,strMemberPaidDifference));
	}
	
	public void Claim_Pricing_AttrToNetSelection(String strAttrToNetSelection) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(PRICING_TABLE,strAttrToNetSelection));
	}
	
	public void Claim_Pricing_AttrToBrandDrug(String strAttrToBrandDrug) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(PRICING_TABLE,strAttrToBrandDrug));
	}
	
	public void Claim_Pricing_AttrToNonPrefFormulary(String strAttrToNonPrefFormulary) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(PRICING_TABLE,strAttrToNonPrefFormulary));
	}
	
	public void Claim_Pricing_AttrToNonPrefFormularyBrand(String strAttrToNonPrefFormularyBrand) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(PRICING_TABLE,strAttrToNonPrefFormularyBrand));
	}
	
	public void Claim_Pricing_TotalPatientPay(String strTotalPatientPay) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(TOTAL_PATIENT_PAY_TABLE,strTotalPatientPay));
	}
	
	public void Claim_Pricing_HRAAmount(String strHRAAmount) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(TOTAL_PATIENT_PAY_TABLE,strHRAAmount));
	}
	
	public void Claim_Pricing_FSAAmount(String strFSAAmount) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(TOTAL_PATIENT_PAY_TABLE,strFSAAmount));
	}
	
	public void Claim_Pricing_HSAAmount(String strHSAAmount) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(TOTAL_PATIENT_PAY_TABLE,strHSAAmount));
	}
	
	public void Claim_Pricing_ADJAmount(String strADJAmount) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(TOTAL_PATIENT_PAY_TABLE,strADJAmount));
	}
	
	public void Claim_Pricing_SPAPAmount(String strSPAPAmount) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(TOTAL_PATIENT_PAY_TABLE,strSPAPAmount));
	}
	
	public void Claim_Pricing_TotalMemberPaidToPharmacy(String strTotalMemberPaidToPharmacy) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(TOTAL_MEMBER_PAID_TO_PHARMACY_TABLE,strTotalMemberPaidToPharmacy));
	}
	
	public void Claim_Pricing_IngredientCost(String strIngredientCost) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(PLAN_PAY_TABLE,strIngredientCost));
	}
	
	public void Claim_Pricing_DispenseFee(String strDispenseFee) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(PLAN_PAY_TABLE,strDispenseFee));
	}
	
	public void Claim_Pricing_IncentiveAmount(String strIncentiveAmount) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(PLAN_PAY_TABLE,strIncentiveAmount));
	}
	
	public void Claim_Pricing_OtherAmountPaid(String strOtherAmountPaid) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(PLAN_PAY_TABLE,strOtherAmountPaid));
	}
	
	public void Claim_Pricing_FlatSalesTax(String strFlatSalesTax) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(PLAN_PAY_TABLE,strFlatSalesTax));
	}
	
	public void Claim_Pricing_PercentageSalesTax(String strPercentageSalesTax) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(PLAN_PAY_TABLE,strPercentageSalesTax));
	}
	
	public void Claim_Pricing_PPTotalPatientPay(String strPPTotalPatientPay) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(PLAN_PAY_TABLE,strPPTotalPatientPay));
	}
	
	public void Claim_Pricing_TotalOtherPayerAmount(String strTotalOtherPayerAmount) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(PLAN_PAY_TABLE,strTotalOtherPayerAmount));
	}
	
	public void Claim_Pricing_OtherPayer(String strOtherPayer) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(OTHER_PAYER_TABLE,strOtherPayer));
	}
	
	public void Claim_Pricing_RxCostIngredientCost(String strRxCostIngredientCost) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(RX_COST_TABLE,strRxCostIngredientCost));
	}
	
	public void Claim_Pricing_RxCostDispenseFee(String strRxCostDispenseFee) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(RX_COST_TABLE,strRxCostDispenseFee));
	}
	
	public void Claim_Pricing_RxCostIncentiveAmount(String strRxCostIncentiveAmount) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(RX_COST_TABLE,strRxCostIncentiveAmount));
	}
	
	public void Claim_Pricing_RxCostOtherAmountPaid(String strRxCostOtherAmountPaid) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(RX_COST_TABLE,strRxCostOtherAmountPaid));
	}
	
	public void Claim_Pricing_RxCostFlatSalesTax(String strRxCostFlatSalesTax) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(RX_COST_TABLE,strRxCostFlatSalesTax));
	}
	
	public void Claim_Pricing_RxCostPercentageSalesTax(String strRxCostPercentageSalesTax) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(RX_COST_TABLE,strRxCostPercentageSalesTax));
	}
	
	public void Claim_Pricing_TotalPlanPaid(String strTotalPlanPaid) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(TOTAL_PLAN_PAID_TABLE,strTotalPlanPaid));
	}
	
	public void Claim_Pricing_TotalOtherPayer(String strTotalOtherPayer) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(TOTAL_OTHER_PAYER_TABLE,strTotalOtherPayer));
	}
	
	
	public void Claim_Pricing_TotalRxCost(String strTotalRxCost) throws Throwable{
		actPricing.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(TOTAL_RX_COST_TABLE,strTotalRxCost));
	}
	
	
	
	
	 	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Claim Detail Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
}
	
	