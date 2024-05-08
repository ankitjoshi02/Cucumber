Feature: Account Registration

  @regression
  Scenario: Succesfull account registration
    Given user redirected to registration page
    When the user enters the detail info below field
      | firstname        | Ankit            |
      | lastname         | Joshi            |
      | email            | ankit12@dsfds.com |
      | password         | Test@123         |
      | confirm password | Test@123         |
    And user click on Creat an account button
    Then use should redireted to thank you msg
