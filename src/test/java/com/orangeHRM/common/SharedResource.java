package com.orangeHRM.common;

import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;



//import com.github.mkolisnyk.cucumber.reporting.CucumberResultsOverview;

public class SharedResource {
	
	private final static Log LOGGER = LogFactory.getLog(SharedResource.class);
	public static ThreadLocal<WebDriver> Tdriver = new ThreadLocal<WebDriver>();	
	public static boolean performLaunchAndLoginAgain;
	
	public int i =0;
	
	@Before
	public void beforeTest(Scenario scenario)
	{			
		WebDriver driver;
		
		try{
			if(!getDriver().toString().contains("null"))
			{
				performLaunchAndLoginAgain=false;
				return;				
			}
			
		}catch(Exception e)
		{
			driver= null;
			performLaunchAndLoginAgain=true;
			System.out.println("driver is set to null ");
		}
		String myBrowser ="chrome";        
		System.out.println("-----------***BeforeTest Running ***-------------");
		System.out.println("-----------Running scenario ***"+ scenario.getName() +"***-------------");
		LOGGER.info("-----------BeforeTest Running-------------");	
		driver=null;
		if(myBrowser.equals("chrome"))
		{			
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");		 	
		 	driver = new ChromeDriver();	 	
		 	driver.get("https://opensource-demo.orangehrmlive.com/");
		 	driver.manage().window().maximize();
		 	System.out.println(driver.getTitle());
		 	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        }
        setWebDriver(driver);        
        getDriver().manage().timeouts().pageLoadTimeout(500, TimeUnit.SECONDS);
        getDriver().manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);       
        LOGGER.info("-----------Initalized driver thread Running-------------");
	}
	public WebDriver getDriver()
	{
		return Tdriver.get();
	}	
	
	public void setWebDriver(WebDriver driver) {
		Tdriver.set(driver);
    }

	public Log getLogger()
	{
		return LOGGER;
	}

	@After
	public void afterTest(Scenario scenario)
	{		
		includeSnapshot(scenario);
		System.out.println("-----------AfterTest Running-------------");
		LOGGER.info("-----------AfterTest Running-------------");
		//getDriver().quit();
		//Tdriver.set(null);		
	}	

	public void includeSnapshot(Scenario scenario)
	{
		scenario.write("Completed Scenario");
		if(scenario.isFailed())
		{
			scenario.embed(((TakesScreenshot) ((Object) getDriver())).getScreenshotAs(OutputType.BYTES),"image/png");
		}	
	}
}
