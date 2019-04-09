package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class PharmacyLookup_Claim_AdditionalInformationSelector {

	private By ADDITIONAL_INFORMATION_LINK,CATEGORY_LIST,ADDITIONAL_INFORMATION_TABLE;
	 	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actAdditionalInformation = new ArrayList<String>();
 
	public PharmacyLookup_Claim_AdditionalInformationSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		PharmacyLookup_Claim_AdditionalInformation_Objects();
	}
	
	private void PharmacyLookup_Claim_AdditionalInformation_Objects()
	{		
		ADDITIONAL_INFORMATION_LINK = By.linkText("Additional Information");
		CATEGORY_LIST = By.xpath("//*[@class='ui-column-filter ui-widget ui-state-default ui-corner-left claim-additional-info-dt-category']");	
		ADDITIONAL_INFORMATION_TABLE = By.xpath("//*[@class='ui-datatable ui-widget claim-additional-info-dt']");
									   	
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Additional Information~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	
	// Additional Information
	
	public void PharmacyLookup_Claim_clickOnAdditionalInformation() throws Throwable{
		utils.ClickOnLink(ADDITIONAL_INFORMATION_LINK);
		Thread.sleep(1000);
	}
	
	public void waitUnitillAdditionalInformation() throws Throwable{
		utils.CheckElementPresenceByLocator(CATEGORY_LIST);
		Thread.sleep(1000);
	}
	
	public void PharmacyLookup_Claim_selectCategoryItem(String strCategory) throws Throwable{
		utils.SelectItemFromWebList(CATEGORY_LIST, strCategory);
		Thread.sleep(1000);
	}
	
	public void Claim_AdditionalInformation_Result(String strResult) throws Throwable{
		actAdditionalInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(ADDITIONAL_INFORMATION_TABLE,strResult));
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Additional Information~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
}
	
	