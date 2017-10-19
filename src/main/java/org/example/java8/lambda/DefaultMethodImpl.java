package org.example.java8.lambda;

public class DefaultMethodImpl implements DefaultMethodInterface {
	private String name;
	private int age;

	public DefaultMethodImpl(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public void setAge(int age) {
		this.age = age;
	}
}
