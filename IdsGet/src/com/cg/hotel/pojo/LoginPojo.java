package com.cg.hotel.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPojo {
    @FindBy(how=How.NAME,using="userName")
	private WebElement username;
    @FindBy(how=How.NAME,using="userPwd")
	private WebElement password;
    @FindBy(how=How.ID,using="userErrMsg")
	private WebElement userMessage;
    @FindBy(how=How.ID,using="pwdErrMsg")
   	private WebElement passwordMessage;
    /*String path="//*[@id=mainCnt]/div/div[1]/form/table/tbody/tr[4]/td[2]/input";
    @FindBy(how=How.XPATH,using="//*[@id='mainCnt']/div/div[1]/form/table/tbody/tr[4]/td[2]/input"*/
    /*@FindBy(how=How.XPATH,using="//input[@value='Login']")*/
    @FindBy(how=How.CLASS_NAME,className="btn")
    private WebElement loginMe;
    //using="xpath=//input[@value='Login']"
	public String getUsername() {
		return this.username.getAttribute("value");
	}
	public void setUsername(String username) {
		this.username.clear();
		this.username.sendKeys(username);
	}
	public String getPassword() {
		return this.password.getAttribute("value");
	}
	public void setPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}
	public String getUserMessage() {
		return userMessage.getText();
	}
	public String getPasswordMessage() {
		return this.passwordMessage.getText();
	}

	public void setLoginMe() {
		loginMe.click();
	}
    
    
    
    
}
