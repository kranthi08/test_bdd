package com.nop.commerce.stepDefinitions;

import com.nop.commerce.common.Nop_Commerce_Utlilty;
import com.nop.commerce.common.SharedResource;
import com.nop.commerce.steps.LoginPage_Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage_UI_Validation_StepDef {
	
	SharedResource sharedResource;
	Nop_Commerce_Utlilty utils;
	
	LoginPage_Steps loginPage_steps;
 
	public LoginPage_UI_Validation_StepDef(SharedResource sharedResource, Nop_Commerce_Utlilty utils) {
		this.sharedResource = sharedResource;
		this.utils = utils;
		init();
	}
	
	private void init() {
		loginPage_steps = new LoginPage_Steps(sharedResource,utils);
	}
	
	@Given("^User is in nop login page$")
	public void user_is_in_nop_login_page() throws Throwable {
		loginPage_steps.the_user_is_in_application();
	}
	
	@When("^Validate the Label Admin area demo in nop login page$")
	public void validate_the_label_admin_area_demo_in_nop_login_page() throws Throwable {
		loginPage_steps.validate_admin_area_demo();
	}
	
	@When("^Validate the Label Email in nop login page$")
	public void validate_the_label_email_in_nop_login_page() throws Throwable {
		loginPage_steps.validate_email();
	}

	@When("^Validate the Label Password in nop login page$")
	public void validate_the_label_password_in_nop_login_page() throws Throwable {
		loginPage_steps.validate_password();
	}

	@When("^Validate the Label RememberMe in nop login page$")
	public void validate_the_label_rememberMe_in_nop_login_page() throws Throwable {
		loginPage_steps.validate_rememberMe_label();
	}

	@When("^Validate the RememberMe checkbox in nop login page$")
	public void validate_the_rememberMe_checkbox_in_nop_login_page() throws Throwable {
		loginPage_steps.validate_rememberMe_checkbox();
	}
	
	@When("^Validate the Label Defaults for admin area in nop login page$")
	public void validate_the_label_defaults_for_admin_area_in_nop_login_page() throws Throwable {
		loginPage_steps.validate_defaults_for_admin_area();
	}
	
}
