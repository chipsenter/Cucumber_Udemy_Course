@fullrun_test
Feature: The Login Page
	As a returning customer
	I want to login to the application 
	So that I can view my account balance
	
Background:
 Given the user is on the login page

@ignore	
Scenario: The user should be able to login with valid credentials
 When the user enters valid credentials
 Then the user should be able to view their account balance
 And the user logs out

@goodLogin
Scenario: the user should not be able to login with bad credentials
 When the user enters bad credentials 
 Then the user should not be able to login
 And the user should get a invalid login message
 
@badLogin
Scenario: the user should be able to login
  When user enters username as "admin@yourstore.com" 
  And user enters password as "admin"
  And user clicks login button 
  Then user should be able to see dashboard
 
@example_test
Scenario Outline: the user should be able to login
  When user enters "<username>" and "<password>"
  Then the user should be able to see dashboard
  
Examples:
| username | password |
| admin@yourstore.com | admin |
| admin2@yourstore.com | admin2 | 

@datatable_test
Scenario: after a failed attempt, the user should be able to login again
  When user enters set of username and password
  | username | password |
  | admin@yourstore.com | admin |
  | admin2@yourstore.com | admin2 |
  Then the user should be able to see dashboard
  
