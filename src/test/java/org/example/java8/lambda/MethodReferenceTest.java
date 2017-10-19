package org.example.java8.lambda;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest {
	@Test
	public void testStaticMethodReference() {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(1);
		list.add(2);

		list.sort(MethodReference::compareStatic);
	}

	@Test
	public void testInstanceMethodReference() {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(1);
		list.add(2);

		MethodReference instance = new MethodReference();
		list.sort(instance::compareInstance);
	}
}
