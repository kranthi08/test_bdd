package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common.PharmacyLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps.PharmacyLookup_BenefitsEligibility_PartD_Steps;
import cucumber.api.java.en.Then;

public class VerifyPharmacyLookUpBenefitsEligibilityPartD {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public PharmacyLookup_Details_Steps pharmacyLookup_Details_Steps;
	public PharmacyLookup_BenefitsEligibility_PartD_Steps pharmacyLookup_BenefitsEligibility_PartD_Steps;
	
	public VerifyPharmacyLookUpBenefitsEligibilityPartD(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		pharmacyLookup_Details_Steps = new PharmacyLookup_Details_Steps(SharedResource,utils);
		pharmacyLookup_BenefitsEligibility_PartD_Steps = new PharmacyLookup_BenefitsEligibility_PartD_Steps(SharedResource,utils);
	}	
	
	
	@Then("^User click on Part D$")
	public void user_click_on_deductible_and_accumulators() throws Throwable{
		pharmacyLookup_Details_Steps.verifyBenefitsEligibility();
		pharmacyLookup_BenefitsEligibility_PartD_Steps.clickOnPartD();
	}
	
	@Then("^User verifies Part D details$")
	public void verify_partd_details(Map<String,String> partDDetails) throws Throwable{
		pharmacyLookup_BenefitsEligibility_PartD_Steps.verifyPartDDetails(partDDetails);
	}	
}
