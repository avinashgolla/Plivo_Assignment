package com.plivo.pageobjects;

import org.openqa.selenium.WebDriver;

import com.plivo.utils.UIUtility;

public class PaymentsPage extends UIUtility {

	private String redeemCouponLink = "Redeem a coupon code instead";
	private String couponCode = "coupon";
	private String submitButton = "Submit";
	private String errorMessage = "coupon_error";

	public PaymentsPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnRedeemCouponLink() {
		clickOnLink(redeemCouponLink);
	}

	public void enterCouponCode(String coupon) {
		enterTextInTextBox(couponCode, coupon);
	}

	public void submitRedemption() {
		clickOnsubmitButton(submitButton);
	}

	public String getErrorMessageForInvalidCoupon() {
		return getErrorMessage(errorMessage);
	}
}
