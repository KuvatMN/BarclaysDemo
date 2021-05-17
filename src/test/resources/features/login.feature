

Feature: User should not be able to login with invalid credentials

  @wip
  Scenario Outline: Login with Invalid Credentials
    Given User is on Login Page
    When User enters "<lastName>" and "<membershipNumber>"
    Then User should see error message "You have 1 error to correct before you can proceed"

    Examples:
      | lastName    | membershipNumber |
      | Nurgeldiyev | 123456789012     |
