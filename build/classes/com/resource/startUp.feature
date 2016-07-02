Feature: StartUp

As a user
I want to create account
so that i can login into application

Scenario: check valid username
Given user entered valid username
When click on "submit"
Then application display "valid username entered"

Scenario: check valid password
Given user entered valid password
When click on "submit"
Then application display "valid password entered"

Scenario: check invalid password
Given user entered valid username
And entered password ""
When click on "submit"
Then application display "Enter valid password"

Scenario: check invalid username
Given user entered valid password
And entered username ""
When click on "submit"
Then application display "Enter valid username"

Scenario: check invalid details 
And password
Given user entered valid username ""
And password ""
When click on "submit"
Then application display "Now the information is correct"
