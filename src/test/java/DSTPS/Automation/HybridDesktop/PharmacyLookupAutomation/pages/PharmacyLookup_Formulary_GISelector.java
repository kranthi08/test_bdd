package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class PharmacyLookup_Formulary_GISelector {

	private By GENERALINFORMATION_LINK,FORMULARY_GI_GENERAL_TABLE;
	private By FORMULARY_GI_TC_TABLE,FORMULARY_GI_AHFSTC_TABLE,FORMULARY_GI_ETC_TABLE;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actFormularyGenInfoDetails = new ArrayList<String>();
	
	public PharmacyLookup_Formulary_GISelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		PharmacyLookup_Formulary_GI_Objects();
	}
	
	private void PharmacyLookup_Formulary_GI_Objects()
	{		
		GENERALINFORMATION_LINK = By.linkText("General Information");
		FORMULARY_GI_GENERAL_TABLE = By.id("formularyForm:formularyAccordionPanel:generalPanel");
		FORMULARY_GI_TC_TABLE = By.id("formularyForm:formularyAccordionPanel:therapeuticClassPanel");
		FORMULARY_GI_AHFSTC_TABLE = By.id("formularyForm:formularyAccordionPanel:AHFSTherapeuticClassTable");
		FORMULARY_GI_ETC_TABLE = By.id("formularyForm:formularyAccordionPanel:EnhancedTherapeuticClassTable");
	}                         
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Formulary General Information Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void Formulary_clickOnGeneralInformation() throws Throwable{
		utils.ClickOnLink(GENERALINFORMATION_LINK);
		utils.GetBusyStatus();
	}
	
	public void waitUntillGeneralInformation() throws Throwable{
		utils.CheckElementPresenceByLocator(FORMULARY_GI_GENERAL_TABLE);
		Thread.sleep(1000);
	}
	
	// General
	
	public void Formulary_GI_NDC(String strNDC) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strNDC));
	}
	
	public void Formulary_GI_LabelName(String strLabelName) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strLabelName));
	}
	
	public void Formulary_GI_BrandName(String strBrandName) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strBrandName));
	}
	
	public void Formulary_GI_GenericName(String strGenericName) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strGenericName));
	}
	
	public void Formulary_GI_Strength(String strStrength) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strStrength));
	}
	
	public void Formulary_GI_DosageForm(String strDosageForm) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strDosageForm));
	}
	
	public void Formulary_GI_MEDID(String strMEDID) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strMEDID));
	}
	
	public void Formulary_GI_Route(String strRoute) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strRoute));
	}
	
	public void Formulary_GI_DrugForm(String strDrugForm) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strDrugForm));
	}
	
	public void Formulary_GI_DrugClass(String strDrugClass) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strDrugClass));
	}
	
	public void Formulary_GI_DEACode(String strDEACode) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strDEACode));
	}
	
	public void Formulary_GI_DesiDrug(String strDesiDrug) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strDesiDrug));
	}
	
	public void Formulary_GI_GenderSpecific(String strGenderSpecific) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strGenderSpecific));
	}
	
	public void Formulary_GI_GCN(String strGCN) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strGCN));
	}
	
	public void Formulary_GI_GCNSeqNumber(String strGCNSeqNumber) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strGCNSeqNumber));
	}
	
	public void Formulary_GI_HICLSeqNumber(String strHICLSeqNumber) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strHICLSeqNumber));
	}
	
	public void Formulary_GI_Manufacturer(String strManufacturer) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strManufacturer));
	}
	
	public void Formulary_GI_MaintenanceDrug(String strMaintenanceDrug) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strMaintenanceDrug));
	}
	
	public void Formulary_GI_GI(String strGI) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strGI));
	}
	
	public void Formulary_GI_GPI(String strGPI) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strGPI));
	}
	
	public void Formulary_GI_GenericAvailable(String strGenericAvailable) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strGenericAvailable));
	}
	
	public void Formulary_GI_OTCAvailable(String strOTCAvailable) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strOTCAvailable));
	}
	
	public void Formulary_GI_GenManufacturer(String strGenManufacturer) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strGenManufacturer));
	}
	
	public void Formulary_GI_FDAListed(String strFDAListed) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strFDAListed));
	}
	
	public void Formulary_GI_FDA(String strFDA) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strFDA));
	}
	
	public void Formulary_GI_UnitDose(String strUnitDose) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strUnitDose));
	}
	
	public void Formulary_GI_UnitDoseOnly(String strUnitDoseOnly) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strUnitDoseOnly));
	}
	
	public void Formulary_GI_PkgSize(String strPkgSize) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strPkgSize));
	}
	
	public void Formulary_GI_SmallPkgGCN(String strSmallPkgGCN) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strSmallPkgGCN));
	}
	
	public void Formulary_GI_SmallPkgCore9(String strSmallPkgCore9) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strSmallPkgCore9));
	}
	
	public void Formulary_GI_RePackaged(String strRePackaged) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strRePackaged));
	}
	
	public void Formulary_GI_InstProduct(String strInstProduct) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strInstProduct));
	}
	
	public void Formulary_GI_CaseSize(String strCaseSize) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strCaseSize));
	}
	
	public void Formulary_GI_AddDate(String strAddDate) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strAddDate));
	}
	
	public void Formulary_GI_ObsoleteDate(String strObsoleteDate) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strObsoleteDate));
	}
	
	public void Formulary_GI_DeleteDate(String strDeleteDate) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strDeleteDate));
	}
	
	public void Formulary_GI_MrktgEndDate(String strMrktgEndDate) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_GENERAL_TABLE,strMrktgEndDate));
	}
	
    // Therapeutic Class	
	
	public void Formulary_GI_TC_SpecificTPClass(String strSpecificTPClass) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_TC_TABLE,strSpecificTPClass));
	}
	
	public void Formulary_GI_TC_StandardTPClass(String strStandardTPClass) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_TC_TABLE,strStandardTPClass));
	}
	
	public void Formulary_GI_TC_GenericTPClass(String strGenericTPClass) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_TC_TABLE,strGenericTPClass));
	}
	
	public void Formulary_GI_TC_DrugCategory(String strDrugCategory) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(FORMULARY_GI_TC_TABLE,strDrugCategory));
	}
	
	// AHFS Therapeutic Class
	
	public void Formulary_GI_AHFSTC_Code(String strAHFSTCCode) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(FORMULARY_GI_AHFSTC_TABLE,strAHFSTCCode));
	}
	
	public void Formulary_GI_AHFSTC_Description(String strAHFSTCDescription) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(FORMULARY_GI_AHFSTC_TABLE,strAHFSTCDescription));
	}
	
	// Enhanced Therapeutic Class
	
	public void Formulary_GI_ETC_Code(String strETCCode) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(FORMULARY_GI_ETC_TABLE,strETCCode));
	}
	
	public void Formulary_GI_ETC_Name(String strETCName) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(FORMULARY_GI_ETC_TABLE,strETCName));
	}
	
	public void Formulary_GI_ETC_DefaultUse(String strETCDefaultUse) throws Throwable{
		actFormularyGenInfoDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(FORMULARY_GI_ETC_TABLE,strETCDefaultUse));
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Formulary General Information Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
}
