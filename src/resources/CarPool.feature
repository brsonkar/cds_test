Feature: New user Registration
Scenario: Mobile Number is mandatory
Given User leaves mobile number field blank
When clicks on submit button
Then Displaying error message "Please fill out this field"
And User will be able to enter mobile number again

Scenario: Mobile number should be valid
Given User enter mobile number as "1234"
When Clicked on submit button 
Then Displaying error message "Mobile number should exactly 10 digits"
And User will be able to click on "Ok" button
And User will be able to enter mobile number again Example "12345678" 

Scenario: Mobile number should be valid
Given User enter mobile number as "12345ty6"
When Clicked on submit button 
Then Displaying error message "The mobile number should be numeric only"
And User will be able to click on "Ok" button
And User will be able to enter mobile nunber again

Scenario: Mobile number should be okay 
Given User enter mobile number as 1234567890
When User click on submit button
Then Displaying message "Please recheck mobile number"
And User will be able to click on "Okay" button
And Display message "Registration successful"
