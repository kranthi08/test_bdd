package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class PharmacyLookup_Authorization_NotesAndHistorySelector {

	private By NOTESANDHISTORY_LINK,AUTHORIZATION_NOTES_TABLE,AUTHORIZATION_HISTORY_TABLE;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actAuthNotesHistoryDetails = new ArrayList<String>();
	
	public PharmacyLookup_Authorization_NotesAndHistorySelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		PharmacyLookup_Authorization_NotesHistory_Objects();
	}
	
	private void PharmacyLookup_Authorization_NotesHistory_Objects()
	{		
		NOTESANDHISTORY_LINK = By.linkText("Notes & History");
		AUTHORIZATION_NOTES_TABLE = By.xpath("//*[@class='claim-drug-info-tbls prior-auth-notes-tbl']");
		AUTHORIZATION_HISTORY_TABLE = By.xpath("//*[@class='claim-drug-info-tbls prior-auth-history-tbl']");
	}                         
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Authorization Notes & History Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void Authorization_clickOnNotesAndHistory() throws Throwable{
		utils.ClickOnLink(NOTESANDHISTORY_LINK);
		utils.GetBusyStatus();
	}
	
	public void waitUntillNotesAndHistory() throws Throwable{
		utils.CheckElementPresenceByLocator(AUTHORIZATION_NOTES_TABLE);
		Thread.sleep(1000);
	}
	
	// Notes
	
	public void Authorization_Notes(String strNotes) throws Throwable{
		actAuthNotesHistoryDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AUTHORIZATION_NOTES_TABLE,strNotes));
	}
	
	// History
	
	public void Authorization_History_Added(String strAdded) throws Throwable{
		actAuthNotesHistoryDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(AUTHORIZATION_HISTORY_TABLE,strAdded));
	}
	
	public void Authorization_History_LastUpdate(String strLastUpdate) throws Throwable{
		actAuthNotesHistoryDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(AUTHORIZATION_HISTORY_TABLE,strLastUpdate));
	}
	
	public void Authorization_History_LastUsed(String strLastUsed) throws Throwable{
		actAuthNotesHistoryDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(AUTHORIZATION_HISTORY_TABLE,strLastUsed));
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Authorization Notes & History Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
}
