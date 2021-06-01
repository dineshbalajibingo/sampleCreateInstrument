
Feature: Validating general details page fields

Scenario Outline: Issuance of Fixed Corportate Bond
Given As a <"User">
And I want to issue a bind with "<Product Group>" and "<Product type>"
When I enter the "<General Details>", "<Extended Details>" and "<Country Details>"
And submit the details after confirmation
Then Instrument is created

Examples:
|User         | Product Group | Product type | General Details | Extended Details     | Country Details  |
|Data Operator|   Fixed       | Corporate Bond | Mandatory Values | Mandatory Values  | Mandatory Values |