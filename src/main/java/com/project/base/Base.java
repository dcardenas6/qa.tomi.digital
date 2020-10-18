package com.project.base;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Base {

	//Constructor WebDriver
	private WebDriver driver;
	
	public Base(WebDriver driver) {
		this.driver = driver;
	}
	
	//ChromeDriver Connection
	public WebDriver chromedriverConnection() {
		System.setProperty(GlobalVariables.CHROME_WEBDRIVER_NAME, GlobalVariables.CHROME_DRIVER_PATH);
		driver = new ChromeDriver();
		return driver;
	}
	
	public void launchBrowser(String url) {
		driver.get(url);
		driver.manage().window().maximize();	
	}
	
	public void reporterLog(String log) {
		Reporter.log(log);
	}
	
	public void waitForElementPresent(By locator) {
		try {
			WebDriverWait wait =new WebDriverWait(driver, GlobalVariables.GENERAL_TIMEOUT);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}catch (TimeoutException e) {
			reporterLog("Timeout error");
		}
	}
	
	public void insertText(By locator, String text) {
		//WebElement caja = driver.findElement(textBox);
		//caja.sendKeys(text);
		driver.findElement(locator).sendKeys(text);	
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}

}
