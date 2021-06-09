Feature: Validating general details page fields


  Scenario Outline: Issuance of Fixed Corportate Bond
    Given As an "<User>"
    And I want to issue a bond with "<Product Group>" and "<Product type>"
    #When I enter the "<General Details>", "<Extended Details>" and "<Country Details>"
    #And submit the details after confirmation
    #Then Instrument is created

  Examples:
    |User         | Product Group | Product type | General Details | Extended Details     | Country Details  |
    |Data Operator|   Fixed       | Corporate Bond | Mandatory Values | Negative Values  | Mandatory Values |


  Scenario: DataTable Examples
    Given I am on github login page
    And I enter usernames and passwords
      | testuser_1 | Test@153 |

    @test
    Scenario Outline: Date Filler

      Given I want to enter below "<Dates>"

      Examples:
      |Dates|
      |10 Years |
      |1 Day |
      |365 Days |