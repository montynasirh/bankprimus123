package bank.cucumbermap;

import java.net.UnknownHostException;

import bank.methods.HTMLReportGenerator;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hookable {
	
	
	
	
	@Before
	public void before (Scenario scenario) throws UnknownHostException
	
	{
		HTMLReportGenerator.TestSuiteStart("E:\\USA\\Bank.html", "primusbank");
		HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus());
		System.out.println("-----------------Sceniro Start----------------------------- ");
	}
	@After
	public void after (Scenario scenario) 
	{
		System.out.println("-----------------Sceniro End----------------------------- ");
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
	}

}
