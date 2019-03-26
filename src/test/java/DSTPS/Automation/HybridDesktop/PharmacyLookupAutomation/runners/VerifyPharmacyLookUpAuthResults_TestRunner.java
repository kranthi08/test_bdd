package DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


//@RunWith(CucumberRunner.class)
@CucumberOptions(
		features = {"classpath:features/PharmacyLookup/PharmacyLookup_Authorization_Verify_AuthResults.feature" }, 
			tags = {"@Functional"}, 
			glue= {"classpath:DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.stepDefinitions",
					"classpath:DSTPS.Automation.HybridDesktop.Apps.common",
					"classpath:DSTPS.Automation.HybridDesktop.PharmacyLookupApp.common",
					"classpath:DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.pages",
					"classpath:DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.runners",
					"classpath:DSTPS.Automation.HybridDesktop.PharmacyLookupAutomation.steps"},
			plugin =  {"pretty","html:target/html", "json:pharmacylookup_pharmacy_verify_authresults.json", "rerun:src/test/resources/rerun.txt"},
			strict=true
)

public class VerifyPharmacyLookUpAuthResults_TestRunner extends AbstractTestNGCucumberTests {
	
}
