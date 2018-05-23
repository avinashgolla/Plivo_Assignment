package com.plivo.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UIUtility {

	protected WebDriver driver;
	protected static final int pageTimeoutTime = 15;

	public UIUtility(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, pageTimeoutTime), this);
	}

	public void initPage(WebElement initialElement, WebElement... initialElements) {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, pageTimeoutTime), this);
		if (initialElement != null) {
			waitForElementVisibility(90, initialElement);
			for (WebElement element : initialElements) {
				waitForElementVisibility(90, element);
			}
		}
	}

	public void waitForElementVisibility(int timeout, WebElement element) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
	}

	public void enterTextInTextBox(String locator, String text) {
		driver.findElement(By.id(locator)).sendKeys(text);
	}

	public void clickOnSubmitButton(String text) {
		driver.findElement(By.id(text)).submit();

	}

	public void clickOnLink(String text) {
		driver.findElement(By.linkText(text)).click();

	}

	public String getErrorMessage(String text) {
		return driver.findElement(By.id(text)).getText();
	}

	public void clickOnsubmitButton(String text) {
		// var x = document.getElementsByClassName("btn");
		  // x[0].innerHTML = "Hello World!";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName('btn')[1].click()");
	}

}
