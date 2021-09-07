package com.stackroute.model;
//POJO class of Student 
public class Student {
	
	private String name;
	private int age;
	private String city;
	private String email;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student(String name, int age, String city, String email) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.email = email;
	}
	public Student() {
		
	}

}
