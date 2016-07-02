Feature: startup page
As a user 
I want to see login and signup link
So that i can use mylifeline app

Scenario: check login link
Given check "login" link
When click on "login"
Then Application will redirect to "login page"

Scenario: check signup link
Given check "signup" link
When click on "signup"
Then Application will redirect to "signup page"