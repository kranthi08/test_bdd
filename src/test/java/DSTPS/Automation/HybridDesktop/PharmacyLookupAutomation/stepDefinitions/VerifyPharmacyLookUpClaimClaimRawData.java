package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common.PharmacyLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps.PharmacyLookup_Claim_ClaimRawData_Steps;

import cucumber.api.java.en.Then;

public class VerifyPharmacyLookUpClaimClaimRawData {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public PharmacyLookup_Details_Steps pharmacyLookup_Details_Steps;
	public PharmacyLookup_Claim_ClaimRawData_Steps pharmacyLookup_Claim_ClaimRawData_Steps;	 
	
	
	public VerifyPharmacyLookUpClaimClaimRawData(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();    
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		
		pharmacyLookup_Details_Steps = new PharmacyLookup_Details_Steps(SharedResource,utils);
		pharmacyLookup_Claim_ClaimRawData_Steps = new PharmacyLookup_Claim_ClaimRawData_Steps(SharedResource,utils);		 
	}	
	

	@Then("^User click on Claim Raw Data in Claim screen$")
	public void user_click_on_Claim_Raw_Data() throws Throwable{		 
		pharmacyLookup_Claim_ClaimRawData_Steps.clickOnClaimRawData();	
	}
	
	@Then("^User verifies Claim Raw Data is displayed$")
	public void verify_the_Claim_Raw_Data(Map<String,String> dataLength) throws Throwable{
		pharmacyLookup_Claim_ClaimRawData_Steps.verifyClaimRawData();	
		pharmacyLookup_Claim_ClaimRawData_Steps.verifyDataLength(dataLength);
	}
			
}
