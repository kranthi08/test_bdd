Feature: Verify the functionality of new user creation in NOP commerce Application
         In Order to test the new user creation functionality of NOP commerce application
         As a Tester 
         I need the required URL and Credentials

  Background: 
		When User perform login in nop commerce application

	Scenario: Verify SignIn functionality with credentials
	  Given User is in dashboard page of NOP commerce application
		When User click on customer link and create new customer
		Then User verify the created customer