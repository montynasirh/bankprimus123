Feature: Loging feature 

Background: user is successfully logged in 
When user opens "chrome" browser and exe "E:\\bankingProject\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
When user enters url "http://primusbank.qedgetech.com/"


@SmokeTest
Scenario: Loging funtionality for valid uder name and password
When user enter "Admin" as user name 
When user enter "Admin" as passsword
When user click on loging button  
Then user is on the "Admin" mian page as get massage as welcome to admin 

