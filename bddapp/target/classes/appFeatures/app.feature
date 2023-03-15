Feature: Login to the website
Scenario: Admin login 
Given Admin login to the website with valid credentials
When Admin input valid userid "Admin" and valid password "admin123"
And Click login botton
Then Admin can see there name on the webpage "true"

Scenario: Admin login 
Given Admin login to the website with valid credentials
When Admin input valid userid "Basith" and valid password "admin123"
And Click login botton
Then Admin can see there name on the webpage "false"
