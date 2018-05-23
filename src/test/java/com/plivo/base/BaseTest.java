package com.plivo.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

	protected WebDriver driver;
	DriverFactory factory;
	static Properties property;
	static String browser;

	@BeforeClass
	public void setup() {
		try {
			property = new Properties();
			FileInputStream file = new FileInputStream("resources/testdata.properties");
			property.load(file);
			browser = property.getProperty("Browser");
			factory = new DriverFactory();
			System.out.println(browser);
			driver = factory.getDriver(browser);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@BeforeMethod(alwaysRun = true)
	public void startApp() {
		if (driver != null)
			driver.get(property.getProperty("Url"));
	}

	@BeforeSuite
	public void setupTestSuite() {
	}

	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		driver.quit();
	}
}
