Feature: Validating general details page fields

#  @test
#  Scenario: Rule based validation
#    Given as a valid user in DB
#    And I want to validate rule order:
#      | rule  | Depends on 1 | Depends on 2 | Depends on 3 |
#      | rule1 | 12           | 13           | 14           |
#      | rule2 | 50           |              |              |
#      | rule3 | 45           | 30           |
#      | rule4 |              |
#      | rule5 |              |
#      | rule6 |              |
#    When rule is validated
#    Then values in DB are verified

   Scenario: Rule based validation
    Given as a valid user in DB
    And I want to validate rule order:
      | rule  | test |
      | rule1 | 1    |
      | rule2 | 2    |
      | rule3 | 3    |
      | rule4 | 4    |
      | rule5 | 5    |
    When rule is validated
    Then values in DB are verified

  Scenario: DataTable Examples
    Given I am on github login page
    And I enter usernames and passwords
      | testuser_1 | Test@153 |


  Scenario Outline: Date Filler
    Given I want to enter below "<Dates>"

    Examples:
      | Dates    |
      | 10 Years |
      | 1 Day    |
      | 365 Days |

