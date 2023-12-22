package com.nop.commerce.steps;

	import com.nop.commerce.common.SharedResource;
import com.nop.commerce.common.Nop_Commerce_Utlilty;
import com.nop.commerce.pages.LoginPage;

	public class LoginPage_Steps 
	{

		LoginPage selectorLoginpage;
		SharedResource sharedResource;
		Nop_Commerce_Utlilty utils;
		
		public LoginPage_Steps(SharedResource sharedResource,Nop_Commerce_Utlilty utils)
		{
			this.sharedResource = sharedResource;
			this.utils = utils;
			init();
		}
		public void init()
		{
			selectorLoginpage = new LoginPage(sharedResource,utils);
		}
		
		//==================================================================
		
		public void the_user_is_in_application() throws Throwable 
		{
			selectorLoginpage.user_is_in_application_home_page();
		}
			
		public void performLogin() throws Throwable {
			selectorLoginpage.setUserName("");
			selectorLoginpage.setPassword("");
			selectorLoginpage.clickOnLoginButton();
		}


}
