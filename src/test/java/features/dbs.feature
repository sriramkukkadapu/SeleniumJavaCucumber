Feature: Application login

Background: 
Given Start the browser

Scenario Outline: DBS test case
Given Navigate to "https://www.dbs.com/about-us/who-we-are/awards-accolades/2018.page"
When User is on Awards page
Then Validate the total number of awards displayed on the page is 14.
And Validate all the <awardname> and <caption> of the awards mentioned in the below table and print in the cucumber report in the form of a table.
Examples:
|awardname		 		| caption	|
|A World First	 	| Euromoney	|
|The Banker				| Bank of the Year 2018	|
|Global Finance		|	Best Bank in the World	|
|Euromoney				| Awards For Excellence	|
|Global Finance		|	World's Best Banks	|
|Global Finance		|	World's Best Investment Banks and Derivatives Providers	|




#"Create a Feature file 
#Write Java methods
#Code should be executable
#Generate cucumber report with screenshots
#
#1.        Navigate to https://www.dbs.com/about-us/who-we-are/awards-accolades/default.page?productId=jxeawnvl
#2.        Validate the total number of awards displayed on the page is 22.
#3.        Validate all the award name and caption of the awards mentioned in the below table and print in the cucumber report in the form of a table.
#Award Name          Caption of the award
#A World First        Euromoney
#The Banker        Bank of the Year 2018
#Global Finance        Best Bank in the World 2018
#Euromoney        Awards For Excellence
#Global Finance        World's Best Banks
#Global Finance        World's Best Investment Banks and Derivatives Providers"