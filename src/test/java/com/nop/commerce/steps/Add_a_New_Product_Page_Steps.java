package com.nop.commerce.steps;

import com.nop.commerce.common.Nop_Commerce_Utlilty;
import com.nop.commerce.common.SharedResource;

import com.nop.commerce.pages.Add_a_New_Product_Page;

public class Add_a_New_Product_Page_Steps {

	
	SharedResource sharedResource;
	Nop_Commerce_Utlilty utils;
	
	Add_a_New_Product_Page addanewproductpage;
	
	public Add_a_New_Product_Page_Steps(SharedResource sharedResource,Nop_Commerce_Utlilty utils) {
		this.sharedResource = sharedResource;
		this.utils = utils;
		init();	
	}
	
	public void init(){
		addanewproductpage = new Add_a_New_Product_Page(sharedResource,utils);
	}
	
	public void inputAllTheRequiredValuesForNewProductCreation() throws Throwable {
		
		addanewproductpage.userIsInAddaNewProductPage();
		addanewproductpage.setTextIntoProductName("");
		addanewproductpage.setTextIntoShortdescription("");
		addanewproductpage.setTextIntoFulldescription("");
		addanewproductpage.setTextIntoSKU("");
		addanewproductpage.selectIsPublishedCheckBox();
		addanewproductpage.setTextIntoProducttags("");
		addanewproductpage.setTextIntoGTIN("");
		addanewproductpage.setTextIntoManufacturerpartnumber("");
		addanewproductpage.selectShowonhomepageCheckBox();
		addanewproductpage.SelectItemInProducttypeDropDown("");
		addanewproductpage.SelectItemInProducttemplateDropDown("");
		addanewproductpage.SelectItemInVendorDropDown("");
		addanewproductpage.ClickonSavebutton();


		
	}
	}

