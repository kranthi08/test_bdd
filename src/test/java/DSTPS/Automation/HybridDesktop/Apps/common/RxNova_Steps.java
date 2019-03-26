package DSTPS.Automation.HybridDesktop.Apps.common;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

import org.openqa.selenium.*;
import org.openqa.selenium.os.WindowsUtils;

public class RxNova_Steps {	
		
	@SuppressWarnings("unused")
	private HybridDesktop_SharedResource SharedResource;	
	private WebDriver driver;
	private RxNova_Utlilty utils; 
	
	public enum Regions {DR1,DR2,DR3,RX2,QR1,QR2,QR3,UR1,UR2,RX6,QRF,UP1,UP2,UA1,UA2,UA3,UA4,UR3,UR4,UP3,UN1,UP6,UP7,PRODUCTION};
	private String RxNova_URL;	
	private String InputRegion=null;
	public static boolean isProduction;
	
	//,,,,,,,,,
	public enum Apps {		
		GROUP("GROUP"),
		AUTH("AUTH"),
		MEMBER("MEMBER"),
		CLAIM("CLAIM"),
		CONDITION("CONDITION"),
		ACCUMULATOR("ACCUMULATOR"),
		BENEFITS("BENEFITS"),
		MESSAGES("MESSAGES"),
		PRESCRIBER("PRESCRIBER"),
		DRUG("DRUG"),		
		ASSIGN_OPTIONS("ASSIGN OPTIONS"),
		COVERAGE_CODE("COVERAGE CODE"),
		MAINTENANCE_HISTORY("MAINTENANCE HISTORY"),
		DRUG_FILE_CHANGE_REPORTS("DRUG FILE CHANGE REPORTS"),
		DATA_DICTIONARY("DATA DICTIONARY"),
		DUR_PROTOCOLS("DUR PROTOCOLS"),
		CUSTOMER_CLIENT("CUSTOMER/CLIENT"),
		DUR_SAFETY("DUR SAFETY"),
		DRUG_LIST("DRUG LIST"),
		PHARMACY_LIST("PHARMACY LIST"),
		PRESCRIBER_LIST("PRESCRIBER LIST"),
		CUSTOMER_SET("CUSTOMER SET"),
		NETWORK_MAINTENANCE("NETWORK MAINTENANCE"),
		PHARMACY_MAINTENANCE("PHARMACY MAINTENANCE"),
		PHARMACY_SERVICE_FEES("PHARMACY SERVICE FEES"),
		FINANCIAL("FINANCIAL"),
		TAGS("TAGS"),
		PRICING("PRICING"),
		RXNOVA_INTEL("RxNova Intel");
		
		private String displayName;
		
		Apps(String displayName)
		{
			//System.out.println("First call is display name returned is displayName " + displayName);
			this.displayName = displayName;
		}
		
		public String displayName()
		{
			//System.out.println("display name returned is displayName " + displayName);
			return displayName;
		}
		
		@Override
		public String toString()
		{
		//	System.out.println("display name returned is toString " + displayName);
			return displayName;
		}
	};
	
	
	public RxNova_Steps(HybridDesktop_SharedResource SharedResource,RxNova_Utlilty utils)
	{
		this.SharedResource = SharedResource;	
		driver = SharedResource.getDriver();	
		this.utils = utils;		
	}			
	
	
	
	//@Given("^Open firefox and start RxNova Application$")
	//@Parameter()
	@Given("^Open firefox and Open RxNova URL$")	
	public void NavigateToRxNovaApplication() //throws InterruptedException
	{	
				
		System.out.println("-----------Open firefox and start RxNova Application-------------");				
		/*try
		{
			InputRegion = System.getProperty("Region");
			System.out.println("InputRegion from jenkins : " + InputRegion);
			System.out.println("ERROR: ***********************Region parameter is empty*******************");
			
		}
		catch(Exception e)
		{
			InputRegion = utils.pf.getProperty("Region");
			System.out.println("InputRegion from properties file : " + InputRegion);
		}*/
		
		if(System.getProperty("MavenRegion")==null)
		{
			InputRegion = utils.pf.getProperty("Region");			
		}
		else
		{
			InputRegion = System.getProperty("MavenRegion");
			System.out.println("In MAVEN PARAMETERS region");
		}
		
		switch(Regions.valueOf(InputRegion.toUpperCase()))
		{
			case QR1:
			case QR2:
			case QR3:
			case QRF:
			case RX6:
				{ RxNova_URL = "https://qc-web/sso-web/login.jsf";isProduction=false; break;}
			case DR1:
			case DR2:
			case DR3:				
			case RX2:
				{RxNova_URL = "https://dev-web/sso-web/login.jsf";isProduction=false; break;}			
			case UP1:			
			case UP3:
			case UP6:
			case UP7:
			case UN1:
			case UA1:
			case UA2:
			case UA3:
			case UA4:
			case UR1:
			case UR2:
			case UR3:
			case UR4:
				{RxNova_URL = "https://beta.argushealth.com/sso-web/login.jsf?";isProduction=false; break;}
			case PRODUCTION:
				{RxNova_URL = "https://www.argushealth.com/sso-web/login.jsf?";isProduction=true;break;}
			default:
				{ System.out.println("Invalid Region - please check the Region name");break;}
		}
		System.out.println("-----------" + RxNova_URL +"-------------");
		driver.get(RxNova_URL);		
		System.out.println("-----------Completed Open firefox and start RxNova Application-------------");
	}
	
	@When("^User enters valid username, valid password and clicks on Login$")	
	public void Login() throws InterruptedException
	{
		System.out.println("-----------user enters valid username, valid password and click on Login-------------");
		String InputUsername=null,InputPassword=null;
		/*System.out.println("UserName :" + UserName);
		System.out.println("Password :" + Password);*/
		if(System.getProperty("MavenUsername")==null)
		{
			InputUsername = utils.pf.getProperty("UserName");			
		}
		else
		{
			InputUsername = System.getProperty("MavenUsername");
			System.out.println("In MAVEN PARAMETERS username");
		}
		if(System.getProperty("MavenPassword")==null)
		{
			InputPassword = utils.pf.getProperty("Password");
		}
		else
		{
			InputPassword = System.getProperty("MavenPassword");
			System.out.println("In MAVEN PARAMETERS password");
		}
		
		// random number for dynimic login's
		Random r = new Random();
		//int value = r.ints(1000, (10000 + 1000)).limit(1000).findFirst().getAsInt();
		int n = r.nextInt(10) + 1;
		int value = n*200 * r.nextInt(10);
		System.out.println("Randomly waiting for " + value);
		Thread.sleep(value);		
		driver.findElement(By.id("loginForm:principal")).sendKeys(InputUsername);
		driver.findElement(By.id("loginForm:credentials")).sendKeys(InputPassword);
		int n1 = r.nextInt(10) + 1;
		int value1 = n1*100 * r.nextInt(10);
		System.out.println("Randomly waiting for " + value1);
		Thread.sleep(value1);
		driver.findElement(By.xpath("//*[@id='loginForm:loginButton']/span")).click();
		Thread.sleep(5000);
		System.out.println(" $$$$$$$$$$$$$$$$$$$$$ Current Title :" + driver.getTitle());
		if(driver.getTitle().contains("Application Error"))
		{
			System.out.println("Current Title :" + driver.getTitle());
			System.out.println(" $$$$$$$$$$$$$$$$$$$$$ Refreshing the page $$$$$$$$$$$$$$$$$$$$$");
			driver.navigate().refresh();
			Thread.sleep(3000);
		}
		if(driver.getTitle().contains("RxNova SSO Login"))
		{
			//driver.findElement(By.id("messagesForm:globalMessages")).getText();
			System.out.println(driver.findElement(By.id("messagesForm:globalMessages")).getText());
			
			//driver.findElement(By.id("messagesForm:globalMessages")).getText();			
			//"Login FailureWe're unable to complete the login with the specified credentials. After three consecutive failed attempts your user ID will be locked. (ASEC0101)"

			if(driver.findElement(By.id("messagesForm:globalMessages")).getText().contains("Login Failure") || driver.findElement(By.id("messagesForm:globalMessages")).getText().contains("Account Locked"))
			{
				Assert.assertEquals("Login Failure","Login Failure1");
			}		
		
		}
	}
		
	@Then("^Application should display Environment selection screen$")
	public void VerifyUserLogin() throws Throwable {
		if(isProduction)
		{
			System.out.println("in prod region");
			return;
		}
		System.out.println("-----------user should be able to login sucessfully-------------");		
		WebDriverWait wb=new WebDriverWait(driver,500);
		wb.until(ExpectedConditions.presenceOfElementLocated(By.className("loginContent")));
	    String val = driver.findElement(By.className("loginContent")).getText();
	        
	    if(val.contains("Please Select The Environment"))
	    {
	    	System.out.println("Sucessful");
	    	//Reporter.log("Sucessful in login");
	    	//Assert.fail("Failed - login");
	    }
	    else if(driver.getTitle().contains("Application Error"))
		{
			System.out.println("Current Title :" + driver.getTitle());
			System.out.println(" $$$$$$$$$$$$$$$$$$$$$ Refreshing the page $$$$$$$$$$$$$$$$$$$$$");
			driver.navigate().refresh();
			Thread.sleep(3000);
		}else
	    {
	    	System.out.println("Not Sucessful");
	    	//Assert.fail("Failed - login");
	    	driver.navigate().refresh();
			Thread.sleep(10000);
	    }			 	
	}
	
	@Then("^User selects Region and Landing page should be displayed$")
	public void RegionSelection() throws Throwable {
		
		if(driver.getTitle().contains("Application Error"))
		{
			System.out.println("Current Title :" + driver.getTitle());
			System.out.println(" $!$$$$$$$$$$$$$$$$$$$$ Refreshing the page $$$$$$$$$$$$$$$$$$$$$");
			driver.navigate().refresh();
			Thread.sleep(3000);
		}
		if(driver.getTitle().contains("RxNova SSO Login"))
		{
			//driver.findElement(By.id("messagesForm:globalMessages")).getText();
			System.out.println(driver.findElement(By.id("messagesForm:globalMessages")).getText());
			
			//driver.findElement(By.id("messagesForm:globalMessages")).getText();			
			//"Login FailureWe're unable to complete the login with the specified credentials. After three consecutive failed attempts your user ID will be locked. (ASEC0101)"
			
			if(driver.findElement(By.id("messagesForm:globalMessages")).getText().contains("Login Failure") || driver.findElement(By.id("messagesForm:globalMessages")).getText().contains("Account Locked"))
			{
				Assert.assertEquals("Login Failure","Login Failure1");
			}		
		
		}
		if(isProduction)
		{
			System.out.println("in prod region");
			return;
		}
		System.out.println("-----------User should be able to click on QR1 Region-------------");
		driver.findElement(By.linkText(InputRegion)).click();	
		Thread.sleep(5000);	
		if(driver.getTitle().contains("Application Error"))
		{
			System.out.println("Current Title :" + driver.getTitle());
			System.out.println(" $!$$$$$$$$$$$$$$$$$$$$ Refreshing the page $$$$$$$$$$$$$$$$$$$$$");
			driver.navigate().refresh();
			Thread.sleep(3000);
			System.out.println("Current Title after refresh:" + driver.getTitle());
		}
		/*if(driver.getTitle().contains("RxNova SSO Login"))
		{
			//driver.findElement(By.id("messagesForm:globalMessages")).getText();
			System.out.println(driver.findElement(By.id("messagesForm:globalMessages")).getText());
			
			//driver.findElement(By.id("messagesForm:globalMessages")).getText();			
			//"Login FailureWe're unable to complete the login with the specified credentials. After three consecutive failed attempts your user ID will be locked. (ASEC0101)"
			
			if(driver.findElement(By.id("messagesForm:globalMessages")).getText().contains("Login Failure"))
			{
				Assert.assertEquals("Login Failure","Login Failure1");
			}		
		
		}*/
		
	}		
	
/*	@Then("^User selects \"(.*)\" Region and Landing page should be displayed$")
	public void RegionSelectionByRegionName(String InputRegion) throws Throwable {
		System.out.println("-----------User should be able to click on " + InputRegion +" Region-------------");
		driver.findElement(By.linkText(InputRegion)).click();	
		Thread.sleep(5000);		
	}*/
	
	@Given("^Region \"(.*)\"$")
	public void RegionSelectionByRegionName(String InputRegion) throws Throwable {
		if(driver.getTitle().contains("Application Error"))
		{
			System.out.println("Current Title :" + driver.getTitle());
			System.out.println(" $*$$$$$$$$$$$$$$$$$$$$ Refreshing the page $$$$$$$$$$$$$$$$$$$$$");
			driver.navigate().refresh();
			Thread.sleep(3000);
		}
		if(isProduction)
		{
			System.out.println("in prod region");
			return;
		}
		return;	
	}
	
	@Given("^Landing Page user navigates to \"(.*)\" application$")
	public void NavigateApplication(String ApplicationPath) throws Throwable {
		
		System.out.println("-----------Landing Page user navigates to Group application -------------");
		String APPPath = "";
		if(ApplicationPath!="")
		{
			String enumValue=null;
			/*if(ApplicationPath.contains("/"))
			{
				enumValue = ApplicationPath.replace("/", "_").toUpperCase();
			}*/
			if(ApplicationPath.contains(" "))
			{
				enumValue = ApplicationPath.replace(" ", "_").toUpperCase();
			}
			else
			{
				enumValue = ApplicationPath.toUpperCase();
			}
			//System.out.println(" application selected is " + Apps.valueOf(enumValue));	
			switch(Apps.valueOf(enumValue))
			{				
				case GROUP:
				{	APPPath = "Customer Setup|Hierarchy|Group"; System.out.println("Group was selected");break;}
				case MEMBER:
				{	APPPath = "Customer Setup|Hierarchy|Member";System.out.println("MEMBER was selected");break;}
				case AUTH:
				{	APPPath = "Auth|Auth";System.out.println("Auth was selected");break;}
				case CLAIM:
				{	APPPath = "Claim|Claim";System.out.println("Claim was selected");break;}
				case CUSTOMER_SET:
				{	APPPath = "Customer Setup|Hierarchy|Customer Set";System.out.println("Customer Set was selected");break;}
				case CUSTOMER_CLIENT:
				{	APPPath = "Customer Setup|Hierarchy|Customer / Client";System.out.println("Customer/Client was selected");break;}
				case ASSIGN_OPTIONS:
				{	APPPath = "Customer Setup|Processing Options|Assign Options";System.out.println("Assign Options was selected");break;}
				case PRICING:
				{	APPPath = "Plan Setup|Pricing";System.out.println("Pricing was selected");break;}
				case ACCUMULATOR:
				{	APPPath = "Plan Setup|Accumulator";System.out.println("Accumulator was selected");break;}	
				case BENEFITS:
				{	APPPath = "Plan Setup|Benefits";System.out.println("Benefits was selected");break;}		
				case CONDITION:
				{	APPPath = "Plan Setup|Conditions";System.out.println("Conditions was selected");break;}
				case COVERAGE_CODE:
				{	APPPath = "Plan Setup|Coverage Code";System.out.println("Coverage Code was selected");break;}					
				case DUR_PROTOCOLS:
				{	APPPath = "Plan Setup|DUR Protocols";System.out.println("DUR Protocols was selected");break;}
				case DUR_SAFETY:
				{	APPPath = "Plan Setup|DUR Safety";System.out.println("DUR Safety was selected");break;}
				case MESSAGES:
				{	APPPath = "Plan Setup|Messages";System.out.println("Messages was selected");break;}
				case DRUG_LIST:
				{	APPPath = "Lists|Drug List";System.out.println("Drug List was selected");break;}
				case PHARMACY_LIST:
				{	APPPath = "Lists|Pharmacy List";System.out.println("Pharmacy List was selected");break;}
				case PRESCRIBER_LIST:
				{	APPPath = "Lists|Prescriber List";System.out.println("Prescriber List was selected");break;}
				case MAINTENANCE_HISTORY:
				{	APPPath = "History|Maintenance History";System.out.println("Maintenance History was selected");break;}
				case PRESCRIBER:
				{	APPPath = "Provider|Prescriber";System.out.println("Prescriber was selected");break;}
				case DRUG:
				{	APPPath = "Drug|Drug";System.out.println("Drug was selected");break;}
				case DRUG_FILE_CHANGE_REPORTS:
				{	APPPath = "Drug|Drug File Change Reports";System.out.println("Drug File Change Reports was selected");break;}
				case DATA_DICTIONARY:
				{	APPPath = "Help|Data Dictionary";System.out.println("Data Dictionary was selected");break;}		
				case NETWORK_MAINTENANCE:
				{	APPPath = "Provider|Network Maintenance";System.out.println("Network Maintenance was selected");break;}
				case PHARMACY_MAINTENANCE:
				{	APPPath = "Provider|Pharmacy Maintenance";System.out.println("Pharmacy Maintenance was selected");break;}
				case PHARMACY_SERVICE_FEES:
				{	APPPath = "Provider|Pharmacy Service Fees";System.out.println("Pharmacy Service Fees was selected");break;}
				case FINANCIAL:
				{	APPPath = "Provider|Financial";System.out.println("Financial was selected");break;}
				case TAGS:
				{	APPPath = "Plan Setup|Tags";System.out.println("Tags was selected");break;}				
				case RXNOVA_INTEL:
				{ APPPath = "RxNova Intel|RxNova Intel";System.out.println("RxNova Intel was selected");break; }
				default :
				{ System.out.println("Invalid Application selection - please check the application name");break;}				
			}			
			utils.NavigateApplicationMenu(APPPath);		
			utils.RxNova_PageSelection(APPPath);			
		}
	}	
	
	public void GoToApplicationBaseState(String strAppPath) throws Throwable {
		
		boolean applicationAvailabilityFlag=false;
		String[] arrAppPath = strAppPath.split("->");
		String ApplicationName = arrAppPath[1].toString();
		
		for(String WHandles: driver.getWindowHandles())
		 {
			driver.switchTo().window(WHandles);
			if(driver.getTitle().contains(ApplicationName))
			{				
			   System.out.println("SwithToWindow -" + driver.getTitle());
			   applicationAvailabilityFlag = true;
			   driver.switchTo().frame(0);	//"contentFrame"
			   break;
			}			
		 }
		
		if(applicationAvailabilityFlag==false)
		{
			utils.HybridDeaktop_MenuNavigation(strAppPath);
		}
   }	
	
	//Given Region "<RegionName>"
	
	
	
	/*@Given("^Landing Page user navigates to application$")
	public void NavigateApplication(DataTable Table) throws Throwable {
		List<List<String>> TableValues = Table.raw();
		String ApplicationPath = TableValues.get(0).get(0).toString();
		System.out.println("-----------Landing Page user navigating to " + ApplicationPath +" application -------------");
		String APPPath = "";
		if(ApplicationPath!="")
		{
			switch(Apps.valueOf(ApplicationPath.toUpperCase()))
			{
				case GROUP:
				{	APPPath = "Customer Setup|Hierarchy|Group"; System.out.println("Group was selected");break;}
				case MEMBER:
				{	APPPath = "Customer Setup|Hierarchy|Member";System.out.println("MEMBER was selected");break;}
				case AUTH:
				{	APPPath = "Auth|Auth";System.out.println("Auth was selected");break;}
				case CLAIM:
				{	APPPath = "Claim|Claim";System.out.println("Claim was selected");break;}
				default :
				{ System.out.println("Invalid Application selection - please check the application name");break;}				
			}			
			utils.NavigateApplicationMenu(APPPath);		
			utils.RxNova_PageSelection(APPPath);			
		}
	}	
	*/
	
	
//	@When("^User verifies Group screen and performs search using MCS, Customer and Client$")
//	public void VerifyGroupScreenAndPerformSearch() throws Throwable {
//		System.out.println("-----------User verifies Group screen and performs search using MCS, Customer and Client-------------");				
//	}
	
/*	@Then("^Group Search results should be displayed$")
	public void VerifyGroupSearchResults() throws Throwable {
		System.out.println("-----------Group Search results should be displayed-------------");				
	}*/
	
	
	


	

	
	
	
}
