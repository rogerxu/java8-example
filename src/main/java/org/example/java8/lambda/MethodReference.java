package org.example.java8.lambda;

public class MethodReference {
	public static int compareStatic(int num1, int num2) {
		return num1 - num2;
	}

	public int compareInstance(int num1, int num2) {
		return num1 - num2;
	}
}
