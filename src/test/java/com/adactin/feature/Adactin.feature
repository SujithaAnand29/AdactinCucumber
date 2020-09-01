Feature: Testing of Booking functionality in Adactin application 

Background:
		Given User launch the Adactin application
		When User log into the application


Scenario Outline: Verify the User is able to login the application 
	Given User launches the application 
	When User enters the valid "<username>" in Username field 
	And User enters the valid "<password>" in password field 
	And User clicks the Login Button 
	Then User verify the SignInPage navigates to the Search Hotel page 
	
Examples:
|username|password|
|AAA|1111|
|BBBB|3333|
|sujithaanand|suji@29|	
	

Scenario: Verify user is in SearchHotel page 
	When User selects the "Sydney" as "value" in the Select Location field 
	And User selects the "Hotel Creek" as "visibletext" in the Select Hotel field 
	And User selects the room type in the Select Room Type field 
	And User selects the number of rooms 
	And User selects the check in date 
	And User selects the check out date 
	And User enter the adults per Room 
	And User enter the children per Room 
	And User clicks on Search button to search for the details 
	Then User verify the Search Hotel page navigates to Select Hotel page 
	
	
Scenario: Verify user in Select Hotel page 
	When User clicks on the selected radio button 
	And User clicks on continue button 
	Then User Verify the Select Hotel page navigates to  Hotel Confirmation page 
	
Scenario: Verify User is in Hotel Confirmation Page 
	When User enters the Firstname 
	And User enters the Lastname 
	And User enters the Address 
	And User enters the Cardno 
	And User enters the Cardtype 
	And User enters the Expirymonth 
	And User enters the Expiryyear 
	And User enters the Cvvnumber 
	And User enters the Booknow 
	Then User checks the booking confirmation in the Booking Confirmation page 
	Then User clicks the logout button 
	
	
	
	
	
	