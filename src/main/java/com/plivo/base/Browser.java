package com.plivo.base;

import org.openqa.selenium.WebDriver;

public abstract class Browser {
	protected WebDriver driver;

	abstract WebDriver getDriver(String browser);
}