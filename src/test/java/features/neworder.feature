Feature: new order
@TC01
Scenario: TC01_NewTshirt_Order
Given Initialize the browser with chrome
And Navigate to "http://automationpractice.com/" Site
When user enter credentials for login
|girish_gvg@yahoo.co.in	|test@123		|
When user select Tshirt and check out
|Faded Short Sleeve T-shirts	|Pay by bank wire  |
Then Verify order details
|Faded Short Sleeve T-shirts	|
And user signout from application
And close browsers