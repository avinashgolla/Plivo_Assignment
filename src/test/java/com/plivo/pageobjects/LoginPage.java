package com.plivo.pageobjects;

import org.openqa.selenium.WebDriver;

import com.plivo.utils.UIUtility;

public class LoginPage extends UIUtility {

	private String uName = "id_username";
	private String passWord = "id_password";
	private String loginButton = "login-sub";

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void enterUname(String text) {
		enterTextInTextBox(uName, text);
	}

	public void enterPassword(String text) {
		enterTextInTextBox(passWord, text);
	}

	public void clickOnSubmit() {
		clickOnSubmitButton(loginButton);
	}

}
