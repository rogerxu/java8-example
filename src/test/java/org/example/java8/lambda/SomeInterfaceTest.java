package org.example.java8.lambda;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SomeInterfaceTest {
	@BeforeClass
	public void setUp() {

	}

	@Test(groups = {"lambda"})
	public void testLambdaExpression() {
		// An instance of a functional interface using a lambda expression
		SomeInterface obj = (name) -> System.out.println("Hello " + name);
		obj.doSomething("Roger");
	}
}
