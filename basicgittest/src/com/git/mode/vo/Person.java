package com.git.mode.vo;

public class Person {
	
	private String name;
	private int age;
	private String email;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", email=" + email + "]";
	}
	
	
	
	
}
