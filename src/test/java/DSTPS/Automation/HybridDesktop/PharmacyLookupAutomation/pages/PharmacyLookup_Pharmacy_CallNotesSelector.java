package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class PharmacyLookup_Pharmacy_CallNotesSelector {

	private By PHARMACY_CALLNOTES_LINK,CALLNOTES_TYPE,CALLNOTES_STATUS;
	private By CALLNOTES_COMMENTS,CALLNOTES_SAVENOTES_BUTTON,PREVIOUS_CALLNOTES;
	private By CALLNOTES_TABLE,CALLNOTES_RESULTS_COUNT;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actCallNotesDetails = new ArrayList<String>();
	
	public PharmacyLookup_Pharmacy_CallNotesSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		PharmacyLookup_Pharmacy_CallNotes_Objects();
	}
	
	private void PharmacyLookup_Pharmacy_CallNotes_Objects()
	{		
		PHARMACY_CALLNOTES_LINK =By.id("pharmacyForm:callNotesAccordionPanel");
		CALLNOTES_TYPE = By.id("pharmacyForm:callNotesAccordionPanel:selectType");
		CALLNOTES_STATUS = By.id("pharmacyForm:callNotesAccordionPanel:selectStatus");
		CALLNOTES_COMMENTS = By.id("pharmacyForm:callNotesAccordionPanel:currentCallNotes");
		CALLNOTES_SAVENOTES_BUTTON = By.xpath("//span[text()='Save Notes']");
		PREVIOUS_CALLNOTES = By.id("pharmacyForm:callNotesAccordionPanel:callNotesTextarea");
		CALLNOTES_TABLE = By.id("pharmacyForm:callNotesAccordionPanel:callNotesTable");
		CALLNOTES_RESULTS_COUNT = By.xpath("//*[@id='pharmacyForm:callNotesAccordionPanel:callNotesTable_paginator_bottom']//span[@class='ui-paginator-current']");
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Pharmacy Call Notes Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void PharmacyLookup_Pharmacy_clickOnCallNotes() throws Throwable{
		utils.ClickOnLink(PHARMACY_CALLNOTES_LINK);
		Thread.sleep(1000);
	}
	
	public void waitUntillCallNotesDetails() throws Throwable{
		utils.CheckElementPresenceByLocator(CALLNOTES_TABLE);
		Thread.sleep(1000);
	}
	
	public void PharmacyLookup_Pharmacy_selectType(String strAddNewType) throws Throwable{
		utils.SelectItemFromWebList(CALLNOTES_TYPE, strAddNewType);
		utils.GetBusyStatus();
	}
	
	public void PharmacyLookup_Pharmacy_selectStatus(String strAddNewStatus) throws Throwable{
		utils.SelectItemFromWebList(CALLNOTES_STATUS, strAddNewStatus);
		utils.GetBusyStatus();
	}
	
	public void PharmacyLookup_Pharmacy_enterComments(String strAddNewComments) throws Throwable{
		utils.SetTextOnEdit(CALLNOTES_COMMENTS, strAddNewComments);
		Thread.sleep(1000);
	}
	
	public String PharmacyLookup_Pharmacy_getTotalResults() throws Throwable{
		return utils.GetElementText(CALLNOTES_RESULTS_COUNT);
	}
	
    public void PharmacyLookup_Pharmacy_clickOnSaveNotesButton() throws Throwable{
		utils.ClickOnButton(CALLNOTES_SAVENOTES_BUTTON);
		utils.GetBusyStatus();
	}
    
    public String PharmacyLookup_Pharmacy_getPreviousCallNotesComments() throws Throwable{
		return utils.GetElementText(PREVIOUS_CALLNOTES);
	}
    
	public void PharmacyLookup_Pharmacy_CallNotesType(String strType) throws Throwable{
		actCallNotesDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(CALLNOTES_TABLE,strType));
	}
	
	public void PharmacyLookup_Pharmacy_CallNotesStatus(String strStatus) throws Throwable{
		actCallNotesDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(CALLNOTES_TABLE,strStatus));
	} 	
 	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Pharmacy Call Notes Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
