package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages.PharmacyLookup_BenefitsEligibility_DualCoverageSelector;

public class PharmacyLookup_BenefitsEligibility_DualCoverage_Steps {

	PharmacyLookup_BenefitsEligibility_DualCoverageSelector pharmacyLookup_BenefitsEligibility_DualCoverageSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expBEDualCoverageDetails = new ArrayList<String>();
	public SoftAssert dualCoverageDetailsSoft = new SoftAssert();
	
	public PharmacyLookup_BenefitsEligibility_DualCoverage_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		pharmacyLookup_BenefitsEligibility_DualCoverageSelector = new PharmacyLookup_BenefitsEligibility_DualCoverageSelector(SharedResource,utils);
	}
	
	public void clickOnDualCoverage() throws Throwable{
		pharmacyLookup_BenefitsEligibility_DualCoverageSelector.clickOnDualCoverageLink();
	}
	
	public void verifyDualCoverageDetails(Map<String,String> dualCoverageDetails)throws Throwable {
		String strBeginDate = dualCoverageDetails.get("BeginDate");
		String strIndicator = dualCoverageDetails.get("Indicator");		
		String strProcessDate = dualCoverageDetails.get("ProcessDate");		
				
		expBEDualCoverageDetails.add(strBeginDate);
		expBEDualCoverageDetails.add(strIndicator);
		expBEDualCoverageDetails.add(strProcessDate);
		
		pharmacyLookup_BenefitsEligibility_DualCoverageSelector.waitUntillDualCoverage();
		pharmacyLookup_BenefitsEligibility_DualCoverageSelector.BenefitsEligibility_DualCoverage_BeginDate(strBeginDate);
		pharmacyLookup_BenefitsEligibility_DualCoverageSelector.BenefitsEligibility_DualCoverage_Indicator(strIndicator);
		pharmacyLookup_BenefitsEligibility_DualCoverageSelector.BenefitsEligibility_DualCoverage_ProcessDate(strProcessDate);
					
		for(int i=0;i<expBEDualCoverageDetails.size();i++)
		{
			dualCoverageDetailsSoft.assertEquals(pharmacyLookup_BenefitsEligibility_DualCoverageSelector.actBEDualCoverageDetails.get(i), expBEDualCoverageDetails.get(i));
		}		
		dualCoverageDetailsSoft.assertAll();
	}
}

