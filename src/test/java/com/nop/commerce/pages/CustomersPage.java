package com.nop.commerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.nop.commerce.common.SharedResource;
import com.nop.commerce.common.Nop_Commerce_Utlilty;

public class CustomersPage {
	SharedResource sharedResource;
	Nop_Commerce_Utlilty utils;
	WebDriver driver;
	
	private By customerPageHeaderLeft, addNewCustomerBtn;
	
	public CustomersPage(SharedResource sharedResource, Nop_Commerce_Utlilty utils) {
		this.sharedResource = sharedResource;
		this.utils = utils;
		this.driver = sharedResource.getDriver();
		init_objects();
	}

	private void init_objects() {
		customerPageHeaderLeft = By.xpath("//h1[@class='float-left']");
		addNewCustomerBtn = By.xpath("//a[@class='btn btn-primary' and @href='/Admin/Customer/Create']");
	}

	public void userIsInCustomerCreationPage() throws Throwable {
		if(driver.findElement(customerPageHeaderLeft).isDisplayed()) {
			System.out.println("User is in Customer creation page");
		}
	}
	
	public void clickOnAddNewCustomerButton() throws Throwable {
		if(driver.findElement(addNewCustomerBtn).isDisplayed()) {
			utils.ClickOnButton(addNewCustomerBtn);
		}
	}
}
