package com.nop.commerce.steps;

import com.nop.commerce.common.SharedResource;
import com.nop.commerce.common.nop_commerce_Utility;
import com.nop.commerce.pages.DashboardPage;

public class DashboardPage_Steps 
{

	DashboardPage selectorDashboardPage;
	SharedResource sharedResource;
	nop_commerce_Utility utils;
	
	public DashboardPage_Steps(SharedResource sharedResource,nop_commerce_Utility utils)
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
	
	public void clickOnCustomersLink() throws Throwable {
		selectorDashboardPage.click_on_customer_Link();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
