package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common.PharmacyLookup_LandingPage_Steps;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages.PharmacyLookup_Claim_PricingSelector;

public class PharmacyLookup_Claim_Pricing_Steps {

	PharmacyLookup_Claim_PricingSelector pharmacyLookup_Claim_PricingSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expPricing = new ArrayList<String>();
	public SoftAssert pricingSoft = new SoftAssert();
	
	
	public PharmacyLookup_Claim_Pricing_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		pharmacyLookup_Claim_PricingSelector = new PharmacyLookup_Claim_PricingSelector(SharedResource,utils);
	}
	
	public void clickOnPricing() throws Throwable{
		pharmacyLookup_Claim_PricingSelector.PharmacyLookup_Claim_clickOnPricing();
		pharmacyLookup_Claim_PricingSelector.waitUnitillPricingDetails();
	}
	
	public void verifyPricing(Map<String,String> princing)throws Throwable {
		String strBaseCopayAmt = princing.get("BaseCopayAmt");
		String strBaseCoinsAmt = princing.get("BaseCoinsAmt");
		String strAmtAppliedToPeriodicDed = princing.get("AmtAppliedToPeriodicDed");
		String strAmtExceededProcBenefitMax = princing.get("AmtExceededProcBenefitMax");
		String strAmtAttributedToProcssorFee = princing.get("AmtAttributedToProcssorFee");
		String strAmtAttributedToSalesTax = princing.get("AmtAttributedToSalesTax");
		String strAmtAttributedToCoverageGap = princing.get("AmtAttributedToCoverageGap");
		String strHealthPlanFundedAmt = princing.get("HealthPlanFundedAmt");
		String strMemberPaidDifference = princing.get("MemberPaidDifference");
		String strAttrToNetSelection = princing.get("AttrToNetSelection");
		String strAttrToBrandDrug = princing.get("AttrToBrandDrug");
		String strAttrToNonPrefFormulary = princing.get("AttrToNonPrefFormulary");
		String strAttrToNonPrefFormularyBrand = princing.get("AttrToNonPrefFormularyBrand");
		String strTotalPatientPay = princing.get("TotalPatientPay");
		String strHRAAmount = princing.get("HRAAmount");
		String strFSAAmount = princing.get("FSAAmount");
		String strHSAAmount = princing.get("HSAAmount");
		String strADJAmount = princing.get("ADJAmount");
		String strSPAPAmount = princing.get("SPAPAmount");
		String strTotalMemberPaidToPharmacy = princing.get("TotalMemberPaidToPharmacy");
		String strIngredientCost = princing.get("IngredientCost");
		String strDispenseFee = princing.get("DispenseFee");
		String strIncentiveAmount = princing.get("IncentiveAmount");
		String strOtherAmountPaid = princing.get("OtherAmountPaid");
		String strFlatSalesTax = princing.get("FlatSalesTax");
		String strPercentageSalesTax = princing.get("PercentageSalesTax");
		String strPPTotalPatientPay = princing.get("PPTotalPatientPay");
		String strTotalOtherPayerAmount = princing.get("TotalOtherPayerAmount");
		String strOtherPayer = princing.get("OtherPayer");
		String strRxCostIngredientCost = princing.get("RxCostIngredientCost");
		String strRxCostDispenseFee = princing.get("RxCostDispenseFee");
		String strRxCostIncentiveAmount = princing.get("RxCostIncentiveAmount");
		String strRxCostOtherAmountPaid = princing.get("RxCostOtherAmountPaid");
		String strRxCostFlatSalesTax = princing.get("RxCostFlatSalesTax");
		String strRxCostPercentageSalesTax = princing.get("RxCostPercentageSalesTax");
		String strTotalPlanPaid = princing.get("TotalPlanPaid");
		String strTotalOtherPayer = princing.get("TotalOtherPayer");
		String strTotalRxCost = princing.get("TotalRxCost");
		 			
		expPricing.add(strBaseCopayAmt);
		expPricing.add(strBaseCoinsAmt);
		expPricing.add(strAmtAppliedToPeriodicDed);
		expPricing.add(strAmtExceededProcBenefitMax);
		expPricing.add(strAmtAttributedToProcssorFee);
		expPricing.add(strAmtAttributedToSalesTax);
		expPricing.add(strAmtAttributedToCoverageGap);
		expPricing.add(strHealthPlanFundedAmt);
		expPricing.add(strMemberPaidDifference);
		expPricing.add(strAttrToNetSelection);
		expPricing.add(strAttrToBrandDrug);
		expPricing.add(strAttrToNonPrefFormulary);
		expPricing.add(strAttrToNonPrefFormularyBrand);
		expPricing.add(strTotalPatientPay);
		expPricing.add(strHRAAmount);
		expPricing.add(strFSAAmount);
		expPricing.add(strHSAAmount);
		expPricing.add(strADJAmount);
		expPricing.add(strSPAPAmount);
		expPricing.add(strTotalMemberPaidToPharmacy);
		expPricing.add(strIngredientCost);
		expPricing.add(strDispenseFee);
		expPricing.add(strIncentiveAmount);
		expPricing.add(strOtherAmountPaid);
		expPricing.add(strFlatSalesTax);
		expPricing.add(strPercentageSalesTax);
		expPricing.add(strPPTotalPatientPay);
		expPricing.add(strTotalOtherPayerAmount);
		expPricing.add(strOtherPayer);
		expPricing.add(strRxCostIngredientCost);
		expPricing.add(strRxCostDispenseFee);
		expPricing.add(strRxCostIncentiveAmount);
		expPricing.add(strRxCostOtherAmountPaid);
		expPricing.add(strRxCostFlatSalesTax);
		expPricing.add(strRxCostPercentageSalesTax);
		expPricing.add(strTotalPlanPaid);
		expPricing.add(strTotalOtherPayer);
		expPricing.add(strTotalRxCost);		 
		
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_BaseCopayAmt(strBaseCopayAmt);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_BaseCoinsAmt(strBaseCoinsAmt);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_AmtAppliedToPeriodicDed(strAmtAppliedToPeriodicDed);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_AmtExceededProcBenefitMax(strAmtExceededProcBenefitMax);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_AmtAttributedToProcssorFee(strAmtAttributedToProcssorFee);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_AmtAttributedToSalesTax(strAmtAttributedToSalesTax);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_AmtAttributedToCoverageGap(strAmtAttributedToCoverageGap);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_HealthPlanFundedAmt(strHealthPlanFundedAmt);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_MemberPaidDifference(strMemberPaidDifference);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_AttrToNetSelection(strAttrToNetSelection);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_AttrToBrandDrug(strAttrToBrandDrug);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_AttrToNonPrefFormulary(strAttrToNonPrefFormulary);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_AttrToNonPrefFormularyBrand(strAttrToNonPrefFormularyBrand);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_TotalPatientPay(strTotalPatientPay);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_HRAAmount(strHRAAmount);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_FSAAmount(strFSAAmount);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_HSAAmount(strHSAAmount);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_ADJAmount(strADJAmount);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_SPAPAmount(strSPAPAmount);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_TotalMemberPaidToPharmacy(strTotalMemberPaidToPharmacy);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_IngredientCost(strIngredientCost);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_DispenseFee(strDispenseFee);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_IncentiveAmount(strIncentiveAmount);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_OtherAmountPaid(strOtherAmountPaid);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_FlatSalesTax(strFlatSalesTax);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_PercentageSalesTax(strPercentageSalesTax);		
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_PPTotalPatientPay(strPPTotalPatientPay);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_TotalOtherPayerAmount(strTotalOtherPayerAmount);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_OtherPayer(strOtherPayer);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_RxCostIngredientCost(strRxCostIngredientCost);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_RxCostDispenseFee(strRxCostDispenseFee);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_RxCostIncentiveAmount(strRxCostIncentiveAmount);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_RxCostOtherAmountPaid(strRxCostOtherAmountPaid);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_RxCostFlatSalesTax(strRxCostFlatSalesTax);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_RxCostPercentageSalesTax(strRxCostPercentageSalesTax);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_TotalPlanPaid(strTotalPlanPaid);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_TotalOtherPayer(strTotalOtherPayer);
		pharmacyLookup_Claim_PricingSelector.Claim_Pricing_TotalRxCost(strTotalRxCost);		
		
			
		for(int i=0;i<expPricing.size();i++)
		{
			pricingSoft.assertEquals(pharmacyLookup_Claim_PricingSelector.actPricing.get(i), expPricing.get(i));
		}		
		pricingSoft.assertAll();
		
	}	
	
	 
}

