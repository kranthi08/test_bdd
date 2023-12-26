package com.nop.commerce.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.nop.commerce.common.SharedResource;
import com.nop.commerce.common.Nop_Commerce_Utlilty;

public class LoginPage {
	
	SharedResource sharedResource;
	Nop_Commerce_Utlilty utils;
	Properties pf;
	WebDriver driver;
	
    private By admin_Area_Demo,userName_Edit,password_Edit,Login_button;
    
	public LoginPage(SharedResource sharedResource, Nop_Commerce_Utlilty utils){
		this.sharedResource = sharedResource;
		this.utils = utils;
		this.driver = sharedResource.getDriver();
		this.pf = sharedResource.getProperties();
		init_objects();
	}
	
	public void init_objects(){
		admin_Area_Demo = By.xpath("//div[@class='page-title']/h1");
		userName_Edit = By.id("Email");
		password_Edit = By.id("Password");
		Login_button = By.xpath("//button[@type='submit' and text()='Log in']");
	}
	
	public void user_is_in_application_home_page()throws Throwable{
		if(utils.CheckElementPresenceByLocator(admin_Area_Demo)) {
			System.out.println("The user is in nop commerce application Home Page");
		}
	}
	
	public void setUserName(String strUserName) throws Throwable{
		if(driver.findElement(userName_Edit).isDisplayed()&&strUserName.equals("")){
			utils.SetTextOnEdit(userName_Edit, pf.getProperty("UserName"));
		}
	}
	public void setPassword(String strPassword) throws Throwable{
		if(driver.findElement(password_Edit).isDisplayed() && strPassword.equals("")){		
			utils.SetTextOnEdit(password_Edit, pf.getProperty("Password"));
		}
	}
	
	public void clickOnLoginButton() throws Throwable{
		if(driver.findElement(Login_button).isDisplayed()){
			utils.ClickOnButton(Login_button);
		}
	}
}
