package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common.PharmacyLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps.PharmacyLookup_BenefitsEligibility_Detail_Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class VerifyPharmacyLookUpBenefitsEligibilityDetail {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public PharmacyLookup_Details_Steps pharmacyLookup_Details_Steps;
	public PharmacyLookup_BenefitsEligibility_Detail_Steps pharmacyLookup_BenefitsEligibility_Detail_Steps;
	
	public VerifyPharmacyLookUpBenefitsEligibilityDetail(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		pharmacyLookup_Details_Steps = new PharmacyLookup_Details_Steps(SharedResource,utils);
		pharmacyLookup_BenefitsEligibility_Detail_Steps = new PharmacyLookup_BenefitsEligibility_Detail_Steps(SharedResource,utils);
	}	
	
	
	@Then("^User click on Benefits Eligibility icon$")
	public void user_click_on_benefits_eligibility() throws Throwable{
		pharmacyLookup_Details_Steps.clickOnBenefitsEligibility();
	}
	
	@Then("^User verifies Benefits & Elegibility details$")
	public void verify_benefits_eligibility_details(Map<String,String> benefitsEligibilityDetails) throws Throwable{
		pharmacyLookup_Details_Steps.verifyBenefitsEligibility();
		pharmacyLookup_BenefitsEligibility_Detail_Steps.verifyBenefitsEligibilityDetails(benefitsEligibilityDetails);
	}
	
	@Given("^User in Benefits & Eligibility Details page$")
	public void user_in_benefits_eligibility_details_page() throws Throwable{
		pharmacyLookup_Details_Steps.verifyBenefitsEligibility();
	}
	
	@Then("^User click on View Additional Eligibility Dates icon and verifies Additional Eligibility Dates$")
	public void verify_additional_eligibility_dates_details(Map<String,String> addEligblDatesDetails) throws Throwable{
		pharmacyLookup_BenefitsEligibility_Detail_Steps.verifyAdditionalEligibilityDatesDetails(addEligblDatesDetails);
	}
	
	@Then("^User click on MemberID details link and verifies the Member details in Member Home Screen$")
	public void verify_member_id_details(Map<String,String> memberIDDetails) throws Throwable{
		pharmacyLookup_BenefitsEligibility_Detail_Steps.verifyMemberIDDetails(memberIDDetails);
	}
	
	
}
