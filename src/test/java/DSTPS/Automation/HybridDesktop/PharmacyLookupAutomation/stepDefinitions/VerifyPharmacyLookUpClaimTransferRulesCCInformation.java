package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common.PharmacyLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps.PharmacyLookup_Claim_TransferRulesCCInformation_Steps;

import cucumber.api.java.en.Then;

public class VerifyPharmacyLookUpClaimTransferRulesCCInformation {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public PharmacyLookup_Details_Steps pharmacyLookup_Details_Steps;
	public PharmacyLookup_Claim_TransferRulesCCInformation_Steps pharmacyLookup_Claim_TransferRulesCCInformation_Steps;	 
	
	
	public VerifyPharmacyLookUpClaimTransferRulesCCInformation(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();    
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		
		pharmacyLookup_Details_Steps = new PharmacyLookup_Details_Steps(SharedResource,utils);
		pharmacyLookup_Claim_TransferRulesCCInformation_Steps = new PharmacyLookup_Claim_TransferRulesCCInformation_Steps(SharedResource,utils);		 
	}	
	

	@Then("^User click on Transfer Rules CC Information in Claim screen$")
	public void user_click_on_Transfer_Rules_CC_Information() throws Throwable{
		//pharmacyLookup_Details_Steps.verifyClaim();
		pharmacyLookup_Claim_TransferRulesCCInformation_Steps.clickOnTransferRulesCCInfo();	
	}
	
	@Then("^User verifies the Transfer Rules CC Information$")
	public void verify_the_transfer_cc_information(Map<String,String> transferRulesCCInfo) throws Throwable{
		pharmacyLookup_Claim_TransferRulesCCInformation_Steps.verifyTransferRulesCCInfo(transferRulesCCInfo);		
	}
			
}
