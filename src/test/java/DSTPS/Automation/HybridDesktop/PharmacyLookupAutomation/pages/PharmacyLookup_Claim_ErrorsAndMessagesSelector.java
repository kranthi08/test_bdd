package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class PharmacyLookup_Claim_ErrorsAndMessagesSelector {

	private By ERRORS_TABLE,ADDITIONAL_MESSAGES_TABLE;
	 
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actErrorsAndMessages = new ArrayList<String>();
 
	public PharmacyLookup_Claim_ErrorsAndMessagesSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		PharmacyLookup_Claim_ErrorsAndMessages_Objects();
	}
	
	private void PharmacyLookup_Claim_ErrorsAndMessages_Objects()
	{		
		ERRORS_TABLE =By.id("claimSelectionForm:claimDetailAccordionPanel:errorsTable");
		ADDITIONAL_MESSAGES_TABLE = By.id("claimSelectionForm:claimDetailAccordionPanel:additionalMessagesTable");		 		
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Errors And Messages Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	
	 
	
	public void Claim_ErrorsAndMessages_NCPDP(String strNCPDP) throws Throwable{
		actErrorsAndMessages.add(utils.RxNovaConnect_WebTable_VerifyColumnData(ERRORS_TABLE,strNCPDP));
	}
	
	public void Claim_ErrorsAndMessages_RejectField(String strRejectField) throws Throwable{
		actErrorsAndMessages.add(utils.RxNovaConnect_WebTable_VerifyColumnData(ERRORS_TABLE,strRejectField));
	}
	
	public void Claim_ErrorsAndMessages_Argus(String strArgus) throws Throwable{
		actErrorsAndMessages.add(utils.RxNovaConnect_WebTable_VerifyColumnData(ERRORS_TABLE,strArgus));
	}
	
	public void Claim_ErrorsAndMessages_Action(String strAction) throws Throwable{
		actErrorsAndMessages.add(utils.RxNovaConnect_WebTable_VerifyColumnData(ERRORS_TABLE,strAction));
	}
	
	public void Claim_ErrorsAndMessages_ArgusErrorText(String strArgusErrorText) throws Throwable{
		actErrorsAndMessages.add(utils.RxNovaConnect_WebTable_VerifyColumnData(ERRORS_TABLE,strArgusErrorText));
	}
	
	public void Claim_ErrorsAndMessages_Qualifier(String strQualifier) throws Throwable{
		actErrorsAndMessages.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(ADDITIONAL_MESSAGES_TABLE,strQualifier));
	}
	
	public void Claim_ErrorsAndMessages_Continue(String strContinue) throws Throwable{
		actErrorsAndMessages.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(ADDITIONAL_MESSAGES_TABLE,strContinue));
	}
	
	public void Claim_ErrorsAndMessages_Message(String strMessage) throws Throwable{
		actErrorsAndMessages.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(ADDITIONAL_MESSAGES_TABLE,strMessage));
	}
	
  	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Errors And Messages Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
}
	
	