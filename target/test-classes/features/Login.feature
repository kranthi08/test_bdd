Feature: Verify the functionality of Orange HRM Application
        In Order to test the SignOn functionality of Orange HRM application
        As a Tester 
        I need the required URL and Credentials

  Background: 
	When User Launch the required OrangeHRM URL

	@Functional
	Scenario Outline: Verify SignIn functionality with credentials
	  Given The user is in OrangeHRM application
#	  When he login into application with valid credentials
#	  	| User_Name   | Password   |
#	  	| <User_Name> | <Password> |
	  When He input the LoginName into Login Name field
	  	| User_Name   |<User_Name> | 
	  And He input required password into Password field
	  	| Password   | <Password> | 
	  Then Click on Login button
	  Then Application Navigates to Employee Information Page
	  
	  Examples:
	  	| User_Name | Password |
	  	| Admin     | admin123 |
