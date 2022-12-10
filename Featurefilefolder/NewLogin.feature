Feature: My Account Login Feature
Description: This feature will test a login functionality

#simple Login without paramaters
#Scenario: Login with valid credentials
#Given Open Browser
#When Enter the URL "http://practice.automationtesting.in"
#And Click on MyAccount
#And Enter username
#And Enter password
#And Click on Login
#Then User able to login to webpage



    #simple Login with paramaters
#Scenario: Login with valid credentials
#Given Open Browser
#When Enter the URL "http://practice.automationtesting.in"
#And Click on MyAccount
#And Enter username "rubinraj7@gmail.com"
#And Enter password "Aruna@7409"
#And Click on Login
#Then User able to login to webpage

     #Login with multiple set of data
Scenario Outline:: Login with valid credentials
Given Open Browser
When Enter the URL "http://practice.automationtesting.in"
And Click on MyAccount
And Enter username "<username>"
And Enter password "<password>"
And Click on Login
Then verify login

Examples:
  |username|password|
  |aruna@gmail.com|Aruna@7409|
  |ammuik|4rt6yt|
  |rubinraj7@gmail.com|Aruna@7409|
  
    #Login with data table parameters(providing data at the place itself)
#Scenario: Login with valid credentials
#Given Open Browser
#When Enter the URL "http://practice.automationtesting.in"
#And Click on MyAccount
#And Enter username 
#|rubinraj7@gmail.com|
#And Enter password 
#|Aruna@7409|
#And Click on Login
#Then verify login












