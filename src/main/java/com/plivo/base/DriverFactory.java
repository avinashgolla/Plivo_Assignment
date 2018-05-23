package com.plivo.base;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
	WebDriver driver = null;

	public WebDriver getDriver(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			return new ChromeBrowser().getDriver(browser);
		}
		return null;
	}
}