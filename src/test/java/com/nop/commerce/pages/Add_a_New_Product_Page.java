package com.nop.commerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.nop.commerce.common.Nop_Commerce_Utlilty;
import com.nop.commerce.common.SharedResource;

public class Add_a_New_Product_Page {

	SharedResource sharedResource;
	Nop_Commerce_Utlilty utils;
	WebDriver driver;
	
	
	private By Addanewproduct;
	private By Productname_txt, Shortdescription_txt, Fulldescription_txt, SKU_txt, Producttags_txt; 
	private By GTIN_txtN, Manufacturerpartnumber_txtN;
	private By Categories_DropDown, Manufacturers_DropDown, Producttype_DropDown, Producttemplate_DropDown, Vendor_DropDown;
	private By  Save_Button;
	private By Published_CheckBox, Showonhomepage_CheckBox, Visibleindividually_CheckBox;

	
	public Add_a_New_Product_Page(SharedResource sharedResource, Nop_Commerce_Utlilty utils) {
		this.sharedResource = sharedResource;
		this.utils = utils;
		this.driver = sharedResource.getDriver();
		init_objects();
	}
	
	private void init_objects() {
		Addanewproduct = By.xpath("//h1[@class=\"float-left\"]");	
		Productname_txt = By.name("Name");
		Shortdescription_txt = By.id("ShortDescription");
		Fulldescription_txt = By.xpath("//iframe[@id=\"FullDescription_ifr\"]");
		SKU_txt = By.id("Sku");
		Published_CheckBox = By.xpath("//input[@id=\"Published\"]");
		Producttags_txt = By.xpath("//li[@class=\"placeholder\"]");
		GTIN_txtN = By.id("Gtin");
		Manufacturerpartnumber_txtN = By.id("ManufacturerPartNumber");
		Showonhomepage_CheckBox = By.id("ShowOnHomepage");
		Producttype_DropDown = By.id("ProductTypeId");
		Producttemplate_DropDown = By.id("ProductTemplateId");
		Vendor_DropDown = By.id("VendorId");
		Save_Button = By.xpath("//button[@class=\"btn btn-primary\"][1]");
		
	}

	public void userIsInAddaNewProductPage() throws Throwable {
		if (utils.CheckElementPresenceByLocator(Addanewproduct)) {
			System.out.println("user is in add a new product page");
		}
	}

	// Product Name
	public void setTextIntoProductName(String strProductNameValue) throws Throwable {
		if (driver.findElement(Productname_txt).isDisplayed()) {
			utils.SetTextOnEdit(Productname_txt, "Microsoft");
		}
	}

	// Shortdescription
	public void setTextIntoShortdescription(String strShortdescriptionValue) throws Throwable {
		if (driver.findElement(Shortdescription_txt).isDisplayed()) {
			utils.SetTextOnEdit(Shortdescription_txt, "OS");
		}
	}

	// Fulldescription
	public void setTextIntoFulldescription(String strFulldescriptionValue) throws Throwable {
		if (driver.findElement(Fulldescription_txt).isDisplayed()) {
			utils.SetTextOnEdit(Fulldescription_txt, "Operating System");
		}
	}

	// SKU
	public void setTextIntoSKU(String strSKUValue) throws Throwable {
		if (driver.findElement(SKU_txt).isDisplayed()) {
			utils.SetTextOnEdit(SKU_txt, "New");
		}
	}

	// Published_CheckBox
	public void selectIsPublishedCheckBox() throws Throwable {
		if (driver.findElement(Published_CheckBox).isDisplayed()) {
			driver.findElement(Published_CheckBox).click();
		}
	}

	// Producttags
	public void setTextIntoProducttags(String strSProducttagsValue) throws Throwable {
		if (driver.findElement(Producttags_txt).isDisplayed()) {
			utils.SetTextOnEdit(Producttags_txt, "Software");
		}
	}

	// GTIN
	public void setTextIntoGTIN(String strGTINValue) throws Throwable {
		if (driver.findElement(GTIN_txtN).isDisplayed()) {
			utils.SetTextOnEdit(GTIN_txtN, "234543");
		}
	}

	// Manufacturerpartnumber_txtN
	public void setTextIntoManufacturerpartnumber(String strManufacturerpartnumberValue) throws Throwable {
		if (driver.findElement(Manufacturerpartnumber_txtN).isDisplayed()) {
			utils.SetTextOnEdit(Manufacturerpartnumber_txtN, "675665");
		}
	}

	// Published_CheckBox
	public void selectShowonhomepageCheckBox() throws Throwable {
		if (driver.findElement(Showonhomepage_CheckBox).isDisplayed()) {
			driver.findElement(Showonhomepage_CheckBox).click();
		}
	}

	// Producttype selection
	public void SelectItemInProducttypeDropDown(String strProducttypeToSelect) throws Throwable {
		if (driver.findElement(Producttype_DropDown).isDisplayed()) {

			Select customerRoleDropdown = new Select(driver.findElement(Producttype_DropDown));
			customerRoleDropdown.selectByVisibleText("Grouped (product with variants)");
			Thread.sleep(5000);
		}
	}

	// Producttemplate selection
	public void SelectItemInProducttemplateDropDown(String strProducttemplateToSelect) throws Throwable {
		if (driver.findElement(Producttemplate_DropDown).isDisplayed()) {

			Select customerRoleDropdown = new Select(driver.findElement(Producttemplate_DropDown));
			customerRoleDropdown.selectByVisibleText("Simple product");
			Thread.sleep(5000);
		}
	}

	// Vendor selection
	public void SelectItemInVendorDropDown(String strVendorToSelect) throws Throwable {
		if (driver.findElement(Vendor_DropDown).isDisplayed()) {

			Select customerRoleDropdown = new Select(driver.findElement(Vendor_DropDown));
			customerRoleDropdown.selectByVisibleText("Vendor 1");
			Thread.sleep(5000);
		}
	}

	// Save button
	public void ClickonSavebutton() throws Throwable {
		if (driver.findElement(Save_Button).isDisplayed()) {
			driver.findElement(Save_Button).click();
			Thread.sleep(2000);
		}
	}

}
