package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common.PharmacyLookup_LandingPage_Steps;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages.PharmacyLookup_Claim_ErrorsAndMessagesSelector;

public class PharmacyLookup_Claim_ErrorsAndMessages_Steps {

	PharmacyLookup_Claim_ErrorsAndMessagesSelector pharmacyLookup_Claim_ErrorsAndMessagesSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expErrorsAndMessages = new ArrayList<String>();
	public SoftAssert errorsAndMessagesSoft = new SoftAssert();
	
	
	public PharmacyLookup_Claim_ErrorsAndMessages_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		pharmacyLookup_Claim_ErrorsAndMessagesSelector = new PharmacyLookup_Claim_ErrorsAndMessagesSelector(SharedResource,utils);
	}
	
	public void verifyErrorsAndMessages(Map<String,String> errorsAndMessages)throws Throwable {
		String strNCPDP = errorsAndMessages.get("NCPDP");
		String strRejectField = errorsAndMessages.get("RejectField");
		String strArgus = errorsAndMessages.get("Argus");
		String strAction = errorsAndMessages.get("Action");
		String strArgusErrorText = errorsAndMessages.get("ArgusErrorText");
		String strQualifier = errorsAndMessages.get("Qualifier");
		String strContinue = errorsAndMessages.get("Continue");
		String strMessage = errorsAndMessages.get("Message");
		 		 			
		expErrorsAndMessages.add(strNCPDP);
		expErrorsAndMessages.add(strRejectField);
		expErrorsAndMessages.add(strArgus);
		expErrorsAndMessages.add(strAction);
		expErrorsAndMessages.add(strArgusErrorText);
		expErrorsAndMessages.add(strQualifier);
		expErrorsAndMessages.add(strContinue);
		expErrorsAndMessages.add(strMessage);
		  		
		pharmacyLookup_Claim_ErrorsAndMessagesSelector.Claim_ErrorsAndMessages_NCPDP(strNCPDP);
		pharmacyLookup_Claim_ErrorsAndMessagesSelector.Claim_ErrorsAndMessages_RejectField(strRejectField);
		pharmacyLookup_Claim_ErrorsAndMessagesSelector.Claim_ErrorsAndMessages_Argus(strArgus);
		pharmacyLookup_Claim_ErrorsAndMessagesSelector.Claim_ErrorsAndMessages_Action(strAction);
		pharmacyLookup_Claim_ErrorsAndMessagesSelector.Claim_ErrorsAndMessages_ArgusErrorText(strArgusErrorText);
		pharmacyLookup_Claim_ErrorsAndMessagesSelector.Claim_ErrorsAndMessages_Qualifier(strQualifier);
		pharmacyLookup_Claim_ErrorsAndMessagesSelector.Claim_ErrorsAndMessages_Continue(strContinue);
		pharmacyLookup_Claim_ErrorsAndMessagesSelector.Claim_ErrorsAndMessages_Message(strMessage);
		 				
			
		for(int i=0;i<expErrorsAndMessages.size();i++)
		{
			errorsAndMessagesSoft.assertEquals(pharmacyLookup_Claim_ErrorsAndMessagesSelector.actErrorsAndMessages.get(i), expErrorsAndMessages.get(i));
		}		
		errorsAndMessagesSoft.assertAll();
		
	}	
	
	 
}

