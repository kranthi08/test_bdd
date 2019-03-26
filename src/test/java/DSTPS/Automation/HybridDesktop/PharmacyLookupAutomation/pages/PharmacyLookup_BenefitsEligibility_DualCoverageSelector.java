package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class PharmacyLookup_BenefitsEligibility_DualCoverageSelector {

	private By BE_DUALCOVERAGE_LINK,BE_DUALCOVERAGE_TABLE;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actBEDualCoverageDetails = new ArrayList<String>();
	
	public PharmacyLookup_BenefitsEligibility_DualCoverageSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		PharmacyLookup_BenefitsEligibility_DualCoverage_Objects();
	}
	
	private void  PharmacyLookup_BenefitsEligibility_DualCoverage_Objects()
	{		
		BE_DUALCOVERAGE_LINK = By.linkText("Dual Coverage");
		BE_DUALCOVERAGE_TABLE = By.id("benefitsSelectionForm:benefitsAccordionPanel:dualCoverageTab"); 		
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Benefits & Eligibility Dual Coverage Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void clickOnDualCoverageLink() throws Throwable{
		utils.ClickOnLink(BE_DUALCOVERAGE_LINK);
		utils.GetBusyStatus();
	}
	
	public void waitUntillDualCoverage() throws Throwable{
		utils.CheckElementPresenceByLocator(BE_DUALCOVERAGE_TABLE);
		Thread.sleep(1000);
	}
	
	public void BenefitsEligibility_DualCoverage_BeginDate(String strBeginDate) throws Throwable{
		actBEDualCoverageDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_DUALCOVERAGE_TABLE,strBeginDate));
	}
	
	public void BenefitsEligibility_DualCoverage_Indicator(String strIndicator) throws Throwable{
		actBEDualCoverageDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_DUALCOVERAGE_TABLE,strIndicator));
	}
	
	public void BenefitsEligibility_DualCoverage_ProcessDate(String strProcessDate) throws Throwable{
		actBEDualCoverageDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_DUALCOVERAGE_TABLE,strProcessDate));
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Benefits & Eligibility Dual Coverage Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
