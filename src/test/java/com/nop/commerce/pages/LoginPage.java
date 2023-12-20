package com.nop.commerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.nop.commerce.common.SharedResource;
import com.nop.commerce.common.nop_commerce_Utility;

public class LoginPage 
{
	SharedResource sharedResource;
	nop_commerce_Utility utils;
	
	WebDriver driver;
	
    private By admin_Area_Demo,userName_Edit,password_Edit,Login_button;
	
	public LoginPage(SharedResource sharedResource, nop_commerce_Utility utils)
	{
		this.sharedResource = sharedResource;
		this.utils = utils;
		this.driver = sharedResource.getDriver();
		init_objects();
	}
	
	public void init_objects()
	{
		admin_Area_Demo = By.xpath("//div[@class='page-title']/h1");
		userName_Edit = By.id("Email");
		password_Edit = By.id("Password");
		Login_button = By.xpath("//button[@type='submit' and text()='Log in']");
	}
	
		
	public void user_is_in_application_home_page()
	{
		if(driver.findElement(admin_Area_Demo).isDisplayed())
		{
			System.out.println("The user is in nop commerce application Home Page");
		}
	}
	
	public void setUserName(String strUserName) throws Throwable
	{
		if(driver.findElement(userName_Edit).isDisplayed())
		{
			utils.SetTextOnEdit(userName_Edit, strUserName);
		}
	}
	
	public void setPassword(String strpassword) throws Throwable
	{
		if(driver.findElement(password_Edit).isDisplayed())
		{		
			utils.SetTextOnEdit(password_Edit, strpassword);
		}
	}
	
	public void clickOnLoginButton() throws Throwable
	{
		if(driver.findElement(Login_button).isDisplayed())
		{
			utils.ClickOnButton(Login_button);
		}
	}
	
	
	
	
	
	
	
	
}
