package com.nop.commerce.steps;

import com.nop.commerce.common.SharedResource;
import com.nop.commerce.common.Nop_Commerce_Utlilty;
import com.nop.commerce.pages.DashboardPage;

public class DashboardPage_Steps 
{

	DashboardPage selectorDashboardPage;
	SharedResource sharedResource;
	Nop_Commerce_Utlilty utils;
	
	public DashboardPage_Steps(SharedResource sharedResource,Nop_Commerce_Utlilty utils)
	{
		this.sharedResource = sharedResource;
		this.utils = utils;
		init();
	}
	public void init()
	{
		selectorDashboardPage = new DashboardPage(sharedResource,utils);
	}
	
	//==================================================================
	
	public void userIsInDashboardPage() {
		selectorDashboardPage.user_is_in_dashboard_page();
	}
	
	public void clickOnCustomersLink() throws Throwable {
		selectorDashboardPage.click_on_customer_Link();
	}
	
	public void clickOnCustomerListLink() throws Throwable {
		selectorDashboardPage.click_on_customer_List_Link();
	}
	//==================================================================
	
	public void clickOnCatalogLink() throws Throwable {
		selectorDashboardPage.click_on_Catalog_Link();
	}
	
	public void clickOnProductsLink() throws Throwable {
		selectorDashboardPage.click_on_Products_Link();
	}
	

}
