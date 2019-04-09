package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common.PharmacyLookup_LandingPage_Steps;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages.PharmacyLookup_Claim_ClaimHistorySelector;

public class PharmacyLookup_Claim_ClaimHistory_Steps {

	PharmacyLookup_Claim_ClaimHistorySelector pharmacyLookup_Claim_ClaimHistorySelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	 	
	public PharmacyLookup_Claim_ClaimHistory_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		pharmacyLookup_Claim_ClaimHistorySelector = new PharmacyLookup_Claim_ClaimHistorySelector(SharedResource,utils);
	}
	
		
	public void verifyClaimHistory() throws Throwable{
		pharmacyLookup_Claim_ClaimHistorySelector.PharmacyLookup_Claim_verifyPresenceOfFillDateFrom();
		pharmacyLookup_Claim_ClaimHistorySelector.PharmacyLookup_Claim_verifyPresenceOfFillDateTo();
		pharmacyLookup_Claim_ClaimHistorySelector.PharmacyLookup_Claim_verifyPresenceOfClientID();
		pharmacyLookup_Claim_ClaimHistorySelector.PharmacyLookup_Claim_verifyPresenceOfClaimId();
		pharmacyLookup_Claim_ClaimHistorySelector.PharmacyLookup_Claim_verifyPresenceOfRxNumber();
		pharmacyLookup_Claim_ClaimHistorySelector.PharmacyLookup_Claim_verifyPresenceOfQty();
		pharmacyLookup_Claim_ClaimHistorySelector.PharmacyLookup_Claim_verifyPresenceOfDaysSupply();
		pharmacyLookup_Claim_ClaimHistorySelector.PharmacyLookup_Claim_verifyPresenceOfType();
		pharmacyLookup_Claim_ClaimHistorySelector.PharmacyLookup_Claim_verifyPresenceOfClaimStatus();
		pharmacyLookup_Claim_ClaimHistorySelector.PharmacyLookup_Claim_verifyPresenceOfPharmacyName();		
	}
	
	public void clickOnClaimHistoryMemberId() throws Throwable{
		pharmacyLookup_Claim_ClaimHistorySelector.PharmacyLookup_Claim_clickOnClaimHistoryMemberId();
//		pharmacyLookup_Claim_ClaimRawDataSelector.waitUnitillClaimRawData();
	}
	 	 	 
}

