Feature: Create a Lead
Scenario Outline: Postive flow for Create a Lead

And Enter the username as DemoSalesManager
And Enter the password as crmsfa
And Click Login
And Click crmsfa link
And Click Lead
And Click Create Lead
And Enter Company Name as <companyname>
And Enter First Name as <firstname>
And Enter Last Name as <lastname>
When Click on Create Lead Button
Then Verify Create Lead is Success

Examples:
|companyname|firstname|lastname|
|TCS|Melvin|Samuel|
|TCS|Jovin|Ryaan|
