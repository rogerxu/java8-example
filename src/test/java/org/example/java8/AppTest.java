package org.example.java8;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@BeforeClass
	public void setUp() {

	}

	@Test(groups = {"fast"})
	public void testApp() {
		System.out.println("Fast test");
	}

	@Test(groups = {"slow"})
	public void aSlowTest() {
		System.out.println("Slow test");
	}
}
