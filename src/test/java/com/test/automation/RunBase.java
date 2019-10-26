package com.test.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunBase {
	protected static WebDriver driver;
	
	protected void setup() {
		driver = getWebDriver();
	}
	protected void tearDown() {
		if(driver !=null)
			driver.close();
	}
	protected WebDriver getWebDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\git\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

}
