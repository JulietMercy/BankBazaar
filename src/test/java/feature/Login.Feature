Feature: Create a Lead
Background:
Given launch the Browser 
And maximize the browser
And set the timeout
And load URL
Scenario: Positive flow for Create a Lead

And Enter the username as DemoSalesManager
And Enter the password as crmsfa
And Click Login
And Click crmsfa link
And Click Lead
And Click Create Lead
And Enter Company Name
And Enter First Name
And Enter Last Name 
When Click on Create Lead Button
Then Verify Create Lead is Success

