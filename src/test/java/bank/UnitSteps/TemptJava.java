package bank.UnitSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class TemptJava implements TestData
{
	public ChromeDriver driver=null;
	
	public void br() {
		//open chromedriver b browser 
				
	
		System.setProperty("webdriver.chrome.driver","E:\\bankingProject\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe");
		 driver=new ChromeDriver();
		//maximize browser 
			driver.manage().window().maximize();}

		
	
	public void urlinput() {//open url
		driver.get("http://primusbank.qedgetech.com/");
		}
	public void name() {
		//enter user name
		driver.findElementByXPath("//*[@id=\"txtuId\"]").sendKeys(username);
	}
	public void pass() {
		//enter passward
				driver.findElementByXPath("//*[@id=\"txtPword\"]").sendKeys(Passward);}
	
	public void clickloging() {
//click loging
		driver.findElementByXPath("//*[@id=\"login\"]").click();}
	
	public void selectbranch() {
		//click on breanch
				driver.findElementByXPath("//*[@src=\"images/Branches_but.jpg\"]").click();
				
				//select country 
				Select sel=new Select(driver.findElement(By.xpath("//*[@id=\"lst_countryS\"]")));
				       sel.selectByVisibleText(country);
				       
				  //select state 
				       Select sel1=new Select(driver.findElement(By.xpath("//*[@id=\"lst_stateS\"]")));
				       
				       sel1.selectByVisibleText(stete);
				       
				       //select city
				       Select sel2=new Select(driver.findElement(By.xpath("//*[@name=\"lst_cityS\"]")));
			             sel2.selectByVisibleText(city);
		
	}
	public static void main(String[] args) {
		
		TemptJava obj=new TemptJava();
		obj.br();
		obj.urlinput();
		obj.name();
		obj.pass();
		obj.clickloging();
		obj.selectbranch();
	}         
	

}
