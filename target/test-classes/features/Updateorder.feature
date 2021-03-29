Feature: Update Order
@TC02
Scenario: TC02_Update_profile
Given Initialize the browser with chrome
And Navigate to "http://automationpractice.com/" Site
When user enter credentials for login
|girish_gvg@yahoo.co.in	|test@123		|
Then Verify updated details
|Girish |test@123		|Your personal information has been successfully updated.  |
And user signout from application
And close browsers