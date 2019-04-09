package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps.PharmacyLookup_Pharmacy_CallNotes_Steps;
import cucumber.api.java.en.Then;

public class VerifyPharmacyLookUpPharmacyCallNotes {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public PharmacyLookup_Pharmacy_CallNotes_Steps pharmacyLookup_Pharmacy_CallNotes_Steps;
	
	public VerifyPharmacyLookUpPharmacyCallNotes(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		pharmacyLookup_Pharmacy_CallNotes_Steps = new PharmacyLookup_Pharmacy_CallNotes_Steps(SharedResource,utils);
	}	
	
	
	@Then("^User click on Call Notes in Pharmacy screen$")
	public void user_click_on_call_notes() throws Throwable{
		pharmacyLookup_Pharmacy_CallNotes_Steps.clickOnCallNotes();
	}
	
	@Then("^User provides details in Pharmacy Add New Call Notes screen and click on Save Notes button$")
	public void add_call_notes(Map<String,String> addCallNotesDetails) throws Throwable{
		pharmacyLookup_Pharmacy_CallNotes_Steps.provideCallNotesDetails(addCallNotesDetails);
		pharmacyLookup_Pharmacy_CallNotes_Steps.addCallNotes();
	}
	
	@Then("^User verifies Pharmacy Previous Call Notes Comments$") //
	public void verify_previous_call_notes_comments(Map<String,String> previousCallNotesComments) throws Throwable{
		pharmacyLookup_Pharmacy_CallNotes_Steps.verifyPreviousCallNotesComments(previousCallNotesComments);
	}
	
	@Then("^User verify Pharmacy Previous Call Notes details$") //
	public void verify_call_notes_details(Map<String,String> callNotesDetails) throws Throwable{
		pharmacyLookup_Pharmacy_CallNotes_Steps.verifyCallNotesDetails(callNotesDetails);
	}
}
