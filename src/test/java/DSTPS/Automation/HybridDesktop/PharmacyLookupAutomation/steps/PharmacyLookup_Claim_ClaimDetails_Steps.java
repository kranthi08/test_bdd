package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common.PharmacyLookup_LandingPage_Steps;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages.PharmacyLookup_Claim_ClaimDetailsSelector;

public class PharmacyLookup_Claim_ClaimDetails_Steps {

	PharmacyLookup_Claim_ClaimDetailsSelector pharmacyLookup_Claim_ClaimDetailsSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expClaimDetails = new ArrayList<String>();
	public SoftAssert claimDetailsSoft = new SoftAssert();
	
	public ArrayList<String> expClaimInformation = new ArrayList<String>();
	public SoftAssert claimInformationSoft = new SoftAssert();
	
	public ArrayList<String> expDrugOverride = new ArrayList<String>();
	public SoftAssert drugOverrideSoft = new SoftAssert();
	
	public ArrayList<String> expPharPrescriber = new ArrayList<String>();
	public SoftAssert pharPrescriberSoft = new SoftAssert();
	
	public ArrayList<String> expClaimPricing = new ArrayList<String>();
	public SoftAssert claimPricingSoft = new SoftAssert();
		
	
	public PharmacyLookup_Claim_ClaimDetails_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		pharmacyLookup_Claim_ClaimDetailsSelector = new PharmacyLookup_Claim_ClaimDetailsSelector(SharedResource,utils);
	}
	
	public void verifyClaimDetails(Map<String,String> claimDetails)throws Throwable {
		String strMemberID = claimDetails.get("MemberID");
		String strDateOfBirth = claimDetails.get("DateOfBirth");		
		String strGender = claimDetails.get("Gender");		
		String strCustomer = claimDetails.get("Customer");
		String strClient = claimDetails.get("Client");
		String strGroup = claimDetails.get("Group");
			
		expClaimDetails.add(strMemberID);
		expClaimDetails.add(strDateOfBirth);
		expClaimDetails.add(strGender);
		expClaimDetails.add(strCustomer);
		expClaimDetails.add(strClient);
		expClaimDetails.add(strGroup);
		
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_ClaimDetail_MemberID(strMemberID);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_ClaimDetail_DateOfBirth(strDateOfBirth);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_ClaimDetail_Gender(strGender);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_ClaimDetail_Customer(strCustomer);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_ClaimDetail_Client(strClient);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_ClaimDetail_Group(strGroup);
			
		for(int i=0;i<expClaimDetails.size();i++)
		{
			claimDetailsSoft.assertEquals(pharmacyLookup_Claim_ClaimDetailsSelector.actClaimDetails.get(i), expClaimDetails.get(i));
		}		
		claimDetailsSoft.assertAll();
		 
	}	
	
	public void verifyClaimInformation(Map<String,String> claimInformation)throws Throwable {
		String strStatus = claimInformation.get("Status");
		String strPharmacyID = claimInformation.get("PharmacyID");
		String strPharmacyQlfr = claimInformation.get("PharmacyQlfr");
		String strRxNo = claimInformation.get("RxNo");
		String strPOSNo = claimInformation.get("POSNo");
		String strClaimNo = claimInformation.get("ClaimNo");
		String strDateFilled = claimInformation.get("DateFilled");
		String strDateWritten = claimInformation.get("DateWritten");
		String strDateReversed = claimInformation.get("DateReversed");
		String strDateAdded = claimInformation.get("DateAdded");
		String strTimeAdded = claimInformation.get("TimeAdded");
		String strDateUpdated = claimInformation.get("DateUpdated");
		String strTimeUpdated = claimInformation.get("TimeUpdated");
		String strRxOrigin = claimInformation.get("RxOrigin");
		String strSource = claimInformation.get("Source");
		String strVersion = claimInformation.get("Version");
 			
		expClaimInformation.add(strStatus);
		expClaimInformation.add(strPharmacyID);
		expClaimInformation.add(strPharmacyQlfr);
		expClaimInformation.add(strRxNo);
		expClaimInformation.add(strPOSNo);
		expClaimInformation.add(strClaimNo);
		expClaimInformation.add(strDateFilled);
		expClaimInformation.add(strDateWritten);
		expClaimInformation.add(strDateReversed);
		expClaimInformation.add(strDateAdded);
		expClaimInformation.add(strTimeAdded);
		expClaimInformation.add(strDateUpdated);
		expClaimInformation.add(strTimeUpdated);
		expClaimInformation.add(strRxOrigin);
		expClaimInformation.add(strSource);
		expClaimInformation.add(strVersion);
		
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_ClaimInformation_Status(strStatus);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_ClaimInformation_PharmacyID(strPharmacyID);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_ClaimInformation_PharmacyQlfr(strPharmacyQlfr);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_ClaimInformation_RxNo(strRxNo);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_ClaimInformation_POSNo(strPOSNo);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_ClaimInformation_ClaimNo(strClaimNo);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_ClaimInformation_DateFilled(strDateFilled);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_ClaimInformation_DateWritten(strDateWritten);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_ClaimInformation_DateReversed(strDateReversed);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_ClaimInformation_DateAdded(strDateAdded);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_ClaimInformation_TimeAdded(strTimeAdded);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_ClaimInformation_DateUpdated(strDateUpdated);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_ClaimInformation_TimeUpdated(strTimeUpdated);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_ClaimInformation_RxOrigin(strRxOrigin);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_ClaimInformation_Source(strSource);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_ClaimInformation_Version(strVersion);
					
		for(int i=0;i<expClaimDetails.size();i++)
		{
			claimInformationSoft.assertEquals(pharmacyLookup_Claim_ClaimDetailsSelector.actClaimInformation.get(i), expClaimInformation.get(i));
		}		
		claimInformationSoft.assertAll();
		 
	}
	
	public void verifyDrugOverride(Map<String,String> drugOverride)throws Throwable {
		String strNDC = drugOverride.get("NDC");
		String strLabelName = drugOverride.get("LabelName");
		String strGenericName = drugOverride.get("GenericName");
		String strDaysSupply = drugOverride.get("DaysSupply");
		String strQuantity = drugOverride.get("Quantity");
		String strDAW = drugOverride.get("DAW");
		String strNewRefill = drugOverride.get("NewRefill");
		String strCompound = drugOverride.get("Compound");
		String strDrugDiscount = drugOverride.get("DrugDiscount");
		String strSpecialtyDrugFlag = drugOverride.get("SpecialtyDrugFlag");
		String strResAuthNumber = drugOverride.get("ResAuthNumber");
		String strPreAuthNumber = drugOverride.get("PreAuthNumber");
		String strCustAuthNumber = drugOverride.get("CustAuthNumber");
		String strPriorAuthNumberSub = drugOverride.get("PriorAuthNumberSub");
		String strClinicalSupportID = drugOverride.get("ClinicalSupportID");
		String strSubmissionClarCode = drugOverride.get("SubmissionClarCode");
		String strOtherCoverage = drugOverride.get("OtherCoverage");
		String strDURInterven = drugOverride.get("DURInterven");
		String strDURConflict = drugOverride.get("DURConflict");
		String strDUROutcome = drugOverride.get("DUROutcome");
		String strPostPay2 = drugOverride.get("PostPay2");
		String strPostPay3 = drugOverride.get("PostPay3");
		String strPostPay4 = drugOverride.get("PostPay4");
				
		expDrugOverride.add(strNDC);
		expDrugOverride.add(strLabelName);
		expDrugOverride.add(strGenericName);
		expDrugOverride.add(strDaysSupply);
		expDrugOverride.add(strQuantity);
		expDrugOverride.add(strDAW);
		expDrugOverride.add(strNewRefill);
		expDrugOverride.add(strCompound);
		expDrugOverride.add(strDrugDiscount);
		expDrugOverride.add(strSpecialtyDrugFlag);
		expDrugOverride.add(strResAuthNumber);
		expDrugOverride.add(strPreAuthNumber);
		expDrugOverride.add(strCustAuthNumber);
		expDrugOverride.add(strPriorAuthNumberSub);
		expDrugOverride.add(strClinicalSupportID);
		expDrugOverride.add(strSubmissionClarCode);
		expDrugOverride.add(strOtherCoverage);
		expDrugOverride.add(strDURInterven);
		expDrugOverride.add(strDURConflict);
		expDrugOverride.add(strDUROutcome);
		expDrugOverride.add(strPostPay2);
		expDrugOverride.add(strPostPay3);
		expDrugOverride.add(strPostPay4);
				
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_DrugOverrideInformation_NDC(strNDC);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_DrugOverrideInformation_LabelName(strLabelName);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_DrugOverrideInformation_GenericName(strGenericName);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_DrugOverrideInformation_DaysSupply(strDaysSupply);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_DrugOverrideInformation_Quantity(strQuantity);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_DrugOverrideInformation_DAW(strDAW);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_DrugOverrideInformation_NewRefill(strNewRefill);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_DrugOverrideInformation_Compound(strCompound);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_DrugOverrideInformation_DrugDiscount(strDrugDiscount);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_DrugOverrideInformation_SpecialtyDrugFlag(strSpecialtyDrugFlag);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_DrugOverrideInformation_ResAuthNumber(strResAuthNumber);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_DrugOverrideInformation_PreAuthNumber(strPreAuthNumber);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_DrugOverrideInformation_CustAuthNumber(strCustAuthNumber);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_DrugOverrideInformation_PriorAuthNumberSub(strPriorAuthNumberSub);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_DrugOverrideInformation_ClinicalSupportID(strClinicalSupportID);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_DrugOverrideInformation_SubmissionClarCode(strSubmissionClarCode);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_DrugOverrideInformation_OtherCoverage(strOtherCoverage);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_DrugOverrideInformation_DURInterven(strDURInterven);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_DrugOverrideInformation_DURConflict(strDURConflict);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_DrugOverrideInformation_DUROutcome(strDUROutcome);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_DrugOverrideInformation_PostPay2(strPostPay2);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_DrugOverrideInformation_PostPay3(strPostPay3);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_DrugOverrideInformation_PostPay4(strPostPay4);
			 
					
		for(int i=0;i<expDrugOverride.size();i++)
		{
			drugOverrideSoft.assertEquals(pharmacyLookup_Claim_ClaimDetailsSelector.actDrugOverride.get(i), expDrugOverride.get(i));
		}		
		drugOverrideSoft.assertAll();
		 
	}
	
	public void verifyPharPrescriber(Map<String,String> pharPrescriber)throws Throwable {
		
		String strPharmacyName = pharPrescriber.get("PharmacyName");
		String strAddress = pharPrescriber.get("Address");
		String strCity = pharPrescriber.get("City");
		String strState = pharPrescriber.get("State");
		String strZIP = pharPrescriber.get("ZIP");
		String strPhone = pharPrescriber.get("Phone");
		String strAffiliation = pharPrescriber.get("Affiliation");
		String strChain = pharPrescriber.get("Chain");
		String strPharmacyNetwork = pharPrescriber.get("PharmacyNetwork");
		String strPrescriberID = pharPrescriber.get("PrescriberID");
		String strPrescriberQlfr = pharPrescriber.get("PrescriberQlfr");
		String strPrescriberName = pharPrescriber.get("PrescriberName");
		String strFillRecInterval = pharPrescriber.get("FillRecInterval");
		 
						
		expPharPrescriber.add(strPharmacyName);
		expPharPrescriber.add(strAddress);
		expPharPrescriber.add(strCity);
		expPharPrescriber.add(strState);
		expPharPrescriber.add(strZIP);
		expPharPrescriber.add(strPhone);
		expPharPrescriber.add(strAffiliation);
		expPharPrescriber.add(strChain);
		expPharPrescriber.add(strPharmacyNetwork);
		expPharPrescriber.add(strPrescriberID);
		expPharPrescriber.add(strPrescriberQlfr);
		expPharPrescriber.add(strPrescriberName);
		expPharPrescriber.add(strFillRecInterval);
	 
				
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_PharmacyPrescriberInformation_PharmacyName(strPharmacyName);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_PharmacyPrescriberInformation_Address(strAddress);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_PharmacyPrescriberInformation_City(strCity);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_PharmacyPrescriberInformation_State(strState);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_PharmacyPrescriberInformation_ZIP(strZIP);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_PharmacyPrescriberInformation_Phone(strPhone);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_PharmacyPrescriberInformation_Affiliation(strAffiliation);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_PharmacyPrescriberInformation_Chain(strChain);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_PharmacyPrescriberInformation_PharmacyNetwork(strPharmacyNetwork);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_PharmacyPrescriberInformation_PrescriberID(strPrescriberID);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_PharmacyPrescriberInformation_PrescriberQlfr(strPrescriberQlfr);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_PharmacyPrescriberInformation_PrescriberName(strPrescriberName);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_PharmacyPrescriberInformation_FillRecInterval(strFillRecInterval);
		 
			 
					
		for(int i=0;i<expPharPrescriber.size();i++)
		{
			pharPrescriberSoft.assertEquals(pharmacyLookup_Claim_ClaimDetailsSelector.actPharPrescriber.get(i), expPharPrescriber.get(i));
		}		
		pharPrescriberSoft.assertAll();
		 
	}
	
public void verifyClaimPricing(Map<String,String> claimPricing)throws Throwable {
		
		String strPlanPaid = claimPricing.get("PlanPaid");
		String strPatientPaid = claimPricing.get("PatientPaid");
		String strAWPCost = claimPricing.get("AWPCost");
		String strMACIngrCost = claimPricing.get("MACIngrCost");
		String strUCAmount = claimPricing.get("UCAmount");
		String strWACAmount = claimPricing.get("WACAmount");
		String strPriceSource = claimPricing.get("PriceSource");
		String strSubIngrCost = claimPricing.get("SubIngrCost");
		String strDispenseFee = claimPricing.get("DispenseFee");
		String strSalesTax = claimPricing.get("SalesTax");
		String strIncentiveAmount = claimPricing.get("IncentiveAmount");
		String strCopay = claimPricing.get("Copay");
		String strTotal = claimPricing.get("Total");
								
		expClaimPricing.add(strPlanPaid);
		expClaimPricing.add(strPatientPaid);
		expClaimPricing.add(strAWPCost);
		expClaimPricing.add(strMACIngrCost);
		expClaimPricing.add(strUCAmount);
		expClaimPricing.add(strWACAmount);
		expClaimPricing.add(strPriceSource);
		expClaimPricing.add(strSubIngrCost);
		expClaimPricing.add(strDispenseFee);
		expClaimPricing.add(strSalesTax);
		expClaimPricing.add(strIncentiveAmount);
		expClaimPricing.add(strCopay);
		expClaimPricing.add(strTotal);		 
				
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_PricingInformation_PlanPaid(strPlanPaid);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_PricingInformation_PatientPaid(strPatientPaid);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_PricingInformation_AWPCost(strAWPCost);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_PricingInformation_MACIngrCost(strMACIngrCost);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_PricingInformation_UCAmount(strUCAmount);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_PricingInformation_WACAmount(strWACAmount);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_PricingInformation_PriceSource(strPriceSource);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_PricingInformation_SubIngrCost(strSubIngrCost);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_PricingInformation_DispenseFee(strDispenseFee);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_PricingInformation_SalesTax(strSalesTax);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_PricingInformation_IncentiveAmount(strIncentiveAmount);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_PricingInformation_Copay(strCopay);
		pharmacyLookup_Claim_ClaimDetailsSelector.Claim_PricingInformation_Total(strTotal);
				 
					
		for(int i=0;i<expClaimPricing.size();i++)
		{
			claimPricingSoft.assertEquals(pharmacyLookup_Claim_ClaimDetailsSelector.actClaimPricing.get(i), expClaimPricing.get(i));
		}		
		claimPricingSoft.assertAll();
		 
	}
}

