package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class PharmacyLookup_Reimbursement_ResultsSelector {

	private By REIMBURSEMENT_PAID_TABLE,REIMBURSEMENT_PAYEEINFO_TABLE,REIMBURSEMENT_PAYMENTINFO_TABLE;
	private By REIMBURSEMENT_COMMENTS_TABLE,REIMBURSEMENT_CLAIMS_TABLE;
	private By REIMBURSEMENT_AWP_TABLE,REIMBURSEMENT_DENIED_TABLE;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actReimbursementResults = new ArrayList<String>();
	
	public PharmacyLookup_Reimbursement_ResultsSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		PharmacyLookup_Reimbursement_Results_Objects();
	}
	
	private void PharmacyLookup_Reimbursement_Results_Objects()
	{		
		REIMBURSEMENT_PAID_TABLE = By.id("reimbursementForm:reimbursementAccordionPanel:reimbursementTable");
		REIMBURSEMENT_PAYEEINFO_TABLE = By.xpath("//*[@class='fl custom-tbls payee-info-tbl']");
		REIMBURSEMENT_PAYMENTINFO_TABLE = By.xpath("//*[@class='fl custom-tbls payment-info-tbl']");
		REIMBURSEMENT_COMMENTS_TABLE = By.xpath("//*[@class='fl custom-tbls reim-comments-tbl']");
		REIMBURSEMENT_CLAIMS_TABLE = By.xpath("//*[@id='reimbursementForm:reimbursementAccordionPanel:reimbursementPaidDetail']/div[2]/table");
		REIMBURSEMENT_AWP_TABLE =By.xpath("//*[@id='reimbursementForm:reimbursementAccordionPanel']/div[2]//table");
		REIMBURSEMENT_DENIED_TABLE = By.xpath("//*[@id='reimbursementForm:reimbursementAccordionPanel']/div[3]//table");
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Reimbursement Results Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	// Reimbursement - Paid
	
	public void Reimbursement_Paid_Account(String strRPAccount) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(REIMBURSEMENT_PAID_TABLE,strRPAccount));
	}
	
	public void Reimbursement_Paid_Payment(String strRPPayment) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(REIMBURSEMENT_PAID_TABLE,strRPPayment));
	}
	
	public void Reimbursement_Paid_Status(String strRPStatus) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(REIMBURSEMENT_PAID_TABLE,strRPStatus));
	}
	
	public void Reimbursement_Paid_PaymentDate(String strRPPaymentDate) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(REIMBURSEMENT_PAID_TABLE,strRPPaymentDate));
	}
	
	public void Reimbursement_Paid_FinancialDate(String strRPFinancialDate) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(REIMBURSEMENT_PAID_TABLE,strRPFinancialDate));
	}
	
	public void Reimbursement_Paid_Replacement(String strRPReplacement) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(REIMBURSEMENT_PAID_TABLE,strRPReplacement));
	}
	
	public void Reimbursement_Paid_OriginalPayment(String strRPOriginalPayment) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(REIMBURSEMENT_PAID_TABLE,strRPOriginalPayment));
	}
	
	public void Reimbursement_Paid_Amount(String strRPAmount) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(REIMBURSEMENT_PAID_TABLE,strRPAmount));
	}
	
	// Payee Information
	
	public void Reimbursement_PayeeInfo_Name(String strRPName) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(REIMBURSEMENT_PAYEEINFO_TABLE,strRPName));
	}
	
	public void Reimbursement_PayeeInfo_Address(String strRPAddress) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(REIMBURSEMENT_PAYEEINFO_TABLE,strRPAddress));
	}
	
	public void Reimbursement_PayeeInfo_City(String strRPCity) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(REIMBURSEMENT_PAYEEINFO_TABLE,strRPCity));
	}
	
	public void Reimbursement_PayeeInfo_State(String strRPState) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(REIMBURSEMENT_PAYEEINFO_TABLE,strRPState));
	}
	
	public void Reimbursement_PayeeInfo_Zip(String strRPZip) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(REIMBURSEMENT_PAYEEINFO_TABLE,strRPZip));
	}
	
	// Payment Information
	
	public void Reimbursement_PaymntInfo_ReasonCode(String strRPReasonCode) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(REIMBURSEMENT_PAYMENTINFO_TABLE,strRPReasonCode));
	}
	
	public void Reimbursement_PaymntInfo_PaymentAmount(String strRPPIPaymentAmount) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(REIMBURSEMENT_PAYMENTINFO_TABLE,strRPPIPaymentAmount));
	}
	
	public void Reimbursement_PaymntInfo_PaymentDate(String strRPPaymentDate) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(REIMBURSEMENT_PAYMENTINFO_TABLE,strRPPaymentDate));
	}
	
	public void Reimbursement_PaymntInfo_ClearedAmount(String strRPClearedAmount) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(REIMBURSEMENT_PAYMENTINFO_TABLE,strRPClearedAmount));
	}
	
	public void Reimbursement_PaymntInfo_ClearedDate(String strRPClearedDate) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(REIMBURSEMENT_PAYMENTINFO_TABLE,strRPClearedDate));
	}
	
	public void Reimbursement_PaymntInfo_Variance(String strRPVariance) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(REIMBURSEMENT_PAYMENTINFO_TABLE,strRPVariance));
	}
	
	public void Reimbursement_PaymntInfo_VoidDate(String strRPVoidDate) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifyRowData(REIMBURSEMENT_PAYMENTINFO_TABLE,strRPVoidDate));
	}
	
	// Comments
	
	public void Reimbursement_Comments_Comment(String strRPComment) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifyColumnData(REIMBURSEMENT_COMMENTS_TABLE,strRPComment));
	}
	
	// Claims
	
	public void Reimbursement_Claims_FillDate(String strRPFillDate) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(REIMBURSEMENT_CLAIMS_TABLE,strRPFillDate));
	}
	
	public void Reimbursement_Claims_LabelName(String strRPLabelName) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(REIMBURSEMENT_CLAIMS_TABLE,strRPLabelName));
	}
	
	public void Reimbursement_Claims_ClaimStatus(String strRPClaimStatus) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(REIMBURSEMENT_CLAIMS_TABLE,strRPClaimStatus));
	}
	
	public void Reimbursement_Claims_PharmacyName(String strRPPharmacyName) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(REIMBURSEMENT_CLAIMS_TABLE,strRPPharmacyName));
	}
	
	// Reimbursements - Approved and Waiting Payment
	
	public void Reimbursement_AWP_FillDate(String strRAWPFillDate) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(REIMBURSEMENT_AWP_TABLE,strRAWPFillDate));
	}
	
	public void Reimbursement_AWP_LabelName(String strRAWPLabelName) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(REIMBURSEMENT_AWP_TABLE,strRAWPLabelName));
	}
	
	public void Reimbursement_AWP_ClaimStatus(String strRAWPClaimStatus) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(REIMBURSEMENT_AWP_TABLE,strRAWPClaimStatus));
	}
	
	public void Reimbursement_AWP_PharmacyName(String strRAWPPharmacyName) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(REIMBURSEMENT_AWP_TABLE,strRAWPPharmacyName));
	}
	
	// Reimbursements - Denied
	
	public void Reimbursement_Denied_FillDate(String strRDFillDate) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(REIMBURSEMENT_DENIED_TABLE,strRDFillDate));
	}
	
	public void Reimbursement_Denied_LabelName(String strRDLabelName) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(REIMBURSEMENT_DENIED_TABLE,strRDLabelName));
	}
	
	public void Reimbursement_Denied_ClaimStatus(String strRDClaimStatus) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(REIMBURSEMENT_DENIED_TABLE,strRDClaimStatus));
	}
	
	public void Reimbursement_Denied_PharmacyName(String strRDPharmacyName) throws Throwable{
		actReimbursementResults.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(REIMBURSEMENT_DENIED_TABLE,strRDPharmacyName));
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Reimbursement Results Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
