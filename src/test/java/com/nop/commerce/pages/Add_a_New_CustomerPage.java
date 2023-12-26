package com.nop.commerce.pages;

import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import com.nop.commerce.common.SharedResource;
import com.nop.commerce.common.Nop_Commerce_Utlilty;

public class Add_a_New_CustomerPage {
	SharedResource sharedResource;
	Nop_Commerce_Utlilty utils;
	WebDriver driver;
	
	private By addANewCustomerPageHeader,newUser_Email, newUser_Password, newUser_FirstName, newUser_LastName;
	private By newUser_Gender_Male,newUser_Gender_FeMale;
	private By newUser_DateOfBirth,newUser_CompanyName,newUser_IsTaxExempt,newUser_NewsLetter_Edit,newUser_NewsLetter_DropDown;
	private By newUser_CustomerRoles_Edit,newUser_CustomerRoles_DropDown;
	private By newUser_ManagerOfVendor,newUser_Active,newUser_AdminComment;
	private By Save_Btn,SaveAndContinueEdit_Btn;
	
	public Add_a_New_CustomerPage(SharedResource sharedResource, Nop_Commerce_Utlilty utils) {
		this.sharedResource = sharedResource;
		this.utils = utils;
		this.driver = sharedResource.getDriver();
		
		init_objects();
	}
	
	private void init_objects() {
		addANewCustomerPageHeader = By.xpath("//div[@class='content-header clearfix']");
		Save_Btn = By.name("save");
		SaveAndContinueEdit_Btn = By.name("save-continue");
		newUser_Email = By.id("Email"); 
		newUser_Password = By.id("Password"); 
		newUser_FirstName = By.id("FirstName");
		newUser_LastName = By.id("LastName");
		newUser_Gender_Male = By.id("Gender_Male");
		newUser_Gender_Male = By.id("Gender_Female");
		newUser_DateOfBirth = By.id("DateOfBirth");
		newUser_CompanyName = By.id("Company");
		newUser_IsTaxExempt = By.id("IsTaxExempt");
		newUser_NewsLetter_Edit = By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']");
		newUser_NewsLetter_DropDown = By.xpath("//select[@id='SelectedNewsletterSubscriptionStoreIds']");
		newUser_CustomerRoles_Edit = By.xpath("(//div[@class='k-multiselect-wrap k-floatwrap'])[2]");
		newUser_CustomerRoles_DropDown = By.id("SelectedCustomerRoleIds");
		newUser_ManagerOfVendor = By.id("VendorId");
		newUser_Active = By.id("Active");
		newUser_AdminComment = By.id("AdminComment");
	}

	public void userIsInAddaNewCustomerPage() throws Throwable {
		if(utils.CheckElementPresenceByLocator(addANewCustomerPageHeader)) {
			System.out.println("user is in add a new customer page");
		}
	}
	
	//Email Edit
	public void setTextIntoEmailEdit(String strEmailEditValue) throws Throwable {
		if(driver.findElement(newUser_Email).isDisplayed() && StringUtils.isNotBlank(strEmailEditValue)) {
			utils.SetTextOnEdit(newUser_Email,strEmailEditValue ); // "abc@google.com"
		}
	}
	
	// Password Edit
	public void setTextIntoPasswordEdit(String strPasswordEditValue) throws Throwable {
		if(driver.findElement(newUser_Password).isDisplayed() && StringUtils.isNotBlank(strPasswordEditValue)) {
			utils.SetTextOnEdit(newUser_Password,strPasswordEditValue  ); //"abc@google1"
		}
	}
	
	// First Name Edit
	public void setTextIntoFirstNameEdit(String strFirstNameEditValue) throws Throwable {
		if(driver.findElement(newUser_FirstName).isDisplayed() && StringUtils.isNotBlank(strFirstNameEditValue)) {
			utils.SetTextOnEdit(newUser_FirstName,strFirstNameEditValue );//"shafi"
		}
	}
	
	// Last Name Edit
	public void setTextIntoLastNameEdit(String strLastNameEditValue) throws Throwable {
		if(driver.findElement(newUser_LastName).isDisplayed() && StringUtils.isNotBlank(strLastNameEditValue)) {
			utils.SetTextOnEdit(newUser_LastName,strLastNameEditValue ); // "rafi"
		}
	}
	
	// Gender - Male radio button
	public void selectGenderMaleRadioButton() throws Throwable {
		if(driver.findElement(newUser_Gender_Male).isDisplayed()) {
			driver.findElement(newUser_Gender_Male).click();
		}
	}

	// Gender - FeMale radio button
	public void selectGenderFeMaleRadioButton() throws Throwable {
		if(driver.findElement(newUser_Gender_FeMale).isDisplayed()) {
			driver.findElement(newUser_Gender_FeMale).click();
			Thread.sleep(2000);
		}
	}
	
	// Date of Birth Edit
	public void setTextIntoDateOfBirthEdit(String strDateOfBirthEditValue) throws Throwable {
		if(driver.findElement(newUser_DateOfBirth).isDisplayed() && StringUtils.isNotBlank(strDateOfBirthEditValue)) {
			driver.findElement(newUser_DateOfBirth).sendKeys(strDateOfBirthEditValue);//"01/01/1980"
			Thread.sleep(2000);
		}
	}

	// Company Name Edit
	public void setTextIntoCompanyNameEdit(String strCompanyNameEditValue) throws Throwable {
		if(driver.findElement(newUser_CompanyName).isDisplayed() && StringUtils.isNotBlank(strCompanyNameEditValue)) {
			driver.findElement(newUser_CompanyName).sendKeys(strCompanyNameEditValue); // "New Stock Board"
			Thread.sleep(2000);
		}
	}

	// Is tax exempt check box
	public void selectIsTaxExemptCheckBox() throws Throwable {
		if(driver.findElement(newUser_IsTaxExempt).isDisplayed()) {
			driver.findElement(newUser_IsTaxExempt).click();
		}
	}
	
	// News Letter Edit
	public void clickOnNewsLetterEdit() throws Throwable {
		if(driver.findElement(newUser_NewsLetter_Edit).isDisplayed()) {
			driver.findElement(newUser_NewsLetter_Edit).click();
			Thread.sleep(3000);
		}
	}
	
	// New Letter Drop down
	public void SelectItemInNewsLetterDropDown(String strNewsLetterToSelect) throws Throwable {
		if(driver.findElement(newUser_NewsLetter_DropDown).isDisplayed() && StringUtils.isNotBlank(strNewsLetterToSelect)) {
			System.out.println("newUser_NewsLetter_DropDown - Displayed");
			Select newsletterDropdown = new Select(driver.findElement(newUser_NewsLetter_DropDown));
			newsletterDropdown.selectByVisibleText("Your store name");
			System.out.println("newUser_NewsLetter_DropDown - 'Your store name' item selected in drop down");
			Thread.sleep(5000);
		}
	}

	// Customer roles edit
	public void clickOnCustomerRolesEdit(String strNewsLetter) throws Throwable {
		if(driver.findElement(newUser_CustomerRoles_Edit).isDisplayed() && StringUtils.isNotBlank(strNewsLetter)) {
			driver.findElement(newUser_CustomerRoles_Edit).click();
			Thread.sleep(5000);
		}
	}

	// Customer role selection
	public void SelectItemInCustomerRolesDropDown(String strCustomerRoleToSelect) throws Throwable {
		if(driver.findElement(newUser_CustomerRoles_DropDown).isDisplayed() && StringUtils.isNotBlank(strCustomerRoleToSelect)) {
			Select customerRoleDropdown = new Select(driver.findElement(newUser_CustomerRoles_DropDown));
			customerRoleDropdown.selectByVisibleText("Guests");
			Thread.sleep(5000);
		}
	}
	// Manager of Vendor selection
	public void SelectItemInManagerOfVendorDropDown(String strManagerOfVendorToSelect) throws Throwable {
		if(driver.findElement(newUser_ManagerOfVendor).isDisplayed() && StringUtils.isNotBlank(strManagerOfVendorToSelect)) {
			utils.SelectItemFromWebList(newUser_ManagerOfVendor, "Vendor 1");
		}
	}
	
	// Active check box
	public void selectActiveCheckBox() throws Throwable {
		if(driver.findElement(newUser_Active).isDisplayed()) {
			utils.SelectCheckBox(newUser_Active);
		}
	}
	
	// Admin Comment Edit
	public void setTextIntoAdminCommetEdit(String strCompanyNameEditValue) throws Throwable {
		if(driver.findElement(newUser_AdminComment).isDisplayed() && StringUtils.isNotBlank(strCompanyNameEditValue)) {
			utils.SetTextOnEdit(newUser_AdminComment, "No comment");
		}
	}

	

}
