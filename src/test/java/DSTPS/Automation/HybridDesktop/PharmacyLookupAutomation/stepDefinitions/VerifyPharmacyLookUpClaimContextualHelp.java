package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common.PharmacyLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps.PharmacyLookup_Claim_ContextualHelp_Steps;

import cucumber.api.java.en.Then;

public class VerifyPharmacyLookUpClaimContextualHelp {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public PharmacyLookup_Details_Steps pharmacyLookup_Details_Steps;
	public PharmacyLookup_Claim_ContextualHelp_Steps pharmacyLookup_Claim_ContextualHelp_Steps;	 
	
	
	public VerifyPharmacyLookUpClaimContextualHelp(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();    
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		
		pharmacyLookup_Details_Steps = new PharmacyLookup_Details_Steps(SharedResource,utils);
		pharmacyLookup_Claim_ContextualHelp_Steps = new PharmacyLookup_Claim_ContextualHelp_Steps(SharedResource,utils);		 
	}	
	
	@Then("^User verifies the Contextual Help details$")
	public void verify_the_Contextual_Help(Map<String,String> contextualHelp) throws Throwable{
		pharmacyLookup_Claim_ContextualHelp_Steps.verifyContextualHelp(contextualHelp);	
	}
			
}
