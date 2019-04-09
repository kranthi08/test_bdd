package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class PharmacyLookup_Claim_DrugInformationSelector {

	private By DRUG_INFORMATION_LINK,DRUG_INDICATORS_CLASSES_TABLE,DOSING_ROUTE_TABLE;	 
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actDrugInformation = new ArrayList<String>();
 
	public PharmacyLookup_Claim_DrugInformationSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		PharmacyLookup_Claim_DrugInformation_Objects();
	}
	
	private void PharmacyLookup_Claim_DrugInformation_Objects()
	{		
		DRUG_INFORMATION_LINK = By.linkText("Drug Information");
		DRUG_INDICATORS_CLASSES_TABLE = By.xpath("//table[@class='claim-drug-info-tbls claim-drug-indicators-tbl']");	
		DOSING_ROUTE_TABLE = By.xpath("//table[@class='claim-drug-info-tbls claim-drug-dosing-tbl']"); 	 		 
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Drug Information~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	
	// Drug Indicators Drug Classes
	
	public void PharmacyLookup_Claim_clickOnDrugInformation() throws Throwable{
		utils.ClickOnLink(DRUG_INFORMATION_LINK);
		Thread.sleep(1000);
	}
	
	public void waitUnitillDrugInformationDetails() throws Throwable{
		utils.CheckElementPresenceByLocator(DRUG_INDICATORS_CLASSES_TABLE);
		Thread.sleep(1000);
	}
	
	public void Claim_DrugInformation_GenericIndicator(String strGenericIndicator) throws Throwable{
		actDrugInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_INDICATORS_CLASSES_TABLE,strGenericIndicator));
	}
	 
	public void Claim_DrugInformation_GenericPriceInedicator(String strGenericPriceInedicator) throws Throwable{
		actDrugInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_INDICATORS_CLASSES_TABLE,strGenericPriceInedicator));
	}
	
	public void Claim_DrugInformation_GCN(String strGCN) throws Throwable{
		actDrugInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_INDICATORS_CLASSES_TABLE,strGCN));
	}
	
	public void Claim_DrugInformation_GCNSequenceNumber(String strGCNSequenceNumber) throws Throwable{
		actDrugInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_INDICATORS_CLASSES_TABLE,strGCNSequenceNumber));
	}
	
	public void Claim_DrugInformation_MEDID(String strMEDID) throws Throwable{
		actDrugInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_INDICATORS_CLASSES_TABLE,strMEDID));
	}
	
	public void Claim_DrugInformation_HICLSequenceNumber(String strHICLSequenceNumber) throws Throwable{
		actDrugInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_INDICATORS_CLASSES_TABLE,strHICLSequenceNumber));
	}
	
	public void Claim_DrugInformation_AHFSCode(String strAHFSCode) throws Throwable{
		actDrugInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_INDICATORS_CLASSES_TABLE,strAHFSCode));
	}
	
	public void Claim_DrugInformation_DEACode(String strDEACode) throws Throwable{
		actDrugInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_INDICATORS_CLASSES_TABLE,strDEACode));
	}
	
	public void Claim_DrugInformation_Manufacturer(String strManufacturer) throws Throwable{
		actDrugInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_INDICATORS_CLASSES_TABLE,strManufacturer));
	}
	
	public void Claim_DrugInformation_GenericTherapeuticClass(String strGenericTherapeuticClass) throws Throwable{
		actDrugInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_INDICATORS_CLASSES_TABLE,strGenericTherapeuticClass));
	}
	
	public void Claim_DrugInformation_StandardTherapeuticClass(String strStandardTherapeuticClass) throws Throwable{
		actDrugInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_INDICATORS_CLASSES_TABLE,strStandardTherapeuticClass));
	}
	
	public void Claim_DrugInformation_SpecificTherapeuticClass(String strSpecificTherapeuticClass) throws Throwable{
		actDrugInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_INDICATORS_CLASSES_TABLE,strSpecificTherapeuticClass));
	}
	
	public void Claim_DrugInformation_EnhancedTherapeuticClass(String strEnhancedTherapeuticClass) throws Throwable{
		actDrugInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_INDICATORS_CLASSES_TABLE,strEnhancedTherapeuticClass));
	}
	
	public void Claim_DrugInformation_DrugClass(String DrugClass) throws Throwable{
		actDrugInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_INDICATORS_CLASSES_TABLE,DrugClass));
	}
	
	public void Claim_DrugInformation_DrugCategory(String strDrugCategory) throws Throwable{
		actDrugInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_INDICATORS_CLASSES_TABLE,strDrugCategory));
	}
	
	public void Claim_DrugInformation_RxCUI(String strRxCUI) throws Throwable{
		actDrugInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_INDICATORS_CLASSES_TABLE,strRxCUI));
	}
	
	public void Claim_DrugInformation_OrangeBookIndicator(String strOrangeBookIndicator) throws Throwable{
		actDrugInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_INDICATORS_CLASSES_TABLE,strOrangeBookIndicator));
	}
	
	public void Claim_DrugInformation_NDCMaintenanceIndicator(String strNDCMaintenanceIndicator) throws Throwable{
		actDrugInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(DRUG_INDICATORS_CLASSES_TABLE,strNDCMaintenanceIndicator));
	}
	
	// Dosing Route 
	
	public void Claim_DrugInformation_DosageStrength(String strDosageStrength) throws Throwable{
		actDrugInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(DOSING_ROUTE_TABLE,strDosageStrength));
	}
	
	public void Claim_DrugInformation_DosageFormCode(String strDosageFormCode) throws Throwable{
		actDrugInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(DOSING_ROUTE_TABLE,strDosageFormCode));
	}
	
	public void Claim_DrugInformation_UnitOfMeasure(String strUnitOfMeasure) throws Throwable{
		actDrugInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(DOSING_ROUTE_TABLE,strUnitOfMeasure));
	}
	
	public void Claim_DrugInformation_PackageSize(String strPackageSize) throws Throwable{
		actDrugInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(DOSING_ROUTE_TABLE,strPackageSize));
	}
	
	public void Claim_DrugInformation_RouteCode(String strRouteCode) throws Throwable{
		actDrugInformation.add(utils.RxNovaConnect_WebTable_VerifyRowData(DOSING_ROUTE_TABLE,strRouteCode));
	}
		 
	 	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Drug Information~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
}
	
	