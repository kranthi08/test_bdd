package com.nop.commerce.steps;

import com.nop.commerce.common.Nop_Commerce_Utlilty;
import com.nop.commerce.common.SharedResource;
import com.nop.commerce.pages.Products_Page;

public class Productspage_Steps {

	SharedResource sharedResource;
	Nop_Commerce_Utlilty utils;
	
	Products_Page productsPage;
	
	public Productspage_Steps(SharedResource sharedResource,Nop_Commerce_Utlilty utils) {
		this.sharedResource = sharedResource;
		this.utils = utils;
		init();
	}
	
	public void init(){
		productsPage = new Products_Page(sharedResource,utils);
	}
	
	public void navidateToAddaProductPage() throws Throwable {
		productsPage.userIsInProductCreationPage();
		productsPage.clickOnAddNewProductsButton();
	}
	
}
