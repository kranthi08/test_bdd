package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common.PharmacyLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps.PharmacyLookup_Authorization_AuthResults_Steps;
import cucumber.api.java.en.Then;

public class VerifyPharmacyLookUpAuthResults {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public PharmacyLookup_Details_Steps pharmacyLookup_Details_Steps;
	public PharmacyLookup_Authorization_AuthResults_Steps pharmacyLookup_Authorization_AuthResults_Steps;
	
	public VerifyPharmacyLookUpAuthResults(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		pharmacyLookup_Details_Steps = new PharmacyLookup_Details_Steps(SharedResource,utils);
		pharmacyLookup_Authorization_AuthResults_Steps = new PharmacyLookup_Authorization_AuthResults_Steps(SharedResource,utils);
	}	
	
	
	@Then("^User click on Authorization icon$")
	public void user_click_on_authorization() throws Throwable{
		pharmacyLookup_Details_Steps.clickOnAuthorization();
	}
	
	@Then("^User verifies the Auth Results details$")
	public void verify_auth_results_details(Map<String,String> authResultsDetails) throws Throwable{
		pharmacyLookup_Details_Steps.verifyAuthorization();
		pharmacyLookup_Authorization_AuthResults_Steps.verifyAuthResults(authResultsDetails);
	}
}
