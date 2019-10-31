package com.test.automation;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

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
	public void goToUrl()
	{
		driver.get("http://www.newtours.demoaut.com/");
		Assertions.assertEquals("Welcome: Mercury Tours", driver.getTitle());
	}

	@Test
	public void logInUsingValidUser()
	{

	}
}
