@ignore
Feature: the user should be able to view their account information

Background:
  Given the user opens the browser
  Given the user navigates to the login page
  Given the user enters valid credentials
  

Scenario: the user should be able to make a payment
  Given the user clicks on make payment
  And the user enters credit card information
  And the user verifies transaction
  Then the user should transfer money
  And the user should see a confirmation message

Scenario: the user should be able to change their password
  Given the user failed to login
