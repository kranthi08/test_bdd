package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages.PharmacyLookup_Reimbursement_CallNotesSelector;

public class PharmacyLookup_Reimbursement_CallNotes_Steps {

	PharmacyLookup_Reimbursement_CallNotesSelector pharmacyLookup_Reimbursement_CallNotesSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expCallNotesDetails = new ArrayList<String>();
	public SoftAssert reimbCallNotesResultSoft = new SoftAssert();
	public SoftAssert reimbPrevCallNotesSoft = new SoftAssert();
	public SoftAssert reimbCallNotesDetailsSoft = new SoftAssert();
	
	public PharmacyLookup_Reimbursement_CallNotes_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		pharmacyLookup_Reimbursement_CallNotesSelector = new PharmacyLookup_Reimbursement_CallNotesSelector(SharedResource,utils);
	}
	
	public void clickOnCallNotes() throws Throwable{
		pharmacyLookup_Reimbursement_CallNotesSelector.PharmacyLookup_Reimbursement_clickOnCallNotes();
	}
	
	public void provideCallNotesDetails(Map<String,String> addCallNotesDetails)throws Throwable {
		String strAddNewType = addCallNotesDetails.get("AddNewType");
		String strAddNewStatus = addCallNotesDetails.get("AddNewStatus");
		String strAddNewComments = addCallNotesDetails.get("AddNewComments");
		
		pharmacyLookup_Reimbursement_CallNotesSelector.waitUntillCallNotesDetails();
		pharmacyLookup_Reimbursement_CallNotesSelector.PharmacyLookup_Reimbursement_selectType(strAddNewType);
		pharmacyLookup_Reimbursement_CallNotesSelector.PharmacyLookup_Reimbursement_selectStatus(strAddNewStatus);
		pharmacyLookup_Reimbursement_CallNotesSelector.PharmacyLookup_Reimbursement_enterComments(strAddNewComments);
	}
	
	public void addCallNotes() throws Throwable{
		
		String beforeTotalResults = pharmacyLookup_Reimbursement_CallNotesSelector.PharmacyLookup_Reimbursement_getTotalResults();
		String arrBeforeTotalResults[] = beforeTotalResults.split("\\:");
		int beforeTotalResultsCount = Integer.valueOf(arrBeforeTotalResults[1].trim());
		pharmacyLookup_Reimbursement_CallNotesSelector.PharmacyLookup_Reimbursement_clickOnSaveNotesButton();
		Thread.sleep(2000);
		String afterTotalResults = pharmacyLookup_Reimbursement_CallNotesSelector.PharmacyLookup_Reimbursement_getTotalResults();
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
		
		reimbCallNotesResultSoft.assertEquals(afterTotalResultsCount, beforeTotalResultsCount+1);
		reimbCallNotesResultSoft.assertAll();
	}
	
	public void verifyPreviousCallNotesComments(Map<String,String> previousCallNotesComments)throws Throwable {
		String strExpPrevCallNotesComments = previousCallNotesComments.get("PrevCallNotesComment");
		String strActPrevCallNotes = pharmacyLookup_Reimbursement_CallNotesSelector.PharmacyLookup_Reimbursement_getPreviousCallNotesComments();
		String arrActPrevCallNotes[] = strActPrevCallNotes.split("\\:");
		String strActPrevCallNotesComments = arrActPrevCallNotes[1];
		reimbPrevCallNotesSoft.assertEquals(strActPrevCallNotesComments, strExpPrevCallNotesComments);
		reimbPrevCallNotesSoft.assertAll();
	}
	
	public void verifyCallNotesDetails(Map<String,String> callNotesDetails) throws Throwable {
		String strType = callNotesDetails.get("Type");
		String strStatus = callNotesDetails.get("Status");
		
		expCallNotesDetails.add(strType);
		expCallNotesDetails.add(strStatus);
		
		pharmacyLookup_Reimbursement_CallNotesSelector.PharmacyLookup_Reimbursement_CallNotesType(strType);
		pharmacyLookup_Reimbursement_CallNotesSelector.PharmacyLookup_Reimbursement_CallNotesStatus(strStatus);
		
		for(int i=0;i<expCallNotesDetails.size();i++)
		{
			reimbCallNotesDetailsSoft.assertEquals(pharmacyLookup_Reimbursement_CallNotesSelector.actCallNotesDetails.get(i), expCallNotesDetails.get(i));
		}		
		reimbCallNotesDetailsSoft.assertAll();
	}
}

