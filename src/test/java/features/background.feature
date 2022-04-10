Feature: Application login

Background: 
Given Validate the browser
When browser is triggered
Then check if browser is started

@RegTest @SmokeTest
Scenario: Home page default login
Given user is on landing page
When user log in to application with "jin" and "1234"
Then Home page is populated
And Cards displayed are "true" 
 
@SmokeTest 
Scenario: Home page default login
Given user is on landing page
When user log in to application with "john" and "abcd1234"
Then Home page is populated
And Cards displayed are "false"

@MobileTest
Scenario: Home page default login
Given user is on landing page
When user sign up with following details
| jenny | pwd123 | jenny@gmail.com | Australia | 9060109978|
Then Home page is populated
And Cards displayed are "false"

@RegTest
Scenario Outline: Home page default login
Given user is on landing page
When user log in to application with multiple <username> and <password>
Then Home page is populated
And Cards displayed are "false"

Examples:
|username	|password|
|User1		|Pwd1		 |
|User2		|Pwd2		 |
|User3		|Pwd3		 |
|User4		|Pwd4		 |


