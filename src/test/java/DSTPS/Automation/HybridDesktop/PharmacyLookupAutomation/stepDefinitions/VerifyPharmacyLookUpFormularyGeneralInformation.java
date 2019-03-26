package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common.PharmacyLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps.PharmacyLookup_Formulary_GI_Steps;
import cucumber.api.java.en.Then;

public class VerifyPharmacyLookUpFormularyGeneralInformation {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public PharmacyLookup_Details_Steps pharmacyLookup_Details_Steps;
	public PharmacyLookup_Formulary_GI_Steps pharmacyLookup_Formulary_GI_Steps;
	
	public VerifyPharmacyLookUpFormularyGeneralInformation(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		pharmacyLookup_Details_Steps = new PharmacyLookup_Details_Steps(SharedResource,utils);
		pharmacyLookup_Formulary_GI_Steps = new PharmacyLookup_Formulary_GI_Steps(SharedResource,utils);
	}	
	
	
	@Then("^User click on General Information in Formulary screen$")
	public void user_click_on_general_information() throws Throwable{
		pharmacyLookup_Details_Steps.verifyFormulary();
		pharmacyLookup_Formulary_GI_Steps.clickOnGeneralInformation();
	}
	
	@Then("^User verifies Formulary General Information details$")
	public void verify_general_information_details(Map<String,String> genInfoDetails) throws Throwable{
		pharmacyLookup_Formulary_GI_Steps.verifyGeneralInformationDetails(genInfoDetails);
	}
}
