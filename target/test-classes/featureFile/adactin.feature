Feature: To check the adactin functionality

@login
Scenario: To check the login page
Given User launches adactin application  
When User enter valid username and password 
Then User clicks login button
And User navigates to the home page

Scenario: Enter the mandatory fields in the search page
Given Select location of hotel from dropdown
When Select your favorite hotel 
And Select your room type which is suitable for you
And Select number of room for you from dropdown
And enter checkin date with valid format 
And enter valid checkout date which should be in future date
And select number of adults per room
And select number of childrens per room which is not mandatory
Then click on the search button

Scenario: select hotel name 
Given check hotel details 
When click the select hotel radio button
And click on the continue button
Then user navigates to the payment option

Scenario: book a hotel with payment details 
Given enter name in the first name field
When enter the last name in the field
And enter billing address of the user 
And enter valid credit card number
And select the card type
And select valid expiry month of the card 
And select expiry year
And enter correct ccv number
Then click on the book now button

Scenario: view booking history
Given navigate to booking history page
When take screenshot of the order number 
Then click on the logout button 
  





