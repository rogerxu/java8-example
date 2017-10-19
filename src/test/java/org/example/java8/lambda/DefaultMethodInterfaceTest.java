package org.example.java8.lambda;

import org.testng.annotations.Test;

public class DefaultMethodInterfaceTest {
	@Test
	public void testDefaultMethod() {
		DefaultMethodInterface instance = new DefaultMethodImpl("Joe", 30);
		System.out.println(instance.getInstanceInfo());
	}

	@Test
	public void testStaticMethod() {
		System.out.println(DefaultMethodInterface.getStaticInfo());
	}
}
