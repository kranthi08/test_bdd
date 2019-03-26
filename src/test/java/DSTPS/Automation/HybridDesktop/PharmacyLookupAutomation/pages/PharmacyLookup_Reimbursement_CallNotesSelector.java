package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class PharmacyLookup_Reimbursement_CallNotesSelector {

	private By REIMBURSEMENT_CALLNOTES_LINK,CALLNOTES_TYPE,CALLNOTES_STATUS;
	private By CALLNOTES_COMMENTS,CALLNOTES_SAVENOTES_BUTTON,PREVIOUS_CALLNOTES;
	private By CALLNOTES_TABLE,CALLNOTES_RESULTS_COUNT;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actCallNotesDetails = new ArrayList<String>();
	
	public PharmacyLookup_Reimbursement_CallNotesSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		PharmacyLookup_Reimbursement_CallNotes_Objects();
	}
	
	private void PharmacyLookup_Reimbursement_CallNotes_Objects()
	{		
		REIMBURSEMENT_CALLNOTES_LINK =By.id("reimbursementForm:callNotesAccordionPanel");
		CALLNOTES_TYPE = By.id("reimbursementForm:callNotesAccordionPanel:selectType");
		CALLNOTES_STATUS = By.id("reimbursementForm:callNotesAccordionPanel:selectStatus");
		CALLNOTES_COMMENTS = By.id("reimbursementForm:callNotesAccordionPanel:currentCallNotes");
		CALLNOTES_SAVENOTES_BUTTON = By.xpath("//span[text()='Save Notes']");
		PREVIOUS_CALLNOTES = By.id("reimbursementForm:callNotesAccordionPanel:callNotesTextarea");
		CALLNOTES_TABLE = By.id("reimbursementForm:callNotesAccordionPanel:callNotesTable");
		CALLNOTES_RESULTS_COUNT = By.xpath("//*[@id='reimbursementForm:callNotesAccordionPanel:callNotesTable_paginator_bottom']//span[@class='ui-paginator-current']");
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Reimbursement Call Notes Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void PharmacyLookup_Reimbursement_clickOnCallNotes() throws Throwable{
		utils.ClickOnLink(REIMBURSEMENT_CALLNOTES_LINK);
		Thread.sleep(1000);
	}
	
	public void waitUntillCallNotesDetails() throws Throwable{
		utils.CheckElementPresenceByLocator(CALLNOTES_TABLE);
		Thread.sleep(1000);
	}
	
	public void PharmacyLookup_Reimbursement_selectType(String strAddNewType) throws Throwable{
		utils.SelectItemFromWebList(CALLNOTES_TYPE, strAddNewType);
		utils.GetBusyStatus();
	}
	
	public void PharmacyLookup_Reimbursement_selectStatus(String strAddNewStatus) throws Throwable{
		utils.SelectItemFromWebList(CALLNOTES_STATUS, strAddNewStatus);
		utils.GetBusyStatus();
	}
	
	public void PharmacyLookup_Reimbursement_enterComments(String strAddNewComments) throws Throwable{
		utils.SetTextOnEdit(CALLNOTES_COMMENTS, strAddNewComments);
		Thread.sleep(1000);
	}
	
	public String PharmacyLookup_Reimbursement_getTotalResults() throws Throwable{
		return utils.GetElementText(CALLNOTES_RESULTS_COUNT);
	}
	
    public void PharmacyLookup_Reimbursement_clickOnSaveNotesButton() throws Throwable{
		utils.ClickOnButton(CALLNOTES_SAVENOTES_BUTTON);
		utils.GetBusyStatus();
	}
    
    public String PharmacyLookup_Reimbursement_getPreviousCallNotesComments() throws Throwable{
		return utils.GetElementText(PREVIOUS_CALLNOTES);
	}
    
	public void PharmacyLookup_Reimbursement_CallNotesType(String strType) throws Throwable{
		actCallNotesDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(CALLNOTES_TABLE,strType));
	}
	
	public void PharmacyLookup_Reimbursement_CallNotesStatus(String strStatus) throws Throwable{
		actCallNotesDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(CALLNOTES_TABLE,strStatus));
	} 	
 	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Reimbursement Call Notes Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
