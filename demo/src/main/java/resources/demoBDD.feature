

Feature: SauceDemo login page test
 
  Scenario Outline: SauceDemo login with difrent username
    Given Browse the saucedemo website 
    And login with difrent username
    When I input <username> and <password>
    Then I verify the status in step

    Examples: 
      | username               | password    |
      | standard_user          | secret_sauce|
      | locked_out_user        | secret_sauce|
      | problem_user           | secret_sauce|
      | performance_glitch_user| secret_sauce|
