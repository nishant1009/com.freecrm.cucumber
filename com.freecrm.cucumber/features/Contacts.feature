Feature: FreeCrm Contacts module functionality

Background: Launching of FreeCrm Site

Scenario Outline: Login to FreeCrm Site with valid credentials
Given User navigates to Login Page
When User enters valid "<userName>" and "<password>"
And Clicks on Login button
Then Login should be successfull

Examples:
|userName											|password|
|nishant_online@rediffmail.com|23Jan2007|

Scenario Outline: Verify User is able to create a new Contact successfully
Given User is on Contacts page
When User Click on New Contacts button
When enters "<FirstName>", "<LastName>", "<Position>" and "<Department>"
When User clicks on Save button
Then Contacts should be saved successfully

Examples:
|FirstName|LastName|Position		|Department|
|TC-FN		|TC-LN	 |Team Member	|QA				 |
