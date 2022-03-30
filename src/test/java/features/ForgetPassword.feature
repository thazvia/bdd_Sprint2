@LoginFeature @smoke

Feature: Infosys employees Forget Password functionality validation

 

@Scenario2

Scenario Outline:  User should be able to login valid credentials

       Given User is on the  login page

       When user clicks on Forget Password button

       When User enters Employee Id on Forget Password page as "0000000001"  

  And User clicks on Submission button

  When User select Security Question as "What is your favorite animal?"

  When User enter Answer as "Answer"

  And User clicks on continue button

  When User enters New Password as "aaaaaaaa"

  When User Re Enter New Password as "aaaaaaaa"

  And User clicks on continue button

      

      

      

      

      

      

Examples:

       |Employee Id|Question|Answer|Password|

       |0000000001|What is your favorite animal?|Answer|aaaaaaaa|

 