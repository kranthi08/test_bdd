Feature: Verify the functionality of new user creation in NOP commerce Application
        In Order to test the new user creation functionality of NOP commerce application
        As a Tester 
        I need the required URL and Credentials

  Background: 
    When User perform login in nop commerce application

  @Functional
  Scenario: Verify SignIn functionality with credentials
    Given User is in dashboard page of NOP commerce application
    When user click on customer link and add the new customer into nop commerce application
    Then the user verify the created customer