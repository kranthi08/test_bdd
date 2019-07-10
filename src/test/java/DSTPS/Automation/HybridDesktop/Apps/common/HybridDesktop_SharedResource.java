package DSTPS.Automation.HybridDesktop.Apps.common;

import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.os.WindowsUtils;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;



//import com.github.mkolisnyk.cucumber.reporting.CucumberResultsOverview;

public class HybridDesktop_SharedResource {
	
	private final static Log LOGGER = LogFactory.getLog(HybridDesktop_SharedResource.class);
	public static ThreadLocal<WebDriver> Tdriver = new ThreadLocal<WebDriver>();	
	public static boolean performLaunchAndLoginAgain;
	
	public int i =0;
	
	@Before
	public void beforeTest(Scenario scenario)
	{			
			
		//String node_url = "http://10.117.161.44:4444/wd/hub";		
		//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "\\Drivers\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/Drivers/chromedriver.exe");
		
		//WebDriver driver=getDriver();
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
			//WindowsUtils.killByName("chromedriver.exe");
			//WindowsUtils.killByName("toolbar.exe");
			//WindowsUtils.killByName("RxNova.exe");
			performLaunchAndLoginAgain=true;
			System.out.println("driver is set to null ");
		}
		String myBrowser ="chrome";        
		System.out.println("-----------***BeforeTest Running ***-------------");
		System.out.println("-----------Running scenario ***"+ scenario.getName() +"***-------------");
		LOGGER.info("-----------BeforeTest Running-------------");	
		driver=null;
		if(myBrowser.equals("chrome")){			
			//WindowsUtils.killByName("toolbar.exe");
		   	//System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Trainings\\ChromeDriver_2.36\\chromedriver.exe");//"S:/ALL/CSRE/Grid/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		 	ChromeOptions options = new ChromeOptions();		 	
		 	//options.setBinary("C:/Program Files (x86)/Argus/RxNova.exe");
		 	options.setBinary("C:/Program Files (x86)/RxNova/RxNova.exe"); //Changed from Argus to RxNova for the latest version 181f
		 	options.addArguments("--start-maximized");		 	
		 	options.addArguments("--disable-dev-shm-usage");
		 	options.addArguments("--no-sandbox");
		 	
		 	driver = new ChromeDriver(options);	 	
		 	//driver.get("https://argusprod-int.dstcorp.net/sso-web/logon.jsf"); 
		 	driver.get("https://dev-web/sso-web/logon.jsf"); 
		 	System.out.println(driver.getTitle());
		 	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
            /*DesiredCapabilities cap = new DesiredCapabilities().chrome();
            cap.setBrowserName("chrome");
            cap.setPlatform(Platform.WINDOWS);
            driver = new RemoteWebDriver(new URL(node_url),cap);*/
        }
        setWebDriver(driver);
        //getDriver().manage().window().maximize();        
        getDriver().manage().timeouts().pageLoadTimeout(500, TimeUnit.SECONDS);
        getDriver().manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);       
        LOGGER.info("-----------Initalized driver thread Running-------------");
	}
	

//	@Before
//	public void beforeTestScenario(Scenario scenario)
//	{
//	  System.out.println("-----------Running scenario ***"+ scenario.getName() +"***-------------");
//	}
	
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

//	@After
//	public void afterTest(Scenario scenario)
//	{		
//		includeSnapshot(scenario);
//		//System.out.println("-----------AfterTest Running-------------");
//		//LOGGER.info("-----------AfterTest Running-------------");
//		//getDriver().quit();
//		//Tdriver.set(null);		
//	}
	
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
