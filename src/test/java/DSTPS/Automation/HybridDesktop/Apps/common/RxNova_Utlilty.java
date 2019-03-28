package DSTPS.Automation.HybridDesktop.Apps.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumhq.jetty9.util.StringUtil;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import cucumber.runtime.Utils;
// review completed


public class RxNova_Utlilty {
	
	private HybridDesktop_SharedResource SharedResource;
	public WebDriver driver;
	public Log LOGGER;
	public Properties pf = new Properties();
	
	private static String winHandleLandingPage;
		
	public RxNova_Utlilty(HybridDesktop_SharedResource SharedResource) throws IOException
	{
		this.driver = SharedResource.getDriver();
		this.LOGGER = SharedResource.getLogger();
		ReadProp();
	}
	
	public void NavigateApplicationMenu(String strAppMenu) throws InterruptedException
	{
		try
		{
		Thread.sleep(2000);
		if(!driver.findElement(By.className("argusLogoRebrand")).isDisplayed())
		{
			System.out.println("**************************** In refresh mode ****************************" + strAppMenu);
			driver.navigate().refresh();
			Thread.sleep(10000);
		}
		}catch(NoSuchFrameException s)
		{
			System.out.println("**************************** NoSuchFrameException - In refresh mode ****************************" + strAppMenu);
			driver.navigate().refresh();
			Thread.sleep(10000);
		}		
		catch(Exception e)
		{
			System.out.println("**************************** Exception - In refresh mode ****************************" + strAppMenu);
			driver.navigate().refresh();
			Thread.sleep(10000);
		}
		
		Boolean boolNavigateApplicationMenu=false;
		int intCounter= 0;
		String[] arrApplication=null;
		if(!strAppMenu.trim().isEmpty())
		{
			arrApplication = strAppMenu.split("\\|");
			for(int i=0; i<=arrApplication.length-1; i++)
			{
				List<WebElement> listofMenuItems=driver.findElements(By.tagName("li"));				
			    for(WebElement v:listofMenuItems)
			    {			    	
			    	if (v.getText().equals(arrApplication[i]))
			    	{
			    		v.click();
			    		//System.out.println("Clicked on link -" + v.getText());
			    		LOGGER.info("***********Clicked on link **************" + v.getText());
			    		Thread.sleep(500);
			    		intCounter++;
			    		boolNavigateApplicationMenu= true;
			    		break;	    		
			    	}
			    }
			}
		}
		
		if(boolNavigateApplicationMenu==false | intCounter != arrApplication.length )
		{
			System.out.println("Unable to Navigate to application menu with details : " + strAppMenu);
		}
	}
	
	
	public void RxNova_PageSelection(String strAppName) throws Throwable
	{
		String SelectApp;
		Boolean boolRxNova_PageSelection=false;
		Set<String> handles = driver.getWindowHandles();		
		if(strAppName.toString().contains("|"))
		{
			String[] arrSelectApp = strAppName.split("\\|");			
			SelectApp = arrSelectApp[arrSelectApp.length-1];
		}
		else
		{
			SelectApp = strAppName.trim();	
		}
		
		
		for(String s: handles)
		{						
			if(driver.switchTo().window(s).getTitle().contains(SelectApp))
			{
				System.out.println("Page selected with title : " + driver.getTitle());				
				boolRxNova_PageSelection = true;
				break;
			}			
		}
		
		if(boolRxNova_PageSelection==false)
		{
			System.out.println("No Application page with name : '" + SelectApp + "' was found");
		}	
	}
	
	
	public void SetTextOnEdit(By objElementName, String strValue) throws Throwable
	{
		Boolean boolSetTextOnEdit=false;	
		int attempt = 0;
		while(attempt < 3)
		{
			try
			{
				if(driver.findElements(objElementName).size()!=0 && StringUtil.isNotBlank(strValue))
				{
					String strName = driver.findElement(objElementName).getAttribute("name");
					driver.findElement(objElementName).clear();
					driver.findElement(objElementName).sendKeys(strValue);
					boolSetTextOnEdit=true;
					System.out.println("Set text on webelement : " + strName + " Value :" + strValue );
					break;
				}
			}catch(Exception e){				
			}
			attempt++;
		}
		
		if(boolSetTextOnEdit==false)
		{
			System.out.println("Webelement with name  : '" + driver.findElement(objElementName).getAttribute("name") + "' was found");
		}
		
	}
	
   public void ClickOnEdit(By objElementName) throws Throwable
	{
		Boolean ClickOnEdit=false;	
		int attempt = 0;
		while(attempt < 3)
		{
			try
			{
				if(driver.findElements(objElementName).size()!=0)
				{
					String strName = driver.findElement(objElementName).getAttribute("name");
					driver.findElement(objElementName).click();
					ClickOnEdit=true;
					System.out.println("Cleared the default text on webelement : " + strName);
					break;
				}
			}catch(Exception e)
			{				
			}
			attempt++;
		}
		if(ClickOnEdit==false)
		{
			System.out.println("Webelement with name  : '" + driver.findElement(objElementName).getAttribute("name") + "' was not found");
		}
	}


	public void SelectItemFromWebList(By objElementName, String strValue) throws InterruptedException, NoSuchElementException
	{
		Boolean boolSelectItemFromWebList=false;
		try
		{
			if(driver.findElements(objElementName).size()!=0 && StringUtil.isNotBlank(strValue))
			{
				Select itemstoSelect =new Select(driver.findElement(objElementName));
				System.out.println("inside SelectItemFromWebList ");
				String strName = driver.findElement(objElementName).getAttribute("name");
				itemstoSelect.selectByVisibleText(strValue);			
				boolSelectItemFromWebList = true;
				System.out.println("Selected item in webelement : " + strName + " Value :" + strValue );
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
			try{
			if(driver.findElements(objElementName).size()!=0 && StringUtil.isNotBlank(strValue))
			{
				Select itemstoSelect =new Select(driver.findElement(objElementName));
				String strName = driver.findElement(objElementName).getAttribute("name");
				List<WebElement> allOptions = itemstoSelect.getOptions();
				for(WebElement i:allOptions){
					//System.out.println(i.getText());
					if(i.getText().equalsIgnoreCase(strValue)){
						String tvalue = i.getText();
						itemstoSelect.selectByVisibleText(tvalue);
						boolSelectItemFromWebList = true;
						System.out.println("Selected item in webelement : " + strName + " Value :" + strValue );
						break;
					}
				}				
			}
			}catch(Exception s){
			}
		}
		
		if(boolSelectItemFromWebList==false)
		{
			System.out.println("Webelement with name  : '" + driver.findElement(objElementName).getAttribute("name") + "' was not found");
		}
	}	


	public void ClickOnButton(By objElementName) throws Throwable
	{
		Boolean boolClickOnButton=false;	
		int attempts=0;
		while(attempts < 3 && driver.findElements(objElementName).size()!=0)
		{
			try
			{
				WaitUntilWebElementExist(objElementName);
				if(driver.findElements(objElementName).size()!=0)
				{
					String strName = driver.findElement(objElementName).getAttribute("name");
					driver.findElement(objElementName).click();
					Thread.sleep(3000);
					boolClickOnButton = true;
					System.out.println("Clicked on webelement : " + strName);
				}
				break;
			}catch(StaleElementReferenceException e){				
			}
			attempts++;
			System.out.println(attempts);
		}
		
		if(boolClickOnButton==false)
		{
			System.out.println("Webelement with name  : '" + driver.findElement(objElementName).getAttribute("name") + "' was not found");
		}
	}	
	
	
//	public void ClickOnButton(By objElementName)
//	{
//		Boolean boolClickOnButton=false;		
//		if(driver.findElements(objElementName).size()!=0)
//		{
//			String strName = driver.findElement(objElementName).getAttribute("name");
//			driver.findElement(objElementName).click();
//			boolClickOnButton = true;
//			System.out.println("Clicked on webelement : " + strName);
//		}
//		
//		if(boolClickOnButton==false)
//		{
//			System.out.println("Webelement with name  : '" + driver.findElement(objElementName).getAttribute("name") + "' was found");
//		}
//	}
	
	public void ClickOnButton(String strBtnName)
    {
		Boolean boolClickOnButton=false;		
		 List<WebElement> allButt = driver.findElements(By.tagName("button"));
         for (WebElement w : allButt){
             if (w.getText().equals(strBtnName)){
                 w.click();
                 boolClickOnButton = true;
                 break;
             }
         }
         if(boolClickOnButton==false){
          	System.out.println("Webelement with name  : '" + strBtnName + "' was not found");
         }                  
    }

	public void ClickOnLink(By objElementName) throws Throwable
	{
		Boolean boolClickOnLink=false;	
		int attempts=0;
		while(attempts < 3)
		{
			try
			{
				WaitUntilWebElementExist(objElementName);
				if(driver.findElements(objElementName).size()!=0)
				{
					String strName = driver.findElement(objElementName).getAttribute("name");
					driver.findElement(objElementName).click();
					boolClickOnLink = true;
					System.out.println("Clicked on webelement : " + strName);
				}
				break;
			}catch(StaleElementReferenceException e){				
			}
			attempts++;
		}
		
		if(boolClickOnLink==false)
		{
			System.out.println("Webelement with name  : '" + driver.findElement(objElementName).getAttribute("name") + "' was not found");
		}
	}
	
	public void SelectCheckBox(By objElementName) throws Throwable
	{
		Boolean boolSelectCheckBox=false;	
		int attempts=0;
		while(attempts < 3)
		{
			try
			{
				WaitUntilWebElementExist(objElementName);
				if(driver.findElements(objElementName).size()!=0)
				{
					String strName = driver.findElement(objElementName).getAttribute("name");
					driver.findElement(objElementName).click();
					boolSelectCheckBox = true;
					System.out.println("Clicked on webelement : " + strName);
				}
				break;
			}catch(StaleElementReferenceException e){				
			}
			attempts++;
		}
		
		if(boolSelectCheckBox==false)
		{
			System.out.println("Webelement with name  : '" + driver.findElement(objElementName).getAttribute("name") + "' was not found");
		}
	}
	
	public void GetBusyStatus() throws Throwable 
	{
		try
		{
		WebDriverWait wt= new WebDriverWait(driver,60);
		WebElement busyElement=driver.findElement(By.id("loading"));
		/*System.out.println("Start Debugging the Busy element");
		System.out.println(busyElement.getAttribute("style").equals(null));
		System.out.println(busyElement.getAttribute("style").isEmpty());
		System.out.println(busyElement.getAttribute("style").equals(""));
		System.out.println("End Debugging the Busy element");*/
		
		if(busyElement.getAttribute("style").equals(null)|| busyElement.getAttribute("style").isEmpty() || busyElement.getAttribute("style").equals(""))
		{
			return;
		}
		else
		{
			if(pf.getProperty("BrowserName").equalsIgnoreCase("IE")||pf.getProperty("BrowserName").equalsIgnoreCase("InternetExplorer"))
			{
				wt.until(ExpectedConditions.attributeToBe(busyElement,"style","DISPLAY: none"));
			}
			else if(pf.getProperty("BrowserName").equalsIgnoreCase("FF")||pf.getProperty("BrowserName").equalsIgnoreCase("firefox"))
			{
				wt.until(ExpectedConditions.attributeToBe(busyElement,"style","display: none;"));
			}else
			{
				wt.until(ExpectedConditions.attributeToBe(busyElement,"style","display: none;"));
			}			
			System.out.println("Performed Wait");
		}
		}
		catch(Exception e)
		{
			Thread.sleep(5000);
		}
	}
	
	
	public void WaitUnitWebListisLoaded(WebElement objlist) throws InterruptedException
	{
		WebDriverWait waitDriver = new WebDriverWait(driver,60);	
		waitDriver.until(ExpectedConditions.attributeToBeNotEmpty(objlist,"innerHTML"));	
	}
	
	public void WaitUntilWebElementExist(By strItem) throws Throwable
	{	
		/*try
		{*/
		System.out.println("Searching for element - Started");
		WebDriverWait wb=new WebDriverWait(driver,20);
		wb.until(ExpectedConditions.presenceOfElementLocated(strItem));
		System.out.println("Searching for element - Ended");
		//}
		/*catch(StaleElementReferenceException e)
		{
			driver.navigate().refresh();
			Thread.sleep(6000);
			WebDriverWait wb=new WebDriverWait(driver,20);
			wb.until(ExpectedConditions.presenceOfElementLocated(strItem));
		}*/	
		
	}
	
	public void ReadProp() throws IOException
	{
		FileInputStream f1= new FileInputStream(System.getProperty("user.dir") + "\\Resource\\RxNovaSettings.properties");
		System.out.println(System.getProperty("user.dir") + "\\Resource\\RxNovaSettings.properties");
		pf.load(f1);		
	}	
	
	public boolean CheckElementPresenceByLocator(By LocatorValue) throws Throwable
	{
		WaitUntilWebElementExist(LocatorValue);
		return driver.findElements(LocatorValue).size() != 0;		
	}
	
	public void SwithToMostRecentWindow() throws InterruptedException	
	{		
		for(String WHandles: driver.getWindowHandles())
		{
			driver.switchTo().window(WHandles);
			System.out.println("SwithToMostRecentWindow -" + driver.getTitle());
		}		
	
	}
	
	
	public void SelectItemFromWebListByNameAndHyphen(By objElementName, String strValue) throws Throwable
	{
		Boolean boolSelectItemFromWebListByNameAndHyphen=false;
		
		int attempts=0;
		while(attempts<3)
		{
			try{
		
			String ItemFound = "";
			String strListItem="";
			if(driver.findElements(objElementName).size()!=0)
			{
				WebElement strItem=driver.findElement(objElementName);
				List<WebElement> strItems=	strItem.findElements(By.tagName("option"));	
				for(int i2=1;i2<strItems.size();i2++)
				{
					strListItem=strItems.get(i2).getText();
					if(strListItem.trim().equalsIgnoreCase(strValue.trim()))
					   {
						  ItemFound = "Found";
						  Select itemstoSelect =new Select(driver.findElement(objElementName));
						  String strName = driver.findElement(objElementName).getAttribute("name");
						  itemstoSelect.selectByVisibleText(strListItem);
 						  boolSelectItemFromWebListByNameAndHyphen = true;
						  System.out.println("Selected item in webelement : " + strName + " Value :" + strValue );
						  break;
					   }
				 }
				if(!ItemFound.equals("Found"))
				  {
					for(int i3=1;i3<strItems.size();i3++)
					 {
						strListItem=strItems.get(i3).getText();	
					    String[] arrItemSplited=strListItem.split("-");
					    if(arrItemSplited[0].trim().equalsIgnoreCase(strValue.trim()))
						   {
							  Select itemstoSelect =new Select(driver.findElement(objElementName));
							  String strName =driver.findElement(objElementName).getAttribute("name");
							  itemstoSelect.selectByVisibleText(strListItem);
							  boolSelectItemFromWebListByNameAndHyphen = true;
							  System.out.println("Selected item in webelement : " + strName + " Value :" + strValue );
							  break;
						   }
					  }
				  }
				
			 	}
			
		}catch(StaleElementReferenceException e){				
		}
		attempts++;
		}
			
		if(boolSelectItemFromWebListByNameAndHyphen==false)
		 {
			System.out.println("Webelement with name  : '" + driver.findElement(objElementName).getAttribute("name") + "' was not found");
		 }
	}
	
	
	
	public void SelectItemFromWebListByPartialDisplayName(By objElementName, String strValue) throws InterruptedException
	{
		Boolean boolSelectItemFromWebListByPartialDisplayName=false;
		
		int attempts=0;
		while(attempts<3)
		{
			try{
				String ItemFound = "";
				String strListItem = "";
				if(driver.findElements(objElementName).size()!=0)
				{
					System.out.println("inside SelectItemFromWebListByPartialDisplayName");
					WebElement objWebList = driver.findElement(objElementName);
					List<WebElement> strItems=	objWebList.findElements(By.tagName("option"));	
					for(int i2=1;i2<strItems.size();i2++)
					{
						strListItem=strItems.get(i2).getText();
						if(strListItem.toLowerCase().trim().contains(strValue.toLowerCase().trim()))
						   {
							  ItemFound = "Found";
							  Select itemstoSelect =new Select(driver.findElement(objElementName));
							  String strName =driver.findElement(objElementName).getAttribute("name");
							  itemstoSelect.selectByVisibleText(strListItem);			
							  boolSelectItemFromWebListByPartialDisplayName = true;
							  System.out.println("Selected item in webelement : " + strName + " Value :" + strValue );
							  break;
						   }
					 }
				 }				
			}catch(StaleElementReferenceException e){				
			}
			attempts++;
		}
		
		if(boolSelectItemFromWebListByPartialDisplayName==false)
		 {
			System.out.println("Webelement with name  : '" + driver.findElement(objElementName).getAttribute("name") + "' was not found");
		 }
	}
	
	
	
	public void SelectValueFromFieldIntellisence(By objElementName, String strValue) throws Throwable
	{
		Boolean boolSelectValueFromFieldIntellisence=false;
		
		if(driver.findElements(objElementName).size()!=0 && StringUtil.isNotBlank(strValue))
		{
			String strName =driver.findElement(objElementName).getAttribute("name");
			driver.findElement(objElementName).sendKeys(strValue);			
			Thread.sleep(2000);
			driver.findElement(By.partialLinkText(strValue)).click();
			boolSelectValueFromFieldIntellisence=true;
			System.out.println("Set text on webelement : " + strName + " Value :" + strValue );
		}
		
		if(boolSelectValueFromFieldIntellisence==false)
		{
			System.out.println("Webelement with name  : '" + driver.findElement(objElementName).getAttribute("name") + "' was not found");
		}
		
	}
	
	
	public void ClickOnImage(By objElementName) throws InterruptedException
	{
		Boolean boolClickOnImage = false;
		
		int attempts = 0;
		while(attempts < 3)
		{
			try
			{
				if(driver.findElements(objElementName).size()!=0)
				{
					String strName =driver.findElement(objElementName).getAttribute("name");
					driver.findElement(objElementName).click();
					Thread.sleep(2000);
					boolClickOnImage = true;
					System.out.println("Clicked on Image : " + strName);
					break;
				}				
			}
			catch(StaleElementReferenceException e){				
			}
			attempts++;			
		}
		
		
		
		if(boolClickOnImage==false)
		{
			System.out.println("Webelement with name  : '" + driver.findElement(objElementName).getAttribute("name") + "' was not found");
		}
	}
	
	
	public void CheckPageLoad() throws InterruptedException
	{
		if(!driver.findElement(By.id("contentFrame")).isDisplayed()) 
		{
			driver.navigate().refresh();
			Thread.sleep(5000);
		}	
	}
	
	
	public long startTime()
	{
		Date d1 = new Date();
		System.out.println(d1.getTime());
		return d1.getTime();
	}
	
	public void TimeDifference(long inputTime)
	{
		Date d2 = new Date();
		long timedifference = d2.getTime() - inputTime;
		System.out.println("time difference is " + timedifference/1000);		
	}
	
	public void HybridDeaktop_MenuNavigation(String strAppPath) throws InterruptedException
	 {	
		// TODO here we need to find the Hybrid main page
		for(String WHandles: driver.getWindowHandles())
		 {
			driver.switchTo().window(WHandles);
			if(driver.getTitle().contains("RxNova - "))
			{
			   System.out.println("SwithToWindow -" + driver.getTitle());
			   
			   //driver.switchTo().frame("contentFrame");
			   //break;
			}			
		 }
		
		 // saving the landing page for future reference
		 winHandleLandingPage = driver.getWindowHandle();
		 // menu navigation
		 String[] arrAppPath = strAppPath.split("->");		 
		 driver.findElement(By.xpath("//span[contains(text(),'" + arrAppPath[0].toString() + "')]")).click();
		 Thread.sleep(500);   
         // new block to handle hidden links
         try{                
               driver.findElement(By.linkText(arrAppPath[1].toString())).click();        
            }catch(Exception e){
               System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ exception occured ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
               WebElement CurrentWebElement = driver.findElement(By.linkText(arrAppPath[1].toString()));
               JavascriptExecutor jse = (JavascriptExecutor)driver;
               jse.executeScript("var elem=arguments[0]; setTimeout(function() {elem.click();}, 100)", CurrentWebElement);
            }        
         Thread.sleep(1000);

		 //switching to new window
		 for(String winHandle : driver.getWindowHandles()){			 
		    driver.switchTo().window(winHandle);
		    //driver.manage().window().maximize();
		 	}
		 
		 if(!(arrAppPath[1].toString().equalsIgnoreCase("RxNova Connect")||arrAppPath[1].toString().equalsIgnoreCase("GOTM")))		 
		 {
			 CheckPageLoad();
			 driver.switchTo().frame(0);   //"contentFrame"
		 }

		 System.out.println("latest window title " + driver.getTitle());
	 }
	
	
	public String GetElementText(By objElementName) throws Throwable{
		try{
		if(driver.findElement(objElementName).isDisplayed()){
			return driver.findElement(objElementName).getText();			
			}
		}catch(Exception e){
			return null;
		}
		return null;				
	}
	
	public String GetElementValue(By objElementName) throws Throwable{
		try{
		if(driver.findElement(objElementName).isDisplayed()){
			return driver.findElement(objElementName).getAttribute("value");			
			}
		}catch(Exception e){
			return null;
		}
		return null;				
	}
	
	public String GetElementTitle(By objElementName) throws Throwable{
		try{
		if(driver.findElement(objElementName).isDisplayed()){
			return driver.findElement(objElementName).getAttribute("title");			
			}
		}catch(Exception e){
			return null;
		}
		return null;				
	}
	
	public void js_clickOnButton(WebElement CurrentWebElement)
    {
           try{
           JavascriptExecutor jse = (JavascriptExecutor)driver;
           if(jse instanceof JavascriptExecutor){
                  jse.executeScript("var elem=arguments[0]; setTimeout(function() {elem.click();}, 100)", CurrentWebElement);
           }
           }catch(Exception e)
           {
                  System.out.println("Exeception with js_clickOnButton occured - " + e.getMessage());
           }
    }
	
	public boolean VerifyElementPresence(By objElementName) {

		return driver.findElements(objElementName).size()!=0;
	}
	
	public void WaitUntilWebListisLoadedWithDefaultValue(By objElementName) throws InterruptedException
	 {  
		Boolean defaultValue=false;
		int attempts=0;
		while(attempts<5)
		 {
	        try
	        {
				Select itemstoSelect =new Select(driver.findElement(objElementName));
			    WebElement option = itemstoSelect.getFirstSelectedOption();
			    String dropdownValue = option.getText();
				if(!dropdownValue.isEmpty())
				{
				   defaultValue=true;
				   System.out.println("WebList loaded with default value");
				   break;
				}
				else
				{
				  Thread.sleep(3000);	
				}
	        }
	        catch(Exception e){
	        	System.out.println("WebList is not loaded with default value exception");
	        }
	        attempts++;	
		}
		
		if(defaultValue==false)
		{
			System.out.println("WebList is not loaded with default value");
		}
		//waitDriver.until(ExpectedConditions.attributeContains(option,"selected", "selected"));		//System.out.println(waitDriver.until(ExpectedConditions.attributeContains(option,"selected", "selected")));
		//waitDriver.until(ExpectedConditions.elementToBeSelected(objElementName));
		//System.out.println(waitDriver.until(ExpectedConditions.elementToBeSelected(objElementName)));
	}
	
	public void VerifyObjectIsDisplayed(By objElementName) {
		Assert.assertTrue(driver.findElement(objElementName).isDisplayed());
	}
	
	public void close_duplicateNamedBrowsers(){
        Set<String> ListOfOpenApps = new HashSet<String>();
        ListOfOpenApps.clear();
        for(String p:driver.getWindowHandles()){
              String CurrentWidow = driver.switchTo().window(p).getTitle().toString();
              if(ListOfOpenApps.contains(CurrentWidow)){
                     driver.close();
                     System.out.println("Closed a duplicate window having title " + CurrentWidow);
              }else{
                     ListOfOpenApps.add(CurrentWidow);
              }                         
        }
 }
	
  public String generateRandomID(String prefix,int lengthWithoutPrefix) {
		
		String GenerateRandomDataWithPrefix=null;
		
		DateFormat dateFormat = new SimpleDateFormat("hmmssyyyyMd");

		Date date = new Date();

		String strDateTime=dateFormat.format(date);
		
		String strRndNumber = strDateTime;
                
		int strRndLength= strRndNumber.length();  
		
		if(lengthWithoutPrefix>0) {
			if(lengthWithoutPrefix > strRndLength) {
				
				GenerateRandomDataWithPrefix = prefix+strRndNumber;
			}else if(lengthWithoutPrefix <= strRndLength) {
				
				GenerateRandomDataWithPrefix = prefix+strRndNumber.substring(0,lengthWithoutPrefix);
			}
		}
		
		return GenerateRandomDataWithPrefix;
	}
  
		

	  public void WebTable_VerifyRowData(By objElementName,String strRowValue) throws InterruptedException
	{
		Boolean boolWebTable_VerifyRowData = false;
		
		String[] arrRowValue = strRowValue.split("\\^");
		String strExpLabelName = arrRowValue[0];
		String strExpLabelValue = arrRowValue[1];		
		
		List<WebElement> strRows = driver.findElement(objElementName).findElements(By.tagName("tr"));
		A:
		for(int i=0;i<strRows.size();i++)
		{
			List<WebElement> strCols = strRows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<strCols.size();j=j+2)
			{
			   String strActLabelName = strCols.get(j).getText();
			   if(strActLabelName.equalsIgnoreCase(strExpLabelName))
			   {
				   String strActLabelValue = strCols.get(j+1).getText();
				   if(strActLabelValue.equalsIgnoreCase(strExpLabelValue))
				   {
					   boolWebTable_VerifyRowData = true;
					   System.out.println("The Field "+strActLabelName+" has the value "+strActLabelValue);
					   break A;
				   }
				   else
				   {
					   System.out.println("The Field "+strActLabelName+" has the value "+strActLabelValue);
				   }

			   }
			}
		}
		
		if(boolWebTable_VerifyRowData==false)
		{
			System.out.println("Webtable  : '" + driver.findElement(objElementName) + "' with "+strRowValue+" was not found");
		}
	}
	
	public void Claim_VerifyPanelExpand(By objElementName,String strExpPanelName) throws InterruptedException
	{
		Boolean boolClaim_VerifyPanelExpand = false;
		
		List<WebElement> panels=driver.findElements(objElementName);
		
		A:
		for (int strPanel=0;strPanel<panels.size();strPanel++)
		 {
	 		WebElement panelName=panels.get(strPanel).findElement(By.className("ui-panel-title"));
	 		String strActPanelName = panelName.getText();
	 		if(strActPanelName.equals(strExpPanelName))
	 		{
	 			if(panelName.findElements(By.xpath("//*[contains(text(),'"+strExpPanelName+"')]/following-sibling::a/child::span[@class='ui-icon ui-icon-minusthick']")).size()>0)
	 			//if(driver.findElements(By.xpath("//*[contains(text(),'"+strExpPanelName+"')]/following-sibling::a/child::span[@class='ui-icon ui-icon-minusthick']")).size()>0)	
	 			{
	 				boolClaim_VerifyPanelExpand = true;
	 				System.out.println("The panel "+strExpPanelName+" is expanded");
	 				break A;
	 			}
	 		}
		 }
   	    
		if(boolClaim_VerifyPanelExpand==false)
		{
			System.out.println("The panel "+strExpPanelName+" is not expanded");
		}
	}
	
	public void Claim_ExpandPanelAndVerifyData(String strExpPanelName,String strExpRowValue) throws Throwable
	{
		
		String strActLabelName;
		String strActLabelValue;
		String[] arrExpRowValue = strExpRowValue.split("\\^");
		String strExpLabelName = arrExpRowValue[0];
		String strExpLabelValue = arrExpRowValue[1];
		
		if(driver.findElements(By.xpath("//*[contains(text(),'"+strExpPanelName+"')]/following-sibling::*")).size()>0)	
	 	{
	 	  if(driver.findElements(By.xpath("//*[contains(text(),'"+strExpPanelName+"')]/following-sibling::a/child::span[@class='ui-icon ui-icon-minusthick']")).size()==0)
	 		{
	 			driver.findElement(By.xpath("//*[contains(text(),'"+strExpPanelName+"')]/following-sibling::a/child::span[@class='ui-icon ui-icon-plusthick']")).click();
	 			Thread.sleep(4000);
	 			System.out.println("The panel "+strExpPanelName+" is expanded");
	 	    }
	 		WebElement strPanelTable = driver.findElement(By.xpath("//*[contains(text(),'"+strExpPanelName+"')]/parent::div/following-sibling::div/child::div/table[1]"));
	 		List<WebElement> strTableRows = strPanelTable.findElements(By.tagName("tr"));
	 		A:
	 		for(int tableRow=0;tableRow<strTableRows.size();tableRow++)
	 		 {
	 			List<WebElement> strTableCols = strTableRows.get(tableRow).findElements(By.tagName("td"));
	 			for(int tableCol=0;tableCol<strTableCols.size();tableCol=tableCol+2)
	 			{
	 				String labelName = strTableCols.get(tableCol).getText();
	 				if(labelName.contains("..."))
	 				{
						String strRepLabelName=labelName.replace("...","_");
						String[] strLabelName=strRepLabelName.split("_");						
						strActLabelName=strTableCols.get(tableCol).findElement(By.xpath("//*[contains(@title,"+"'"+strLabelName[0]+"'"+")]")).getAttribute("title");
	 				}
	 				else
	 				{
	 					strActLabelName=labelName;
	 				}
	 				
	 				if(strActLabelName.equalsIgnoreCase(strExpLabelName))
	 				{
	 					strActLabelValue = strTableCols.get(tableCol+1).getText();
	 					if(strActLabelValue.equalsIgnoreCase(strExpLabelValue))
	 					{
	 						System.out.println("The Field "+strExpLabelName+" has value "+strExpLabelValue);
	 						break A;
	 					}
	 					else
	 					{
	 						System.out.println("The Field "+strExpLabelName+" has value "+strActLabelValue);
	 					}
	 				}	 				
	 			}
	 		 }	 			
	 		
	    }		
	 	else
	 	{
	 	   System.out.println("The panel "+strExpPanelName+" is disabled by default");
	 	}
	}
	
	public void VerifyLinkEnabled(By objElementName) throws InterruptedException
	{
		try
		{
		   WebDriverWait wait = new WebDriverWait(driver, 5);
		   wait.until(ExpectedConditions.elementToBeClickable(objElementName));
		   System.out.println("The link "+objElementName+" is enabled");
		}
		catch (Exception e)
		{
			System.out.println("The link "+objElementName+" is disabled");
		}
	}
	
	public void WebTable_VerifyColumnData(By objElementName,String strColumnValue) throws InterruptedException
	{
		Boolean boolWebTable_VerifyColumnData = false;
		
		String[] arrRowValue = strColumnValue.split("\\^");
		String strExpLabelName = arrRowValue[0];
		String strExpLabelValue = arrRowValue[1];		
		
		List<WebElement> strRows = driver.findElement(objElementName).findElements(By.tagName("tr"));
		List<WebElement> strColName = strRows.get(0).findElements(By.tagName("td"));
		List<WebElement> strColValue = strRows.get(1).findElements(By.tagName("td"));
		for(int i=0;i<strColName.size();i++)
		 {
		    String strActLabelName = strColName.get(i).getText();
			if(strActLabelName.equalsIgnoreCase(strExpLabelName))
			   {
				  String strActLabelValue = strColValue.get(i).getText();
  			      if(strActLabelValue.equalsIgnoreCase(strExpLabelValue))
				    {
  			    	boolWebTable_VerifyColumnData = true;
					   System.out.println("The Field "+strActLabelName+" has the value "+strActLabelValue);
					   break;
				    }
				   else
				    {
					   System.out.println("The Field "+strActLabelName+" has the value "+strActLabelValue);
				    }
					   
				}
			}
		
		if(boolWebTable_VerifyColumnData==false)
		{
			System.out.println("Webtable  : '" + driver.findElement(objElementName) + "' with "+strColumnValue+" was not found");		
		}
		
	}
	
	 public void NCPDP_WebTable_VerifyRowData(By objElementName,String strRowValue) throws InterruptedException
		{
			Boolean boolNCPDPWebTable_VerifyRowData = false;
			
			String[] arrRowValue = strRowValue.split("\\^",-1);
			String strExpLabelName = arrRowValue[0];
			String strExpLabelValue = arrRowValue[1];
			
			List<WebElement> strRows = driver.findElement(objElementName).findElements(By.tagName("tr"));
			A:
			for(int i=0;i<strRows.size();i++)
			{
				List<WebElement> strCols = strRows.get(i).findElements(By.tagName("td"));
				for(int j=0;j<strCols.size();j=j+2)
				{
				   String strActLabelName = strCols.get(j).getText();
				   if(strActLabelName.equalsIgnoreCase(strExpLabelName))
				   {
					   String strActLabelValue = strCols.get(j+1).getText();
					   if(strExpLabelValue.contains("$"))
					   {
						   String strActLabelValue1;
						   String strActLabelValue2;
						   
						   String[] arrExpLabelValue = strExpLabelValue.split("\\$");
						   
						   List<WebElement> strSubTbls = strCols.get(j+1).findElements(By.tagName("table"));
						   for(int k=0;k<strSubTbls.size();k++)
						   {
							   List<WebElement> strSubTblCols = strSubTbls.get(k).findElements(By.tagName("td"));
							   strActLabelValue1 = strSubTblCols.get(0).getText();
							   strActLabelValue2 = strSubTblCols.get(1).getText();
							   
							   strActLabelValue = strActLabelValue1+" "+strActLabelValue2;
							   if(strActLabelValue.equalsIgnoreCase(arrExpLabelValue[k]))
							   {
								   boolNCPDPWebTable_VerifyRowData = true;
								   System.out.println("The Field "+strActLabelName+" has the value "+strActLabelValue);
							   }
						   }   

					   }
					   
					  if(strActLabelValue.equalsIgnoreCase(strExpLabelValue))
						 {
							boolNCPDPWebTable_VerifyRowData = true;
							System.out.println("The Field "+strActLabelName+" has the value "+strActLabelValue);
							break A;
						 }
				   }
			    }
			}
			
			if(boolNCPDPWebTable_VerifyRowData==false)
			{
				System.out.println("Webtable  : '" + driver.findElement(objElementName) + "' with "+strRowValue+" was not found");
			}
		}
	 
	 public void NCPDPExceptions_WebTable_VerifyRowData(By objElementName,String strRowValue) throws InterruptedException
		{
			Boolean boolNCPDPExceptions_WebTable_VerifyRowData = false;
			
			String[] arrRowValue = strRowValue.split("\\^",-1);
			String strExpLabelName = arrRowValue[0];
			String strExpLabelValue = arrRowValue[1];		
			
			WebElement strLabelHeader = driver.findElement(objElementName).findElement(By.xpath("//div[@class='top5 full-width clearfix']/table"));
			
			List<WebElement> strLabelHeaderSubTbls = strLabelHeader.findElements(By.tagName("table"));
			A:
			for(int i=0;i<strLabelHeaderSubTbls.size();i++)
			{
				List<WebElement> strLabelNameSubTblRows = strLabelHeaderSubTbls.get(i).findElements(By.tagName("td"));
				for(int j=0;j<strLabelNameSubTblRows.size();j++)
				{
					String strActLabelName = strLabelNameSubTblRows.get(j).getText();
				    if(strActLabelName.equalsIgnoreCase(strExpLabelName))
				    {
			    	  WebElement strLabelVal = driver.findElement(objElementName).findElement(By.xpath("//div[@class='top5 full-width clearfix']/div/table"));
  		    	      List<WebElement> strLabelValSubTblsRows = strLabelVal.findElements(By.tagName("tr"));
			    	  for(int k=0;k<strLabelValSubTblsRows.size();k++)
			    	   {
			    		   String strActLabelValue = strLabelValSubTblsRows.get(k).findElement(By.tagName("td")).getText();
			    		   
						   if(strActLabelValue.equalsIgnoreCase(strExpLabelValue))
						   {
							   boolNCPDPExceptions_WebTable_VerifyRowData = true;
							   System.out.println("The Field "+strActLabelName+" has the value "+strActLabelValue);
							   break A;
						   }
					   }
				   }
				}    
			}
			
			if(boolNCPDPExceptions_WebTable_VerifyRowData==false)
			{
				System.out.println("Webtable  : '" + driver.findElement(objElementName) + "' with "+strRowValue+" was not found");
			}
		}
	 
		public void VerifyButtonEnabled(By objElementName) throws InterruptedException
		{
			try
			{
			   WebDriverWait wait = new WebDriverWait(driver, 5);
			   wait.until(ExpectedConditions.elementToBeClickable(objElementName));
			   System.out.println("The button "+objElementName+" is enabled");
			}
			catch (Exception e)
			{
				System.out.println("The button "+objElementName+" is disabled");
			}
		}
		
		public void clickOnFirstLink(By objElementName) throws Throwable
	    {
			Boolean boolclickOnFirstLink=false;	
			int attempts=0;
			while(attempts < 3)
			{
				try
				{
					WaitUntilWebElementExist(objElementName);
					if(driver.findElements(objElementName).size()!=0)
					{
						List<WebElement> allLinks = driver.findElement(objElementName).findElements(By.tagName("a"));
						String strName = allLinks.get(0).getText();
						if(strName.isEmpty())
						{
						   allLinks.get(1).click();
						   strName = allLinks.get(1).getText();
						}
						else
						{
						   allLinks.get(0).click();
						}
						boolclickOnFirstLink = true;
						System.out.println("Clicked on webelement : " + strName);

					}
					break;
				}catch(StaleElementReferenceException e){				
				}
				attempts++;
			}
			
			if(boolclickOnFirstLink==false)
			{
				System.out.println("Webelement : '" + driver.findElement(objElementName) + "' was not found");
			}
         
	    }
		
/////////////////////////// RxNovaConnect_WebTable_VerifyRowData ///////////////////////////////////////////////////
		
public String RxNovaConnect_WebTable_VerifyRowData(By objElementName,String strRowValue) throws InterruptedException
 {
	Boolean boolRxNovaConnect_WebTable_VerifyRowData = false;
	
	String strActLabelName="";
	String strActLabelValue="";
	
	String[] arrRowValue = strRowValue.split("\\^",-1);
	String strExpLabelName = arrRowValue[0];
	String strExpLabelValue = arrRowValue[1];		
	
	WebElement strTblBody = driver.findElement(objElementName).findElement(By.tagName("tbody"));
	List<WebElement> strRows = strTblBody.findElements(By.tagName("tr"));
	A:
	for(int i=0;i<strRows.size();i++)
	{
		List<WebElement> strCols = strRows.get(i).findElements(By.tagName("td"));
		for(int j=0;j<strCols.size();j=j+2)
		{
		   strActLabelName = strCols.get(j).getText();
		   if(strActLabelName.equalsIgnoreCase(strExpLabelName))
		    {
			   if(strCols.size()==1) 
			    {
				   strActLabelValue = "";				    
			    }
			   else
			    {
				   strActLabelValue = strCols.get(j+1).getText();
			    }
			   if(strExpLabelValue.contains("$")) // To handle the multiple values in single row
			    {
				   String strActLabelValue1 = strCols.get(j+1).getText();
				   String strActLabelValue2 = strCols.get(j+2).getText();
				   strActLabelValue = strActLabelValue1+"$"+strActLabelValue2;
			    }
			   if(strActLabelValue.equalsIgnoreCase(strExpLabelValue))
			    {
				   boolRxNovaConnect_WebTable_VerifyRowData = true;
				   System.out.println("The Field "+strActLabelName+" has the value "+strActLabelValue);				   
			    }
			   else
			    {
				   System.out.println("The Field "+strActLabelName+" has the value "+strActLabelValue);
			    }
			   break A;
		    }
		}
	}	
	
	
	if(boolRxNovaConnect_WebTable_VerifyRowData==false)
	{
		System.out.println("Webtable  : '" + driver.findElement(objElementName) + "' with "+strRowValue+" was not found");
	}
	
	return strActLabelName+"^"+strActLabelValue;
}

/////////////////////////// RxNovaConnect_WebTable_VerifyColumnData ///////////////////////////////////////////////////

public String RxNovaConnect_WebTable_VerifyColumnData(By objElementName,String strColValue) throws InterruptedException
{
	Boolean boolRxNovaConnect_WebTable_VerifyColumnData = false;
	
	String strActColHeaderName="";
	String strActColHeaderValue="";
	
	String[] arrRowValue = strColValue.split("\\^",-1);
	String strExpColHeaderName = arrRowValue[0];
	String strExpColHeaderValue = arrRowValue[1];		
	
	WebElement strColHeader = driver.findElement(objElementName).findElement(By.tagName("thead"));
	
	List<WebElement> strColHeaderRows = strColHeader.findElements(By.tagName("tr"));
	A:
	for(int i=0;i<strColHeaderRows.size();i++)
	{
		
		List<WebElement> strColHeaderVal = strColHeaderRows.get(i).findElements(By.tagName("th"));
		for(int j=0;j<strColHeaderVal.size();j++)
		{
		strActColHeaderName = strColHeaderVal.get(j).getText();   
 	    if(strActColHeaderName.equalsIgnoreCase(strExpColHeaderName))
		   {
 	    	WebElement strColHeaderValues = driver.findElement(objElementName).findElement(By.tagName("tbody"));
 	    	
 	    	List<WebElement> strColHeaderValueRows = strColHeaderValues.findElements(By.tagName("tr"));
 	    	
 	    	List<WebElement> strColHeaderValue = strColHeaderValueRows.get(0).findElements(By.tagName("td"));
    		
    		strActColHeaderValue = strColHeaderValue.get(j).getText();
 	    		
 			if(strActColHeaderValue.equalsIgnoreCase(strExpColHeaderValue))
			    {
 			       boolRxNovaConnect_WebTable_VerifyColumnData = true;
				   System.out.println("The Column "+strActColHeaderName+" has the value "+strActColHeaderValue);
			    }
			   else
			    {
				  System.out.println("The Column "+strActColHeaderName+" has the value "+strActColHeaderValue);				  
			    }
 			 break A;
		    }
 	    	
	    }
    }	
	
	if(boolRxNovaConnect_WebTable_VerifyColumnData==false)
	{
		System.out.println("Webtable  : '" + driver.findElement(objElementName) + "' with "+strColValue+" was not found");
	}
	
	return strActColHeaderName+"^"+strActColHeaderValue;
}

/////////////////////////// RxNovaConnect_WebTable_VerifyRowColumnData ///////////////////////////////////////////////////

public String RxNovaConnect_WebTable_VerifyRowColumnData(By objElementName,String strRowValue) throws InterruptedException
{
	Boolean boolRxNovaConnect_WebTable_VerifyRowColumnData = false;
	
	String strActLabelName="";
	String strActLabelValue="";
	
	String[] arrRowValue = strRowValue.split("\\^",-1);
	String strExpLabelName = arrRowValue[0];
	String strExpLabelValue = arrRowValue[1];		
	
	List<WebElement> strRows = driver.findElement(objElementName).findElements(By.tagName("tr"));
	List<WebElement> strColName = strRows.get(0).findElements(By.tagName("td"));
	List<WebElement> strColValue = strRows.get(1).findElements(By.tagName("td"));
	for(int i=0;i<strColName.size();i++)
	{
		strActLabelName = strColName.get(i).getText();
		if(strActLabelName.equalsIgnoreCase(strExpLabelName))
		  {
			 strActLabelValue = strColValue.get(i).getText();
			 if(strActLabelValue.contains("..."))
				{
				    //strActLabelValue = strColName.get(i).getAttribute("title");
				    String strRepLabelValue=strActLabelValue.replace("...","_");
					String[] arrActLabelValue=strRepLabelValue.split("_");    							
					
					strActLabelValue=strColName.get(i).findElement(By.xpath("//*[contains(@title,"+"'"+arrActLabelValue[0]+"'"+")]")).getAttribute("title");
				}
			 if(strActLabelValue.equalsIgnoreCase(strExpLabelValue))
			  {
			   	boolRxNovaConnect_WebTable_VerifyRowColumnData = true;
			    System.out.println("The Field "+strActLabelName+" has the value "+strActLabelValue);
			  }
			 else
			  {
			    System.out.println("The Field "+strActLabelName+" has the value "+strActLabelValue);
			  }
			 break;
	  	  }
	}
	
	if(boolRxNovaConnect_WebTable_VerifyRowColumnData==false)
	{
		System.out.println("Webtable  : '" + driver.findElement(objElementName) + "' with "+strRowValue+" was not found");
	}
	
	return strActLabelName+"^"+strActLabelValue;
}

/////////////////////////// RxNovaConnect_WebTable_VerifySingleRowColumnData ///////////////////////////////////////////////////

public String RxNovaConnect_WebTable_VerifySingleRowColumnData(By objElementName,String strColValue) throws InterruptedException
{
	Boolean boolRxNovaConnect_WebTable_VerifySingleRowColumnData = false;
	
	String strActColHeaderName="";
	String strActColHeaderValue="";
	
	String[] arrRowValue = strColValue.split("\\^",-1);
	String strExpColHeaderName = arrRowValue[0];
	String strExpColHeaderValue = arrRowValue[1];		
	
	WebElement strColHeader = driver.findElement(objElementName).findElement(By.tagName("thead"));
	
	List<WebElement> strColHeaderRows = strColHeader.findElements(By.tagName("tr"));
	A:
	for(int i=0;i<strColHeaderRows.size();i++)
	 {		
		List<WebElement> strColHeaderVal = strColHeaderRows.get(i).findElements(By.tagName("th"));
		for(int j=0;j<strColHeaderVal.size();j++)
		{
		strActColHeaderName = strColHeaderVal.get(j).getText();   
 	    if(strActColHeaderName.equalsIgnoreCase(strExpColHeaderName))
		   {
 	    	WebElement strColHeaderValues = driver.findElement(objElementName).findElement(By.tagName("tbody"));
 	    	
 	    	List<WebElement> strColHeaderValueRows = strColHeaderValues.findElements(By.tagName("tr"));
 	    	
 	    	List<WebElement> strColHeaderValue = strColHeaderValueRows.get(0).findElements(By.tagName("td"));
    		
    		strActColHeaderValue = strColHeaderValue.get(0).getText();
    		
    		if(strActColHeaderValue.contains("No results were found matching your criteria."))
    		{
    			strActColHeaderValue = "";
    		}
 	    		
 			if(strActColHeaderValue.equalsIgnoreCase(strExpColHeaderValue))
			  {
 				boolRxNovaConnect_WebTable_VerifySingleRowColumnData = true;
				System.out.println("The Column "+strActColHeaderName+" has the value "+strActColHeaderValue);
			  }
			else
			  {
			    System.out.println("The Column "+strActColHeaderName+" has the value "+strActColHeaderValue);				  
			  }
 			 break A;
		    }
 	    	
	    }
    }	
	
	if(boolRxNovaConnect_WebTable_VerifySingleRowColumnData==false)
	{
		System.out.println("Webtable  : '" + driver.findElement(objElementName) + "' with "+strColValue+" was not found");
	}
	
	return strActColHeaderName+"^"+strActColHeaderValue;
}



}
