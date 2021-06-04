@Login
Feature: To verify login functionality

	Background: User move to signIn page
		Given User is at home page "https://www.carsguide.com.au/" of cars guide website
    When user click on signUp signIn button
    And click on signIn link
    
  @login-positive
  Scenario: Verify user is able to login with correct credentials  
    When user enter email "admin@gmail.com"
    And user enter password "1 Series"
    And user click submit
    Then user should be able to successfully login
    
  @login-negative  
	Scenario: Verify user can not login with invalid credentials
		When user enter email "xyz@gmail.com"
    And user enter password "cars24"
    And user click submit
    Then message should be displayed "Wrong email or password" and user can not login
   