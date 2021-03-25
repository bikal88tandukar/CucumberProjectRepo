Feature: Finding Google logo 
Scenario: google Logo display test 
    Given I am on the google page "http://google.com/" 
    When I search for Google Logo webelement
    Then I should get the logo displayed
    
    Then I will close the web browser
    