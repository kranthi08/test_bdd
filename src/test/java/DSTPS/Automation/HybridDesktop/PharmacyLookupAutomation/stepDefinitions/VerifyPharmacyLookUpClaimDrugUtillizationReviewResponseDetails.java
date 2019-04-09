package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common.PharmacyLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps.PharmacyLookup_Claim_DrugUtillizationReviewResponseDetails_Steps;

import cucumber.api.java.en.Then;

public class VerifyPharmacyLookUpClaimDrugUtillizationReviewResponseDetails {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public PharmacyLookup_Details_Steps pharmacyLookup_Details_Steps;
	public PharmacyLookup_Claim_DrugUtillizationReviewResponseDetails_Steps pharmacyLookup_Claim_DrugUtillizationReviewResponseDetails_Steps;	 
	
	
	public VerifyPharmacyLookUpClaimDrugUtillizationReviewResponseDetails(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();    
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		
		pharmacyLookup_Details_Steps = new PharmacyLookup_Details_Steps(SharedResource,utils);
		pharmacyLookup_Claim_DrugUtillizationReviewResponseDetails_Steps = new PharmacyLookup_Claim_DrugUtillizationReviewResponseDetails_Steps(SharedResource,utils);		 
	}	
	

	@Then("^User click on Drug Utilization Review Response Details in Claim screen$")
	public void user_click_on_Drug_Utilization_Review_Response_Details() throws Throwable{	 
		pharmacyLookup_Claim_DrugUtillizationReviewResponseDetails_Steps.clickOnDrugUtillizationReviewResponseDetails();	
	}
	
	@Then("^User verifies Drug Utilization Review Response Details$")
	public void verify_the_Drug_Utilization_Review_Response_Details(Map<String,String> drugUtillizationReviewResponseDetails) throws Throwable{
		pharmacyLookup_Claim_DrugUtillizationReviewResponseDetails_Steps.verifyDrugUtillizationReviewResponseDetails(drugUtillizationReviewResponseDetails);		
	}
			
}
