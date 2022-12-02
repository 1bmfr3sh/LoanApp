@LoginAsAdmin

Feature: admin page
  Scenario: admin page
    Given User is on the Homepage
    When Admin is clicking on admin page
    And Admin is log in with "admin" and "password"
    And User click on the sign in button

