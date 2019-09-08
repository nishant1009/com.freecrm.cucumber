Feature: FreeCrm login functionaity

Background: Launching of FreeCrm Site

Given Webdriver is initialized and FreeCrm site is launched

Scenario Outline: Login to FreeCrm Site with valid credentials
Given User navigates to Login Page
When User enters valid "<userName>" and "<password>"
And Clicks on Login button
Then Login should be successfull

Examples:
|userName											|password|
|nishant_online@rediffmail.com|23Jan2007|


Scenario Outline: Login to FreeCrm Site with invalid credentials
Given User navigates to Login Page
When User enters valid "<userName>" and "<password>"
And Clicks on Login button
Then Login should not be successfull

Examples:
|userName											|password|
|nishant_online@rediffmail.com|23jan2007|