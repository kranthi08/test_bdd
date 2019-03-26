package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class PharmacyLookup_Authorization_AuthResultsSelector {

	private By AUTHORIZATION_AUTHRESULTS_TABLE;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actAuthResults = new ArrayList<String>();
	
	public PharmacyLookup_Authorization_AuthResultsSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		PharmacyLookup_Authorization_AuthResults_Objects();
	}
	
	private void PharmacyLookup_Authorization_AuthResults_Objects()
	{		
		AUTHORIZATION_AUTHRESULTS_TABLE = By.id("priorAuthForm:priorAuthResultTable");
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Auth Results Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void Authorization_AuthResults_AuthID(String strAuthID) throws Throwable{
		actAuthResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(AUTHORIZATION_AUTHRESULTS_TABLE,strAuthID));
	}
	
	public void Authorization_AuthResults_AuthType(String strAuthType) throws Throwable{
		actAuthResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(AUTHORIZATION_AUTHRESULTS_TABLE,strAuthType));
	}
	
	public void Authorization_AuthResults_Status(String strStatus) throws Throwable{
		actAuthResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(AUTHORIZATION_AUTHRESULTS_TABLE,strStatus));
	}
	
	public void Authorization_AuthResults_RxNumber(String strRxNumber) throws Throwable{
		actAuthResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(AUTHORIZATION_AUTHRESULTS_TABLE,strRxNumber));
	}
	
	public void Authorization_AuthResults_DrugName(String strDrugName) throws Throwable{
		actAuthResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(AUTHORIZATION_AUTHRESULTS_TABLE,strDrugName));
	}
	
	public void Authorization_AuthResults_EffectiveDate(String strEffectiveDate) throws Throwable{
		actAuthResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(AUTHORIZATION_AUTHRESULTS_TABLE,strEffectiveDate));
	}
	
	public void Authorization_AuthResults_EndDate(String strEndDate) throws Throwable{
		actAuthResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(AUTHORIZATION_AUTHRESULTS_TABLE,strEndDate));
	}	
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Auth Results Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~	
}
