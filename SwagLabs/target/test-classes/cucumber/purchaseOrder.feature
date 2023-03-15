@tag
Feature: purchase order from online
Buy items from swaglabs online store

 Background:
 Given I landed on Ecommerce application
 
  @Smoke
  Scenario Outline: Selected product buy from online store
    Given I input userid<username> and user password<password> in apps
    And Select my product<productName>from list
    When i submit informatiom for Chackout 
    Then "THANK YOU FOR YOUR ORDER" message is displayed on confarmation Page

    Examples: 
      | username     | password   | productName|
      |standard_user |secret_sauce|  Onesie    |

   


