package com.nop.commerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.nop.commerce.common.Nop_Commerce_Utlilty;
import com.nop.commerce.common.SharedResource;

public class Products_Page {

	SharedResource sharedResource;
	Nop_Commerce_Utlilty utils;
	WebDriver driver;
	
	private By productsPageHeaderLeft, addNewproductBtn;
	
	public Products_Page(SharedResource sharedResource, Nop_Commerce_Utlilty utils) {
		this.sharedResource = sharedResource;
		this.utils = utils;
		this.driver = sharedResource.getDriver();
		init_objects();
	}

	private void init_objects() {
		productsPageHeaderLeft = By.xpath("//h1[@class=\"float-left\"]");
		addNewproductBtn = By.xpath("//a[@class=\"btn btn-primary\" and @href=\"/Admin/Product/Create\"]");
	}

	public void userIsInProductCreationPage() throws Throwable {
		if(driver.findElement(productsPageHeaderLeft).isDisplayed()) {
			System.out.println("User is in Products creation page");
		}
	}
	
	public void clickOnAddNewProductsButton() throws Throwable {
		if(driver.findElement(addNewproductBtn).isDisplayed()) {
			utils.ClickOnButton(addNewproductBtn);
		}
	}
}
