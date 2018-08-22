@Booking
Feature: Booking a hotel

  @login
  Scenario: Logging into website
    Given when I open login page
    When I didnt enter the 'username' and 'password' and I click on the 'login'
    Then 'Please fill username' should display
    When I enter username and didnt enter password
    And I click on the 'login' again
    Then 'Please fill password' should display
    When I enter incorrect 'username' and 'password'
    Then 'Invalid login! Please try again!' should display
    When I enter correct 'username' and password'
    Then It should take me to booking page

  @bookinghotel
  Scenario: Entering user details
    Given I logged in successfully
    When User select 'Confirm Booking' link without entering 'FirstName'
    Then 'Please fill the First Name' message should display
    When User select 'Confirm Booking' link without entering 'LastName'
    Then 'Please fill the Last Name' message should display
    When User select 'Confirm Booking' link without entering 'email'
    Then 'Please fill the email' message should display
    When User select "Confirm Booking' link without entering proper 'email'
    Then 'Please enter valid Email Id.' message should display
    When User select 'Confirm Booking' link without entering 'mobile number'
    Then 'Please fill the Mobile number' message should display
    When User select "Confirm Booking' link without entering proper 'mobile number'
    Then 'Please enter valid mobile number.' message should display
    When User 'enter address'
    When User select 'Confirm Booking' link by selecting 'select city'
    Then 'Please select the city' message should display
    When User select 'Confirm Booking' link by selecting 'select state'
    Then 'Please select the state' message should display
    When User selects the 'number of people'
    Then 'number of rooms' are autopopulated
    When User select 'Confirm Booking' without entering 'Card Holder Name'
    Then 'Please fill the Card Holder Name' message should display
    When User select 'Confirm Booking' without entering 'Debit Card Number'
    Then 'Please fill the Debit Card Number' message should display
    When User select 'Confirm Booking' without entering 'CVV'
    Then 'Please fill the CVV' message should display
    When User select 'Confirm Booking' without entering 'Card Expiration Month'
    Then 'Please fill the Expiration Month' message should display
    When User select 'Confirm Booking' without entering 'Card Expiration Year'
    Then 'Please fill the Expiration Year' message should display

  @successful
  Scenario: Booking completed
    When User select 'Confirm Booking' after entering Valid set of information
    Then 'Booking Completed' message should display
