package bank.UnitSteps;

import bank.methods.SeleniumOperations;

public class StepExecutor {
	
	
	public static void main(String[] args) {
		//browser launch 
		Object[] input=new Object[2];
		input[0]="Chrome";
		input[1]="E:\\bankingProject\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe";
		SeleniumOperations.BrowserLaunch(input);

		//application open
		Object[]input1=new Object[1];
		input1[0]="http://primusbank.qedgetech.com/";
		SeleniumOperations.applicationLaunch(input1);
		//enter user name
		Object[]input2= new Object[2];
		input2[0]="//*[@id=\"txtuId\"]";
		input2[1]="Admin";
		SeleniumOperations.sendkey(input2);
		
		//enter user password
		Object[]input3= new Object[2];
		input3[0]="//*[@id=\"txtPword\"]";
		input3[1]="Admin";
		SeleniumOperations.sendkey(input3);
		
		//click on logiong 
		Object[]input4= new Object[1];
		input4[0]="//*[@id=\"login\"]";
		SeleniumOperations.click(input4);
		
		//click on Branch
		Object[]input5= new Object[1];
		input5[0]="//*[@src=\"images/Branches_but.jpg\"]";
		SeleniumOperations.click(input5);
		
		//select country
		Object[]input6=new Object [2];
		input6[0]="//*[@id=\"lst_countryS\"]";
		input6[1]="INDIA";
		SeleniumOperations.dropdown(input6);
		
		//select  state
		Object[]input7=new Object [2];
		input7[0]="//*[@id=\"lst_stateS\"]";
		input7[1]="Andhra Pradesh";
		SeleniumOperations.dropdown(input7);
		
		//select city
		Object [] input8=new Object [2];
		input8[0]="//*[@name=\"lst_cityS\"]";
		input8[1]="Hyderabad";
		SeleniumOperations.dropdown(input8);
		//click on search 
		Object[] input9=new Object[1];
		input9[0]="//*[@id=\"btn_search\"]";
		SeleniumOperations.click(input9);
	}

	
}
