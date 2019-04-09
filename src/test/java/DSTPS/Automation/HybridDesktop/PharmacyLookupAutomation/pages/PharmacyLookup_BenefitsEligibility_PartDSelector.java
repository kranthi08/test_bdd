package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class PharmacyLookup_BenefitsEligibility_PartDSelector {

	private By BE_PARTD_LINK,BE_PARTDCMS_TABLE,BE_PARTDCMSDATES_TABLE;
	private By BE_PARTDPROGRAM_TABLE,BE_PARTDSEQUENCE_TABLE;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actBEPartDDetails = new ArrayList<String>();
	
	public PharmacyLookup_BenefitsEligibility_PartDSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		PharmacyLookup_BenefitsEligibility_PartD_Objects();
	}
	
	private void  PharmacyLookup_BenefitsEligibility_PartD_Objects()
	{		
		BE_PARTD_LINK = By.linkText("Part D");
		BE_PARTDCMS_TABLE = By.xpath("//*[@class='fl custom-tbls benefits-partd-cms-tbl']");
		BE_PARTDCMSDATES_TABLE = By.xpath("//*[@class='ui-datatable ui-widget fl custom-dt cms-date-dt']");		
		BE_PARTDPROGRAM_TABLE = By.xpath("//*[@class='ui-datatable ui-widget custom-dt']");
		BE_PARTDSEQUENCE_TABLE = By.xpath("//*[@class='ui-datatable ui-widget custom-dt partd-sequence-dt']");
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Benefits & Eligibility Part D Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void clickOnPartDLink() throws Throwable{
		utils.ClickOnLink(BE_PARTD_LINK);
		utils.GetBusyStatus();
	}
	
	public void waitUntillPartD() throws Throwable{
		utils.CheckElementPresenceByLocator(BE_PARTDCMS_TABLE);
		Thread.sleep(1000);
	}
	
	// CMS
	
	public void BenefitsEligibility_PartD_MemberSSN(String strCMSMemberSSN) throws Throwable{
		actBEPartDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_PARTDCMS_TABLE,strCMSMemberSSN));
	}
	
	public void BenefitsEligibility_PartD_SpouseSSN(String strCMSSpouseSSN) throws Throwable{
		actBEPartDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_PARTDCMS_TABLE,strCMSSpouseSSN));
	}
	
	public void BenefitsEligibility_PartD_HealthInsuranceClaimNo(String strCMSHealthInsClaimNo) throws Throwable{
		actBEPartDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_PARTDCMS_TABLE,strCMSHealthInsClaimNo));
	}
	
	public void BenefitsEligibility_PartD_RailroadBenefitNumber(String strCMSRRBenefitNumber) throws Throwable{
		actBEPartDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_PARTDCMS_TABLE,strCMSRRBenefitNumber));
	}
	
	public void BenefitsEligibility_PartD_MaritalStatus(String strCMSMaritalStatus) throws Throwable{
		actBEPartDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_PARTDCMS_TABLE,strCMSMaritalStatus));
	}
	
	public void BenefitsEligibility_PartD_Income(String strCMSIncome) throws Throwable{
		actBEPartDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_PARTDCMS_TABLE,strCMSIncome));
	}
	
	public void BenefitsEligibility_PartD_MedicaidID(String strCMSMedicaidID) throws Throwable{
		actBEPartDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_PARTDCMS_TABLE,strCMSMedicaidID));
	}
	
	// CMS Dates
	
	public void BenefitsEligibility_PartD_CMSDatesStart(String strCMSDatesStart) throws Throwable{
		actBEPartDDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_PARTDCMSDATES_TABLE,strCMSDatesStart));
	}
	
	public void BenefitsEligibility_PartD_CMSDatesEnd(String strCMSDatesEnd) throws Throwable{
		actBEPartDDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_PARTDCMSDATES_TABLE,strCMSDatesEnd));
	}
	
	// Part D Program
		
	public void BenefitsEligibility_PartD_PartDProgramType(String strPartDProgramType) throws Throwable{
		actBEPartDDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_PARTDPROGRAM_TABLE,strPartDProgramType));
	}
	
	public void BenefitsEligibility_PartD_PartDProgramValue(String strPartDProgramValue) throws Throwable{
		actBEPartDDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_PARTDPROGRAM_TABLE,strPartDProgramValue));
	}
	
	public void BenefitsEligibility_PartD_PartDProgramStatus(String strPartDProgramStatus) throws Throwable{
		actBEPartDDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_PARTDPROGRAM_TABLE,strPartDProgramStatus));
	}
	
	public void BenefitsEligibility_PartD_PartDProgramConractID(String strPartDProgramConractID) throws Throwable{
		actBEPartDDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_PARTDPROGRAM_TABLE,strPartDProgramConractID));
	}
	
	public void BenefitsEligibility_PartD_PartDProgramIndicator(String strPartDProgramIndicator) throws Throwable{
		actBEPartDDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_PARTDPROGRAM_TABLE,strPartDProgramIndicator));
	}
	
	public void BenefitsEligibility_PartD_PartDProgramStart(String strPartDProgramStart) throws Throwable{
		actBEPartDDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_PARTDPROGRAM_TABLE,strPartDProgramStart));
	}
	
	public void BenefitsEligibility_PartD_PartDProgramEnd(String strPartDProgramEnd) throws Throwable{
		actBEPartDDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_PARTDPROGRAM_TABLE,strPartDProgramEnd));
	}
	
	public void BenefitsEligibility_PartD_PartDProgramPorcDate(String strPartDProgramPorcDate) throws Throwable{
		actBEPartDDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_PARTDPROGRAM_TABLE,strPartDProgramPorcDate));
	}
	
	// Part D Sequence
	
	public void BenefitsEligibility_PartD_PartDSType(String strPartDSType) throws Throwable{
		actBEPartDDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_PARTDSEQUENCE_TABLE,strPartDSType));
	}
	
	public void BenefitsEligibility_PartD_PartDSRxTypeCode(String strPartDSRxTypeCode) throws Throwable{
		actBEPartDDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_PARTDSEQUENCE_TABLE,strPartDSRxTypeCode));
	}
	
	public void BenefitsEligibility_PartD_PartDSRxGroupID(String strPartDSRxGroupID) throws Throwable{
		actBEPartDDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_PARTDSEQUENCE_TABLE,strPartDSRxGroupID));
	}
	
	public void BenefitsEligibility_PartD_PartDSRxBIN(String strPartDSRxBIN) throws Throwable{
		actBEPartDDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_PARTDSEQUENCE_TABLE,strPartDSRxBIN));
	}
	
	public void BenefitsEligibility_PartD_PartDSRxPCN(String strPartDSRxPCN) throws Throwable{
		actBEPartDDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_PARTDSEQUENCE_TABLE,strPartDSRxPCN));
	}
	
	public void BenefitsEligibility_PartD_PartDSRxMemberID(String strPartDSRxMemberID) throws Throwable{
		actBEPartDDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_PARTDSEQUENCE_TABLE,strPartDSRxMemberID));
	}
	
	public void BenefitsEligibility_PartD_PartDSRxPersonCode(String strPartDSRxPersonCode) throws Throwable{
		actBEPartDDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_PARTDSEQUENCE_TABLE,strPartDSRxPersonCode));
	}
	
	public void BenefitsEligibility_PartD_PartDSRxHelpDesk(String strPartDSRxHelpDesk) throws Throwable{
		actBEPartDDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_PARTDSEQUENCE_TABLE,strPartDSRxHelpDesk));
	}
	
	public void BenefitsEligibility_PartD_PartDSStart(String strPartDSStart) throws Throwable{
		actBEPartDDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_PARTDSEQUENCE_TABLE,strPartDSStart));
	}
	
	public void BenefitsEligibility_PartD_PartDSEnd(String strPartDSEnd) throws Throwable{
		actBEPartDDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_PARTDSEQUENCE_TABLE,strPartDSEnd));
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Benefits & Eligibility Part D Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
