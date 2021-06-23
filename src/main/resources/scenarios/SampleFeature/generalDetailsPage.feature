Feature: Validating general details page fields


  Scenario: Rule based validation
    Given as a valid user in DB
    And I want to validate rule order:
    |rule|
    |rule1|
    |rule2|
    |rule3|
    |rule4|
    |rule5|
    |rule6|
    When rule is validated
    Then values in DB are verified

  Scenario: DataTable Examples
    Given I am on github login page
    And I enter usernames and passwords
      | testuser_1 | Test@153 |




    Scenario Outline: Date Filler
      Given I want to enter below "<Dates>"
      And then I click on login in page

      Examples:
      |Dates|
      |10 Years |
      |1 Day |
      |365 Days |