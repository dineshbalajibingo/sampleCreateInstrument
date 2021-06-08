Feature: Fixed-Income Muncipal Bond with Maturity Period  > 10 years

#Zero coupon type bond
  Scenario Outline: Zero coupon type bond with coupon frequency
    Given as a Data operator
    When I select “Fixed" as my product group and "Muncipal Bond” as my product type
    And chooses to create bond with coupon type of "Zero" and choose coupon frequency as "<Frequency>"
    And submits “General Details”, “Extended Details” and “Country Details” sections
    Then Instrument is created

    Examples:
      | Frequency   |
      | Daily       |
      | Weekly      |
      | Monthly     |
      | Semi-annual |
      | Annual      |
      | Day 1       |
      | Day 365     |

 #Fixed coupon type bond
  Scenario Outline: Fixed coupon type bond with coupon frequency
    Given as a Data operator
    When I select “Fixed" as my product group and "Muncipal Bond” as my product type
    And chooses to create bond with coupon type of "Fixed" and choose coupon frequency as "<Frequency>"
    And submits “General Details”, “Extended Details” and “Country Details” sections
    Then Instrument is created

    Examples:
      | Frequency   |
      | Daily       |
      | Weekly      |
      | Monthly     |
      | Semi-annual |
      | Annual      |
      | Day 1       |
      | Day 365     |

 #Fixed Float coupon type bond
  Scenario Outline: Fixed Float coupon type bond with coupon frequency
    Given as a Data operator
    When I select “Fixed" as my product group and "Muncipal Bond” as my product type
    And chooses to create bond with coupon type of "Fixed Float" and choose coupon frequency as "<Frequency>"
    And submits “General Details”, “Extended Details” and “Country Details” sections
    Then Instrument is created
    Examples:
      | Frequency   |
      | Daily       |
      | Weekly      |
      | Monthly     |
      | Semi-annual |
      | Annual      |
      | Day 1       |
      | Day 365     |

 #Floating coupon type bond
  Scenario Outline: Floating coupon type bond bond with coupon frequency Daily
    Given as a Data operator
    When I select “Fixed" as my product group and "Muncipal Bond” as my product type
    And chooses to create bond with coupon type of "Floating" and choose coupon frequency as "<Frequency>"
    And submits “General Details”, “Extended Details” and “Country Details” sections
    Then Instrument is created
    Examples:
      | Frequency   |
      | Daily       |
      | Weekly      |
      | Monthly     |
      | Semi-annual |
      | Annual      |
      | Day 1       |
      | Day 365     |

#Auction coupon type bond
  Scenario Outline: Auction coupon type bond bond with coupon frequency Daily
    Given as a Data operator
    When I select “Fixed" as my product group and "Muncipal Bond” as my product type
    And chooses to create bond with coupon type of "Auction" and choose coupon frequency as "<Frequency>"
    And submits “General Details”, “Extended Details” and “Country Details” sections
    Then Instrument is created
    Examples:
      | Frequency   |
      | Daily       |
      | Weekly      |
      | Monthly     |
      | Semi-annual |
      | Annual      |
      | Day 1       |
      | Day 365     |


 #Index linked coupon type bond
  Scenario Outline: Index Linked coupon type bond bond with coupon frequency Daily
    Given as a Data operator
    When I select “Fixed" as my product group and "Muncipal Bond” as my product type
    And chooses to create bond with coupon type of "Index Linked" and choose coupon frequency as "<Frequency>"
    And submits “General Details”, “Extended Details” and “Country Details” sections
    Then Instrument is created

    Examples:
      | Frequency   |
      | Daily       |
      | Weekly      |
      | Monthly     |
      | Semi-annual |
      | Annual      |
      | Day 1       |
      | Day 365     |


#Stepped coupon type bond
  Scenario Outline: Stepped coupon type bond coupon type bond bond with coupon frequency Daily
    Given as a Data operator
    When I select “Fixed" as my product group and "Muncipal Bond” as my product type
    And chooses to create bond with coupon type of "Stepped" and choose coupon frequency as "<Frequency>"
    And submits “General Details”, “Extended Details” and “Country Details” sections
    Then Instrument is created

    Examples:
      | Frequency   |
      | Daily       |
      | Weekly      |
      | Monthly     |
      | Semi-annual |
      | Annual      |
      | Day 1       |
      | Day 365     |