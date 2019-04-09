package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common.PharmacyLookup_LandingPage_Steps;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages.PharmacyLookup_Claim_ContextualHelpSelector;

public class PharmacyLookup_Claim_ContextualHelp_Steps {

	PharmacyLookup_Claim_ContextualHelpSelector pharmacyLookup_Claim_ContextualHelpSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expContextualHelp = new ArrayList<String>();
	public SoftAssert contextualHelpSoft = new SoftAssert();	
	 	
	public PharmacyLookup_Claim_ContextualHelp_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		pharmacyLookup_Claim_ContextualHelpSelector = new PharmacyLookup_Claim_ContextualHelpSelector(SharedResource,utils);
	}
	
	
	public void verifyContextualHelp(Map<String,String> contextualHelp)throws Throwable {
		pharmacyLookup_Claim_ContextualHelpSelector.waitUnitillContextualHelp();
		
		String strPaidClaim = contextualHelp.get("PaidClaim");	
		String strMultiSourceDrugs = contextualHelp.get("MultiSourceDrugs");
		 
		contextualHelpSoft.assertEquals(pharmacyLookup_Claim_ContextualHelpSelector.checkPresenceOfPaidClaim(), strPaidClaim);	
		contextualHelpSoft.assertTrue(pharmacyLookup_Claim_ContextualHelpSelector.checkPresenceOfMultiSourceDrugs().contains(strMultiSourceDrugs));
		contextualHelpSoft.assertAll();
		
	}
	 	 	 
}

