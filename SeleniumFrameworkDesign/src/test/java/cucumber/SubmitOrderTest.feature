@tag
Feature: Buying Product From Online Store
  Product buying
  Background:
  Given i landing on ecommerce page
  
  

  @tag1
  Scenario: Items select and submit order
    Given 
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

  @tag2
  Scenario Outline: Positive test of submiting order
    Given I login with username <name> and userpassword <password>  
    When I add a product in cart<product>
    And chackout <product> submit order
    Then I verify the return message "THANKYOU FOR THE ORDER."

    Examples: 
      | name               | password         | product       |
      |basith301@yahoo.com |301Basith         |ADIDAS ORIGINAL|
 
