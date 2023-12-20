package com.nop.commerce.stepDefinitions;

import com.nop.commerce.common.SharedResource;
import com.nop.commerce.common.orangeHRM_Utlilty;
import com.nop.commerce.steps.orangeHRM_LoginPage_Steps;

import cucumber.api.java.en.Then;

public class orangeHRM_EmployeeInfoStepDef 
{
	orangeHRM_LoginPage_Steps loginPageSteps;
	SharedResource sharedResource;
	orangeHRM_Utlilty utility;
	
	public orangeHRM_EmployeeInfoStepDef(SharedResource sharedResource,orangeHRM_Utlilty utility)
	{
		this.sharedResource = sharedResource;
		this.utility = utility;
		init();
	}
	
	public void init()
	{
		
	}
	
	@Then("Application Navigates to Employee Information Page")
	public void application_Navigates_to_Employee_Information_Page() 
	{
		System.out.println("Application Navigates to Employee Information Page"); 
	}
}
