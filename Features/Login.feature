Feature: Login with valid credentials

  @sanity @regression
  Scenario: Successful login with valid credentials
    Given user navigate to login page
    When user enters email as "yaad@adsdas.com" and password as "Test@123"
    And clicks on sign in button
    Then user should be redirected to the MyAccount page
    When user click on dropdown icon
    When user click on signout button
#
  #@regression
  #Scenario Outline: Login data driven
    #Given user navigate to login page
    #When user enters email as "<email>" and password as "<password>"
    #And clicks on sign in button
    #Then user should be redirected to the MyAccount page
#
    #Examples: 
      #| email            | password |
      #| yaad@adsdas.com  | Test@123 |
      #| laks@yahoo.com   | Test@123 |
      #| ankit@adsfds.com | Test@123 |
