package DSTPS.Automation.HybridDesktop.Apps.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.os.WindowsUtils;
import org.openqa.selenium.remote.RemoteWebDriver;

import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import cucumber.api.java.Before;


public class LaunchPageSelectors{
	
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	private By USERID;
	private By USERPWD;
	private By ENVIRONMENT;
	private By LOGINBUTTON;
	
	public LaunchPageSelectors(HybridDesktop_SharedResource SharedResource,RxNova_Utlilty utils) throws Throwable{
		driver = SharedResource.getDriver();
		this.utils = utils;		
		LaunchPage_Objects();
	}
	
	private void LaunchPage_Objects()
	{
		USERID = By.id("edtUsername");
		USERPWD = By.id("edtPassword");
		ENVIRONMENT = By.id("cboHostSel");
		LOGINBUTTON = By.id("btnOk");
	}
		
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public void LaunchPage_enterUserName(String strUserID) throws Throwable{	
		utils.SetTextOnEdit(USERID,strUserID);
	}
	
	public void LaunchPage_enterPassword(String strPassword) throws Throwable{	
		utils.SetTextOnEdit(USERPWD,strPassword);
	}
	
	public void LaunchPage_SelectRegion(String strRegion) throws Throwable{
		utils.SelectItemFromWebListByNameAndHyphen(ENVIRONMENT, strRegion);
	}
	
	public void LaunchPage_ClickOnLoginButton() throws Throwable{
		utils.ClickOnButton(LOGINBUTTON);
	}		
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	

}
