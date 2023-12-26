Feature: Verify the functionality of new product creation in NOP commerce Application
         In Order to test the new product creation functionality of NOP commerce application
         As a Tester 
         I need the required URL and Credentials

  Background: 
		When User perform login in nop commerce application

	Scenario: Verify SignIn functionality with credentials
	  Given User is in dashboard page of NOP commerce application
		When User click on product link and create new product
		Then User verify the created customer