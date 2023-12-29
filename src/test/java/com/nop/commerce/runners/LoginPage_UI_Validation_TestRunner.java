package com.nop.commerce.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"classpath:features/LoginPage_UI_Validation.feature" },  
			glue= {"classpath:com.nop.commerce.stepDefinitions",
					"classpath:com.nop.commerce.common",
					"classpath:com.nop.commerce.pages",
					"classpath:com.nop.commerce.runners",
					"classpath:com.nop.commerce.steps"},
			plugin =  {"pretty","html:target/NOP/LoginPage_UI_Validation", "json:target/NOP/LoginPage_UI_Validation.json",
					   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
					  }
)

public class LoginPage_UI_Validation_TestRunner extends AbstractTestNGCucumberTests {}
