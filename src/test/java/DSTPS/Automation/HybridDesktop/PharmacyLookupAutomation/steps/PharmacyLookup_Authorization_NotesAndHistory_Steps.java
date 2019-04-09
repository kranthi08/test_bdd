package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages.PharmacyLookup_Authorization_NotesAndHistorySelector;

public class PharmacyLookup_Authorization_NotesAndHistory_Steps {

	PharmacyLookup_Authorization_NotesAndHistorySelector pharmacyLookup_Authorization_NotesAndHistorySelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expAuthNotesHistoryDetails = new ArrayList<String>();
	public SoftAssert authNotesHistorySoft = new SoftAssert();
	
	public PharmacyLookup_Authorization_NotesAndHistory_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		pharmacyLookup_Authorization_NotesAndHistorySelector = new PharmacyLookup_Authorization_NotesAndHistorySelector(SharedResource,utils);
	}
	
	public void clickOnNotesAndHistory() throws Throwable{
		pharmacyLookup_Authorization_NotesAndHistorySelector.Authorization_clickOnNotesAndHistory();
	}
	
	public void verifyNotesAndHistoryDetails(Map<String,String> notesAndHistoryDetails)throws Throwable {
		String strNotes = notesAndHistoryDetails.get("Notes");
		String strAdded = notesAndHistoryDetails.get("HistoryAdded");
		String strLastUpdate = notesAndHistoryDetails.get("HistoryLastUpdated");		
		String strLastUsed = notesAndHistoryDetails.get("HistoryLastUsed");
		
		expAuthNotesHistoryDetails.add(strNotes);
		expAuthNotesHistoryDetails.add(strAdded);
		expAuthNotesHistoryDetails.add(strLastUpdate);
		expAuthNotesHistoryDetails.add(strLastUsed);

		pharmacyLookup_Authorization_NotesAndHistorySelector.waitUntillNotesAndHistory();
		pharmacyLookup_Authorization_NotesAndHistorySelector.Authorization_Notes(strNotes);
		pharmacyLookup_Authorization_NotesAndHistorySelector.Authorization_History_Added(strAdded);
		pharmacyLookup_Authorization_NotesAndHistorySelector.Authorization_History_LastUpdate(strLastUpdate);
		pharmacyLookup_Authorization_NotesAndHistorySelector.Authorization_History_LastUsed(strLastUsed);
		
		for(int i=0;i<expAuthNotesHistoryDetails.size();i++)
		{
			authNotesHistorySoft.assertEquals(pharmacyLookup_Authorization_NotesAndHistorySelector.actAuthNotesHistoryDetails.get(i), expAuthNotesHistoryDetails.get(i));
		}		
		authNotesHistorySoft.assertAll();
	}
}

