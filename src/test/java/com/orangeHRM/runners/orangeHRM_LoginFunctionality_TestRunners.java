package com.orangeHRM.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features = {"classpath:features/Login.feature" }, 
			tags = {"@Functional"}, 
			glue= {"classpath:com.orangeHRM.stepDefinitions",
					"classpath:com.orangeHRM.Apps.common",
					"classpath:com.orangeHRM.common",
					"classpath:com.orangeHRM.pages",
					"classpath:com.orangeHRM.runners",
					"classpath:com.orangeHRM.steps"},
			plugin =  {"pretty","html:target/html", "json:orangeHRM_Logon.json", "rerun:src/test/resources/rerun.txt"},
			strict=true
)

public class orangeHRM_LoginFunctionality_TestRunners extends AbstractTestNGCucumberTests {

	
	
}
