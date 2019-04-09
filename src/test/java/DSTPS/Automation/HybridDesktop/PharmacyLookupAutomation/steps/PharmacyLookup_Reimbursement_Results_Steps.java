package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages.PharmacyLookup_Reimbursement_ResultsSelector;

public class PharmacyLookup_Reimbursement_Results_Steps {

	PharmacyLookup_Reimbursement_ResultsSelector pharmacyLookup_Reimbursement_ResultsSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expReimbursementResults = new ArrayList<String>();
	public SoftAssert reimbResultsSoft = new SoftAssert();
	
	public PharmacyLookup_Reimbursement_Results_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		pharmacyLookup_Reimbursement_ResultsSelector = new PharmacyLookup_Reimbursement_ResultsSelector(SharedResource,utils);
	}
	
	public void verifyReimbursementResults(Map<String,String> reimbursementResults)throws Throwable {
		String strRPAccount = reimbursementResults.get("RPAccount");
		String strRPPayment = reimbursementResults.get("RPPayment");		
		String strRPPaymentDate = reimbursementResults.get("RPPaymentDate");
		String strRPFinancialDate = reimbursementResults.get("RPFinancialDate");
		String strRPOriginalPayment = reimbursementResults.get("RPOriginalPayment");
		String strRPAmount = reimbursementResults.get("RPAmount");
		String strRPName = reimbursementResults.get("RPName");
		String strRPAddress = reimbursementResults.get("RPAddress");
		String strRPCity = reimbursementResults.get("RPCity");
		String strRPState = reimbursementResults.get("RPState");
		String strRPZip = reimbursementResults.get("RPZip");
		String strRPReasonCode = reimbursementResults.get("RPReasonCode");
		String strRPPaymentAmount = reimbursementResults.get("RPPaymentAmount");
		String strRPPIPaymentDate = reimbursementResults.get("RPPIPaymentDate");
		String strRPClearedAmount = reimbursementResults.get("RPClearedAmount");
		String strRPClearedDate = reimbursementResults.get("RPClearedDate");
		String strRPVariance = reimbursementResults.get("RPVariance");
		String strRPVoidDate = reimbursementResults.get("RPVoidDate");
		String strRPComment = reimbursementResults.get("RPComments");
		String strRPFillDate = reimbursementResults.get("RPFillDate");
		String strRPLabelName = reimbursementResults.get("RPLabelName");
		String strRPClaimStatus = reimbursementResults.get("RPClaimStatus");
		String strRPPharmacyName = reimbursementResults.get("RPPharmacyName");
		String strRAWPFillDate = reimbursementResults.get("RAWPFillDate");
		String strRAWPLabelName = reimbursementResults.get("RAWPLabelName");
		String strRAWPClaimStatus = reimbursementResults.get("RAWPClaimStatus");
		String strRAWPPharmacyName = reimbursementResults.get("RAWPPharmacyName");
		String strRDFillDate = reimbursementResults.get("RDFillDate");
		String strRDLabelName = reimbursementResults.get("RDLabelName");
		String strRDClaimStatus = reimbursementResults.get("RDClaimStatus");
		String strRDPharmacyName = reimbursementResults.get("RDPharmacyName");
		
		
		expReimbursementResults.add(strRPAccount);
		expReimbursementResults.add(strRPPayment);
		expReimbursementResults.add(strRPPaymentDate);
		expReimbursementResults.add(strRPFinancialDate);
		expReimbursementResults.add(strRPOriginalPayment);
		expReimbursementResults.add(strRPAmount);
		expReimbursementResults.add(strRPName);
		expReimbursementResults.add(strRPAddress);
		expReimbursementResults.add(strRPCity);
		expReimbursementResults.add(strRPState);
		expReimbursementResults.add(strRPZip);
		expReimbursementResults.add(strRPReasonCode);
		expReimbursementResults.add(strRPPaymentAmount);
		expReimbursementResults.add(strRPPIPaymentDate);
		expReimbursementResults.add(strRPClearedAmount);
		expReimbursementResults.add(strRPClearedDate);
		expReimbursementResults.add(strRPVariance);
		expReimbursementResults.add(strRPVoidDate);
		expReimbursementResults.add(strRPComment);
		expReimbursementResults.add(strRPFillDate);
		expReimbursementResults.add(strRPLabelName);
		expReimbursementResults.add(strRPClaimStatus);
		expReimbursementResults.add(strRPPharmacyName);
		expReimbursementResults.add(strRAWPFillDate);
		expReimbursementResults.add(strRAWPLabelName);
		expReimbursementResults.add(strRAWPClaimStatus);
		expReimbursementResults.add(strRAWPPharmacyName);
		expReimbursementResults.add(strRDFillDate);
		expReimbursementResults.add(strRDLabelName);
		expReimbursementResults.add(strRDClaimStatus);
		expReimbursementResults.add(strRDPharmacyName);
		
		pharmacyLookup_Reimbursement_ResultsSelector.Reimbursement_Paid_Account(strRPAccount);
		pharmacyLookup_Reimbursement_ResultsSelector.Reimbursement_Paid_Payment(strRPPayment);
		pharmacyLookup_Reimbursement_ResultsSelector.Reimbursement_Paid_PaymentDate(strRPPaymentDate);
		pharmacyLookup_Reimbursement_ResultsSelector.Reimbursement_Paid_FinancialDate(strRPFinancialDate);
		pharmacyLookup_Reimbursement_ResultsSelector.Reimbursement_Paid_OriginalPayment(strRPOriginalPayment);
		pharmacyLookup_Reimbursement_ResultsSelector.Reimbursement_Paid_Amount(strRPAmount);
		pharmacyLookup_Reimbursement_ResultsSelector.Reimbursement_PayeeInfo_Name(strRPName);
		pharmacyLookup_Reimbursement_ResultsSelector.Reimbursement_PayeeInfo_Address(strRPAddress);
		pharmacyLookup_Reimbursement_ResultsSelector.Reimbursement_PayeeInfo_City(strRPCity);
		pharmacyLookup_Reimbursement_ResultsSelector.Reimbursement_PayeeInfo_State(strRPState);
		pharmacyLookup_Reimbursement_ResultsSelector.Reimbursement_PayeeInfo_Zip(strRPZip);
		pharmacyLookup_Reimbursement_ResultsSelector.Reimbursement_PaymntInfo_ReasonCode(strRPReasonCode);
		pharmacyLookup_Reimbursement_ResultsSelector.Reimbursement_PaymntInfo_PaymentAmount(strRPPaymentAmount);
		pharmacyLookup_Reimbursement_ResultsSelector.Reimbursement_PaymntInfo_PaymentDate(strRPPIPaymentDate);
		pharmacyLookup_Reimbursement_ResultsSelector.Reimbursement_PaymntInfo_ClearedAmount(strRPClearedAmount);
		pharmacyLookup_Reimbursement_ResultsSelector.Reimbursement_PaymntInfo_ClearedDate(strRPClearedDate);
		pharmacyLookup_Reimbursement_ResultsSelector.Reimbursement_PaymntInfo_Variance(strRPVariance);
		pharmacyLookup_Reimbursement_ResultsSelector.Reimbursement_PaymntInfo_VoidDate(strRPVoidDate);
		pharmacyLookup_Reimbursement_ResultsSelector.Reimbursement_Comments_Comment(strRPComment);
		pharmacyLookup_Reimbursement_ResultsSelector.Reimbursement_Claims_FillDate(strRPFillDate);
		pharmacyLookup_Reimbursement_ResultsSelector.Reimbursement_Claims_LabelName(strRPLabelName);
		pharmacyLookup_Reimbursement_ResultsSelector.Reimbursement_Claims_ClaimStatus(strRPClaimStatus);
		pharmacyLookup_Reimbursement_ResultsSelector.Reimbursement_Claims_PharmacyName(strRPPharmacyName);
		pharmacyLookup_Reimbursement_ResultsSelector.Reimbursement_AWP_FillDate(strRAWPFillDate);
		pharmacyLookup_Reimbursement_ResultsSelector.Reimbursement_AWP_LabelName(strRAWPLabelName);
		pharmacyLookup_Reimbursement_ResultsSelector.Reimbursement_AWP_ClaimStatus(strRAWPClaimStatus);
		pharmacyLookup_Reimbursement_ResultsSelector.Reimbursement_AWP_PharmacyName(strRAWPPharmacyName);
		pharmacyLookup_Reimbursement_ResultsSelector.Reimbursement_Denied_FillDate(strRDFillDate);
		pharmacyLookup_Reimbursement_ResultsSelector.Reimbursement_Denied_LabelName(strRDLabelName);
		pharmacyLookup_Reimbursement_ResultsSelector.Reimbursement_Denied_ClaimStatus(strRDClaimStatus);
		pharmacyLookup_Reimbursement_ResultsSelector.Reimbursement_Denied_PharmacyName(strRDPharmacyName);
		
		for(int i=0;i<expReimbursementResults.size();i++)
		{
			reimbResultsSoft.assertEquals(pharmacyLookup_Reimbursement_ResultsSelector.actReimbursementResults.get(i), expReimbursementResults.get(i));
		}		
		reimbResultsSoft.assertAll();
	}	
}

