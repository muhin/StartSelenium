package com.test.automation;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RunTest extends RunBase{
	@BeforeAll
	public void beforeAll() {
		setup();
	}
	@AfterAll
	public void afterAll() {
		tearDown();
	}
	@Test
	public void goToGoogle() {
		driver.get("http://google.com");
	}
}
