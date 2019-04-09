package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class PharmacyLookup_BenefitsEligibility_CoverageCopaySelector {

	private By BE_COVERAGECOPAY_LINK,BE_COVERAGECODE_TABLE;
	private By BE_COPAYASSIGNMENTS_TABLE,BE_COPAYVALUES_TABLE;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actBECoverageCopayDetails = new ArrayList<String>();
	
	public PharmacyLookup_BenefitsEligibility_CoverageCopaySelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		PharmacyLookup_BenefitsEligibility_CoverageCopay_Objects();
	}
	
	private void  PharmacyLookup_BenefitsEligibility_CoverageCopay_Objects()
	{		
		BE_COVERAGECOPAY_LINK = By.linkText("Coverage & Copay");
		BE_COVERAGECODE_TABLE = By.id("benefitsSelectionForm:benefitsAccordionPanel:coverageCodeTable");
		BE_COPAYASSIGNMENTS_TABLE = By.id("benefitsSelectionForm:benefitsAccordionPanel:copayAssignmentTable");
		BE_COPAYVALUES_TABLE = By.id("benefitsSelectionForm:benefitsAccordionPanel:copayValueTable");		
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Benefits & Eligibility Coverage & Copay Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void clickOnCoverageAndCopayLink() throws Throwable{
		utils.ClickOnLink(BE_COVERAGECOPAY_LINK);
		utils.GetBusyStatus();
	}
	
	public void waitUntillCoverageAndCopay() throws Throwable{
		utils.CheckElementPresenceByLocator(BE_COVERAGECODE_TABLE);
		Thread.sleep(1000);
	}
	
	// Coverage Code
	
	public void BenefitsEligibility_CAC_CoverageCode1(String strCoverageCode1) throws Throwable{
		actBECoverageCopayDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(BE_COVERAGECODE_TABLE,strCoverageCode1));
	}
	
	public void BenefitsEligibility_CAC_CoverageCode2(String strCoverageCode2) throws Throwable{
		actBECoverageCopayDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(BE_COVERAGECODE_TABLE,strCoverageCode2));
	}
	
	public void BenefitsEligibility_CAC_Description(String strDescription) throws Throwable{
		actBECoverageCopayDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(BE_COVERAGECODE_TABLE,strDescription));
	}
	
	public void BenefitsEligibility_CAC_StartDate(String strStartDate) throws Throwable{
		actBECoverageCopayDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(BE_COVERAGECODE_TABLE,strStartDate));
	}
	
	public void BenefitsEligibility_CAC_CoverageFlag(String strCoverageFlag) throws Throwable{
		actBECoverageCopayDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(BE_COVERAGECODE_TABLE,strCoverageFlag));
	}
	
	// Copay Assignments
	
	public void BenefitsEligibility_CAC_Priority(String strPriority) throws Throwable{
		actBECoverageCopayDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_COPAYASSIGNMENTS_TABLE,strPriority));
	}
	
	public void BenefitsEligibility_CAC_ConditionDescription(String strConditionDescription) throws Throwable{
		actBECoverageCopayDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_COPAYASSIGNMENTS_TABLE,strConditionDescription));
	}
	
	public void BenefitsEligibility_CAC_CopayField(String strCopayField) throws Throwable{
		actBECoverageCopayDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_COPAYASSIGNMENTS_TABLE,strCopayField));
	}
	
	// Copay Values
	
	public void BenefitsEligibility_CAC_CopayValues1(String strCopayValues1) throws Throwable{
		actBECoverageCopayDetails.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(BE_COPAYVALUES_TABLE,strCopayValues1));
	}
	
	public void BenefitsEligibility_CAC_CopayValues2(String strCopayValues2) throws Throwable{
		actBECoverageCopayDetails.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(BE_COPAYVALUES_TABLE,strCopayValues2));
	}
	
	public void BenefitsEligibility_CAC_CopayValues3(String strCopayValues3) throws Throwable{
		actBECoverageCopayDetails.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(BE_COPAYVALUES_TABLE,strCopayValues3));
	}
	
	public void BenefitsEligibility_CAC_CopayValues4(String strCopayValues4) throws Throwable{
		actBECoverageCopayDetails.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(BE_COPAYVALUES_TABLE,strCopayValues4));
	}
	
	public void BenefitsEligibility_CAC_CopayValues5(String strCopayValues5) throws Throwable{
		actBECoverageCopayDetails.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(BE_COPAYVALUES_TABLE,strCopayValues5));
	}
	
	public void BenefitsEligibility_CAC_CopayValues6(String strCopayValues6) throws Throwable{
		actBECoverageCopayDetails.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(BE_COPAYVALUES_TABLE,strCopayValues6));
	}
	
	public void BenefitsEligibility_CAC_CopayValues7(String strCopayValues7) throws Throwable{
		actBECoverageCopayDetails.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(BE_COPAYVALUES_TABLE,strCopayValues7));
	}
	
	public void BenefitsEligibility_CAC_CopayValues8(String strCopayValues8) throws Throwable{
		actBECoverageCopayDetails.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(BE_COPAYVALUES_TABLE,strCopayValues8));
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Benefits & Eligibility Coverage & Copay Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
