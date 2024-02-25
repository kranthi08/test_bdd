package com.nop.commerce.stepDefinitions;

import com.nop.commerce.common.SharedResource;

import java.util.List;

import com.nop.commerce.common.Nop_Commerce_Utlilty;
import com.nop.commerce.steps.Add_a_New_CustomerPage_Steps;
import com.nop.commerce.steps.Add_a_New_Product_Page_Steps;
import com.nop.commerce.steps.CustomersPage_Steps;
import com.nop.commerce.steps.DashboardPage_Steps;
import com.nop.commerce.steps.Productspage_Steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DashboardPageStepDef {

	SharedResource sharedResource;
	Nop_Commerce_Utlilty utils;
	
	DashboardPage_Steps dashBoardPageSteps;
	CustomersPage_Steps customerspagesteps;
	Add_a_New_CustomerPage_Steps addanewcustomerpagesteps;
	Productspage_Steps ProductsPageSteps;
	Add_a_New_Product_Page_Steps addanewProductpagesteps;
	
	public DashboardPageStepDef(SharedResource sharedResource, Nop_Commerce_Utlilty utils) {
		this.sharedResource = sharedResource;
		this.utils = utils;
		init();
	}
	
	private void init() {
		dashBoardPageSteps = new DashboardPage_Steps(sharedResource,utils);
		customerspagesteps = new CustomersPage_Steps(sharedResource,utils);
		addanewcustomerpagesteps = new Add_a_New_CustomerPage_Steps(sharedResource,utils);
		ProductsPageSteps = new Productspage_Steps(sharedResource,utils);
		addanewProductpagesteps = new Add_a_New_Product_Page_Steps (sharedResource,utils);
	}

	@Given("^User is in dashboard page of NOP commerce application$")
	public void user_in_dashboard_page_of_nop_commerce_appilcation() throws Throwable {
		dashBoardPageSteps.userIsInDashboardPage();
	}
	
	@When("^User click on customer link and create new customer$")
	public void user_click_on_customer_link_and_create_new_customer(DataTable datarows) throws Throwable {
		List<List<String>> testData=  datarows.asLists();
		String strtestcaeID = testData.get(1).get(0);
		dashBoardPageSteps.clickOnCustomersLink();
		dashBoardPageSteps.clickOnCustomerListLink();
		customerspagesteps.navidateToAddaCustomerPage();
		addanewcustomerpagesteps.inputAllTheRequiredValuesForNewUserCreation(strtestcaeID);
	}
	
	@Then("^User verify the created customer$")
	public void the_user_verify_the_created_customer() throws Throwable {
		System.out.println("User verify the created customer");
	}
	
	@When("^User click on product link and create new product$")
	public void user_click_on_catalog_link_and_create_new_product() throws Throwable {
		System.out.println("User click on catalog link and create new product");
		dashBoardPageSteps.clickOnCatalogLink();
		dashBoardPageSteps.clickOnProductsLink();
		ProductsPageSteps.navidateToAddaProductPage();
		addanewProductpagesteps.inputAllTheRequiredValuesForNewProductCreation();	
	}
	
	
}
