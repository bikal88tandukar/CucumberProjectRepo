Feature: open HRM website 
Scenario: one 
	Given I open website "https://orangehrm-demo-6x.orangehrmlive.com/auth/login" 
	When I type login = "admin" and password = "admin123" 
	And I click sign-in button 
	Then I should get "Dashboard" text
	Then I close the site