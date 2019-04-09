package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common.PharmacyLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps.PharmacyLookup_Claim_ClaimHistory_Steps;

import cucumber.api.java.en.Then;

public class VerifyPharmacyLookUpClaimClaimHistory {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public PharmacyLookup_Details_Steps pharmacyLookup_Details_Steps;
	public PharmacyLookup_Claim_ClaimHistory_Steps pharmacyLookup_Claim_ClaimHistory_Steps;	 
	
	
	public VerifyPharmacyLookUpClaimClaimHistory(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();    
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		
		pharmacyLookup_Details_Steps = new PharmacyLookup_Details_Steps(SharedResource,utils);
		pharmacyLookup_Claim_ClaimHistory_Steps = new PharmacyLookup_Claim_ClaimHistory_Steps(SharedResource,utils);		 
	}	
	

	@Then("^User verifies Claim History details$")
	public void user_verify_Claim_History_Details() throws Throwable{		 
		pharmacyLookup_Claim_ClaimHistory_Steps.verifyClaimHistory();	
	}
	
	@Then("^User click on Blue arrow in Claim History details$")
	public void click_on_Blue_arrow_in_Claim_History() throws Throwable{
		pharmacyLookup_Claim_ClaimHistory_Steps.clickOnClaimHistoryMemberId();		
	}
			
}
