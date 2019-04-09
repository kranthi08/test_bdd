package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class PharmacyLookup_Claim_ContextualHelpSelector {

	private By CONTEXTUAL_HELP_TABLE,PAID_CLAIM,MULTI_SOURCE_DRUGS;
		
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actContextualHelp = new ArrayList<String>();	
 
	public PharmacyLookup_Claim_ContextualHelpSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		PharmacyLookup_Claim_ContextualHelp_Objects();
	}
	
	private void PharmacyLookup_Claim_ContextualHelp_Objects()
	{		
		
		CONTEXTUAL_HELP_TABLE = By.xpath("//*[@class='ui-scrollpanel ui-scrollpanel-native ui-widget ui-widget-content ui-corner-all helpful-hints-scroll helpful-hints-content']");	
		PAID_CLAIM = By.xpath("//*[@class='ui-datatable ui-widget custom-dt noborder']//font[text()='Paid Claim']"); 
		//MULTI_SOURCE_DRUGS = By.xpath("//*[@class='ui-datatable ui-widget custom-dt noborder']//li[contains(text(),'Multi-Source Drugs')]");
		MULTI_SOURCE_DRUGS = By.xpath("//*[@class='ui-scrollpanel ui-scrollpanel-native ui-widget ui-widget-content ui-corner-all helpful-hints-scroll helpful-hints-content']//li[contains(text(),'Multi-Source Drugs')]"); 
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Claim Raw Data~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	
	// Claim Raw Data
	
	public void waitUnitillContextualHelp() throws Throwable{
		utils.CheckElementPresenceByLocator(CONTEXTUAL_HELP_TABLE);
		Thread.sleep(1000);
	}
	
	public String checkPresenceOfPaidClaim() throws Throwable{
		return utils.GetElementText(PAID_CLAIM);    		
	}
	
	public String checkPresenceOfMultiSourceDrugs() throws Throwable{
		return utils.GetElementText(MULTI_SOURCE_DRUGS);    		
	}
	 
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Claim Raw Data~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
}
	
	