Feature: Application login

Scenario: Home page default login
Given user is on landing page
When user log in to application with "jin" and "1234"
Then Home page is populated
And Cards displayed are "true" 
 


