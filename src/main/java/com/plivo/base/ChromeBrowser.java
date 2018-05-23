package com.plivo.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser extends Browser {

	public WebDriver getDriver(String browser) {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		return new ChromeDriver();
	}

}
