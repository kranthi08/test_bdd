package com.nop.commerce.steps;

import com.nop.commerce.common.SharedResource;

import java.util.HashMap;
import java.util.Map;

import com.nop.commerce.common.ExcelHelper;
import com.nop.commerce.common.Nop_Commerce_Utlilty;
import com.nop.commerce.pages.Add_a_New_CustomerPage;

public class Add_a_New_CustomerPage_Steps {

	SharedResource sharedResource;
	Nop_Commerce_Utlilty utils;
	
	Add_a_New_CustomerPage addanewcustomerpage;
	
	String strTestDataFilePath = System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\nop_commerce.xlsx";
	Map<String, String> testDataMap = null;
	
	public Add_a_New_CustomerPage_Steps(SharedResource sharedResource,Nop_Commerce_Utlilty utils) {
		this.sharedResource = sharedResource;
		this.utils = utils;
		init();	
	}
	
	public void init(){
		addanewcustomerpage = new Add_a_New_CustomerPage(sharedResource,utils);
	}
	
	public void inputAllTheRequiredValuesForNewUserCreation() throws Throwable {
		testDataMap = getTestDataFromExcelFile();
		
		addanewcustomerpage.userIsInAddaNewCustomerPage();
		addanewcustomerpage.setTextIntoEmailEdit(testDataMap.get("EmailEdit"));
		addanewcustomerpage.setTextIntoPasswordEdit(testDataMap.get("PasswordEdit"));
		addanewcustomerpage.setTextIntoFirstNameEdit(testDataMap.get("FirstNameEdit"));
		addanewcustomerpage.setTextIntoLastNameEdit(testDataMap.get("LastNameEdit"));
		if(testDataMap.get("newUser_Gender_Male").toLowerCase().equals("yes")) 
		{
			addanewcustomerpage.selectGenderMaleRadioButton();
		}
		else if(testDataMap.get("newUser_Gender_FeMale").toLowerCase().equals("yes")) 
		{
			addanewcustomerpage.selectGenderFeMaleRadioButton();
		}
		addanewcustomerpage.setTextIntoDateOfBirthEdit(testDataMap.get("newUser_DateOfBirth"));
		addanewcustomerpage.setTextIntoCompanyNameEdit(testDataMap.get("newUser_CompanyName"));
		if(testDataMap.get("newUser_IsTaxExempt").toLowerCase().equals("yes")) 
		{
			addanewcustomerpage.selectIsTaxExemptCheckBox();
		}
		addanewcustomerpage.clickOnNewsLetterEdit();
		addanewcustomerpage.SelectItemInNewsLetterDropDown(testDataMap.get("newUser_NewsLetter_DropDown"));
		addanewcustomerpage.clickOnCustomerRolesEdit(testDataMap.get(""));
		addanewcustomerpage.SelectItemInCustomerRolesDropDown(testDataMap.get("newUser_CustomerRoles_DropDown"));
		addanewcustomerpage.SelectItemInManagerOfVendorDropDown(testDataMap.get("newUser_ManagerOfVendor"));
		if(testDataMap.get("newUser_Active").toLowerCase().equals("yes")) 
		{
			addanewcustomerpage.selectActiveCheckBox();
		}
		addanewcustomerpage.setTextIntoAdminCommetEdit(testDataMap.get("newUser_AdminComment"));
	}
	
	public Map<String,String> getTestDataFromExcelFile() throws Throwable{
		return ExcelHelper.getTestDataInMap(strTestDataFilePath, "nop_commerce", "user_creation1"); 
	}









}
