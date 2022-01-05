#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)

Feature: Login Module

  Scenario: Verify Login Page Title
    Given User Should Be On Login Page
    When verify page title
    Then page title should be "actiTIME - Login"

  Scenario: Verify Login Functionlaity With Valid User
    Given User Should Be On Login Page
    When Enter valid username & password
    And Click login button
    Then User should login successfully and navigate to dashboard page and title of dashboard should be "actiTIME - Enter Time-Track"