package com.nop.commerce.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class SharedResource {
	
	private final static Log LOGGER = LogFactory.getLog(SharedResource.class);
	public static ThreadLocal<WebDriver> Tdriver = new ThreadLocal<WebDriver>();
	private static Properties pf = null;
	
	@Before
	public void beforeTest(Scenario scenario) throws IOException
	{			
		WebDriver driver;
		ReadProp();
		try{
			if(!getDriver().toString().contains("null"))
			{
//				performLaunchAndLoginAgain=false;
				return;				
			}
			
		}catch(Exception e)
		{
			driver= null;
//			performLaunchAndLoginAgain=true;
			System.out.println("driver is set to null ");
		}
		String myBrowser =getProperties().getProperty("BrowserName");        
		System.out.println("-----------***BeforeTest Running ***-------------");
		System.out.println("-----------Running scenario ***"+ scenario.getName() +"***-------------");
		LOGGER.info("-----------BeforeTest Running-------------");	
		driver=null;
		switch(myBrowser.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		 	driver = new ChromeDriver();	 	
		 	break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
		 	break;
		case "microsoftedge":
			System.setProperty("webdriver.edge.driver", "C:\\selenium\\msedgedriver.exe");		
			driver = new EdgeDriver();
		 	break;
		default:
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		 	driver = new ChromeDriver();	 	
		 	break;
		}
		
        setWebDriver(driver);
        LOGGER.info("-----------Initalized driver thread Running-------------");
	 	driver.get("https://admin-demo.nopcommerce.com/login");
	 	System.out.println(driver.getTitle());
	 	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	 	driver.manage().window().maximize();
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
		getDriver().quit();		
	}	

	public void includeSnapshot(Scenario scenario)
	{
		scenario.log("Completed Scenario");
		if(scenario.isFailed())
		{
			scenario.attach(((TakesScreenshot) ((Object) getDriver())).getScreenshotAs(OutputType.BYTES),"image/png","");
		}	
	}
	public void ReadProp() throws IOException
	{
		FileInputStream f1= new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\config\\nop_commerce.properties");
		if(pf==null) {
			pf = new Properties();
			pf.load(f1);
		}
		else {
			pf.load(f1);
		}
	}
	
	public Properties getProperties() {
		return pf;
	}
}
