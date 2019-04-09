package DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class PharmacyLookup_DetailsSelector {

	private By BENEFITSELIGIBILITY_LINK,CLAIM_LINK,FORMULARY_LINK;
	private By PHARMACY_LINK,AUTHORIZATION_LINK,REIMBURSEMENT_LINK;
	private By CALLNOTES_LINK,BENEFITSELIGIBILITY_DETAIL,CLAIM_HISTORY;
	private By FORMULARY_DRUGRESULTS,PHARMACY_NWPHARMACIES,AUTHORIZATION_RESULTS;
	private By REIMBURSEMENT_RESULTS,CALLNOTES_DETAIL;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public PharmacyLookup_DetailsSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		PharmacyLookup_Details_Objects();
	}
	
	private void PharmacyLookup_Details_Objects()
	{		
		BENEFITSELIGIBILITY_LINK = By.xpath("//a[starts-with(@class,'ui-commandlink lnk-scenario lnk-') and contains(text(),'benefits')]");
		CLAIM_LINK = By.xpath("//a[starts-with(@class,'ui-commandlink lnk-scenario lnk-') and contains(text(),'claim')]");
		FORMULARY_LINK = By.xpath("//a[starts-with(@class,'ui-commandlink lnk-scenario lnk-') and contains(text(),'formulary')]");
		PHARMACY_LINK = By.xpath("//a[starts-with(@class,'ui-commandlink lnk-scenario lnk-') and contains(text(),'pharmacy')]");
		AUTHORIZATION_LINK = By.xpath("//a[starts-with(@class,'ui-commandlink lnk-scenario lnk-') and contains(text(),'priorauth')]");
		REIMBURSEMENT_LINK = By.xpath("//a[starts-with(@class,'ui-commandlink lnk-scenario lnk-') and contains(text(),'reimb')]");
		CALLNOTES_LINK = By.xpath("//a[starts-with(@class,'ui-commandlink lnk-scenario lnk-') and contains(text(),'notes')]");
		BENEFITSELIGIBILITY_DETAIL = By.id("benefitsSelectionForm:benefits");
		CLAIM_HISTORY = By.id("claimSelectionForm:claim-history");
		FORMULARY_DRUGRESULTS = By.id("formularyForm:searchCriteriaValue_input");
		PHARMACY_NWPHARMACIES = By.id("selectPharmacyDialogForm:btnSearch");
		AUTHORIZATION_RESULTS = By.id("priorAuthForm:AuthID");
		REIMBURSEMENT_RESULTS = By.id("reimbursementForm:reimbursementAccordionPanel");
		CALLNOTES_DETAIL = By.id("callNotesForm:callNotesTable");
		
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Pharmacy Lookup Details Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void PharmacyLookup_clickOnBenefitsEligibilityLink() throws Throwable{
		utils.ClickOnLink(BENEFITSELIGIBILITY_LINK);
		Thread.sleep(1000);
	}
	
	public void waitUntillBenefitsEligibilityDetail() throws Throwable{
		utils.CheckElementPresenceByLocator(BENEFITSELIGIBILITY_DETAIL);
		Thread.sleep(1000);
	}
	
	public void verifyBenefitsEligibilityDetail(){
		utils.VerifyObjectIsDisplayed(BENEFITSELIGIBILITY_DETAIL);
	}
	
	public void PharmacyLookup_clickOnClaimLink() throws Throwable{
		utils.ClickOnLink(CLAIM_LINK);
		Thread.sleep(1000);
	}
	
	public void waitUntillClaimHistory() throws Throwable{
		utils.CheckElementPresenceByLocator(CLAIM_HISTORY);
		Thread.sleep(1000);
	}
	
	public void verifyClaimHistory(){
		utils.VerifyObjectIsDisplayed(CLAIM_HISTORY);
	}
	
	public void PharmacyLookup_clickOnFormularyLink() throws Throwable{
		utils.ClickOnLink(FORMULARY_LINK);
		Thread.sleep(1000);
	}
	
	public void waitUntillDrugResults() throws Throwable{
		utils.CheckElementPresenceByLocator(FORMULARY_DRUGRESULTS);
		Thread.sleep(1000);
	}
	
	public void verifyDrugResults(){
		utils.VerifyObjectIsDisplayed(FORMULARY_DRUGRESULTS);
	}
	
	public void PharmacyLookup_clickOnPharmacyLink() throws Throwable{
		utils.ClickOnLink(PHARMACY_LINK);
		Thread.sleep(1000);
	}
	
	public void waitUntillNetworkPharmaciesSearch() throws Throwable{
		utils.CheckElementPresenceByLocator(PHARMACY_NWPHARMACIES);
		Thread.sleep(1000);
	}
	
	public void verifyNetworkPharmaciesSearch(){
		utils.VerifyObjectIsDisplayed(PHARMACY_NWPHARMACIES);
	}
	
	public void PharmacyLookup_clickOnAuthorizationLink() throws Throwable{
		utils.ClickOnLink(AUTHORIZATION_LINK);
		Thread.sleep(1000);
	}
	
	public void waitUntillAuthResults() throws Throwable{
		utils.CheckElementPresenceByLocator(AUTHORIZATION_RESULTS);
		Thread.sleep(1000);
	}
	
	public void verifyAuthResults(){
		utils.VerifyObjectIsDisplayed(AUTHORIZATION_RESULTS);
	}
	
	public void PharmacyLookup_clickOnReimbursementLink() throws Throwable{
		utils.ClickOnLink(REIMBURSEMENT_LINK);
		Thread.sleep(1000);
	}
	
	public void waitUntillReimbursementResults() throws Throwable{
		utils.CheckElementPresenceByLocator(REIMBURSEMENT_RESULTS);
		Thread.sleep(1000);
	}
	
	public void verifyReimbursementResults(){
		utils.VerifyObjectIsDisplayed(REIMBURSEMENT_RESULTS);
	}
	
	public void PharmacyLookup_clickOnCallNotesLink() throws Throwable{
		utils.ClickOnLink(CALLNOTES_LINK);
		Thread.sleep(1000);
	}
	
	public void waitUntillCallNotesDetail() throws Throwable{
		utils.CheckElementPresenceByLocator(CALLNOTES_DETAIL);
		Thread.sleep(1000);
	}
	
	public void verifyCallNotesDetail(){
		utils.VerifyObjectIsDisplayed(CALLNOTES_DETAIL);
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Pharmacy Lookup Details Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
