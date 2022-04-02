package com.orangeHRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.orangeHRM.common.SharedResource;
import com.orangeHRM.common.orangeHRM_Utlilty;

public class orangeHRM_EmployeeInformationPage 
{
	SharedResource sharedResource;
	orangeHRM_Utlilty utility;
	WebDriver driver;
	
	By Admin_Tab, PIM_Tab;
	
	public orangeHRM_EmployeeInformationPage(SharedResource sharedResource, orangeHRM_Utlilty utils)
	{
		this.sharedResource = sharedResource;
		this.utility = utils;
		this.driver = sharedResource.getDriver();
		init_objects();
	}
	public void init_objects()
	{
		
	}
}
