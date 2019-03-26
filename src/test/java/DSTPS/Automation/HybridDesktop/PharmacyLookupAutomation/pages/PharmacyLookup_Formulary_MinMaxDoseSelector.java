package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class PharmacyLookup_Formulary_MinMaxDoseSelector {

	private By MINMAXDOSE_LINK,FORMULARY_PEDIATRIC_TABLE;
	private By FORMULARY_ADULT_TABLE,FORMULARY_GERIATRIC_TABLE;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actMinMaxDetails = new ArrayList<String>();
	
	public PharmacyLookup_Formulary_MinMaxDoseSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		PharmacyLookup_Formulary_MinMaxDose_Objects();
	}
	
	private void PharmacyLookup_Formulary_MinMaxDose_Objects()
	{		
		MINMAXDOSE_LINK = By.linkText("Min/Max Dose");
		FORMULARY_PEDIATRIC_TABLE = By.id("formularyForm:formularyAccordionPanel:pediatricTable");
		FORMULARY_ADULT_TABLE = By.id("formularyForm:formularyAccordionPanel:adultTable");
		FORMULARY_GERIATRIC_TABLE = By.id("formularyForm:formularyAccordionPanel:geriatricTable");
	}                         
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Formulary Min/Max Dose Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void Formulary_clickOnMinMaxDose() throws Throwable{
		utils.ClickOnLink(MINMAXDOSE_LINK);
		utils.GetBusyStatus();
	}
	
	public void waitUntillPediatric() throws Throwable{
		utils.CheckElementPresenceByLocator(FORMULARY_PEDIATRIC_TABLE);
		Thread.sleep(1000);
	}
	
	// Pediatric
	
	public void Formulary_Pediatric_MinDailyDose(String strPedMinDailyDose) throws Throwable{
		actMinMaxDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(FORMULARY_PEDIATRIC_TABLE,strPedMinDailyDose));
	}
	
	public void Formulary_Pediatric_MaxDailyDose(String strPedMaxDailyDose) throws Throwable{
		actMinMaxDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(FORMULARY_PEDIATRIC_TABLE,strPedMaxDailyDose));
	}
	
	public void Formulary_Pediatric_NotToExceedDailyDose(String strPedNotToExceedDailyDose) throws Throwable{
		actMinMaxDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(FORMULARY_PEDIATRIC_TABLE,strPedNotToExceedDailyDose));
	}
	
	// Adult
	
	public void Formulary_Adult_MinDailyDose(String strAdultMinDailyDose) throws Throwable{
		actMinMaxDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(FORMULARY_ADULT_TABLE,strAdultMinDailyDose));
	}
	
	public void Formulary_Adult_MaxDailyDose(String strAdultMaxDailyDose) throws Throwable{
		actMinMaxDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(FORMULARY_ADULT_TABLE,strAdultMaxDailyDose));
	}
	
	// Geriatric
	
	public void Formulary_Geriatric_MinDailyDose(String strGeriatricMinDailyDose) throws Throwable{
		actMinMaxDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(FORMULARY_GERIATRIC_TABLE,strGeriatricMinDailyDose));
	}
	
	public void Formulary_Geriatric_MaxDailyDose(String strGeriatricMaxDailyDose) throws Throwable{
		actMinMaxDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(FORMULARY_GERIATRIC_TABLE,strGeriatricMaxDailyDose));
	}	
		
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Formulary Min/Max Dose Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
}
