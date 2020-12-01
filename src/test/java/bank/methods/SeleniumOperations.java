package bank.methods;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperations {
	
	public static WebDriver driver=null;
	
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>(); 
	
	//browser launch 
	public static Hashtable<String,Object> BrowserLaunch(Object[]inputParameters) 
	{  
		
		try {
		String strBrowserName=(String)inputParameters[0];
		String webDriverpath=(String) inputParameters[1];
		
		if (strBrowserName.equalsIgnoreCase("Chrome")) 
		{
			
			System.setProperty("webdriver.chrome.driver",webDriverpath);
			 driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			} 
		else if (strBrowserName.equalsIgnoreCase("FF")) 
			{
			
			    System.setProperty("webdriver.gecko.driver",webDriverpath);
			    driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
			}
		outputParameters.put("Status", "PASS");
		outputParameters.put("MESSAGE", "Action: browser launch, Input Given:"+inputParameters[0].toString());
		
		}  catch(Exception e)
		{
		
			outputParameters.put("Status", "FAIL");
			outputParameters.put("MESSAGE", "Action: browser launch, Input Given:"+inputParameters[0].toString());
	
		}
		
		
		return outputParameters;
	}
			
	
	
	
	
	
	
	// url open Application launch 
		public static Hashtable<String,Object> applicationLaunch(Object[]inputParameters)
		{
			
			
			try {
			String strurl=(String)inputParameters[0];
			
			driver.get(strurl);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MASSAGE", "Action:Application Launch,Input Given:"+inputParameters[0].toString());
			
			}catch (Exception e)
			{
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MASSAGE", "Action:Application Launch,Input Given:"+inputParameters[0].toString());
			}
			
			
			return outputParameters;
		}
		
			
		//send key 
		public static Hashtable<String,Object> sendkey(Object[]inputParameters) 
		{
			
			
			try {
			String XPath=(String) inputParameters[0];
			String Value=(String) inputParameters[1];
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement obj1=driver.findElement(By.xpath(XPath));
		obj1.clear();
		obj1.sendKeys(Value);
			
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MASSAGE", "Action: SendKey,Input Given:"+inputParameters[1].toString());
		
			
			}catch (Exception e)
			{
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MASSAGE", "Action: SendKey,Input Given:"+inputParameters[1].toString());
			
			}
			
			return outputParameters;
			}
		
		
		
		//click
		public static Hashtable<String,Object>  click(Object[]inputParameters) 
		{
			
			try {
			String xpath = (String) inputParameters[0];
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
		WebElement obj2=driver.findElement(By.xpath(xpath));
		obj2.click();
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MASSAGE", "Action: Click,Input Given:"+inputParameters[0].toString());
		
			
			}
			
		
			catch (Exception e)
			{
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MASSAGE", "Action: Click,Input Given:"+inputParameters[0].toString());
			}
			return outputParameters;
			
		}
		
		//drop down
		public static Hashtable<String,Object> dropdown(Object[]inputParameters) 
		{
			
		try {
			String xpath=(String) inputParameters[0];
			String name=(String) inputParameters[1];
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			Select sel=new Select(driver.findElement(By.xpath(xpath)));
			sel.selectByVisibleText(name);
			
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MASSAGE", "Action: Dropdown,Input Given:"+inputParameters[1].toString());
		
		}catch (Exception e) 
		{
		outputParameters.put("STATUS", "FAIL");
	    outputParameters.put("MASSAGE", "Action: Dropdown,Input Given:"+inputParameters[1].toString());	
		}
			
			
		return outputParameters;
		}
		
		
		//validation method 
		public static Hashtable<String,Object> validation(Object[]inputParameters)
		{   
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			String xPath=(String) inputParameters[0]; //we are given xpath of web element 
			String String1=(String) inputParameters[1];//we are given String of that xpath  
			
		WebElement web=driver.findElement(By.xpath(xPath));
		
		String String2=web.getText();
		
		try 
		{
			if (String1.equalsIgnoreCase(String2))
			{
				System.out.println("testcase pass");
				}else
			{
				System.out.println("testcase Fail");
			
			}
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MASSAGE", "Action: Validation,Input Given:"+inputParameters[1].toString());
			}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MASSAGE", "Action: Validation,Input Given:"+inputParameters[1].toString());
			
		}
		return outputParameters;
		
		   }
		}
	
	
	



