package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common.PharmacyLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps.PharmacyLookup_Reimbursement_CallNotes_Steps;
import cucumber.api.java.en.Then;

public class VerifyPharmacyLookUpReimbursementCallNotes {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public PharmacyLookup_Details_Steps pharmacyLookup_Details_Steps;
	public PharmacyLookup_Reimbursement_CallNotes_Steps pharmacyLookup_Reimbursement_CallNotes_Steps;
	
	public VerifyPharmacyLookUpReimbursementCallNotes(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		pharmacyLookup_Details_Steps = new PharmacyLookup_Details_Steps(SharedResource,utils);
		pharmacyLookup_Reimbursement_CallNotes_Steps = new PharmacyLookup_Reimbursement_CallNotes_Steps(SharedResource,utils);
	}	
	
	
	@Then("^User click on Call Notes in Reimbursement screen$")
	public void user_click_on_call_notes() throws Throwable{
		pharmacyLookup_Details_Steps.verifyFormulary();
		pharmacyLookup_Reimbursement_CallNotes_Steps.clickOnCallNotes();
	}
	
	@Then("^User provides details in Reimbursement Add New Call Notes screen and click on Save Notes button$")
	public void add_call_notes(Map<String,String> addCallNotesDetails) throws Throwable{
		pharmacyLookup_Reimbursement_CallNotes_Steps.provideCallNotesDetails(addCallNotesDetails);
		pharmacyLookup_Reimbursement_CallNotes_Steps.addCallNotes();
	}
	
	@Then("^User verifies Reimbursement Previous Call Notes Comments$") //
	public void verify_previous_call_notes_comments(Map<String,String> previousCallNotesComments) throws Throwable{
		pharmacyLookup_Reimbursement_CallNotes_Steps.verifyPreviousCallNotesComments(previousCallNotesComments);
	}
	
	@Then("^User verify Reimbursement Previous Call Notes details$") //
	public void verify_call_notes_details(Map<String,String> callNotesDetails) throws Throwable{
		pharmacyLookup_Reimbursement_CallNotes_Steps.verifyCallNotesDetails(callNotesDetails);
	}
}