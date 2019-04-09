package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common.PharmacyLookup_LandingPage_Steps;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages.PharmacyLookup_Claim_CallNotesSelector;


public class PharmacyLookup_Claim_CallNotes_Steps {

	PharmacyLookup_Claim_CallNotesSelector pharmacyLookup_Claim_CallNotesSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expCallNotesDetails = new ArrayList<String>();
	public SoftAssert claimCallNotesResultSoft = new SoftAssert();
	public SoftAssert claimPrevCallNotesSoft = new SoftAssert();
	public SoftAssert claimCallNotesDetailsSoft = new SoftAssert();
	
	public PharmacyLookup_Claim_CallNotes_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		pharmacyLookup_Claim_CallNotesSelector = new PharmacyLookup_Claim_CallNotesSelector(SharedResource,utils);
	}
	
	public void clickOnCallNotes() throws Throwable{
		pharmacyLookup_Claim_CallNotesSelector.PharmacyLookup_Claim_clickOnCallNotes();
	}
	
	public void provideCallNotesDetails(Map<String,String> addCallNotesDetails)throws Throwable {
		String strAddNewType = addCallNotesDetails.get("AddNewType");
		String strAddNewStatus = addCallNotesDetails.get("AddNewStatus");
		String strAddNewComments = addCallNotesDetails.get("AddNewComments");
		
		pharmacyLookup_Claim_CallNotesSelector.waitUnitillCallNotesDetails();
		pharmacyLookup_Claim_CallNotesSelector.PharmacyLookup_Claim_selectType(strAddNewType);
		pharmacyLookup_Claim_CallNotesSelector.PharmacyLookup_Claim_selectStatus(strAddNewStatus);
		pharmacyLookup_Claim_CallNotesSelector.PharmacyLookup_Claim_enterComments(strAddNewComments);
	}
	
	public void addCallNotes() throws Throwable{
		
		String beforeTotalResults = pharmacyLookup_Claim_CallNotesSelector.PharmacyLookup_Claim_getTotalResults();
		String arrBeforeTotalResults[] = beforeTotalResults.split("\\:");
		int beforeTotalResultsCount = Integer.valueOf(arrBeforeTotalResults[1].trim());
		pharmacyLookup_Claim_CallNotesSelector.PharmacyLookup_Claim_clickOnSaveNotesButton();
		Thread.sleep(2000);
		String afterTotalResults = pharmacyLookup_Claim_CallNotesSelector.PharmacyLookup_Claim_getTotalResults();
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
		
		claimCallNotesResultSoft.assertEquals(afterTotalResultsCount, beforeTotalResultsCount+1);
		claimCallNotesResultSoft.assertAll();
		claimCallNotesResultSoft = null;
	}
	
	public void verifyPreviousCallNotesComments(Map<String,String> previousCallNotesComments)throws Throwable {
		String strExpPrevCallNotesComments = previousCallNotesComments.get("PrevCallNotesComment");
		String strActPrevCallNotes = pharmacyLookup_Claim_CallNotesSelector.PharmacyLookup_Claim_getPreviousCallNotesComments();
		String arrActPrevCallNotes[] = strActPrevCallNotes.split("\\:");
		String strActPrevCallNotesComments = arrActPrevCallNotes[1];
		claimPrevCallNotesSoft.assertEquals(strActPrevCallNotesComments, strExpPrevCallNotesComments);
		claimPrevCallNotesSoft.assertAll();
		
	}
	
	public void verifyCallNotesDetails(Map<String,String> callNotesDetails) throws Throwable {
		String strType = callNotesDetails.get("Type");
		String strStatus = callNotesDetails.get("Status");
		
		expCallNotesDetails.add(strType);
		expCallNotesDetails.add(strStatus);
		
		pharmacyLookup_Claim_CallNotesSelector.PharmacyLookup_Claim_CallNotesType(strType);
		pharmacyLookup_Claim_CallNotesSelector.PharmacyLookup_Claim_CallNotesStatus(strStatus);
		
		for(int i=0;i<expCallNotesDetails.size();i++)
		{
			claimCallNotesDetailsSoft.assertEquals(pharmacyLookup_Claim_CallNotesSelector.actCallNotesDetails.get(i), expCallNotesDetails.get(i));
		}		
		claimCallNotesDetailsSoft.assertAll();
		
	}
}

