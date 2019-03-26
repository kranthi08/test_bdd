package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common.PharmacyLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps.PharmacyLookup_BenefitsEligibility_DeductibleAccumulator_Steps;
import cucumber.api.java.en.Then;

public class VerifyPharmacyLookUpBenefitsEligibilityDeductibleAccumulator {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public PharmacyLookup_Details_Steps pharmacyLookup_Details_Steps;
	public PharmacyLookup_BenefitsEligibility_DeductibleAccumulator_Steps pharmacyLookup_BenefitsEligibility_DeductibleAccumulator_Steps;
	
	public VerifyPharmacyLookUpBenefitsEligibilityDeductibleAccumulator(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		pharmacyLookup_Details_Steps = new PharmacyLookup_Details_Steps(SharedResource,utils);
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulator_Steps = new PharmacyLookup_BenefitsEligibility_DeductibleAccumulator_Steps(SharedResource,utils);
	}	
	
	
	@Then("^User click on Deductible & Accumulators$")
	public void user_click_on_deductible_and_accumulators() throws Throwable{
		pharmacyLookup_Details_Steps.verifyBenefitsEligibility();
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulator_Steps.clickOnDeductibleAccumulator();
	}
	
	@Then("^User verifies Deductible & Accumulators details$")
	public void verify_dual_coverage_details(Map<String,String> deductibleAccumulatorDetails) throws Throwable{
		pharmacyLookup_BenefitsEligibility_DeductibleAccumulator_Steps.verifyDeductibleAccumulatorDetails(deductibleAccumulatorDetails);
	}	
}
