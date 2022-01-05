Feature: Login Module

@All
  Scenario: Verify Login Page Title
    Given User Should Be On Login Page
    When verify page title
    Then page title should be "Aicme"

@All
  Scenario: Verify Login Functionlaity With Valid User
    Given User Should Be On Login Page
    When Enter valid username & password
    Then User should login successfully and navigate to dashboard page and title of dashboard should be "Home"
