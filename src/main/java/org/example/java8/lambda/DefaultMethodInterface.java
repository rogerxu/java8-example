package org.example.java8.lambda;

public interface DefaultMethodInterface {
	String getName();
	void setName(String name);
	int getAge();
	void setAge(int age);

	default String getInstanceInfo() {
		return getName() + " - " + getAge();
	}

	static String getStaticInfo() {
		return "static method in interface";
	}
}
