package com.nop.commerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.nop.commerce.common.SharedResource;
import com.nop.commerce.common.orangeHRM_Utlilty;

public class orangeHRM_LoginPage 
{
	SharedResource sharedResource;
	orangeHRM_Utlilty utility;
	
	
	WebDriver driver;
	
    private By orangeHRM_image,userName_Edit,password_Edit,Login_button;
	
	public orangeHRM_LoginPage(SharedResource sharedResource, orangeHRM_Utlilty utils)
	{
		this.sharedResource = sharedResource;
		this.utility = utils;
		this.driver = sharedResource.getDriver();
		init_objects();
	}
	
	public void init_objects()
	{
		orangeHRM_image = By.xpath("//img[@src='/webres_623e9ff84d9922.68021004/themes/default/images/login/logo.png']");
		userName_Edit = By.id("txtUsername");
		password_Edit = By.id("txtPassword");
		Login_button = By.id("btnLogin");
	}
	
	public void Launch_the_required_URL() 
	{
		System.out.println("User Launched the required OrangeHRM URL");
	}
	
	public void user_is_in_application()
	{
		if(driver.findElement(orangeHRM_image).isDisplayed())
		{
			System.out.println("The user is in Orange HRM application Home Page");
		}
	}
	
	public void setUserName(String strUserName) throws Throwable
	{
		if(driver.findElement(userName_Edit).isDisplayed())
		{
			//driver.findElement(userName_Edit).clear();
			//driver.findElement(userName_Edit).sendKeys(strUserName);
			utility.SetTextOnEdit(userName_Edit, strUserName);
		}
	}
	
	public void setPassword(String strpassword) throws Throwable
	{
		if(driver.findElement(password_Edit).isDisplayed())
		{
			
		// driver.findElement(password_Edit).clear();
		//	driver.findElement(password_Edit).sendKeys(strpassword);
			
			utility.SetTextOnEdit(password_Edit, strpassword);
		}
	}
	
	public void clickOnLoginButton() throws Throwable
	{
		if(driver.findElement(Login_button).isDisplayed())
		{
			//driver.findElement(Login_button).click();
			utility.ClickOnButton(Login_button);
		}
		
		
	}
	
	
	
	
	
	
	
	
}
