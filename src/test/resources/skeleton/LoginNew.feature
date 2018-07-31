Feature: Login

In order to login to newtours
As a user 
i need to register first
Business Rule : Registered users can only do the transactions


Scenario: User can do the successful login
Given user is on the login page of newtours 
When user enters correct credentials
Then user can do successful login