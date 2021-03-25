Feature: Entering three websites 
Scenario: Home Page of Google 
	Given I visit Google home page "https://www.google.com" 
	Then I enter keyword "selenium" 
	And I submit the page 
	Then I wait 4 seconds for google 
	
Scenario: GitHub Homepage 
	Given I visit GitHub home page "https://github.com" 
	Then I wait 4 seconds for github 
	
Scenario: Home Page of Twitter 
	Given I visit Twitter home page "https://twitter.com" 
	And I wait 4 seconds for twitter
	