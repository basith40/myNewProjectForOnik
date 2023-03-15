@tag
Feature: ErrorValidation

  @ErrorTest
  Scenario Outline: Error message is displayed or not
    Given I landed on Ecommerce application
    When I input userid<username> and user password<password> in apps
    Then "Epic sadface: Username and password do not match any user in this service" message is displayed

   Examples: 
      | username     | password   | 
      |standard_use |secret_sauce|  