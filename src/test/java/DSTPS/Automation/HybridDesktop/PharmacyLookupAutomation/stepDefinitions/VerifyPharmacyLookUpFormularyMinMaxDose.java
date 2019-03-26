package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common.PharmacyLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps.PharmacyLookup_Formulary_MinMaxDose_Steps;
import cucumber.api.java.en.Then;

public class VerifyPharmacyLookUpFormularyMinMaxDose {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public PharmacyLookup_Details_Steps pharmacyLookup_Details_Steps;
	public PharmacyLookup_Formulary_MinMaxDose_Steps pharmacyLookup_Formulary_MinMaxDose_Steps;
	
	public VerifyPharmacyLookUpFormularyMinMaxDose(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		pharmacyLookup_Details_Steps = new PharmacyLookup_Details_Steps(SharedResource,utils);
		pharmacyLookup_Formulary_MinMaxDose_Steps = new PharmacyLookup_Formulary_MinMaxDose_Steps(SharedResource,utils);
	}	
	
	
	@Then("^User click on Min Max Dose$")
	public void user_click_on_min_max_dose() throws Throwable{
		pharmacyLookup_Details_Steps.verifyFormulary();
		pharmacyLookup_Formulary_MinMaxDose_Steps.clickOnMinMaxDose();
	}
	
	@Then("^User verifies the Min Max Dose details$")
	public void verify_min_max_dose_details(Map<String,String> minMaxDoseDetails) throws Throwable{
		pharmacyLookup_Formulary_MinMaxDose_Steps.verifyMinMaxDoseDetails(minMaxDoseDetails);
	}
}
