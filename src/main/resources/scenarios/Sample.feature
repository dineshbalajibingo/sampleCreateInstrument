Feature:

  #Precondition --Trigger--Action--Outcome

  Scenario: User logs in

    Given I am on the homepage
    When I click on the "Login" button
    And I fill in the "Email" field with "me@example.com"
    And I fill in the "Password" field with "secret"
    And I click on "Submit"
    Then I should see "Welcome to the app, John Doe"


  Scenario: User logs in

    Given I am on the homepage
    When I log in
    Then I should see a login notification

  @test
  Scenario: Test of Rule 28

    Given user has the input file in raw zone with following data
      | UN          | PW           |
      | idBbUnique  | 123          |
      | ISIN        | CND100010H35 |
      | Ticker      | WIJ          |
      | CouponType  | When Issued  |
      | TradeStatus | Y            |