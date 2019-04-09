package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common.PharmacyLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps.PharmacyLookup_Claim_MedicarePartD_Steps;

import cucumber.api.java.en.Then;

public class VerifyPharmacyLookUpClaimMedicarePartD {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public PharmacyLookup_Details_Steps pharmacyLookup_Details_Steps;
	public PharmacyLookup_Claim_MedicarePartD_Steps pharmacyLookup_Claim_MedicarePartD_Steps;	 
	
	
	public VerifyPharmacyLookUpClaimMedicarePartD(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();    
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		
		pharmacyLookup_Details_Steps = new PharmacyLookup_Details_Steps(SharedResource,utils);
		pharmacyLookup_Claim_MedicarePartD_Steps = new PharmacyLookup_Claim_MedicarePartD_Steps(SharedResource,utils);		 
	}	
	

	@Then("^User click on Medicare Part D in Claim screen$")
	public void user_click_on_Medicare_Part_D() throws Throwable{		 
		pharmacyLookup_Claim_MedicarePartD_Steps.clickOnMedicarePartD();	
	}
	
	@Then("^User verifies Medicare Part D$")
	public void verify_the_Medicare_Part_D(Map<String,String> medicarePartD) throws Throwable{
		pharmacyLookup_Claim_MedicarePartD_Steps.verifyMedicarePartD(medicarePartD);		
	}
			
}
