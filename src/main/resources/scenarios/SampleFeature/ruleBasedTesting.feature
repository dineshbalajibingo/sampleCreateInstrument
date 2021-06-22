Feature: Rule based testing

  Scenario: Test of Rule 28

    Given user has the input file in raw zone with following data
      | idBbUnique  | 123          |
      | ISIN        | CND100010H35 |
      | Ticker      | WIJ          |
      | CouponType  | When Issued  |
      | TradeStatus | Y            |
    And file is placed in "Landing Zone" for processing
    And pipeline job is executed "successfully"
    When I look for Instrument table populated in "RAW Zone"
    Then the table should have following values for idBbUnique "123"
      | Ticker | WIJ |

  Scenario: Test of Rule 29
    Given user has the input file in raw zone with following data
      | idBbUnique  | 124          |
      | ISIN        | CND100010H36 |
      | Ticker      | NYT          |
      | CouponType  | CALL         |
      | TradeStatus | Y            |
    And file is placed in "Landing Zone" for processing
    And pipeline job is executed "successfully"
    When I look for Instrument table populated in "RAW Zone"
    Then the table should have following values for idBbUnique "124"
      | Coupon Type | CALL |

  Scenario: Test of Rule 30
    Given user has the input file in raw zone with following data
      | idBbUnique  | 125          |
      | ISIN        | CND100010H37 |
      | Ticker      | SOS          |
      | CouponType  | PUT          |
      | TradeStatus | Y            |
    And file is placed in "Landing Zone" for processing
    And pipeline job is executed "successfully"
    When I look for Instrument table populated in "RAW Zone"
    Then the table should have following values for idBbUnique "125"
      | Trade Status | Y |

  Scenario: Test of Rule 31
    Given user has the input file in raw zone with following data
      | idBbUnique  | 126          |
      | ISIN        | CND100010H38 |
      | Ticker      | DOD          |
      | CouponType  | Not  Issued  |
      | TradeStatus | N            |
    And file is placed in "Landing Zone" for processing
    And pipeline job is executed "successfully"
    When I look for Instrument table populated in "RAW Zone"
    Then the table should have following values for idBbUnique "126"
      | Ticker | DOD |