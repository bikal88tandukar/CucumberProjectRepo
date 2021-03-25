Feature: test scenario to test login for demo site 
Background: 
    Given demo site login "https://orangehrm-demo-6x.orangehrmlive.com/auth/login" 
    
@tag1 
Scenario Outline: Login logout with different credentials 
    Then I enter userName = "<userName>" and password = "<password>" 
    And I click submit 
    Then I match text "<text>" 
    
    Examples: 
        | userName  | password      | text     |
        | admin     | admin124      | Dashboard|
        | admin     | admin124      | Dashboard|
        | admon     | admin123      | Dashboard|
        | admin     | admin123      | Dashboard|
        | admin     | admin123      | Dashboarr|
        
        