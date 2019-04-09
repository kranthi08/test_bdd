package DSTPS.Automation.HybridDesktop.Apps.common;

import java.util.Map;
import java.util.Random;

import org.openqa.selenium.WebDriver;

import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
//import DSTPS.Automation.HybridDesktop.GroupAutomation.pages.LaunchPageSelectors;
import DSTPS.Automation.HybridDesktop.Apps.common.LaunchPageSelectors;
import cucumber.api.Scenario;

public class LaunchPage_Steps {
	
	LaunchPageSelectors launchPage;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public LaunchPage_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		launchPage = new LaunchPageSelectors(SharedResource,utils);
	}
	
		
	public void PerformLogin(Map<String,String> MenuDetails) throws Throwable{
		
		String strInputUsername=null,strInputPassword=null;
		String strInputRegion=null;
		
		strInputUsername = MenuDetails.get("userid");
		strInputPassword = MenuDetails.get("password");
		strInputRegion = MenuDetails.get("region");
		
		
		System.out.println("-----------user enters valid username, valid password and click on Login-------------");
		
		/*System.out.println("UserName :" + UserName);
		System.out.println("Password :" + Password);*/
		if(System.getProperty("MavenUsername")==null)
		{
			strInputUsername = utils.pf.getProperty("UserName");			
		}
		else
		{
			strInputUsername = System.getProperty("MavenUsername");
			System.out.println("In MAVEN PARAMETERS username");
		}
		if(System.getProperty("MavenPassword")==null)
		{
			strInputPassword = utils.pf.getProperty("Password");
		}
		else
		{
			strInputPassword = System.getProperty("MavenPassword");
			System.out.println("In MAVEN PARAMETERS password");
		}
		
		if(System.getProperty("MavenRegion")==null)
		{
			strInputRegion = utils.pf.getProperty("Region");			
		}
		else
		{
			strInputRegion = System.getProperty("MavenRegion");
			System.out.println("In MAVEN PARAMETERS Region");
		}
		
		// random number for dynimic login's
		Random r = new Random();
		//int value = r.ints(1000, (10000 + 1000)).limit(1000).findFirst().getAsInt();
		int n = r.nextInt(10) + 1;
		int value = n*200 * r.nextInt(10);
		System.out.println("Randomly waiting for " + value);
		Thread.sleep(value);		
		launchPage.LaunchPage_enterUserName(strInputUsername);
		launchPage.LaunchPage_enterPassword(strInputPassword);
		int n1 = r.nextInt(10) + 1;
		int value1 = n1*100 * r.nextInt(10);
		System.out.println("Randomly waiting for " + value1);
		Thread.sleep(value1);		
		launchPage.LaunchPage_SelectRegion(strInputRegion);
		launchPage.LaunchPage_ClickOnLoginButton();
		Thread.sleep(5000);
	}
	
}
