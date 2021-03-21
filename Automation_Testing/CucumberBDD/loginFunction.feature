Feature: User able to login with valid username & password.

Scenario: User login with valid username & verify the page title

Given User can open any browser
And User able to enter url
 
When User able to click on the login button
And  User enter the userName 
And  User enter the password 
And User click on the signing button 

Then User able to verify successfully login 
And User name & homepage title


 