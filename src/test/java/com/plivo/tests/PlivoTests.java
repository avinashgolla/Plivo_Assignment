package com.plivo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.plivo.base.BaseTest;
import com.plivo.pageobjects.HomePage;
import com.plivo.pageobjects.LoginPage;
import com.plivo.pageobjects.PaymentsPage;

public class PlivoTests extends BaseTest {

	@Test
	public void test1() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		login.enterUname("plivoiview@gmail.com");
		login.enterPassword("Plivo@123");
		login.clickOnSubmit();
		HomePage home = new HomePage(driver);
		home.clickOnAccountLink();
		home.clickOnPaymentLink();
		PaymentsPage payment = new PaymentsPage(driver);
		payment.clickOnRedeemCouponLink();
		payment.enterCouponCode("123456789");
		Thread.sleep(10000);
		payment.submitRedemption();
		Assert.assertEquals(payment.getErrorMessageForInvalidCoupon(), "This coupon code is invalid.",
				"mismatch in the error message");
	}

}
