Feature: User Authentication
  As a registered user
  I want to login into the system
  So that I can access my account

  Scenario: Valid User login
  	Given I am on the login page
  	When I enter<Login> <password> Valid Credentials
  	|Login|password|
  	|Rahul|@Abcd1234|
  	And I click the login button
  	Then  I should redirected to the dashboard
    And I should see a welcome message
    
    