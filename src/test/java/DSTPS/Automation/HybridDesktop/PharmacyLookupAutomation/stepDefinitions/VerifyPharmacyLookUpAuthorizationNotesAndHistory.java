package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common.PharmacyLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps.PharmacyLookup_Authorization_NotesAndHistory_Steps;
import cucumber.api.java.en.Then;

public class VerifyPharmacyLookUpAuthorizationNotesAndHistory {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public PharmacyLookup_Details_Steps pharmacyLookup_Details_Steps;
	public PharmacyLookup_Authorization_NotesAndHistory_Steps pharmacyLookup_Authorization_NotesAndHistory_Steps;
	
	public VerifyPharmacyLookUpAuthorizationNotesAndHistory(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		pharmacyLookup_Details_Steps = new PharmacyLookup_Details_Steps(SharedResource,utils);
		pharmacyLookup_Authorization_NotesAndHistory_Steps = new PharmacyLookup_Authorization_NotesAndHistory_Steps(SharedResource,utils);
	}	
	
	
	@Then("^User click on Notes & History$")
	public void user_click_on_notes_and_history() throws Throwable{
		pharmacyLookup_Details_Steps.verifyAuthorization();
		pharmacyLookup_Authorization_NotesAndHistory_Steps.clickOnNotesAndHistory();
	}
	
	@Then("^User verifies Notes & History details$")
	public void verify_notes_and_history_details(Map<String,String> notesAndHistoryDetails) throws Throwable{
		pharmacyLookup_Authorization_NotesAndHistory_Steps.verifyNotesAndHistoryDetails(notesAndHistoryDetails);
	}
}
