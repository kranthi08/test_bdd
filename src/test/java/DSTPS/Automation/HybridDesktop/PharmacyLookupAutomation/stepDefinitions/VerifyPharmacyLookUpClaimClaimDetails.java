package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common.PharmacyLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps.PharmacyLookup_Claim_ClaimDetails_Steps;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps.PharmacyLookup_Reimbursement_Results_Steps;
import cucumber.api.java.en.Then;

public class VerifyPharmacyLookUpClaimClaimDetails {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public PharmacyLookup_Details_Steps pharmacyLookup_Details_Steps;
	public PharmacyLookup_Claim_ClaimDetails_Steps pharmacyLookup_Claim_ClaimDetails_Steps;	 
	
	
	public VerifyPharmacyLookUpClaimClaimDetails(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();    
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		
		pharmacyLookup_Details_Steps = new PharmacyLookup_Details_Steps(SharedResource,utils);
		pharmacyLookup_Claim_ClaimDetails_Steps = new PharmacyLookup_Claim_ClaimDetails_Steps(SharedResource,utils);		 
	}	
	
	
	@Then("^User verifies the Claim details$")
	public void verify_the_claim_details(Map<String,String> claimDetails) throws Throwable{
		pharmacyLookup_Claim_ClaimDetails_Steps.verifyClaimDetails(claimDetails);		
	}
	
	@Then("^User verifies the Claim Information details$")
	public void verify_the_claim_information(Map<String,String> claimInformation) throws Throwable{
		pharmacyLookup_Claim_ClaimDetails_Steps.verifyClaimInformation(claimInformation);		
	}
	
	@Then("^User verifies the Drug Override Information details$")
	public void verify_the_drug_override_information(Map<String,String> drugOverride) throws Throwable{
		pharmacyLookup_Claim_ClaimDetails_Steps.verifyDrugOverride(drugOverride);		
	}
	
	@Then("^User verifies the Pharmacy Prescriber Information details$")
	public void verify_the_pharmacy_prescriber_information(Map<String,String> pharPrescriber) throws Throwable{
		pharmacyLookup_Claim_ClaimDetails_Steps.verifyPharPrescriber(pharPrescriber);		
	}
	
	@Then("^User verifies the Claim Pricing Information details$")
	public void verify_the_claim_pricing_information(Map<String,String> claimPricing) throws Throwable{
		pharmacyLookup_Claim_ClaimDetails_Steps.verifyClaimPricing(claimPricing);		
	}
			
}
