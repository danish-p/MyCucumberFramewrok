Feature: here we are going to see about Sceanario Outline working

@Smoke1
Scenario Outline: 
Given User is on registration Page
When user enters "<fName>" in first name field
And user enter "<lname>" in last name field
And user clicks on register button
Then registration is successfully

Examples:

| fName | lname |
| danish0 | aleem0 |
| danish1 | aleem1 |
| danish2 | aleem2 |

@Smoke1
Scenario Outline: 
Given User is on registration Page
When user enters "<fName>" in first name field
And user enter "<lname>" in last name field
And user clicks on register button
Then registration is successfully

@Smoke1
Scenario Outline: 
Given User is on amount
When user enters <amount1> in first name field
And user enter <amount2> in last name field
And user clicks on submit
Then check amount

Examples:

| amount1 | amount2 |
| 10 | 20 |
| 10.0 | 21 |
| 210.5 | 23.32 |