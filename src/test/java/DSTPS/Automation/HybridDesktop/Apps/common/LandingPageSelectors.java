package DSTPS.Automation.HybridDesktop.Apps.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;

public class LandingPageSelectors {
	
	private By WELCOME_MESSAGE,LOGOUT_BUTTON;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public LandingPageSelectors(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		LandingPage_Objects();
	}
	
	private void LandingPage_Objects()
	{
		WELCOME_MESSAGE = By.xpath("//*[@id='jumpToForm']/div/span");
		LOGOUT_BUTTON =By.xpath("//span[contains(text(),'Logout')]"); 		
	}
	
	public String getWelcomeMessage() throws Throwable{
		return utils.GetElementText(WELCOME_MESSAGE);
	}
}
