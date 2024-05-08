Feature: Login Data Driven with Excel

  Scenario Outline: Login Data Drivern Excel
    Given user navigate to login page
    Then user should redirected to the My Account page by passing email and password from excel row "<row_index>"

    Examples: 
      | row_index |
      |         1 |
      |         2 |
      |         3 |
      |         4 |
      |         5 |
