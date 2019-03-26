package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class PharmacyLookup_Formulary_DrugResultsSelector {

	private By FORMULARY_DRUGRESULTS_TABLE,FORMULARY_CLAIMTEST_BUTON;
	private By CLAIMTEST_HEADER_SUMMARY,CLAIMTEST_TRACKINGID_TABLE,CLAIMTEST_NOTES_TABLE;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actDrugResults = new ArrayList<String>();
	public ArrayList<String> actClaimTestSummary = new ArrayList<String>();
	
	public PharmacyLookup_Formulary_DrugResultsSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		PharmacyLookup_Formulary_DrugResults_Objects();
	}
	
	private void PharmacyLookup_Formulary_DrugResults_Objects()
	{		
		FORMULARY_DRUGRESULTS_TABLE = By.id("formularyForm:drugSearchResultTable");
		FORMULARY_CLAIMTEST_BUTON = By.id("formularyForm:claimTestBtnPanel");
		CLAIMTEST_HEADER_SUMMARY = By.id("claimTestEntryForm:claimSetHeaderSummaryPanel");
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Formulary Drug Results Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void Formulary_DrugResults_NDC(String strNDC) throws Throwable{
		actDrugResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(FORMULARY_DRUGRESULTS_TABLE,strNDC));
	}
	
	public void Formulary_DrugResults_BrandName(String strBrandName) throws Throwable{
		actDrugResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(FORMULARY_DRUGRESULTS_TABLE,strBrandName));
	}
	
	public void Formulary_DrugResults_GenericName(String strGenericName) throws Throwable{
		actDrugResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(FORMULARY_DRUGRESULTS_TABLE,strGenericName));
	}
	
	public void Formulary_DrugResults_GCN(String strGCN) throws Throwable{
		actDrugResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(FORMULARY_DRUGRESULTS_TABLE,strGCN));
	}
	
	public void Formulary_DrugResults_DrugName(String strDrugName) throws Throwable{
		actDrugResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(FORMULARY_DRUGRESULTS_TABLE,strDrugName));
	}
	
	public void Formulary_DrugResults_GI(String strGI) throws Throwable{
		actDrugResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(FORMULARY_DRUGRESULTS_TABLE,strGI));
	}
	
	public void Formulary_DrugResults_GPI(String strGPI) throws Throwable{
		actDrugResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(FORMULARY_DRUGRESULTS_TABLE,strGPI));
	}
	
	public void Formulary_DrugResults_PkgSize(String strPkgSize) throws Throwable{
		actDrugResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(FORMULARY_DRUGRESULTS_TABLE,strPkgSize));
	}
	
	public void Formulary_DrugResults_clickOnClaimTestButton() throws Throwable{
		utils.ClickOnButton(FORMULARY_CLAIMTEST_BUTON);
		utils.GetBusyStatus();
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Formulary Drug Results Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Claim Test Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void verifyClaimTest() throws Throwable{
		try
		{
			utils.SwithToMostRecentWindow();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println("The window is not available for switching");
		}
		driver.switchTo().frame(0);
		utils.CheckElementPresenceByLocator(CLAIMTEST_HEADER_SUMMARY);		
	}
	
	public void ClaimTest_Type(String strType) throws Throwable{
		actClaimTestSummary.add(utils.RxNovaConnect_WebTable_VerifyRowColumnData(CLAIMTEST_HEADER_SUMMARY,strType));
	}
	
	public void ClaimTest_TransactionType(String strTransactionType) throws Throwable{
		actClaimTestSummary.add(utils.RxNovaConnect_WebTable_VerifyRowColumnData(CLAIMTEST_HEADER_SUMMARY,strTransactionType));
	}
	
	public void ClaimTest_PrevClaimID(String strPrevClaimID) throws Throwable{
		actClaimTestSummary.add(utils.RxNovaConnect_WebTable_VerifyRowColumnData(CLAIMTEST_HEADER_SUMMARY,strPrevClaimID));
	}
	
	public void closeRxNovaClaim() throws InterruptedException
	{
		driver.findElement(By.linkText("Close Window")).click();
		Thread.sleep(2000);	
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Claim Test Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
