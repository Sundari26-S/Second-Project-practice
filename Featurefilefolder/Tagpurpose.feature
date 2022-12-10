Feature: Tags in cucumber

@SanityTest
Scenario: verify login
Given Check the valid login

@SanityTest @E2ETest
Scenario: Verify logout
Given Check the logout

@RegressionTest
Scenario: Verify search part
Given check the search option

@RegressionTest
Scenario: Verify about part
Given check the above option

@E2ETest @SanityTest
Scenario: Verify contact us part
Given check the contact us part

@E2ETest
Scenario: Verify Home part
Given Check the Home page