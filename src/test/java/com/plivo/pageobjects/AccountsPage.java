package com.plivo.pageobjects;

import org.openqa.selenium.WebDriver;

import com.plivo.utils.UIUtility;

public class AccountsPage extends UIUtility {

	private String paymentsLink = "";

	public AccountsPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnPaymentsLink(String text) {
		clickOnLink(text);
	}

}
