package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages.PharmacyLookup_Authorization_AuthResultsSelector;

public class PharmacyLookup_Authorization_AuthResults_Steps {

	PharmacyLookup_Authorization_AuthResultsSelector pharmacyLookup_Authorization_AuthResultsSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expAuthResults = new ArrayList<String>();
	public SoftAssert authResultsSoft = new SoftAssert();
	
	public PharmacyLookup_Authorization_AuthResults_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		pharmacyLookup_Authorization_AuthResultsSelector = new PharmacyLookup_Authorization_AuthResultsSelector(SharedResource,utils);
	}
	
	public void verifyAuthResults(Map<String,String> authResultsDetails)throws Throwable {
		String strAuthID = authResultsDetails.get("AuthID");
		String strAuthType = authResultsDetails.get("AuthType");		
		String strStatus = authResultsDetails.get("Status");		
		String strRxNumber = authResultsDetails.get("RxNumber");
		String strDrugName = authResultsDetails.get("DrugName");
		String strEffectiveDate = authResultsDetails.get("EffectiveDate");
		String strEndDate = authResultsDetails.get("EndDate");
		
		expAuthResults.add(strAuthID);
		expAuthResults.add(strAuthType);
		expAuthResults.add(strStatus);
		expAuthResults.add(strRxNumber);
		expAuthResults.add(strDrugName);
		expAuthResults.add(strEffectiveDate);
		expAuthResults.add(strEndDate);
		
		pharmacyLookup_Authorization_AuthResultsSelector.Authorization_AuthResults_AuthID(strAuthID);
		pharmacyLookup_Authorization_AuthResultsSelector.Authorization_AuthResults_AuthType(strAuthType);
		pharmacyLookup_Authorization_AuthResultsSelector.Authorization_AuthResults_Status(strStatus);
		pharmacyLookup_Authorization_AuthResultsSelector.Authorization_AuthResults_RxNumber(strRxNumber);
		pharmacyLookup_Authorization_AuthResultsSelector.Authorization_AuthResults_DrugName(strDrugName);
		pharmacyLookup_Authorization_AuthResultsSelector.Authorization_AuthResults_EffectiveDate(strEffectiveDate);
		pharmacyLookup_Authorization_AuthResultsSelector.Authorization_AuthResults_EndDate(strEndDate);
		
		for(int i=0;i<expAuthResults.size();i++)
		{
			authResultsSoft.assertEquals(pharmacyLookup_Authorization_AuthResultsSelector.actAuthResults.get(i), expAuthResults.get(i));
		}		
		authResultsSoft.assertAll();
	}	
}

