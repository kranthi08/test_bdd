package com.nop.commerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.nop.commerce.common.SharedResource;
import com.nop.commerce.common.Nop_Commerce_Utlilty;


public class DashboardPage {
	SharedResource sharedResource;
	Nop_Commerce_Utlilty utils;
	
	WebDriver driver;
	
	private By dashBoard_Header_Text, customer_Link, customerList_Link;
	private By Catalog_Link, Products_Link;
	
	public DashboardPage(SharedResource sharedResource, Nop_Commerce_Utlilty utils) {
		
		this.sharedResource = sharedResource;
		this.utils = utils;
		this.driver = sharedResource.getDriver();
		init_objects();
	}
	
	public void init_objects()
	{
		dashBoard_Header_Text = By.xpath("//div[@class='content-header']/h1");
		customer_Link = By.xpath("//ul[@class='nav nav-pills nav-sidebar flex-column nav-legacy']/li[4]/a");
		customerList_Link = By.xpath("//ul[@class='nav nav-pills nav-sidebar flex-column nav-legacy']/li[4]/ul/li/a");
		Catalog_Link = By.xpath("//i[@class=\"nav-icon fas fa-book\"]");
		Products_Link = By.xpath("//i[@class=\"nav-icon far fa-dot-circle\"]//following::p[1]");
	}

	public void user_is_in_dashboard_page()
	{
		if(driver.findElement(dashBoard_Header_Text).isDisplayed())
		{
			System.out.println("The user is in nop commerce application dashboard Page");
		}
	}
	
	public void click_on_customer_Link() throws Throwable
	{
		if(driver.findElement(customer_Link).isDisplayed()) {
			System.out.println("Customer link displayed");
			utils.ClickOnLink(customer_Link);
		}
	}
	
	public void click_on_customer_List_Link() throws Throwable
	{
		if(driver.findElement(customerList_Link).isDisplayed()) {
			System.out.println("Customer List link displayed");
			utils.ClickOnLink(customerList_Link);
		}
	}
	
	public void click_on_Catalog_Link() throws Throwable
	{
		if(driver.findElement(Catalog_Link).isDisplayed()) {
			System.out.println("Catalog Link displayed");
			utils.ClickOnLink(Catalog_Link);
		}
	}
	
	public void click_on_Products_Link() throws Throwable
	{
		if(driver.findElement(Products_Link).isDisplayed()) {
			System.out.println("Products Link displayed");
			utils.ClickOnLink(Products_Link);
		}
	}




}
