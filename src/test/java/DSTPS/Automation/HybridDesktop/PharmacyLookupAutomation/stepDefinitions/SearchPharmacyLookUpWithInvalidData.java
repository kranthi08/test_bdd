package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.LandingPage_Steps;
import DSTPS.Automation.HybridDesktop.Apps.common.LaunchPage_Steps;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common.PharmacyLookup_LandingPage_Steps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchPharmacyLookUpWithInvalidData {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public LaunchPage_Steps launchPage_Steps;
	public LandingPage_Steps landingPage_Steps;
	public PharmacyLookup_LandingPage_Steps pharmacyLookup_LandingPage_Steps;
	
	public SearchPharmacyLookUpWithInvalidData(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		launchPage_Steps = new LaunchPage_Steps(SharedResource,utils);
		landingPage_Steps = new LandingPage_Steps(SharedResource,utils);
		pharmacyLookup_LandingPage_Steps = new PharmacyLookup_LandingPage_Steps(SharedResource,utils);
	}	
	
	
	@When("^User click on search button in Pharmacy Lookup with blank Pharmacy NPI and Rx Number fields$")
	public void user_search_for_pharmacy_with_invalid_data(Map<String,String> searchDetails) throws Throwable{
		pharmacyLookup_LandingPage_Steps.searchPharmacyLookUp(searchDetails);
	}
	
	@Then("^verifies the red X error messages$")
	public void verify_red_X_error_messages(Map<String,String> errorMessage) throws Throwable{
		pharmacyLookup_LandingPage_Steps.verifyErrorMessage(errorMessage);
	}	
}
