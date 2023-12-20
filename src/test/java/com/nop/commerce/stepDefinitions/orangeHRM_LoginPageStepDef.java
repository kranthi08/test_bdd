package com.nop.commerce.stepDefinitions;

import java.util.Map;

import com.nop.commerce.common.SharedResource;
import com.nop.commerce.common.orangeHRM_Utlilty;
import com.nop.commerce.steps.orangeHRM_LoginPage_Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class orangeHRM_LoginPageStepDef 
{
	orangeHRM_LoginPage_Steps loginPageSteps;
	SharedResource sharedResource;
	orangeHRM_Utlilty utility;
	
	public orangeHRM_LoginPageStepDef(SharedResource sharedResource,orangeHRM_Utlilty utility)
	{
		this.sharedResource = sharedResource;
		this.utility = utility;
		init();
	}
	public void init()
	{
		loginPageSteps = new orangeHRM_LoginPage_Steps(sharedResource,utility);
	}
	
	@When("User Launch the required OrangeHRM URL")
	public void user_Launch_the_required_OrangeHRM_URL() 
	{
		loginPageSteps.user_Launch_the_required_URL();
	}
	
	@Given("The user is in OrangeHRM application")
	public void the_user_is_in_OrangeHRM_application() 
	{
		loginPageSteps.the_user_is_in_application(); 
	}

	@When("He input the LoginName into Login Name field")
	public void he_input_the_LoginName_into_Login_Name_field(Map<String,String> username) throws Throwable //Map<String,String> username
	{
		//System.out.println("He input the LoginName into Login Name field");
		loginPageSteps.input_the_LoginName(username);
	}

	@When("He input required password into Password field")
	public void he_input_required_password_into_Password_field(Map<String,String> password)  throws Throwable
	{
		//System.out.println("He input required password into Password field");
		loginPageSteps.input_password(password);
	}

	@Then("Click on Login button")
	public void click_on_Login_button() throws Throwable
	{
		//System.out.println("Click on Login button");
		loginPageSteps.clickOnLogin();
	}

	
	
	
	
	
	
	
	
	
	
	
}
