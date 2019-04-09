package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common.PharmacyLookup_LandingPage_Steps;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages.PharmacyLookup_Claim_ClaimRawDataSelector;

public class PharmacyLookup_Claim_ClaimRawData_Steps {

	PharmacyLookup_Claim_ClaimRawDataSelector pharmacyLookup_Claim_ClaimRawDataSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expClaimRawData = new ArrayList<String>();
	public SoftAssert claimRawDataSoft = new SoftAssert();
	
	public PharmacyLookup_Claim_ClaimRawData_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		pharmacyLookup_Claim_ClaimRawDataSelector = new PharmacyLookup_Claim_ClaimRawDataSelector(SharedResource,utils);
	}
	
	public void clickOnClaimRawData() throws Throwable{
		pharmacyLookup_Claim_ClaimRawDataSelector.PharmacyLookup_Claim_clickOnClaimRawData();
		pharmacyLookup_Claim_ClaimRawDataSelector.waitUnitillClaimRawData();
	}
	
	public void verifyClaimRawData() throws Throwable{
		pharmacyLookup_Claim_ClaimRawDataSelector.PharmacyLookup_Claim_verifyPresenceOfTransmittedData();
		pharmacyLookup_Claim_ClaimRawDataSelector.PharmacyLookup_Claim_verifyPresenceOfResponseData();
	}	
	
	public void verifyDataLength(Map<String,String> dataLength)throws Throwable {
		String strDataLength = dataLength.get("DataLength");		 
		 
		claimRawDataSoft.assertEquals(pharmacyLookup_Claim_ClaimRawDataSelector.checkDataLenght(), strDataLength);		
		//claimRawDataSoft.assertAll();
		
	}
	 	 	 
}

