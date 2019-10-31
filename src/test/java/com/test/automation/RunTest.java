package com.test.automation;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.test.pages.Login;

public class RunTest extends RunBase
{
	@BeforeAll
	public void beforeAll()
	{
		setup();
	}

	@AfterAll
	public void afterAll()
	{
		tearDown();
	}

	@Test
	@Order(1)
	public void goToUrl()
	{
		driver.get("http://www.newtours.demoaut.com/");
		Assertions.assertEquals("Welcome: Mercury Tours", driver.getTitle());
	}

	@Test
	@Order(2)
	public void logInUsingValidUser()
	{
		final Login login = new Login(driver);
		login.setUserName("muhin");
		login.setPassword("muhin");
		login.clicLoginButton();
		Assertions.assertEquals("Find a Flight: Mercury Tours:", driver.getTitle());
	}
}
