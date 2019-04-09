package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class PharmacyLookup_Claim_ClaimRawDataSelector {

	private By CLAIM_RAW_DATA_LINK,CLAIM_RAW_DATA_TABLE,TRANSMITTED_DATA,RESPONSE_DATA, DATA_LENGTH;
		
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actClaimRawData = new ArrayList<String>();
 
	public PharmacyLookup_Claim_ClaimRawDataSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		PharmacyLookup_Claim_ClaimRawData_Objects();
	}
	
	private void PharmacyLookup_Claim_ClaimRawData_Objects()
	{		
		CLAIM_RAW_DATA_LINK = By.linkText("Claim Raw Data");
		CLAIM_RAW_DATA_TABLE = By.xpath("//*[@class='ui-accordion-content ui-helper-reset ui-widget-content ui-helper-hidden']");	
		TRANSMITTED_DATA = By.xpath("//input[@type='radio']/following-sibling::label[contains(text(),'Transmitted Data')]"); 
		RESPONSE_DATA = By.xpath("//input[@type='radio']/following-sibling::label[contains(text(),'Response Data')]");
		DATA_LENGTH = By.xpath("//*[@class='claim-raw-data'][1]");
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Claim Raw Data~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	
	// Claim Raw Data
	
	public void PharmacyLookup_Claim_clickOnClaimRawData() throws Throwable{
		utils.ClickOnLink(CLAIM_RAW_DATA_LINK);
		Thread.sleep(1000);
	}
	
	public void waitUnitillClaimRawData() throws Throwable{
		utils.CheckElementPresenceByLocator(CLAIM_RAW_DATA_TABLE);
		Thread.sleep(1000);
	}
	
	public void PharmacyLookup_Claim_verifyPresenceOfTransmittedData() throws Throwable{
		utils.VerifyElementPresence(TRANSMITTED_DATA);
		Thread.sleep(1000);
	}
	
	public void PharmacyLookup_Claim_verifyPresenceOfResponseData() throws Throwable{
		utils.VerifyElementPresence(RESPONSE_DATA);
		Thread.sleep(1000);
	}	 
	
	public String checkDataLenght() throws Throwable{
		return utils.GetElementText(DATA_LENGTH);    		
	}
	 
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Claim Raw Data~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
}
	
	