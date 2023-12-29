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
	
    private By userName_Edit,password_Edit,Login_button;
    private By admin_Area_Demo_text, welcome_please_signin_title;
    private By label_Email,label_Password,label_Remember_Me_Text,label_defaults_for_admin_area_Text;
    private By checkbox_RememberMe;
    
	public LoginPage(SharedResource sharedResource, Nop_Commerce_Utlilty utils){
		this.sharedResource = sharedResource;
		this.utils = utils;
		this.driver = sharedResource.getDriver();
		this.pf = sharedResource.getProperties();
		init_objects();
	}
	
	public void init_objects(){
		admin_Area_Demo_text = By.xpath("//div[@class='page-title']/h1");
		userName_Edit = By.id("Email");
		password_Edit = By.id("Password");
		Login_button = By.xpath("//button[@type='submit' and text()='Log in']");
		welcome_please_signin_title = By.xpath("//div[@class='title']");
		label_Email = By.xpath("//label[@for='Email']");
		label_Password = By.xpath("//label[@for='Password']");
		label_Remember_Me_Text = By.xpath("//label[@for='RememberMe']");
		label_defaults_for_admin_area_Text = By.xpath("//div[@class='topic-block-title']");
		checkbox_RememberMe = By.id("RememberMe");
	}
	
	public void user_is_in_application_home_page()throws Throwable{
		if(utils.CheckElementPresenceByLocator(admin_Area_Demo_text)) {
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
	
	// -----------------------------------------------------------------
	// admin_Area_Demo_text
	public void validate_label_admin_Area_Demo_text() {
		if(driver.findElement(admin_Area_Demo_text).isDisplayed()) {
			System.out.println("Label admin_Area_Demo_text displayed");
		}
	}
	
	// Welcome, please sign in!
	public void validate_label_welcome_please_signin_title() {
		if(driver.findElement(welcome_please_signin_title).isDisplayed()) {
			System.out.println("Label welcome_please_signin_title displayed");
		}
	}

	
	// E-mail
	public void validate_label_email() {
		if(driver.findElement(label_Email).isDisplayed()) {
			System.out.println("Label label_Email displayed");
		}
	}
	
	// Password
	public void validate_label_password() {
		if(driver.findElement(label_Password).isDisplayed()) {
			System.out.println("Label label_Password displayed");
		}
	}
	
	// Remember me?
	public void validate_label_Remember_Me_Text() {
		if(driver.findElement(label_Remember_Me_Text).isDisplayed()) {
			System.out.println("Label label_Remember_Me_Text displayed");
		}
	}
	
	// Remember me check box
	public void validate_checkbox_RememberMe() {
		if(driver.findElement(checkbox_RememberMe).isDisplayed()) {
			System.out.println("Label checkbox_RememberMe displayed");
		}
	}
	
	// label_defaults_for_admin_area_Text
	public void validate_label_defaults_for_admin_area_Text() {
		if(driver.findElement(label_defaults_for_admin_area_Text).isDisplayed()) {
			System.out.println("Label label_defaults_for_admin_area_Text displayed");
		}
	}

}
