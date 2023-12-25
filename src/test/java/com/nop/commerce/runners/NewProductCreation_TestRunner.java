package com.nop.commerce.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"classpath:features/NewProductCreation.feature" },  
			glue= {"classpath:com.nop.commerce.stepDefinitions",
					"classpath:com.nop.commerce.common",
					"classpath:com.nop.commerce.pages",
					"classpath:com.nop.commerce.runners",
					"classpath:com.nop.commerce.steps"},
		plugin= {"pretty","html:target/Cucumber-html-report","json:target/cucumber-reports/Login.json","rerun:src/test/resources/rerun.txt"}
		
)

public class NewProductCreation_TestRunner extends AbstractTestNGCucumberTests {}
