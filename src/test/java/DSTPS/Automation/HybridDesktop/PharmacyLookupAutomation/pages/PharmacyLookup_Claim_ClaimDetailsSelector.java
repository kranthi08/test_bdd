package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class PharmacyLookup_Claim_ClaimDetailsSelector {

	private By CLAIM_DETAIL_TABLE,CLAIM_INFORMATION_TABLE,DRUG_OVERRIDE_TABLE;
	private By PHARMACY_PRESCRIBER_TABLE,CLAIM_PRI_INFORMATION_TABLE;
	private By CLAIM_HISTORY_BUTTON,REVERSE_CLAIM_BUTTON;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actClaimDetails = new ArrayList<String>();
	public ArrayList<String> actClaimInformation = new ArrayList<String>();
	public ArrayList<String> actDrugOverride = new ArrayList<String>();
	public ArrayList<String> actPharPrescriber = new ArrayList<String>();
	public ArrayList<String> actClaimPricing = new ArrayList<String>();
	
	public PharmacyLookup_Claim_ClaimDetailsSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		PharmacyLookup_Pharmacy_CallNotes_Objects();
	}
	
	private void PharmacyLookup_Pharmacy_CallNotes_Objects()
	{		
		CLAIM_DETAIL_TABLE =By.xpath("//table[@class='word-break-tbl claim-detail-member-tbl']");		
		CLAIM_INFORMATION_TABLE = By.xpath("//table[@class='claim-dur-tbls claim-information-tbl']");
		DRUG_OVERRIDE_TABLE = By.xpath("//table[@class='claim-dur-tbls claim-drug-override-tbl']");
		PHARMACY_PRESCRIBER_TABLE = By.xpath("//table[@class='claim-dur-tbls claim-pharmacy-prescriber-tbl']");
		CLAIM_PRI_INFORMATION_TABLE = By.xpath("//table[@class='claim-dur-tbls claim-pricing-tbl']");
		CLAIM_HISTORY_BUTTON = By.xpath("//span[text()='Claim History']");
		REVERSE_CLAIM_BUTTON = By.xpath("//span[text()='Reverse Claim']");
		
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Claim Detail Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	
	// Claim Details
	
	public void Claim_ClaimDetail_MemberID(String strMemberID) throws Throwable{
		actClaimDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_DETAIL_TABLE,strMemberID));
	}
	
	public void Claim_ClaimDetail_DateOfBirth(String strDateOfBirth) throws Throwable{
		actClaimDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_DETAIL_TABLE,strDateOfBirth));
	}
	
	public void Claim_ClaimDetail_Gender(String strGender) throws Throwable{
		actClaimDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_DETAIL_TABLE,strGender));
	}
	
	public void Claim_ClaimDetail_Customer(String strCustomer) throws Throwable{
		actClaimDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_DETAIL_TABLE,strCustomer));
	}
	
	public void Claim_ClaimDetail_Client(String strClient) throws Throwable{
		actClaimDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_DETAIL_TABLE,strClient));
	}
	
	public void Claim_ClaimDetail_Group(String strGroup) throws Throwable{
		actClaimDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_DETAIL_TABLE,strGroup));
	}
	
	
	// Claim Information
	public void Claim_ClaimInformation_Status(String strStatus) throws Throwable{
		actClaimInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_INFORMATION_TABLE,strStatus));
	}
	
	public void Claim_ClaimInformation_PharmacyID(String strPharmacyID) throws Throwable{
		actClaimInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_INFORMATION_TABLE,strPharmacyID));
	}
	
	public void Claim_ClaimInformation_PharmacyQlfr(String strPharmacyQlfr) throws Throwable{
		actClaimInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_INFORMATION_TABLE,strPharmacyQlfr));
	}
	
	public void Claim_ClaimInformation_RxNo(String strRxNo) throws Throwable{
		actClaimInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_INFORMATION_TABLE,strRxNo));
	}
	
	public void Claim_ClaimInformation_POSNo(String strPOSNo) throws Throwable{
		actClaimInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_INFORMATION_TABLE,strPOSNo));
	}
	
	public void Claim_ClaimInformation_ClaimNo(String strClaimNo) throws Throwable{
		actClaimInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_INFORMATION_TABLE,strClaimNo));
	}
	
	public void Claim_ClaimInformation_DateFilled(String strDateFilled) throws Throwable{
		actClaimInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_INFORMATION_TABLE,strDateFilled));
	}
	
	public void Claim_ClaimInformation_DateWritten(String strDateWritten) throws Throwable{
		actClaimInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_INFORMATION_TABLE,strDateWritten));
	}
	
	public void Claim_ClaimInformation_DateReversed(String strDateReversed) throws Throwable{
		actClaimInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_INFORMATION_TABLE,strDateReversed));
	}
	
	public void Claim_ClaimInformation_DateAdded(String strDateAdded) throws Throwable{
		actClaimInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_INFORMATION_TABLE,strDateAdded));
	}
	
	public void Claim_ClaimInformation_TimeAdded(String strTimeAdded) throws Throwable{
		actClaimInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_INFORMATION_TABLE,strTimeAdded));
	}
	
	public void Claim_ClaimInformation_DateUpdated(String strDateUpdated) throws Throwable{
		actClaimInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_INFORMATION_TABLE,strDateUpdated));
	}
	
	public void Claim_ClaimInformation_TimeUpdated(String strTimeUpdated) throws Throwable{
		actClaimInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_INFORMATION_TABLE,strTimeUpdated));
	}
	
	public void Claim_ClaimInformation_RxOrigin(String strRxOrigin) throws Throwable{
		actClaimInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_INFORMATION_TABLE,strRxOrigin));
	}
	
	public void Claim_ClaimInformation_Source(String strSource) throws Throwable{
		actClaimInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_INFORMATION_TABLE,strSource));
	}
	
	public void Claim_ClaimInformation_Version(String strVersion) throws Throwable{
		actClaimInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_INFORMATION_TABLE,strVersion));
	}
	
	// Drug Override Information
	
	public void Claim_DrugOverrideInformation_NDC(String strNDC) throws Throwable{
		actDrugOverride.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_OVERRIDE_TABLE,strNDC));
	}
	
	public void Claim_DrugOverrideInformation_LabelName(String strLabelName) throws Throwable{
		actDrugOverride.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_OVERRIDE_TABLE,strLabelName));
	}
	
	public void Claim_DrugOverrideInformation_GenericName(String strGenericName) throws Throwable{
		actDrugOverride.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_OVERRIDE_TABLE,strGenericName));
	}
	
	public void Claim_DrugOverrideInformation_DaysSupply(String strDaysSupply) throws Throwable{
		actDrugOverride.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_OVERRIDE_TABLE,strDaysSupply));
	}
	
	public void Claim_DrugOverrideInformation_Quantity(String strQuantity) throws Throwable{
		actDrugOverride.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_OVERRIDE_TABLE,strQuantity));
	}
	
	public void Claim_DrugOverrideInformation_DAW(String strDAW) throws Throwable{
		actDrugOverride.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_OVERRIDE_TABLE,strDAW));
	}
	
	public void Claim_DrugOverrideInformation_NewRefill(String strNewRefill) throws Throwable{
		actDrugOverride.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_OVERRIDE_TABLE,strNewRefill));
	}
	
	public void Claim_DrugOverrideInformation_Compound(String strCompound) throws Throwable{
		actDrugOverride.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_OVERRIDE_TABLE,strCompound));
	}
	
	public void Claim_DrugOverrideInformation_DrugDiscount(String strDrugDiscount) throws Throwable{
		actDrugOverride.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_OVERRIDE_TABLE,strDrugDiscount));
	}
	
	public void Claim_DrugOverrideInformation_SpecialtyDrugFlag(String strSpecialtyDrugFlag) throws Throwable{
		actDrugOverride.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_OVERRIDE_TABLE,strSpecialtyDrugFlag));
	}
	
	public void Claim_DrugOverrideInformation_ResAuthNumber(String strResAuthNumber) throws Throwable{
		actDrugOverride.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_OVERRIDE_TABLE,strResAuthNumber));
	}
	
	public void Claim_DrugOverrideInformation_PreAuthNumber(String strPreAuthNumber) throws Throwable{
		actDrugOverride.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_OVERRIDE_TABLE,strPreAuthNumber));
	}
	
	public void Claim_DrugOverrideInformation_CustAuthNumber(String strCustAuthNumber) throws Throwable{
		actDrugOverride.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_OVERRIDE_TABLE,strCustAuthNumber));
	}
	
	public void Claim_DrugOverrideInformation_PriorAuthNumberSub(String strPriorAuthNumberSub) throws Throwable{
		actDrugOverride.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_OVERRIDE_TABLE,strPriorAuthNumberSub));
	}
	
	public void Claim_DrugOverrideInformation_ClinicalSupportID(String strClinicalSupportID) throws Throwable{
		actDrugOverride.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_OVERRIDE_TABLE,strClinicalSupportID));
	}
	
	public void Claim_DrugOverrideInformation_SubmissionClarCode(String strSubmissionClarCode) throws Throwable{
		actDrugOverride.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_OVERRIDE_TABLE,strSubmissionClarCode));
	}
	
	public void Claim_DrugOverrideInformation_OtherCoverage(String strOtherCoverage) throws Throwable{
		actDrugOverride.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_OVERRIDE_TABLE,strOtherCoverage));
	}
	
	public void Claim_DrugOverrideInformation_DURInterven(String strDURInterven) throws Throwable{
		actDrugOverride.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_OVERRIDE_TABLE,strDURInterven));
	}
	
	public void Claim_DrugOverrideInformation_DURConflict(String strDURConflict) throws Throwable{
		actDrugOverride.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_OVERRIDE_TABLE,strDURConflict));
	}
	
	public void Claim_DrugOverrideInformation_DUROutcome(String strDUROutcome) throws Throwable{
		actDrugOverride.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_OVERRIDE_TABLE,strDUROutcome));
	}
	
	public void Claim_DrugOverrideInformation_PostPay2(String strPostPay2) throws Throwable{
		actDrugOverride.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_OVERRIDE_TABLE,strPostPay2));
	}
	
	public void Claim_DrugOverrideInformation_PostPay3(String strPostPay3) throws Throwable{
		actDrugOverride.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_OVERRIDE_TABLE,strPostPay3));
	}
	
	public void Claim_DrugOverrideInformation_PostPay4(String strPostPay4) throws Throwable{
		actDrugOverride.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_OVERRIDE_TABLE,strPostPay4));
	}
	
	// Pharmacy Prescriber Information
	
	public void Claim_PharmacyPrescriberInformation_PharmacyName(String strPharmacyName) throws Throwable{
		actPharPrescriber.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_PRESCRIBER_TABLE,strPharmacyName));
	}
	
	public void Claim_PharmacyPrescriberInformation_Address(String strAddress) throws Throwable{
		actPharPrescriber.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_PRESCRIBER_TABLE,strAddress));
	}
	
	public void Claim_PharmacyPrescriberInformation_City(String strCity) throws Throwable{
		actPharPrescriber.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_PRESCRIBER_TABLE,strCity));
	}
	
	public void Claim_PharmacyPrescriberInformation_State(String strState) throws Throwable{
		actPharPrescriber.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_PRESCRIBER_TABLE,strState));
	}
	
	public void Claim_PharmacyPrescriberInformation_ZIP(String strZIP) throws Throwable{
		actPharPrescriber.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_PRESCRIBER_TABLE,strZIP));
	}
	
	public void Claim_PharmacyPrescriberInformation_Phone(String strPhone) throws Throwable{
		actPharPrescriber.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_PRESCRIBER_TABLE,strPhone));
	}
	
	public void Claim_PharmacyPrescriberInformation_Affiliation(String strAffiliation) throws Throwable{
		actPharPrescriber.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_PRESCRIBER_TABLE,strAffiliation));
	}
	
	public void Claim_PharmacyPrescriberInformation_Chain(String strChain) throws Throwable{
		actPharPrescriber.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_PRESCRIBER_TABLE,strChain));
	}
	
	public void Claim_PharmacyPrescriberInformation_PharmacyNetwork(String strPharmacyNetwork) throws Throwable{
		actPharPrescriber.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_PRESCRIBER_TABLE,strPharmacyNetwork));
	}
	
	public void Claim_PharmacyPrescriberInformation_PrescriberID(String strPrescriberID) throws Throwable{
		actPharPrescriber.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_PRESCRIBER_TABLE,strPrescriberID));
	}
	
	public void Claim_PharmacyPrescriberInformation_PrescriberQlfr(String strPrescriberQlfr) throws Throwable{
		actPharPrescriber.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_PRESCRIBER_TABLE,strPrescriberQlfr));
	}
	
	public void Claim_PharmacyPrescriberInformation_PrescriberName(String strPrescriberName) throws Throwable{
		actPharPrescriber.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_PRESCRIBER_TABLE,strPrescriberName));
	}
	
	public void Claim_PharmacyPrescriberInformation_FillRecInterval(String strFillRecInterval) throws Throwable{
		actPharPrescriber.add(utils.RxNovaConnect_WebTable_VerifyRowData(PHARMACY_PRESCRIBER_TABLE,strFillRecInterval));
	}
	
		
	// Claim Princing Information
	
	public void Claim_PricingInformation_PlanPaid(String strPlanPaid) throws Throwable{
		actClaimPricing.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_PRI_INFORMATION_TABLE,strPlanPaid));
	}
	
	public void Claim_PricingInformation_PatientPaid(String strPatientPaid) throws Throwable{
		actClaimPricing.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_PRI_INFORMATION_TABLE,strPatientPaid));
	}
	
	public void Claim_PricingInformation_AWPCost(String strAWPCost) throws Throwable{
		actClaimPricing.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_PRI_INFORMATION_TABLE,strAWPCost));
	}
	
	public void Claim_PricingInformation_MACIngrCost(String strMACIngrCost) throws Throwable{
		actClaimPricing.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_PRI_INFORMATION_TABLE,strMACIngrCost));
	}
	
	public void Claim_PricingInformation_UCAmount(String strUCAmount) throws Throwable{
		actClaimPricing.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_PRI_INFORMATION_TABLE,strUCAmount));
	}
	
	public void Claim_PricingInformation_WACAmount(String strWACAmount) throws Throwable{
		actClaimPricing.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_PRI_INFORMATION_TABLE,strWACAmount));
	}
	
	public void Claim_PricingInformation_PriceSource(String strPriceSource) throws Throwable{
		actClaimPricing.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_PRI_INFORMATION_TABLE,strPriceSource));
	}
	
	public void Claim_PricingInformation_SubIngrCost(String strSubIngrCost) throws Throwable{
		actClaimPricing.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_PRI_INFORMATION_TABLE,strSubIngrCost));
	}
	
	public void Claim_PricingInformation_DispenseFee(String strDispenseFee) throws Throwable{
		actClaimPricing.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_PRI_INFORMATION_TABLE,strDispenseFee));
	}
	
	public void Claim_PricingInformation_SalesTax(String strSalesTax) throws Throwable{
		actClaimPricing.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_PRI_INFORMATION_TABLE,strSalesTax));
	}
	
	public void Claim_PricingInformation_IncentiveAmount(String strIncentiveAmount) throws Throwable{
		actClaimPricing.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_PRI_INFORMATION_TABLE,strIncentiveAmount));
	}
	
	public void Claim_PricingInformation_Copay(String strCopay) throws Throwable{
		actClaimPricing.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_PRI_INFORMATION_TABLE,strCopay));
	}
	
	public void Claim_PricingInformation_Total(String strTotal) throws Throwable{
		actClaimPricing.add(utils.RxNovaConnect_WebTable_VerifyRowData(CLAIM_PRI_INFORMATION_TABLE,strTotal));
	}
	
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Claim Detail Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
}
	
	