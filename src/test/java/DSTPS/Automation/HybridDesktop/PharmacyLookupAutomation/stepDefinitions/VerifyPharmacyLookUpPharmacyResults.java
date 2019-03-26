package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common.PharmacyLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps.PharmacyLookup_Pharmacy_Results_Steps;
import cucumber.api.java.en.Then;

public class VerifyPharmacyLookUpPharmacyResults {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public PharmacyLookup_Details_Steps pharmacyLookup_Details_Steps;
	public PharmacyLookup_Pharmacy_Results_Steps pharmacyLookup_Pharmacy_Results_Steps;
	
	public VerifyPharmacyLookUpPharmacyResults(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		pharmacyLookup_Details_Steps = new PharmacyLookup_Details_Steps(SharedResource,utils);
		pharmacyLookup_Pharmacy_Results_Steps = new PharmacyLookup_Pharmacy_Results_Steps(SharedResource,utils);
	}	
	
	
	@Then("^User click on Pharmacy icon$")
	public void user_click_on_pharmacy() throws Throwable{
		pharmacyLookup_Details_Steps.clickOnPharmacy();
	}
	
	@Then("^User provides details and click on search for Network Pharmacies$")
	public void search_for_network_pharmacies(Map<String,String> pharmacySearchDetails) throws Throwable{
		pharmacyLookup_Details_Steps.verifyPharmacy();
		pharmacyLookup_Pharmacy_Results_Steps.searchPharmacyResults(pharmacySearchDetails);
	}
	
	@Then("^User verifies Pharmacy Results details$")
	public void verify_pharmacy_results_details(Map<String,String> pharmacyResultsDetails) throws Throwable{
		pharmacyLookup_Pharmacy_Results_Steps.verifyPharmacyResults(pharmacyResultsDetails);
	}
}
