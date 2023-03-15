Feature: Orange HRM website

Scenario Outline: Admin login with valid credentials
Given Website initialize with chrome browser
And Navigate to the "https://opensource-demo.orangehrmlive.com/index.php/auth/login" site
When Admin input userid <username> and user password <password> and Click login botton
Then Admin can see there homepage with his name
And close driver

Examples: 
|username |password|  
|Admin    |admin123|
|Basith   |admin123|