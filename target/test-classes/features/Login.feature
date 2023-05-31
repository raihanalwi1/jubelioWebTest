Feature: Login
  As a user
  I want to login
  So I can manage my dashboard account

  Scenario Outline: Login with email and password
    Given I am on the login page
    When I input email "<email>"
    And I input password "<password>"
    And I click login button
    Then I will validate status "<status>"
    Examples:
    |             email            | password    | status |
    | qa.rakamin.jubelio@gmail.com | Jubelio123! | true   |
    | user@gmail.com               | user123.    | false  |
    |                              | abcde123    | req-email |
    | naixxy@gmail.com             |             | req-password |
    | qa.rakamin.jubelio@gmail.com | adada       | req-6char    |

