package com.nop.commerce.steps;

import com.nop.commerce.common.SharedResource;
import com.nop.commerce.common.Nop_Commerce_Utlilty;
import com.nop.commerce.pages.Add_a_New_CustomerPage;

public class Add_a_New_CustomerPage_Steps {

	SharedResource sharedResource;
	Nop_Commerce_Utlilty utils;
	
	Add_a_New_CustomerPage addanewcustomerpage;
	
	public Add_a_New_CustomerPage_Steps(SharedResource sharedResource,Nop_Commerce_Utlilty utils) {
		this.sharedResource = sharedResource;
		this.utils = utils;
		init();	
	}
	
	public void init(){
		addanewcustomerpage = new Add_a_New_CustomerPage(sharedResource,utils);
	}
	
	public void inputAllTheRequiredValuesForNewUserCreation() throws Throwable {
		addanewcustomerpage.userIsInAddaNewCustomerPage();
		addanewcustomerpage.setTextIntoEmailEdit("");
		addanewcustomerpage.setTextIntoPasswordEdit("");
		addanewcustomerpage.setTextIntoFirstNameEdit("");
		addanewcustomerpage.setTextIntoLastNameEdit("");
		addanewcustomerpage.selectGenderMaleRadioButton();
		addanewcustomerpage.setTextIntoDateOfBirthEdit("");
		addanewcustomerpage.setTextIntoCompanyNameEdit("");
		addanewcustomerpage.selectIsTaxExemptCheckBox();
		//addanewcustomerpage.clickOnNewsLetterEdit("");
		//addanewcustomerpage.SelectItemInNewsLetterDropDown("");
		addanewcustomerpage.clickOnCustomerRolesEdit("");
		addanewcustomerpage.SelectItemInCustomerRolesDropDown("");
		addanewcustomerpage.SelectItemInManagerOfVendorDropDown("");
		addanewcustomerpage.selectActiveCheckBox();
		addanewcustomerpage.setTextIntoAdminCommetEdit("");
	}

}
