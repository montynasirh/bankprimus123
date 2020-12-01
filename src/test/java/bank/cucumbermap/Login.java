package bank.cucumbermap;

import java.util.Hashtable;

import bank.methods.HTMLReportGenerator;
import bank.methods.SeleniumOperations;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Login 
{

@When("^user opens \"([^\"]*)\" browser and exe \"([^\"]*)\"$")
public void user_opens_browser_and_exe(String browserName, String exepath) throws Throwable 
{
	//browser launch 
			Object[] input=new Object[2];
			input[0]=browserName;
			input[1]=exepath;
			SeleniumOperations.BrowserLaunch(input);   
}

@When("^user enters url \"([^\"]*)\"$")
public void user_enters_url(String url) throws Throwable 
{
	//application open
			Object[]input1=new Object[1];
			input1[0]=url;
			SeleniumOperations.applicationLaunch(input1);
    }
@When("^user enter \"([^\"]*)\" as user name$")
public void username(String uname) throws Throwable 
{//enter user name
	Object[]input2= new Object[2];
	input2[0]="//*[@id=\"txtuId\"]";
	input2[1]=uname;
	Hashtable<String,Object>input2op=SeleniumOperations.sendkey(input2);
	
	
HTMLReportGenerator.StepDetails(input2op.get("STATUS").toString(), "user enter \"([^\"]*)\" as user name",input2op.get("MASSAGE").toString());
	}

@When("^user enter \"([^\"]*)\" as passsword$")
public void passsword(String pward) throws Throwable 
{
	//enter user password
			Object[]input3= new Object[2];
			input3[0]="//*[@id=\"txtPword\"]";
			input3[1]=pward;
			Hashtable<String,Object>input3op=SeleniumOperations.sendkey(input3);
			
HTMLReportGenerator.StepDetails(input3op.get("STATUS").toString(),"user enter \"([^\"]*)\" as passsword",input3op.get("MASSAGE").toString());			
			
    }

@When("^user click on loging button$")
public void user_click_on_loging_button() throws Throwable 
{
	//click on logiong 
			Object[]input4= new Object[1];
			input4[0]="//*[@id=\"login\"]";
	Hashtable<String,Object>input4op=SeleniumOperations.click(input4);
	
HTMLReportGenerator.StepDetails(input4op.get("STATUS").toString(),"user click on loging button",input4op.get("MASSAGE").toString());	
    }

@Then ("^user is on the \"(.*)\" mian page as get massage as welcome to admin$")
public void validation(String valid)
{Object[] loging= new Object[2];
loging[0]="//*[text()='Admin']";
loging[1]=valid;
Hashtable<String,Object>loging5op=SeleniumOperations.validation(loging); 

HTMLReportGenerator.StepDetails(loging5op.get("STATUS").toString(),"user is on the \\\"(.*)\\\" mian page as get massage as welcome to admin",loging5op.get("MASSAGE").toString());	
	}


}
