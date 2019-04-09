package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages.PharmacyLookup_Pharmacy_CallNotesSelector;

public class PharmacyLookup_Pharmacy_CallNotes_Steps {

	PharmacyLookup_Pharmacy_CallNotesSelector pharmacyLookup_Pharmacy_CallNotesSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expCallNotesDetails = new ArrayList<String>();
	public SoftAssert pharmacyCallNotesResultSoft = new SoftAssert();
	public SoftAssert pharmacyPrevCallNotesSoft = new SoftAssert();
	public SoftAssert pharmacyCallNotesDetailsSoft = new SoftAssert();
	
	public PharmacyLookup_Pharmacy_CallNotes_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		pharmacyLookup_Pharmacy_CallNotesSelector = new PharmacyLookup_Pharmacy_CallNotesSelector(SharedResource,utils);
	}
	
	public void clickOnCallNotes() throws Throwable{
		pharmacyLookup_Pharmacy_CallNotesSelector.PharmacyLookup_Pharmacy_clickOnCallNotes();
	}
	
	public void provideCallNotesDetails(Map<String,String> addCallNotesDetails)throws Throwable {
		String strAddNewType = addCallNotesDetails.get("AddNewType");
		String strAddNewStatus = addCallNotesDetails.get("AddNewStatus");
		String strAddNewComments = addCallNotesDetails.get("AddNewComments");
		
		pharmacyLookup_Pharmacy_CallNotesSelector.waitUntillCallNotesDetails();
		pharmacyLookup_Pharmacy_CallNotesSelector.PharmacyLookup_Pharmacy_selectType(strAddNewType);
		pharmacyLookup_Pharmacy_CallNotesSelector.PharmacyLookup_Pharmacy_selectStatus(strAddNewStatus);
		pharmacyLookup_Pharmacy_CallNotesSelector.PharmacyLookup_Pharmacy_enterComments(strAddNewComments);
	}
	
	public void addCallNotes() throws Throwable{
		
		String beforeTotalResults = pharmacyLookup_Pharmacy_CallNotesSelector.PharmacyLookup_Pharmacy_getTotalResults();
		String arrBeforeTotalResults[] = beforeTotalResults.split("\\:");
		int beforeTotalResultsCount = Integer.valueOf(arrBeforeTotalResults[1].trim());
		pharmacyLookup_Pharmacy_CallNotesSelector.PharmacyLookup_Pharmacy_clickOnSaveNotesButton();
		Thread.sleep(2000);
		String afterTotalResults = pharmacyLookup_Pharmacy_CallNotesSelector.PharmacyLookup_Pharmacy_getTotalResults();
		String arrAfterTotalResults[] = afterTotalResults.split("\\:");
		int afterTotalResultsCount = Integer.valueOf(arrAfterTotalResults[1].trim());
		if(afterTotalResultsCount>beforeTotalResultsCount)
		  {
			System.out.println("The Call Notes details added successfully");
		  }
		else
		 {
			System.out.println("The Call Notes details are not added");
		 }
		
		pharmacyCallNotesResultSoft.assertEquals(afterTotalResultsCount, beforeTotalResultsCount+1);
		pharmacyCallNotesResultSoft.assertAll();
	}
	
	public void verifyPreviousCallNotesComments(Map<String,String> previousCallNotesComments)throws Throwable {
		String strExpPrevCallNotesComments = previousCallNotesComments.get("PrevCallNotesComment");
		String strActPrevCallNotes = pharmacyLookup_Pharmacy_CallNotesSelector.PharmacyLookup_Pharmacy_getPreviousCallNotesComments();
		String arrActPrevCallNotes[] = strActPrevCallNotes.split("\\:");
		String strActPrevCallNotesComments = arrActPrevCallNotes[1];
		pharmacyPrevCallNotesSoft.assertEquals(strActPrevCallNotesComments, strExpPrevCallNotesComments);
		pharmacyPrevCallNotesSoft.assertAll();
	}
	
	public void verifyCallNotesDetails(Map<String,String> callNotesDetails) throws Throwable {
		String strType = callNotesDetails.get("Type");
		String strStatus = callNotesDetails.get("Status");
		
		expCallNotesDetails.add(strType);
		expCallNotesDetails.add(strStatus);
		
		pharmacyLookup_Pharmacy_CallNotesSelector.PharmacyLookup_Pharmacy_CallNotesType(strType);
		pharmacyLookup_Pharmacy_CallNotesSelector.PharmacyLookup_Pharmacy_CallNotesStatus(strStatus);
		
		for(int i=0;i<expCallNotesDetails.size();i++)
		{
			pharmacyCallNotesDetailsSoft.assertEquals(pharmacyLookup_Pharmacy_CallNotesSelector.actCallNotesDetails.get(i), expCallNotesDetails.get(i));
		}		
		pharmacyCallNotesDetailsSoft.assertAll();
	}
}

