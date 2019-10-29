package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class login extends PageBase
{
	public login(final WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
}
