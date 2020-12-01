Feature: Search feature 

Background: user is successfully Search
When user can opens "chrome" browser and exe "E:\\bankingProject\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
When user can enters url "http://primusbank.qedgetech.com/"
When user can enter "Admin" as user name 
When user can enter "Admin" as passsword
When user can click on loging button  




Scenario: Search  funtionality for Country , State And City
When user click on breanch 
When user select "INDIA" as country 
When user select "Andhra Pradesh" as state 
When user select "Hyderabad" as city
When user click on search button 
Then user on "Branch Details" page as get massage Branch Details 




