Feature: Post a ride
  As a car owner
  I want to post a new ride
  So that anyone can travel with me

  Scenario: Successful posting
    Given Car owner enter Fname as "Naveen" and Lname as "Singh" and Location as "Vasant Kunj" and time as "5:30" an email as "naveen.singh@leanpitch.com" and phone as "9810547500"
    When click on "Submit"
    Then System should show a message "Posting was successful"

  Scenario: Failed posting
    Given Car owner enter Fname as "" and Lname as "Singh" and Location as "Vasant Kunj" and time as "5:30" an email as "naveen.singh@leanpitch.com" and phone as "9810547500"
    When click on "Submit"
    Then System should show a message "Posting failed"

  Scenario: Failed posting with send mail
    Given Car owner enter Fname as "" and Lname as "Singh" and Location as "Vasant Kunj" and time as "5:30" an email as "naveen.singh@leanpitch.com" and phone as "9810547500"
    When click on "Submit"
    Then System should show a message "Posting failed"
    And Send a mail to email id "error@leanpitch.com"

  Scenario: Registered user succussful posting
    Given Car owner enter Location as "Vasant Kunj" and time as "5:30"
    When click on "Submit"
    Then System should show a message "Posting Succusful"
    And Send a mail to email id "success@leanpitch.com"

  Scenario Outline: Multiple data
    Given Car owner enter <Location>, <Time>, <Email>, <Phone>
    When click on <Operator>
    Then System should show a <Message>

    Examples: 
      | Location | Time   | Email         | Phone        | Operator | Message   |
      | "CP"     | "4:00" | "abc@xyz.com" | "8470047500" | "Submit" | "Success" |
      | "Dwarka" | "3:00" | "abc@xyz.com" | "8470047500" | "Click"  | "Fail"    |
