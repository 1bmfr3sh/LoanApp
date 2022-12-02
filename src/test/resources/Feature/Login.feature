@Homepage
Feature: Loan Application log in page

  Scenario: User is trying to Sign in
    Given User is on the Homepage
    When User is clicking on Loan Application
    And User is logging in with "user" and "password"
    And User click on the sign in button
    And I add values in all fields
      | First Name     | Jacques           |
      | Last Name      | Sinsenagua        |
      | Age            | 19                |
      | Address Line 1 | Beverly Road      |
      | Address Line 2 | Hull              |
      | Postcode       | HU5 1LA           |
      | Email          | Jacques@gmail.com |
      | Loan Amount    | 1200             |



    Then user clicks on the application submit
