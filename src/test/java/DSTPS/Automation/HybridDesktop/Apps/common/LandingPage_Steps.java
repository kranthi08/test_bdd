package DSTPS.Automation.HybridDesktop.Apps.common;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
//import DSTPS.Automation.HybridDesktop.GroupAutomation.pages.LandingPageSelectors;
//import DSTPS.Automation.HybridDesktop.GroupAutomation.pages.LaunchPageSelectors;
import DSTPS.Automation.HybridDesktop.Apps.common.LandingPageSelectors;

public class LandingPage_Steps {
	
	LandingPageSelectors landingPageSelectors;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public LandingPage_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// linitilize all the pages you are handling 
		landingPageSelectors = new LandingPageSelectors(SharedResource,utils);
	}
	
	public void SelectApplication(Map<String,String> menu) throws Throwable{		
		String MenuDetails= menu.get("menu");
		Assert.assertTrue(landingPageSelectors.getWelcomeMessage().contains("Welcome,"));
		utils.HybridDeaktop_MenuNavigation(MenuDetails);				
	}
	
	

}
