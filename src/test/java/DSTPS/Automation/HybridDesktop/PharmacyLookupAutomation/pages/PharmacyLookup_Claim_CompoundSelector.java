package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class PharmacyLookup_Claim_CompoundSelector {

	private By COMPOUND_LINK,COMPOUND_TABLE,COMPOUND_SECOND_TABLE;	 
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actCompound = new ArrayList<String>();
 
	public PharmacyLookup_Claim_CompoundSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		PharmacyLookup_Claim_Compound_Objects();
	}
	
	private void PharmacyLookup_Claim_Compound_Objects()
	{		
		COMPOUND_LINK = By.linkText("Compound");
		COMPOUND_TABLE = By.xpath("//*[@class='ui-corner-all custom-panel-content compound-ribbon']/table[1]");	
		COMPOUND_SECOND_TABLE = By.xpath("//*[@class='ui-corner-all custom-panel-content compound-ribbon']/table[2]");	
										
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Compound Information~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	
	// Compound
	
	public void PharmacyLookup_Claim_clickOnCompound() throws Throwable{
		utils.ClickOnLink(COMPOUND_LINK);
		Thread.sleep(1000);
	}
	
	public void waitUnitillCompoundDetails() throws Throwable{
		utils.CheckElementPresenceByLocator(COMPOUND_TABLE);
		Thread.sleep(1000);
	}
	
	public void Claim_Compound_CompoundCode(String strCompoundCode) throws Throwable{
		actCompound.add(utils.RxNovaConnect_WebTable_VerifyRowData(COMPOUND_TABLE,strCompoundCode));
	}
	
	public void Claim_Compound_DispensingUnitFormIndicator(String strDispensingUnitFormIndicator) throws Throwable{
		actCompound.add(utils.RxNovaConnect_WebTable_VerifyRowData(COMPOUND_TABLE,strDispensingUnitFormIndicator));
	}
	
	public void Claim_Compound_DosageFormDescriptionCode(String strDosageFormDescriptionCode) throws Throwable{
		actCompound.add(utils.RxNovaConnect_WebTable_VerifyRowData(COMPOUND_TABLE,strDosageFormDescriptionCode));
	}	
		
	
	public void Claim_Compound_CompoundProductID(String strCompoundProductID) throws Throwable{
		actCompound.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(COMPOUND_SECOND_TABLE,strCompoundProductID));
	}
		
	public void Claim_Compound_ProductIDQualifier(String strProductIDQualifier) throws Throwable{
		actCompound.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(COMPOUND_SECOND_TABLE,strProductIDQualifier));
	}
	
	public void Claim_Compound_CompoundIngredientQTY(String strCompoundIngredientQTY) throws Throwable{
		actCompound.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(COMPOUND_SECOND_TABLE,strCompoundIngredientQTY));
	}
	
	public void Claim_Compound_SubmittedCompoundIngredientDrugCostCompound_(String strSubmittedCompoundIngredientDrugCost) throws Throwable{
		actCompound.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(COMPOUND_SECOND_TABLE,strSubmittedCompoundIngredientDrugCost));
	}
	
	public void Claim_Compound_PlanCompoundIngredientDrugCost(String strPlanCompoundIngredientDrugCost) throws Throwable{
		actCompound.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(COMPOUND_SECOND_TABLE,strPlanCompoundIngredientDrugCost));
	}
	
	public void Claim_Compound_CompoundIngreBasisCostDetermination(String strCompoundIngreBasisCostDetermination) throws Throwable{
		actCompound.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(COMPOUND_SECOND_TABLE,strCompoundIngreBasisCostDetermination));
	}
	
	public void Claim_Compound_PostPay3Indicator(String strPostPay3Indicator) throws Throwable{
		actCompound.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(COMPOUND_SECOND_TABLE,strPostPay3Indicator));
	}
	
	public void Claim_Compound_PostPay4Indicator(String strPostPay4Indicator) throws Throwable{
		actCompound.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(COMPOUND_SECOND_TABLE,strPostPay4Indicator));
	}
 
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Compound Information~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
}
	
	