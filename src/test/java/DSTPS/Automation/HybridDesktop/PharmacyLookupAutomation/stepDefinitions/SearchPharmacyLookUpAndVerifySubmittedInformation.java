package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.LandingPage_Steps;
import DSTPS.Automation.HybridDesktop.Apps.common.LaunchPage_Steps;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common.PharmacyLookup_LandingPage_Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SearchPharmacyLookUpAndVerifySubmittedInformation {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public LaunchPage_Steps launchPage_Steps;
	public LandingPage_Steps landingPage_Steps;
	public PharmacyLookup_LandingPage_Steps pharmacyLookup_LandingPage_Steps;
	
	public SearchPharmacyLookUpAndVerifySubmittedInformation(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		launchPage_Steps = new LaunchPage_Steps(SharedResource,utils);
		landingPage_Steps = new LandingPage_Steps(SharedResource,utils);
		pharmacyLookup_LandingPage_Steps = new PharmacyLookup_LandingPage_Steps(SharedResource,utils);
	}	
	
	
	@Given("^the user access the Hybrid Desktop Application$")
	public void user_can_access_the_Hybrid_desktop_application(Map<String,String> LoginDetails) throws Throwable{		
		if(SharedResource.performLaunchAndLoginAgain){
		launchPage_Steps.PerformLogin(LoginDetails);}
	}
	
	@Given("^User in Landing Page, he selects the application from menu$")
	public void the_user_selects_the_application_from_menu_options(Map<String,String> MenuDetails) throws Throwable{		
		landingPage_Steps.SelectApplication(MenuDetails);
	}
	
	@Then("^User search for existing pharmacy by entering details in Pharmacy Lookup$")
	public void the_user_search_for_the_existing_pharmacy(Map<String,String> searchDetails) throws Throwable{
		pharmacyLookup_LandingPage_Steps.searchPharmacyLookUp(searchDetails);
	}
	
	@Then("^Member details should be displayed$")
	public void verify_member_details(Map<String,String> memberDetails) throws Throwable{
		pharmacyLookup_LandingPage_Steps.verifyMemberDetails(memberDetails);
	}
	
	@Given("^User in Pharmacy Lookup Search Page$")
	public void verify_pharmacy_search_results( ) throws Throwable {
		pharmacyLookup_LandingPage_Steps.verifyPharmacySearchResults();
	}
	
	@Then("^User click on MemberID Field and verifies the submitted information$")
	public void verify_submitted_information(Map<String,String> submittedInformation) throws Throwable{
		pharmacyLookup_LandingPage_Steps.verifySubmittedInformation(submittedInformation);
	}
	
	@Given("^User in Pharmacy Lookup Search Page and click on Blue arrow at MemberID Field$")
	public void click_on_member_id_link( ) throws Throwable {
		pharmacyLookup_LandingPage_Steps.verifyPharmacySearchResults();
		pharmacyLookup_LandingPage_Steps.clickOnMemberIDLink();
	}
	
	@Then("^User verifies the header details$")
	public void verify_header_details(Map<String,String> headerDetails) throws Throwable{
		pharmacyLookup_LandingPage_Steps.verifyHeaderDetails(headerDetails);
	}
	
	@Given("^User in Pharmacy Lookup details page$")
	public void verify_pharmacy_lookup_detail() throws Throwable {
		pharmacyLookup_LandingPage_Steps.verifyPharmacyLookupDetail();
	}
	
	
}
