package com.cg.hotel.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class BookingPojo {
@FindBy(how=How.ID,using="txtFirstName")
private WebElement firstName;
@FindBy(how=How.ID,using="txtLastName")
private WebElement lastName;
@FindBy(how=How.ID,using="txtEmail")
private WebElement emailID;
@FindBy(how=How.ID,using="txtPhone")
private WebElement mobileNumber;
@FindBy(how=How.XPATH,using="//textarea")
private WebElement address;
@FindBy(how=How.NAME,using="city")
private WebElement city;
@FindBy(how=How.NAME,using="state")
private WebElement state;
@FindBy(how=How.NAME,using="persons")
private WebElement numberOfGuests;
@FindBy(how=How.ID,using="rooms")
private WebElement numberOfRooms;
@FindBy(how=How.ID,using="txtCardholderName")
private WebElement cardHolderName;
@FindBy(how=How.ID,using="txtDebit")
private WebElement debitCardNumber;
@FindBy(how=How.ID,using="txtCvv")
private WebElement cvvNumber;
@FindBy(how=How.ID,using="txtMonth")
private WebElement expirationMonth;
@FindBy(how=How.ID,using="txtYear")
private WebElement expirationYear;
@FindBy(how=How.ID,using="btnPayment")
private WebElement confirmBooking;

public String getFirstName() {
	return firstName.getAttribute("value");
}
public void setFirstName(String firstName) {
	this.firstName.clear();
	this.firstName.sendKeys(firstName);
}
public String getLastName() {
	return lastName.getAttribute("value");
}
public void setLastName(String lastName) {
	this.lastName.clear();
	this.lastName.sendKeys(lastName);
}
public String getEmailID() {
	return emailID.getAttribute("value");
}
public void setEmailID(String emailID) {
	this.emailID.clear();
	this.emailID.sendKeys(emailID);
}
public String getMobileNumber() {
	return mobileNumber.getAttribute("value");
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber.clear();
	this.mobileNumber.sendKeys(mobileNumber);
}
public String getAddress() {
	return address.getAttribute("value");
}
public void setAddress(String address) {
	this.address.clear();
	this.address.sendKeys(address);
}
public String getCity() {
	return new Select(this.city).getFirstSelectedOption().getText();
}
public void setCity(String city) {
	new Select(this.city).selectByVisibleText(city);
}
public String getState() {
	return new Select(this.state).getFirstSelectedOption().getText();
}
public void setState(String state) {
	/*this.state = state;*/
	new Select(this.state).selectByVisibleText(state);
}
public String getNumberOfGuests() {
	return new Select(this.numberOfGuests).getFirstSelectedOption().getText();
}
public void setNumberOfGuests(String numberOfGuests) {
	new Select(this.numberOfGuests).selectByVisibleText(numberOfGuests);
}
public String getNumberOfRooms() {
	return numberOfRooms.getText();
}

public String getCardHolderName() {
	return cardHolderName.getAttribute("value");
}
public void setCardHolderName(String cardHolderName) {
	this.cardHolderName.clear();
	this.cardHolderName.sendKeys(cardHolderName);
}
public String getDebitCardNumber() {
	return debitCardNumber.getAttribute("value");
}
public void setDebitCardNumber(String debitCardNumber) {
	this.debitCardNumber.clear();
	this.debitCardNumber.sendKeys(debitCardNumber);
}
public String getCvvNumber() {
	return cvvNumber.getAttribute("value");
}
public void setCvvNumber(String cvvNumber) {
	this.cvvNumber.clear();
	this.cvvNumber.sendKeys(cvvNumber);
}
public String getExpirationMonth() {
	return expirationMonth.getAttribute("value");
}
public void setExpirationMonth(String expirationMonth) {
	this.expirationMonth.clear();
	this.expirationMonth.sendKeys(expirationMonth);
}
public String getExpirationYear() {
	return expirationYear.getAttribute("value");
}
public void setExpirationYear(String expirationYear) {
	this.expirationYear.clear();
	this.expirationYear.sendKeys(expirationYear);
}

public void setConfirmBooking() {
	confirmBooking.click();
}


}