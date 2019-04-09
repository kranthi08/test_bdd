package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages.PharmacyLookup_BenefitsEligibility_PartDSelector;

public class PharmacyLookup_BenefitsEligibility_PartD_Steps {

	PharmacyLookup_BenefitsEligibility_PartDSelector pharmacyLookup_BenefitsEligibility_PartDSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expBEPartDDetails = new ArrayList<String>();
	public SoftAssert partDDetailsSoft = new SoftAssert();
	
	public PharmacyLookup_BenefitsEligibility_PartD_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		pharmacyLookup_BenefitsEligibility_PartDSelector = new PharmacyLookup_BenefitsEligibility_PartDSelector(SharedResource,utils);
	}
	
	public void clickOnPartD() throws Throwable{
		pharmacyLookup_BenefitsEligibility_PartDSelector.clickOnPartDLink();
	}
	
	public void verifyPartDDetails(Map<String,String> partDDetails)throws Throwable {
		String strCMSMemberSSN = partDDetails.get("CMSMemberSSN");
		String strCMSSpouseSSN = partDDetails.get("CMSSpouseSSN");		
		String strCMSHealthInsClaimNo = partDDetails.get("CMSHealthInsClaimNo");
		String strCMSRRBenefitNumber = partDDetails.get("CMSRRBenefitNumber");
		String strCMSMaritalStatus = partDDetails.get("CMSMaritalStatus");		
		String strCMSIncome = partDDetails.get("CMSIncome");
		String strCMSMedicaidID = partDDetails.get("CMSMedicaidID");
		String strCMSDatesStart = partDDetails.get("CMSDatesStart");		
		String strCMSDatesEnd = partDDetails.get("CMSDatesEnd");
		String strPartDProgramType = partDDetails.get("PartDProgramType");
		String strPartDProgramValue = partDDetails.get("PartDProgramValue");		
		String strPartDProgramStatus = partDDetails.get("PartDProgramStatus");
		String strPartDProgramConractID = partDDetails.get("PartDProgramConractID");
		String strPartDProgramIndicator = partDDetails.get("PartDProgramIndicator");		
		String strPartDProgramStart = partDDetails.get("PartDProgramStart");
		String strPartDProgramEnd = partDDetails.get("PartDProgramEnd");
		String strPartDProgramPorcDate = partDDetails.get("PartDProgramPorcDate");		
		String strPartDSType = partDDetails.get("PartDSType");
		String strPartDSRxTypeCode = partDDetails.get("PartDSRxTypeCode");
		String strPartDSRxGroupID = partDDetails.get("PartDSRxGroupID");		
		String strPartDSRxBIN = partDDetails.get("PartDSRxBIN");
		String strPartDSRxPCN = partDDetails.get("PartDSRxPCN");
		String strPartDSRxMemberID = partDDetails.get("PartDSRxMemberID");		
		String strPartDSRxPersonCode = partDDetails.get("PartDSRxPersonCode");
		String strPartDSRxHelpDesk = partDDetails.get("PartDSRxHelpDesk");		
		String strPartDSStart = partDDetails.get("PartDSStart");
		String strPartDSEnd = partDDetails.get("PartDSEnd");
				
		expBEPartDDetails.add(strCMSMemberSSN);
		expBEPartDDetails.add(strCMSSpouseSSN);
		expBEPartDDetails.add(strCMSHealthInsClaimNo);
		expBEPartDDetails.add(strCMSRRBenefitNumber);
		expBEPartDDetails.add(strCMSMaritalStatus);
		expBEPartDDetails.add(strCMSIncome);
		expBEPartDDetails.add(strCMSMedicaidID);
		expBEPartDDetails.add(strCMSDatesStart);
		expBEPartDDetails.add(strCMSDatesEnd);
		expBEPartDDetails.add(strPartDProgramType);
		expBEPartDDetails.add(strPartDProgramValue);
		expBEPartDDetails.add(strPartDProgramStatus);
		expBEPartDDetails.add(strPartDProgramConractID);
		expBEPartDDetails.add(strPartDProgramIndicator);
		expBEPartDDetails.add(strPartDProgramStart);
		expBEPartDDetails.add(strPartDProgramEnd);
		expBEPartDDetails.add(strPartDProgramPorcDate);
		expBEPartDDetails.add(strPartDSType);
		expBEPartDDetails.add(strPartDSRxTypeCode);
		expBEPartDDetails.add(strPartDSRxGroupID);
		expBEPartDDetails.add(strPartDSRxBIN);
		expBEPartDDetails.add(strPartDSRxPCN);
		expBEPartDDetails.add(strPartDSRxMemberID);
		expBEPartDDetails.add(strPartDSRxPersonCode);
		expBEPartDDetails.add(strPartDSRxHelpDesk);
		expBEPartDDetails.add(strPartDSStart);
		expBEPartDDetails.add(strPartDSEnd);
		
		pharmacyLookup_BenefitsEligibility_PartDSelector.waitUntillPartD();
		pharmacyLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_MemberSSN(strCMSMemberSSN);
		pharmacyLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_SpouseSSN(strCMSSpouseSSN);
		pharmacyLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_HealthInsuranceClaimNo(strCMSHealthInsClaimNo);
		pharmacyLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_RailroadBenefitNumber(strCMSRRBenefitNumber);
		pharmacyLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_MaritalStatus(strCMSMaritalStatus);
		pharmacyLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_Income(strCMSIncome);
		pharmacyLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_MedicaidID(strCMSMedicaidID);
		pharmacyLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_CMSDatesStart(strCMSDatesStart);
		pharmacyLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_CMSDatesEnd(strCMSDatesEnd);
		pharmacyLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDProgramType(strPartDProgramType);
		pharmacyLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDProgramValue(strPartDProgramValue);
		pharmacyLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDProgramStatus(strPartDProgramStatus);
		pharmacyLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDProgramConractID(strPartDProgramConractID);
		pharmacyLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDProgramIndicator(strPartDProgramIndicator);
		pharmacyLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDProgramStart(strPartDProgramStart);
		pharmacyLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDProgramEnd(strPartDProgramEnd);
		pharmacyLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDProgramPorcDate(strPartDProgramPorcDate);
		pharmacyLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDSType(strPartDSType);
		pharmacyLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDSRxTypeCode(strPartDSRxTypeCode);
		pharmacyLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDSRxGroupID(strPartDSRxGroupID);
		pharmacyLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDSRxBIN(strPartDSRxBIN);
		pharmacyLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDSRxPCN(strPartDSRxPCN);
		pharmacyLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDSRxMemberID(strPartDSRxMemberID);
		pharmacyLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDSRxPersonCode(strPartDSRxPersonCode);
		pharmacyLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDSRxHelpDesk(strPartDSRxHelpDesk);
		pharmacyLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDSStart(strPartDSStart);
		pharmacyLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDSEnd(strPartDSEnd);
					
		for(int i=0;i<expBEPartDDetails.size();i++)
		{
			partDDetailsSoft.assertEquals(pharmacyLookup_BenefitsEligibility_PartDSelector.actBEPartDDetails.get(i), expBEPartDDetails.get(i));
		}		
		partDDetailsSoft.assertAll();
	}
}

