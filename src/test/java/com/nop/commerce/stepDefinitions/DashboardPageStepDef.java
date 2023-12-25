package com.nop.commerce.stepDefinitions;

import com.nop.commerce.common.SharedResource;
import com.nop.commerce.common.Nop_Commerce_Utlilty;
import com.nop.commerce.steps.Add_a_New_CustomerPage_Steps;
import com.nop.commerce.steps.CustomersPage_Steps;
import com.nop.commerce.steps.DashboardPage_Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DashboardPageStepDef {

	SharedResource sharedResource;
	Nop_Commerce_Utlilty utils;
	
	DashboardPage_Steps dashBoardPageSteps;
	CustomersPage_Steps customerspagesteps;
	Add_a_New_CustomerPage_Steps addanewcustomerpagesteps;
	
	public DashboardPageStepDef(SharedResource sharedResource, Nop_Commerce_Utlilty utils) {
		this.sharedResource = sharedResource;
		this.utils = utils;
		init();
	}
	
	private void init() {
		dashBoardPageSteps = new DashboardPage_Steps(sharedResource,utils);
		customerspagesteps = new CustomersPage_Steps(sharedResource,utils);
		addanewcustomerpagesteps = new Add_a_New_CustomerPage_Steps(sharedResource,utils);
	}

	@Given("^User is in dashboard page of NOP commerce application$")
	public void user_in_dashboard_page_of_nop_commerce_appilcation() throws Throwable {
		dashBoardPageSteps.userIsInDashboardPage();
	}
	
	@When("^User click on customer link and create new customer$")
	public void user_click_on_customer_link_and_create_new_customer() throws Throwable {
		dashBoardPageSteps.clickOnCustomersLink();
		dashBoardPageSteps.clickOnCustomerListLink();
		customerspagesteps.navidateToAddaCustomerPage();
		addanewcustomerpagesteps.inputAllTheRequiredValuesForNewUserCreation();
	}
	
	@Then("^User verify the created customer$")
	public void the_user_verify_the_created_customer() throws Throwable {
		System.out.println("User verify the created customer");
	}
}
