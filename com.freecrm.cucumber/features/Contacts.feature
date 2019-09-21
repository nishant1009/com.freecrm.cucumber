Feature: FreeCrm Contacts module functionality

Background: Launching of FreeCrm Site

Given Webdriver is initialized and FreeCrm site is launched
Given User navigates to Login Page
When User enters valid "nishant_online@rediffmail.com" and "23Jan2007"
And Clicks on Login button
Then Login should be successfull



Scenario Outline: Verify User is able to create a new Contact successfully
Given User is on Contacts page
When User Click on New Contacts button
When enters "<FirstName>", "<LastName>", "<Position>" and "<Department>"
When User clicks on Save button
Then Contacts should be saved successfully

Examples:
|FirstName|LastName|Position		|Department|
|TC-FN		|TC-LN	 |Team Member	|QA				 |


Scenario: Verify edit functionality of Contacts

Given Contacts exists in CRM application
When User edits the contacts
And Saves the Contact 
Then Contact should be editted successfully

|Description|City|
|Automation|Pune|

Scenario: Verify delete functionality of Contacts

Given Contacts exists in CRM application
When User selects Contacts and deletes the selected Contact
Then selected contacts should be deleted successfully 

Scenario Outline: Verify User is able to search contact based upon address
Given User is on Contacts page
When User search the contact using "<Address>"
Then User should see only contacts having matching address

Examples:
|Address|
|Pune|


Scenario: Verify User is able to add column in result grid
Given User is on Contacts page
When User add a column to be displayed in result grid
Then Column should be added in result grid
