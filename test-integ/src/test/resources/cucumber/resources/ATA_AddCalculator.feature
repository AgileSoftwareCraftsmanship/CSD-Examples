#encoding: utf-8
Feature: Calculator Add function
  In order to get sum of the two numbers immediately without having to do it manually
  As an accountant
  I should be able to Add two numbers

  Scenario: Positive number Addition
    Given the number 7 and 8
    When I select the "Add" as option
    Then the Result field should be 15
Scenario: Second Positive number Addition
    Given the number 6 and 6
    When I select the "Add" as option
    Then the Result field should be 12
    