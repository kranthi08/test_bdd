package com.nop.commerce.steps;

import com.nop.commerce.common.SharedResource;
import com.nop.commerce.common.Nop_Commerce_Utlilty;
import com.nop.commerce.pages.CustomersPage;

public class CustomersPage_Steps {

	SharedResource sharedResource;
	Nop_Commerce_Utlilty utils;
	
	CustomersPage customersPage;
	
	public CustomersPage_Steps(SharedResource sharedResource,Nop_Commerce_Utlilty utils) {
		this.sharedResource = sharedResource;
		this.utils = utils;
		init();
	}
	
	public void init(){
		customersPage = new CustomersPage(sharedResource,utils);
	}

	public void navidateToAddaCustomerPage() throws Throwable {
		customersPage.userIsInCustomerCreationPage();
		customersPage.clickOnAddNewCustomerButton();
	}










}
