package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common.PharmacyLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps.PharmacyLookup_BenefitsEligibility_CoverageCopay_Steps;
import cucumber.api.java.en.Then;

public class VerifyPharmacyLookUpBenefitsEligibilityCoverageCopay {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public PharmacyLookup_Details_Steps pharmacyLookup_Details_Steps;
	public PharmacyLookup_BenefitsEligibility_CoverageCopay_Steps pharmacyLookup_BenefitsEligibility_CoverageCopay_Steps;
	
	public VerifyPharmacyLookUpBenefitsEligibilityCoverageCopay(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		pharmacyLookup_Details_Steps = new PharmacyLookup_Details_Steps(SharedResource,utils);
		pharmacyLookup_BenefitsEligibility_CoverageCopay_Steps = new PharmacyLookup_BenefitsEligibility_CoverageCopay_Steps(SharedResource,utils);
	}	
	
	
	@Then("^User click on Coverage & Copay$")
	public void user_click_on_coverage_and_copay() throws Throwable{
		pharmacyLookup_Details_Steps.verifyBenefitsEligibility();
		pharmacyLookup_BenefitsEligibility_CoverageCopay_Steps.clickOnCoverageCopay();
	}
	
	@Then("^User verifies Coverage & Copay details$")
	public void verify_coverage_copay_details(Map<String,String> coverageCopayDetails) throws Throwable{
		pharmacyLookup_BenefitsEligibility_CoverageCopay_Steps.verifyCoverageCopayDetails(coverageCopayDetails);
	}	
}
