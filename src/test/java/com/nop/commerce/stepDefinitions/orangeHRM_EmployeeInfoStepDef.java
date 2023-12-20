package com.nop.commerce.stepDefinitions;

import com.nop.commerce.common.SharedResource;
import com.nop.commerce.common.nop_commerce_Utility;
import com.nop.commerce.steps.LoginPage_Steps;

import cucumber.api.java.en.Then;

public class orangeHRM_EmployeeInfoStepDef 
{
	LoginPage_Steps loginPageSteps;
	SharedResource sharedResource;
	nop_commerce_Utility utility;
	
	public orangeHRM_EmployeeInfoStepDef(SharedResource sharedResource,nop_commerce_Utility utility)
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
