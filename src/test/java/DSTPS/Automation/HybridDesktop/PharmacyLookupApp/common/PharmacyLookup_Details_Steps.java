package DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common;

import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;

public class PharmacyLookup_Details_Steps {

	PharmacyLookup_DetailsSelector pharmacyLookup_DetailsSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public static ArrayList<String> expMemberDetails = new ArrayList<String>();
	public static ArrayList<String> expSubmittedInformation = new ArrayList<String>();
	public static ArrayList<String> expHeaderSummary = new ArrayList<String>();
	public static SoftAssert soft = new SoftAssert();
	
	public PharmacyLookup_Details_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		pharmacyLookup_DetailsSelector = new PharmacyLookup_DetailsSelector(SharedResource,utils);
	}
	
	public void clickOnBenefitsEligibility() throws Throwable{
		pharmacyLookup_DetailsSelector.PharmacyLookup_clickOnBenefitsEligibilityLink();		
	}
	
	public void verifyBenefitsEligibility() throws Throwable{
		pharmacyLookup_DetailsSelector.waitUntillBenefitsEligibilityDetail();
		pharmacyLookup_DetailsSelector.verifyBenefitsEligibilityDetail();
	}
	
	public void clickOnClaim() throws Throwable{
		pharmacyLookup_DetailsSelector.PharmacyLookup_clickOnClaimLink();		
	}
	
	public void verifyClaim() throws Throwable{
		pharmacyLookup_DetailsSelector.waitUntillClaimHistory();
		pharmacyLookup_DetailsSelector.verifyClaimHistory();
	}
	
	public void clickOnFormulary() throws Throwable{
		pharmacyLookup_DetailsSelector.PharmacyLookup_clickOnFormularyLink();		
	}
	
	public void verifyFormulary() throws Throwable{
		pharmacyLookup_DetailsSelector.waitUntillDrugResults();
		pharmacyLookup_DetailsSelector.verifyDrugResults();
	}
	
	public void clickOnPharmacy() throws Throwable{
		pharmacyLookup_DetailsSelector.PharmacyLookup_clickOnPharmacyLink();		
	}
	
	public void verifyPharmacy() throws Throwable{
		pharmacyLookup_DetailsSelector.waitUntillNetworkPharmaciesSearch();
		pharmacyLookup_DetailsSelector.verifyNetworkPharmaciesSearch();
	}	
	
	public void clickOnAuthorization() throws Throwable{
		pharmacyLookup_DetailsSelector.PharmacyLookup_clickOnAuthorizationLink();		
	}
	
	public void verifyAuthorization() throws Throwable{
		pharmacyLookup_DetailsSelector.waitUntillAuthResults();
		pharmacyLookup_DetailsSelector.verifyAuthResults();
	}
	
	public void clickOnReimbursement() throws Throwable{
		pharmacyLookup_DetailsSelector.PharmacyLookup_clickOnReimbursementLink();		
	}
	
	public void verifyReimbursement() throws Throwable{
		pharmacyLookup_DetailsSelector.waitUntillReimbursementResults();
		pharmacyLookup_DetailsSelector.verifyReimbursementResults();		
	}
	
	public void clickOnCallNotes() throws Throwable{
		pharmacyLookup_DetailsSelector.PharmacyLookup_clickOnCallNotesLink();		
	}
	
	public void verifyCallNotes() throws Throwable{
		pharmacyLookup_DetailsSelector.waitUntillCallNotesDetail();
		pharmacyLookup_DetailsSelector.verifyCallNotesDetail();		
	}
}

