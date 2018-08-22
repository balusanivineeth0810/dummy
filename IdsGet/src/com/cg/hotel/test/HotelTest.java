package com.cg.hotel.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.hotel.pojo.BookingPojo;
import com.cg.hotel.pojo.LoginPojo;
import com.cg.hotel.util.DriverUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HotelTest {
	private WebDriver driver;
	private BookingPojo pojo;
	private LoginPojo lpojo;
	@Before()
	public void setUp()
	{
		driver=DriverUtil.driverInitialize("chrome");
		pojo= new BookingPojo();
		lpojo = new LoginPojo();
		driver.get("http://localhost:8080/IdsGet/login.html");
		PageFactory.initElements(driver, pojo);
		PageFactory.initElements(driver, lpojo);
	}
	
	@After
	public void tearDown()
	{
        DriverUtil.closeDriver(driver);
	}

/*	@Given("^when I open the login page$")
	public void when_I_open_the_login_page() throws Throwable {
	     assertEquals("", driver.getTitle());
	}

	@Given("^enter the username and password$")
	public void enter_the_username_and_password() throws Throwable {
	     lpojo.setUsername("capgemini");
	     lpojo.setPassword("capg1234");
	      
	}

	@When("^I click on the login button$")
	public void i_click_on_the_login_button() throws Throwable {
	     
	      lpojo.setLoginMe();
	}

	@When("^If the login credentials are correct$")
	public void if_the_login_credentials_are_correct() throws Throwable {
	     
	      lp
	}

	@Then("^redirect me to booking page$")
	public void redirect_me_to_booking_page() throws Throwable {
	     
	      assertEquals("Hotel Booking", driver.getTitle());
	}

	@Then("^If the credentials are incorrect$")
	public void if_the_credentials_are_incorrect() throws Throwable {
	     
	      lpojo.setUsername("learning");
	      lpojo.setPassword("Capgemini123");
	      lpojo.setLoginMe();
	}

	@Then("^display 'Invalid login try again'$")
	public void display_Invalid_login_try_again() throws Throwable {
	     
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Invalid login! Please try again!";
		assertEquals(expectedMessage,actualMessage);
	}

	@Then("^If I didnt enter username and clicked login$")
	public void if_I_didnt_enter_username_and_clicked_login() throws Throwable {
	     
	      lpojo.setUsername("");
	      lpojo.setPassword("capg1234");
	      lpojo.setLoginMe();
	}

	@Then("^display please enter username$")
	public void display_please_enter_username() throws Throwable {
	     
	      assertEquals(" * Please enter userName.",lpojo.getUserMessage());
	}

	@Then("^If I didnt enter password and clicked login$")
	public void if_I_didnt_enter_password_and_clicked_login() throws Throwable {
	     
	      lpojo.setUsername("capgemini");
	      lpojo.setPassword("");
	      lpojo.setLoginMe();
	}

	@Then("^display please enter password$")
	public void display_please_enter_password() throws Throwable {
	     
	      assertEquals(" * Please enter password.",lpojo.getPasswordMessage());
	      
	        @login
  Scenario: Logging into website
    Given when I open the login page
    And enter the username and password
    When I click on the login button
    And If the login credentials are correct
    Then redirect me to booking page
    And If the credentials are incorrect
    Then display 'Invalid login try again'
    And If I didnt enter username and clicked login
    Then display please enter username
    And If I didnt enter password and clicked login
    Then display please enter password
	}*/
	@Test
	public void test() throws Throwable {
		when_I_open_login_page();
		i_didnt_enter_the_username_and_password_and_I_click_on_the_login();
		please_fill_username_should_display();
		i_enter_username_and_didnt_enter_password();
		i_click_on_the_login_again();
		please_fill_password_should_display();
		i_enter_incorrect_username_and_password();
		invalid_login_Please_try_again_should_display();
		i_enter_correct_username_and_password();
		it_should_take_me_to_booking_page();
		
		i_logged_in_successfully();
		user_select_Confirm_Booking_link_without_entering_FirstName();
		please_fill_the_First_Name_message_should_display();
		user_select_Confirm_Booking_link_without_entering_LastName();
		please_fill_the_Last_Name_message_should_display();
		user_select_Confirm_Booking_link_without_entering_email();
		please_fill_the_email_message_should_display();
		user_select_Confirm_Booking_link_without_entering_proper_email();
		please_enter_valid_Email_Id_message_should_display();
		user_select_Confirm_Booking_link_without_entering_mobile_number();
		please_fill_the_Mobile_number_message_should_display();
		user_select_Confirm_Booking_link_without_entering_proper_mobile_number();
		please_enter_valid_mobile_number_message_should_display();
		user_enter_address();
		user_select_Confirm_Booking_link_by_selecting_select_city();
		please_select_the_city_message_should_display();
		user_select_Confirm_Booking_link_by_selecting_select_state();
		please_select_the_state_message_should_display();
		user_selects_the_number_of_people();
		number_of_rooms_are_autopopulated();
		user_select_Confirm_Booking_without_entering_Card_Holder_Name();
		please_fill_the_Card_Holder_Name_message_should_display();
		user_select_Confirm_Booking_without_entering_Debit_Card_Number();
		please_fill_the_Debit_Card_Number_message_should_display();
		user_select_Confirm_Booking_without_entering_CVV();
		please_fill_the_CVV_message_should_display();
		user_select_Confirm_Booking_without_entering_Card_Expiration_Month();
		please_fill_the_Expiration_Month_message_should_display();
		user_select_Confirm_Booking_without_entering_Card_Expiration_Year();
		please_fill_the_Expiration_Year_message_should_display();
		user_select_Confirm_Booking_after_entering_Valid_set_of_information();
		booking_Completed_message_should_display();
	}
	@Given("^when I open login page$")
	public void when_I_open_login_page() throws Throwable {
	    
	    assertEquals("",driver.getTitle());
	}

	@When("^I didnt enter the 'username' and 'password' and I click on the 'login'$")
	public void i_didnt_enter_the_username_and_password_and_I_click_on_the_login() throws Throwable {
		lpojo.setLoginMe();
	}
	@Then("^'Please fill username' should display$")
	public void please_fill_username_should_display() throws Throwable {
	    
		assertEquals("* Please enter userName.",lpojo.getUserMessage());
	}

	@When("^I enter username and didnt enter password$")
	public void i_enter_username_and_didnt_enter_password() throws Throwable {
	    
	    lpojo.setUsername("igate");
	    
	}
	
	@When("^I click on the 'login' again$")
	public void i_click_on_the_login_again() throws Throwable {
		lpojo.setLoginMe();
	}

	@Then("^'Please fill password' should display$")
	public void please_fill_password_should_display() throws Throwable {
		assertEquals("* Please enter password.",lpojo.getPasswordMessage());
	    
	}

	@When("^I enter incorrect 'username' and 'password'$")
	public void i_enter_incorrect_username_and_password() throws Throwable {
	    lpojo.setPassword("igate1234");
	    lpojo.setLoginMe();
	}

	@Then("^'Invalid login! Please try again!' should display$")
	public void invalid_login_Please_try_again_should_display() throws Throwable {
	    
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Invalid login! Please try again!";
		assertEquals(expectedMessage,actualMessage);
	}

	@When("^I enter correct 'username' and password'$")
	public void i_enter_correct_username_and_password() throws Throwable {
		driver.switchTo().alert().dismiss();
	    lpojo.setUsername("capgemini");
	    lpojo.setPassword("capg1234");
	    lpojo.setLoginMe();
	}

	@Then("^It should take me to booking page$")
	public void it_should_take_me_to_booking_page() throws Throwable {
		assertEquals("Hotel Booking", driver.getTitle());
	    
	}
//Done
	@Given("^I logged in successfully$")
	public void i_logged_in_successfully() throws Throwable {
	     
	      assertEquals("Hotel Booking", driver.getTitle());
	}

	@When("^User select 'Confirm Booking' link without entering 'FirstName'$")
	public void user_select_Confirm_Booking_link_without_entering_FirstName() throws Throwable {
	     pojo.setConfirmBooking();
	     
	      
	}

	@Then("^'Please fill the First Name' message should display$")
	public void please_fill_the_First_Name_message_should_display() throws Throwable {
	     
		String actualMessage=driver.switchTo().alert().getText();
		 String expectedMessage="Please fill the First Name";
		 assertEquals(expectedMessage,actualMessage);
	}

	@When("^User select 'Confirm Booking' link without entering 'LastName'$")
	public void user_select_Confirm_Booking_link_without_entering_LastName() throws Throwable {
		driver.switchTo().alert().dismiss();
	      pojo.setFirstName("Dhawal");
	      pojo.setConfirmBooking();
	}

	@Then("^'Please fill the Last Name' message should display$")
	public void please_fill_the_Last_Name_message_should_display() throws Throwable {
	     
		String actualMessage=driver.switchTo().alert().getText();
		 String expectedMessage="Please fill the Last Name";
		 assertEquals(expectedMessage,actualMessage);
	}

	@When("^User select 'Confirm Booking' link without entering 'email'$")
	public void user_select_Confirm_Booking_link_without_entering_email() throws Throwable {
		driver.switchTo().alert().dismiss();
	      pojo.setLastName("Kulakarni");
	      pojo.setConfirmBooking();
	}

	@Then("^'Please fill the email' message should display$")
	public void please_fill_the_email_message_should_display() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		 String expectedMessage="Please fill the Email";
		 assertEquals(expectedMessage,actualMessage);
	      
	}
	
	@When("^User select \"Confirm Booking' link without entering proper 'email'$")
	public void user_select_Confirm_Booking_link_without_entering_proper_email() throws Throwable {
		driver.switchTo().alert().dismiss();
	    pojo.setEmailID("dhawalkulakarni");
	    pojo.setConfirmBooking();
	    
	}

	@Then("^'Please enter valid Email Id\\.' message should display$")
	public void please_enter_valid_Email_Id_message_should_display() throws Throwable {
	    
		String actualMessage=driver.switchTo().alert().getText();
		 String expectedMessage="Please enter valid Email Id.";
		 assertEquals(expectedMessage,actualMessage);
	}



	@When("^User select 'Confirm Booking' link without entering 'mobile number'$")
	public void user_select_Confirm_Booking_link_without_entering_mobile_number() throws Throwable {
		driver.switchTo().alert().dismiss();
	     pojo.setEmailID("dhawalkulakarni@gmail.com");
	     pojo.setConfirmBooking();
	      
	}
//done
	@Then("^'Please fill the Mobile number' message should display$")
	public void please_fill_the_Mobile_number_message_should_display() throws Throwable {
	     
		String actualMessage=driver.switchTo().alert().getText();
		 String expectedMessage="Please fill the Mobile No.";
		 assertEquals(expectedMessage,actualMessage);
	}
	
	@When("^User select \"Confirm Booking' link without entering proper 'mobile number'$")
	public void user_select_Confirm_Booking_link_without_entering_proper_mobile_number() throws Throwable {
		driver.switchTo().alert().dismiss();
	    pojo.setMobileNumber("alphabets");
	    pojo.setConfirmBooking();
	    
	}

	@Then("^'Please enter valid mobile number\\.' message should display$")
	public void please_enter_valid_mobile_number_message_should_display() throws Throwable {
	    
		String actualMessage=driver.switchTo().alert().getText();
		 String expectedMessage="Please enter valid Contact no.";
		 assertEquals(expectedMessage,actualMessage);
	}

	@When("^User 'enter address'$")
	public void user_enter_address() throws Throwable {
		driver.switchTo().alert().dismiss();
	     pojo.setMobileNumber("9874561230");
	     pojo.setAddress("Royal Market");
	      
	}

	@When("^User select 'Confirm Booking' link by selecting 'select city'$")
	public void user_select_Confirm_Booking_link_by_selecting_select_city() throws Throwable {
	     pojo.setConfirmBooking();
	     
	      
	}

	@Then("^'Please select the city' message should display$")
	public void please_select_the_city_message_should_display() throws Throwable {
	     
		String actualMessage=driver.switchTo().alert().getText();
		 String expectedMessage="Please select city";
		 assertEquals(expectedMessage,actualMessage);
	}

	@When("^User select 'Confirm Booking' link by selecting 'select state'$")
	public void user_select_Confirm_Booking_link_by_selecting_select_state() throws Throwable {
		driver.switchTo().alert().dismiss();
	      pojo.setCity("Chennai");
	      pojo.setConfirmBooking();
	}

	@Then("^'Please select the state' message should display$")
	public void please_select_the_state_message_should_display() throws Throwable {
	     
		String actualMessage=driver.switchTo().alert().getText();
		 String expectedMessage="Please select state";
		 assertEquals(expectedMessage,actualMessage);
	}

	@When("^User selects the 'number of people'$")
	public void user_selects_the_number_of_people() throws Throwable {
		driver.switchTo().alert().dismiss();
	     pojo.setState("Tamilnadu");
	     pojo.setNumberOfGuests("4");
	      
	}

	@Then("^'number of rooms' are autopopulated$")
	public void number_of_rooms_are_autopopulated() throws Throwable {
	     assertEquals("2",pojo.getNumberOfRooms());
	      
	}

	@When("^User select 'Confirm Booking' without entering 'Card Holder Name'$")
	public void user_select_Confirm_Booking_without_entering_Card_Holder_Name() throws Throwable {
	     pojo.setConfirmBooking();
	      
	}

	@Then("^'Please fill the Card Holder Name' message should display$")
	public void please_fill_the_Card_Holder_Name_message_should_display() throws Throwable {
		
		String actualMessage=driver.switchTo().alert().getText();
		 String expectedMessage="Please fill the Card holder name";
		 assertEquals(expectedMessage,actualMessage);
	      
	}
//done
	@When("^User select 'Confirm Booking' without entering 'Debit Card Number'$")
	public void user_select_Confirm_Booking_without_entering_Debit_Card_Number() throws Throwable {
		driver.switchTo().alert().dismiss();
	      pojo.setCardHolderName("Vineeth");
	      pojo.setConfirmBooking();
	}

	@Then("^'Please fill the Debit Card Number' message should display$")
	public void please_fill_the_Debit_Card_Number_message_should_display() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		 String expectedMessage="Please fill the Debit card Number";
		 assertEquals(expectedMessage,actualMessage);   
	      
	}

	@When("^User select 'Confirm Booking' without entering 'CVV'$")
	public void user_select_Confirm_Booking_without_entering_CVV() throws Throwable {
		driver.switchTo().alert().dismiss();
	      pojo.setDebitCardNumber("45689264646456");
	      pojo.setConfirmBooking();
	}

	@Then("^'Please fill the CVV' message should display$")
	public void please_fill_the_CVV_message_should_display() throws Throwable {
	     
		String actualMessage=driver.switchTo().alert().getText();
		 String expectedMessage="Please fill the CVV";
		 assertEquals(expectedMessage,actualMessage);   
	      
	}

	@When("^User select 'Confirm Booking' without entering 'Card Expiration Month'$")
	public void user_select_Confirm_Booking_without_entering_Card_Expiration_Month() throws Throwable {
		driver.switchTo().alert().dismiss();
	    pojo.setCvvNumber("786");
		pojo.setConfirmBooking();
	}

	@Then("^'Please fill the Expiration Month' message should display$")
	public void please_fill_the_Expiration_Month_message_should_display() throws Throwable {
	     
		String actualMessage=driver.switchTo().alert().getText();
		 String expectedMessage="Please fill expiration month";
		 assertEquals(expectedMessage,actualMessage);   
	      
	}

	@When("^User select 'Confirm Booking' without entering 'Card Expiration Year'$")
	public void user_select_Confirm_Booking_without_entering_Card_Expiration_Year() throws Throwable {
		driver.switchTo().alert().dismiss();
	    pojo.setExpirationMonth("12");
		pojo.setConfirmBooking();
	}

	@Then("^'Please fill the Expiration Year' message should display$")
	public void please_fill_the_Expiration_Year_message_should_display() throws Throwable {
	     
		String actualMessage=driver.switchTo().alert().getText();
		 String expectedMessage="Please fill the expiration year";
		 assertEquals(expectedMessage,actualMessage);   
	      
	}

	@When("^User select 'Confirm Booking' after entering Valid set of information$")
	public void user_select_Confirm_Booking_after_entering_Valid_set_of_information() throws Throwable {
		driver.switchTo().alert().dismiss();
		pojo.setExpirationYear("2020");
		pojo.setConfirmBooking();
	      
	}

	@Then("^'Booking Completed' message should display$")
	public void booking_Completed_message_should_display() throws Throwable {
	     
	      assertEquals("Payment Details", driver.getTitle());
	}
	

}
