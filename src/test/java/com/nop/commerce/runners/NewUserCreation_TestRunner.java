package com.nop.commerce.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"classpath:features/NewUserCreation.feature" },  
			glue= {"classpath:com.nop.commerce.stepDefinitions",
					"classpath:com.nop.commerce.common",
					"classpath:com.nop.commerce.pages",
					"classpath:com.nop.commerce.runners",
					"classpath:com.nop.commerce.steps"},
			plugin =  {"pretty","html:target/NOP/html", "json:target/NOP/NewUserCreation.json"},
			strict=true
)

public class NewUserCreation_TestRunner extends AbstractTestNGCucumberTests {}
