Feature: this feature is about data table example

@Smoke
Scenario:
Given user is on registration page
When user enters following user details
| danish0 | aleem0 | 26 | 28-April-1994 |
| danish1 | aleem1 | 26 | 28-April-1994 |
| danish2 | aleem3 | 26 | 28-April-1994 |
Then user register successully


@Smoke
Scenario:
Given user is on registration page with different data and column
When user enters following user details with columns
| fname | lastName | age | DOB |
| danish0 | aleem0 | 26 | 28-April-1994 |
| danish1 | aleem1 | 26 | 28-April-1994 |
| danish2 | aleem3 | 26 | 28-April-1994 |
Then user register successully