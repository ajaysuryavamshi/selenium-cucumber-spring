Feature: Login

  Scenario: Successful Login
    Given I navigate to the login page
    When I enter valid credentials
    And click on the login button
    Then I should be redirected to the dashboard

  Scenario: Unsuccessful Login
    Given I navigate to the login page
    When I enter invalid credentials
    And click on the login button
    Then I should see an error message
