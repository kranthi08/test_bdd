package com.nop.commerce.steps;


import java.util.Map;

import com.nop.commerce.common.SharedResource;
import com.nop.commerce.common.orangeHRM_Utlilty;
import com.nop.commerce.pages.orangeHRM_LoginPage;

public class orangeHRM_LoginPage_Steps 
{

	orangeHRM_LoginPage selectorLoginpage;
	SharedResource sharedResource;
	orangeHRM_Utlilty utility;
	
	public orangeHRM_LoginPage_Steps(SharedResource sharedResource,orangeHRM_Utlilty utility)
	{
		this.sharedResource = sharedResource;
		this.utility = utility;
		init();
	}
	public void init()
	{
		selectorLoginpage = new orangeHRM_LoginPage(sharedResource,utility);
	}
	
	//==================================================================
	
	public void user_Launch_the_required_URL() 
	{
		selectorLoginpage.Launch_the_required_URL();
	}
	
	public void the_user_is_in_application() 
	{
		//System.out.println("The user is in OrangeHRM application");
		selectorLoginpage.user_is_in_application();
	}
	
	public void input_the_LoginName(Map<String,String> username) throws Throwable 
	{
		//List<List<String>> user = username.raw();
		
		//String strUserName = user.get(1).get(0);
		String strUserName = username.get("User_Name");
		
		System.out.println("He input the LoginName "+ strUserName +" into Login Name field");
		selectorLoginpage.setUserName(strUserName);
	}
	
	public void input_password(Map<String,String> password) throws Throwable
	{
		String strPassword = password.get("Password");
		selectorLoginpage.setPassword(strPassword);
	}
	
	public void clickOnLogin() throws Throwable
	{
		selectorLoginpage.clickOnLoginButton();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
