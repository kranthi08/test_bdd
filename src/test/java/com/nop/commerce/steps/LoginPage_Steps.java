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
		
		public void the_user_is_in_application() throws Throwable {
			selectorLoginpage.user_is_in_application_home_page();
		}
			
		public void performLogin() throws Throwable {
			selectorLoginpage.setUserName("");
			selectorLoginpage.setPassword("");
			selectorLoginpage.clickOnLoginButton();
		}
		
		public void validate_admin_area_demo() throws Throwable {
			selectorLoginpage.validate_label_admin_Area_Demo_text();
		}
		
		public void validate_welcome_please_sign_in() throws Throwable {
			selectorLoginpage.validate_label_welcome_please_signin_title();
		}
		
		public void validate_email() throws Throwable {
			selectorLoginpage.validate_label_email();
		}
		
		public void validate_password() throws Throwable {
			selectorLoginpage.validate_label_password();
		}
		
		public void validate_rememberMe_label() throws Throwable {
			selectorLoginpage.validate_label_Remember_Me_Text();
		}
		
		public void validate_rememberMe_checkbox() throws Throwable {
			selectorLoginpage.validate_checkbox_RememberMe();
		}
		
		public void validate_defaults_for_admin_area() throws Throwable {
			selectorLoginpage.validate_label_defaults_for_admin_area_Text();
		}

}
