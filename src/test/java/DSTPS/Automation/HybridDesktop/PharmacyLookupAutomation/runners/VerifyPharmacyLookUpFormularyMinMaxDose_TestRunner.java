package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


//@RunWith(CucumberRunner.class)
@CucumberOptions(
		features = {"classpath:features/PharmacyLookup/PharmacyLookup_Formulary_Verify_MinMaxDose.feature" }, 
			tags = {"@Functional"}, 
			glue= {"classpath:DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.stepDefinitions",
					"classpath:DSTPS.Automation.HybridDesktop.Apps.common",
					"classpath:DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common",
					"classpath:DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages",
					"classpath:DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.runners",
					"classpath:DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps"},
			plugin =  {"pretty","html:target/html", "json:pharmacylookup_formulary_verify_minmaxdose.json", "rerun:src/test/resources/rerun.txt"},
			strict=true
)

public class VerifyPharmacyLookUpFormularyMinMaxDose_TestRunner extends AbstractTestNGCucumberTests {
	
}
