@LoginFeature @smoke

Feature: Infosys employees login functionality validation

 

@Scenario1

Scenario Outline:  User should be able to login valid credentials

       Given User is on the  login page

       When User enters Employee Id as "0000000001"  

       When User enters Password as "Admin@123"

       And User clicks on login button 

       Then User should land on password reset page

 

Examples:

       |Employee Id|Password|

       |0000000001|Admin@123|

 
  