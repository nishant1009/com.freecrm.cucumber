Feature: CRM deals module functionality

Background: Launching of FreeCrm Site

Given Webdriver is initialized and FreeCrm site is launched
Given User navigates to Login Page
When User enters valid "nishant_online@rediffmail.com" and "23Jan2007"
And Clicks on Login button
Then Login should be successfull


Scenario Outline: Verify User is able to create a new Deal

Given User is present on Deals Page
When User clicks on New Deal button
And enters "<Title>", "<Description>", "<Probability>" and "<Amount>" and Saves the deal
Then deal should be created successfully
Examples:
|Title|Description|Probability|Amount|
|TD		|Test Deal	|60					|950	 |

Scenario Outline: Verify User is able to edit the deal

Given User is present on Deals Page
When User selects the Deal to edit and clicks on Edit button
And User updates "<Commission>" and saves the deal
Then Deal should be editted successfully

Examples:
|Commission|
|150|

Scenario: Verify delete functionality of Deals

Given Deals exists in CRM application
When User selects Deal and deletes the selected Deal
Then selected Deal should be deleted successfully