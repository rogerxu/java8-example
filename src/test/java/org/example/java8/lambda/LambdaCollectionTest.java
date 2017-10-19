package org.example.java8.lambda;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaCollectionTest {
	@Test
	public void testTraverse() {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.forEach((str) -> System.out.println(str));
	}

	@Test
	public void testFilter() {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");

		Predicate<String> predicate = (str) -> str.equals("b");
		list.forEach((str) -> {
			if (predicate.test(str)) {
				System.out.println(str);
			}
		});
	}
}
