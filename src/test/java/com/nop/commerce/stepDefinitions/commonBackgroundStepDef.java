package com.nop.commerce.stepDefinitions;

import com.nop.commerce.common.SharedResource;
import com.nop.commerce.common.nop_commerce_Utility;
import com.nop.commerce.steps.LoginPage_Steps;

import cucumber.api.java.en.When;

public class commonBackgroundStepDef {

	SharedResource sharedResource;
	nop_commerce_Utility utils;
	LoginPage_Steps loginPageSteps;
	
	commonBackgroundStepDef(SharedResource sharedResource,nop_commerce_Utility utils){
		this.sharedResource = sharedResource;
		this.utils = utils;
		init();
	}
	
	public void init()
	{
		loginPageSteps = new LoginPage_Steps(sharedResource,utils);
	}
	
	@When("^User perform login in nop commerce application$")
	public void user_perform_login_in_nop_commerce_application() throws Throwable {
		loginPageSteps.the_user_is_in_application();
		loginPageSteps.performLogin();
	}










}
