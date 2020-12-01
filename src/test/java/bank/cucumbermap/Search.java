package bank.cucumbermap;

import bank.methods.SeleniumOperations;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search {
	@When("^user can opens \"([^\"]*)\" browser and exe \"([^\"]*)\"$")
	public void user_can_opens_browser_and_exe(String browserName, String exepath) throws Throwable {
		//browser launch 
		Object[] input=new Object[2];
		input[0]=browserName;
		input[1]=exepath;
		SeleniumOperations.BrowserLaunch(input);
	    
	}

	@When("^user can enters url \"([^\"]*)\"$")
	public void user_can_enters_url(String url) throws Throwable {
		//application open
		Object[]input1=new Object[1];
		input1[0]=url;
		SeleniumOperations.applicationLaunch(input1);
	    
	}

	@When("^user can enter \"([^\"]*)\" as user name$")
	public void user_can_enter_as_user_name(String name) throws Throwable {
		//enter user name
		Object[]input2= new Object[2];
		input2[0]="//*[@id=\"txtuId\"]";
		input2[1]=name;
		SeleniumOperations.sendkey(input2);
	    
	}

	@When("^user can enter \"([^\"]*)\" as passsword$")
	public void user_can_enter_as_passsword(String ward) throws Throwable {
		//enter user password
		Object[]input3= new Object[2];
		input3[0]="//*[@id=\"txtPword\"]";
		input3[1]=ward;
		SeleniumOperations.sendkey(input3);
	    
	}

	@When("^user can click on loging button$")
	public void user_can_click_on_loging_button() throws Throwable {
		//click on logiong 
		Object[]input4= new Object[1];
		input4[0]="//*[@id=\"login\"]";
		SeleniumOperations.click(input4);
	    
	}



@When("^user click on breanch$")
public void user_click_on_breanch() throws Throwable 
{
	//click on Branch
			Object[]input5= new Object[1];
			input5[0]="//*[@src=\"images/Branches_but.jpg\"]";
			SeleniumOperations.click(input5);
}

@When("^user select \"([^\"]*)\" as country$")
public void user_select_as_country(String country) throws Throwable
{
	//select country
			Object[]input6=new Object [2];
			input6[0]="//*[@id=\"lst_countryS\"]";
			input6[1]=country;
			SeleniumOperations.dropdown(input6);
}

@When("^user select \"([^\"]*)\" as state$")
public void user_select_as_state(String state) throws Throwable
{//select  state
	Object[]input7=new Object [2];
	input7[0]="//*[@id=\"lst_stateS\"]";
	input7[1]=state;
	SeleniumOperations.dropdown(input7);
    
}

@When("^user select \"([^\"]*)\" as city$")
public void user_select_as_city(String city) throws Throwable {
	//select city
	Object [] input8=new Object [2];
	input8[0]="//*[@id=\"lst_cityS\"]";
	input8[1]=city;
	SeleniumOperations.dropdown(input8);
    
}

@When("^user click on search button$")
public void user_click_on_search_button() throws Throwable 
{//click on search 
	Object[] input9=new Object[1];
	input9[0]="//*[@id=\"btn_search\"]";
	SeleniumOperations.click(input9);
    
}

@Then("^user on \"([^\"]*)\" page as get massage Branch Details$")
public void user_on_page_as_get_massage_Branch_Details(String ar) throws Throwable
{
	Object[] welcome= new Object[2];
	welcome[0]="//*[text()='Branch Details']";
	welcome[1]=ar;
	SeleniumOperations.validation(welcome);

}

}
