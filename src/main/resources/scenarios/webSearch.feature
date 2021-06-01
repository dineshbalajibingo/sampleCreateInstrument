@Web
Feature: Google Search

  @WebSearch @test
  Scenario: Search Quantum
    Given I am on Google Search Page
    When I search for "quantum perfecto"
    Then it should have "quantum" in search results
    #Then I am on Google Search Page

  @WebSearch @test
  Scenario: Search Quantum
    Given I am on Google Search Page
    When I search for "quantum perfecto"
    Then it should have "zzz" in search results
    #Then I am on Google Search Page

  @WebDD
  Scenario Outline: Search Keyword Inline Data
    Given I am on Google Search Page
    When I search for "<searchKey>"
    Then it should have "<searchResult>" in search results

    Examples:
      | recId | recDescription 	| searchKey               | searchResult  |
      | 1     | First Data Set	| London        | zzz |
      | 2     | Second Data Set 	|Paris| Paris |


  Scenario: Example of data table
    Given I am on github login page
    And I enter the UN and PW:
      | un  | pw |
      | testuser_1 | Test@153 |

  Scenario Outline: JSON Keyword Example
    Given I am on github login page
    #And I enter "<username>" and "<password>"
    And I enter usernames and passwords

    Examples: {'datafile':'./src/main/resources/data/testData.json'}

Scenario Outline: Issuance of Fixed Corportate Bond
  Given As a <"User">
  And I want to issue a bind with "<Product Group>" and "<Product type>"
  When I enter the "<General Details>", "<Extended Details>" and "<Country Details>"
  And submit the details after confirmation
  Then Instrument is created

  Examples:
    |User         | Product Group | Product type | General Details | Extended Details     | Country Details  |
    |Data Operator|   Fixed       | Corporate Bond | Mandatory Values | Mandatory Values  | Mandatory Values |