package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common.PharmacyLookup_LandingPage_Steps;
import DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages.PharmacyLookup_Claim_DrugInformationSelector;

public class PharmacyLookup_Claim_DrugInformation_Steps {

	PharmacyLookup_Claim_DrugInformationSelector pharmacyLookup_Claim_DrugInformationSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expDrugInformation = new ArrayList<String>();
	public SoftAssert drugInformationSoft = new SoftAssert();
	
	
	public PharmacyLookup_Claim_DrugInformation_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		pharmacyLookup_Claim_DrugInformationSelector = new PharmacyLookup_Claim_DrugInformationSelector(SharedResource,utils);
	}
	
	public void clickOnDrugInformation() throws Throwable{
		pharmacyLookup_Claim_DrugInformationSelector.PharmacyLookup_Claim_clickOnDrugInformation();
		pharmacyLookup_Claim_DrugInformationSelector.waitUnitillDrugInformationDetails();
	}
	
	public void verifyDrugInformation(Map<String,String> drugInformation)throws Throwable {
		 
		String strGenericIndicator = drugInformation.get("GenericIndicator");
		String strGenericPriceInedicator = drugInformation.get("GenericPriceInedicator");
		String strGCN = drugInformation.get("GCN");
		String strGCNSequenceNumber = drugInformation.get("GCNSequenceNumber");
		String strMEDID = drugInformation.get("MEDID");
		String strHICLSequenceNumber = drugInformation.get("HICLSequenceNumber");
		String strAHFSCode = drugInformation.get("AHFSCode");
		String strDEACode = drugInformation.get("DEACode");
		String strManufacturer = drugInformation.get("Manufacturer");
		String strGenericTherapeuticClass = drugInformation.get("GenericTherapeuticClass");
		String strStandardTherapeuticClass = drugInformation.get("StandardTherapeuticClass");
		String strSpecificTherapeuticClass = drugInformation.get("SpecificTherapeuticClass");
		String strEnhancedTherapeuticClass = drugInformation.get("EnhancedTherapeuticClass");
		String strDrugClass = drugInformation.get("DrugClass");
		String strDrugCategory = drugInformation.get("DrugCategory");
		String strRxCUI = drugInformation.get("RxCUI");
		String strOrangeBookIndicator = drugInformation.get("OrangeBookIndicator");
		String strNDCMaintenanceIndicator = drugInformation.get("NDCMaintenanceIndicator");
		String strDosageStrength = drugInformation.get("DosageStrength");
		String strDosageFormCode = drugInformation.get("DosageFormCode");
		String strUnitOfMeasure = drugInformation.get("UnitOfMeasure");
		String strPackageSize = drugInformation.get("PackageSize");
		String strRouteCode = drugInformation.get("RouteCode");
		  		 		 
		expDrugInformation.add(strGenericIndicator);
		expDrugInformation.add(strGenericPriceInedicator);
		expDrugInformation.add(strGCN);
		expDrugInformation.add(strGCNSequenceNumber);
		expDrugInformation.add(strMEDID);
		expDrugInformation.add(strHICLSequenceNumber);
		expDrugInformation.add(strAHFSCode);
		expDrugInformation.add(strDEACode);
		expDrugInformation.add(strManufacturer);
		expDrugInformation.add(strGenericTherapeuticClass);
		expDrugInformation.add(strStandardTherapeuticClass);
		expDrugInformation.add(strSpecificTherapeuticClass);
		expDrugInformation.add(strEnhancedTherapeuticClass);
		expDrugInformation.add(strDrugClass);
		expDrugInformation.add(strDrugCategory);
		expDrugInformation.add(strRxCUI);
		expDrugInformation.add(strOrangeBookIndicator);
		expDrugInformation.add(strNDCMaintenanceIndicator);		 
		expDrugInformation.add(strDosageStrength);
		expDrugInformation.add(strDosageFormCode);
		expDrugInformation.add(strUnitOfMeasure);
		expDrugInformation.add(strPackageSize);
		expDrugInformation.add(strRouteCode);		 
		
		pharmacyLookup_Claim_DrugInformationSelector.Claim_DrugInformation_GenericIndicator(strGenericIndicator);
		pharmacyLookup_Claim_DrugInformationSelector.Claim_DrugInformation_GenericPriceInedicator(strGenericPriceInedicator);
		pharmacyLookup_Claim_DrugInformationSelector.Claim_DrugInformation_GCN(strGCN);
		pharmacyLookup_Claim_DrugInformationSelector.Claim_DrugInformation_GCNSequenceNumber(strGCNSequenceNumber);
		pharmacyLookup_Claim_DrugInformationSelector.Claim_DrugInformation_MEDID(strMEDID);
		pharmacyLookup_Claim_DrugInformationSelector.Claim_DrugInformation_HICLSequenceNumber(strHICLSequenceNumber);
		pharmacyLookup_Claim_DrugInformationSelector.Claim_DrugInformation_AHFSCode(strAHFSCode);
		pharmacyLookup_Claim_DrugInformationSelector.Claim_DrugInformation_DEACode(strDEACode);
		pharmacyLookup_Claim_DrugInformationSelector.Claim_DrugInformation_Manufacturer(strManufacturer);
		pharmacyLookup_Claim_DrugInformationSelector.Claim_DrugInformation_GenericTherapeuticClass(strGenericTherapeuticClass);
		pharmacyLookup_Claim_DrugInformationSelector.Claim_DrugInformation_StandardTherapeuticClass(strStandardTherapeuticClass);
		pharmacyLookup_Claim_DrugInformationSelector.Claim_DrugInformation_SpecificTherapeuticClass(strSpecificTherapeuticClass);
		pharmacyLookup_Claim_DrugInformationSelector.Claim_DrugInformation_EnhancedTherapeuticClass(strEnhancedTherapeuticClass);
		pharmacyLookup_Claim_DrugInformationSelector.Claim_DrugInformation_DrugClass(strDrugClass);
		pharmacyLookup_Claim_DrugInformationSelector.Claim_DrugInformation_DrugCategory(strDrugCategory);
		pharmacyLookup_Claim_DrugInformationSelector.Claim_DrugInformation_RxCUI(strRxCUI);
		pharmacyLookup_Claim_DrugInformationSelector.Claim_DrugInformation_OrangeBookIndicator(strOrangeBookIndicator);
		pharmacyLookup_Claim_DrugInformationSelector.Claim_DrugInformation_NDCMaintenanceIndicator(strNDCMaintenanceIndicator);
		pharmacyLookup_Claim_DrugInformationSelector.Claim_DrugInformation_DosageStrength(strDosageStrength);
		pharmacyLookup_Claim_DrugInformationSelector.Claim_DrugInformation_DosageFormCode(strDosageFormCode);
		pharmacyLookup_Claim_DrugInformationSelector.Claim_DrugInformation_UnitOfMeasure(strUnitOfMeasure);
		pharmacyLookup_Claim_DrugInformationSelector.Claim_DrugInformation_PackageSize(strPackageSize);
		pharmacyLookup_Claim_DrugInformationSelector.Claim_DrugInformation_RouteCode(strRouteCode);		 
			
		for(int i=0;i<expDrugInformation.size();i++)
		{
			drugInformationSoft.assertEquals(pharmacyLookup_Claim_DrugInformationSelector.actDrugInformation.get(i), expDrugInformation.get(i));
		}		
		drugInformationSoft.assertAll();
		
	}	
	
	 
}

