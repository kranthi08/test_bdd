package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common.PharmacyLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps.PharmacyLookup_Reimbursement_Results_Steps;
import cucumber.api.java.en.Then;

public class VerifyPharmacyLookUpReimbursementResults {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public PharmacyLookup_Details_Steps pharmacyLookup_Details_Steps;
	public PharmacyLookup_Reimbursement_Results_Steps pharmacyLookup_Reimbursement_Results_Steps;
	
	public VerifyPharmacyLookUpReimbursementResults(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		pharmacyLookup_Details_Steps = new PharmacyLookup_Details_Steps(SharedResource,utils);
		pharmacyLookup_Reimbursement_Results_Steps = new PharmacyLookup_Reimbursement_Results_Steps(SharedResource,utils);
	}	
	
	
	@Then("^User click on Reimbursement icon$")
	public void user_click_on_reimbursement() throws Throwable{
		pharmacyLookup_Details_Steps.clickOnReimbursement();
	}
	
	@Then("^User verifies Reimbursement Results details$")
	public void verify_reimbursement_results_details(Map<String,String> reimbursementDetails) throws Throwable{
		pharmacyLookup_Details_Steps.verifyReimbursement();
		pharmacyLookup_Reimbursement_Results_Steps.verifyReimbursementResults(reimbursementDetails);
	}
}
