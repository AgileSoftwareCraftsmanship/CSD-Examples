Feature: Calculator Add function
  In order to get sum of the two numbers immediately without having to do it manually
  As an accountant
  I should be able to Add two numbers 

Scenario: Positive number Addition
  
Given the inputs 7 and 8
When I select the "Add" as option
Then the Result field should be 15
@testing
Scenario: 2nd Positive number Addition
Given user inputs number 7 and 7
When I select the "Add" as option
Then the Result field should be 

Scenario: Negative number Addition
Given user inputs number -7 and -8
When I select the "Add" as option
Then User get message "Please enter Positive Number"

