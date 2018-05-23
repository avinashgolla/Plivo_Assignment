package com.plivo.pageobjects;

import org.openqa.selenium.WebDriver;

import com.plivo.utils.UIUtility;

public class HomePage extends UIUtility {

	private String accountLink = "Account";
	private String paymentLink = "Payments";

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void clickOnAccountLink() {
		clickOnLink(accountLink);
	}

	public void clickOnPaymentLink() {
		clickOnLink(paymentLink);
	}
}
