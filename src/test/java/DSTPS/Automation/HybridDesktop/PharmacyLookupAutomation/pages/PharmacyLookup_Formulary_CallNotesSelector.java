package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class PharmacyLookup_Formulary_CallNotesSelector {

	private By FORMULARY_CALLNOTES_LINK,CALLNOTES_TYPE,CALLNOTES_STATUS;
	private By CALLNOTES_COMMENTS,CALLNOTES_SAVENOTES_BUTTON,PREVIOUS_CALLNOTES;
	private By CALLNOTES_TABLE,CALLNOTES_RESULTS_COUNT;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actCallNotesDetails = new ArrayList<String>();
	
	public PharmacyLookup_Formulary_CallNotesSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		PharmacyLookup_Pharmacy_CallNotes_Objects();
	}
	
	private void PharmacyLookup_Pharmacy_CallNotes_Objects()
	{		
		FORMULARY_CALLNOTES_LINK =By.id("formularyForm:callNotesAccordionPanel");
		CALLNOTES_TYPE = By.id("formularyForm:callNotesAccordionPanel:selectType");
		CALLNOTES_STATUS = By.id("formularyForm:callNotesAccordionPanel:selectStatus");
		CALLNOTES_COMMENTS = By.id("formularyForm:callNotesAccordionPanel:currentCallNotes");
		CALLNOTES_SAVENOTES_BUTTON = By.xpath("//span[text()='Save Notes']");
		PREVIOUS_CALLNOTES = By.id("formularyForm:callNotesAccordionPanel:callNotesTextarea");
		CALLNOTES_TABLE = By.id("formularyForm:callNotesAccordionPanel:callNotesTable");
		CALLNOTES_RESULTS_COUNT = By.xpath("//*[@id='formularyForm:callNotesAccordionPanel:callNotesTable_paginator_bottom']//span[@class='ui-paginator-current']");
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Formulary Call Notes Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void PharmacyLookup_Formulary_clickOnCallNotes() throws Throwable{
		utils.ClickOnLink(FORMULARY_CALLNOTES_LINK);
		Thread.sleep(1000);
	}
	
	public void waitUntillCallNotesDetails() throws Throwable{
		utils.CheckElementPresenceByLocator(CALLNOTES_TABLE);
		Thread.sleep(1000);
	}
	
	public void PharmacyLookup_Formulary_selectType(String strAddNewType) throws Throwable{
		utils.SelectItemFromWebList(CALLNOTES_TYPE, strAddNewType);
		utils.GetBusyStatus();
	}
	
	public void PharmacyLookup_Formulary_selectStatus(String strAddNewStatus) throws Throwable{
		utils.SelectItemFromWebList(CALLNOTES_STATUS, strAddNewStatus);
		utils.GetBusyStatus();
	}
	
	public void PharmacyLookup_Formulary_enterComments(String strAddNewComments) throws Throwable{
		utils.SetTextOnEdit(CALLNOTES_COMMENTS, strAddNewComments);
		Thread.sleep(1000);
	}
	
	public String PharmacyLookup_Formulary_getTotalResults() throws Throwable{
		return utils.GetElementText(CALLNOTES_RESULTS_COUNT);
	}
	
    public void PharmacyLookup_Formulary_clickOnSaveNotesButton() throws Throwable{
		utils.ClickOnButton(CALLNOTES_SAVENOTES_BUTTON);
		utils.GetBusyStatus();
	}
    
    public String PharmacyLookup_Formulary_getPreviousCallNotesComments() throws Throwable{
		return utils.GetElementText(PREVIOUS_CALLNOTES);
	}
    
	public void PharmacyLookup_Formulary_CallNotesType(String strType) throws Throwable{
		actCallNotesDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(CALLNOTES_TABLE,strType));
	}
	
	public void PharmacyLookup_Formulary_CallNotesStatus(String strStatus) throws Throwable{
		actCallNotesDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(CALLNOTES_TABLE,strStatus));
	} 	
 	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Formulary Call Notes Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
