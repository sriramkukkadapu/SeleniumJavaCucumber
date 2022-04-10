Feature: Application login

Scenario: Home page default login
Given user is on landing page
When user log in to application with username and pwd
Then Home page is populated
And Cards are displayed
 