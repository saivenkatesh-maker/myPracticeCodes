package com.stackroute.json;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties(ignoreUnknown = true)

public class Student {
   private int id;
   private String firstName;
   private String lastName;
   private String email;
   private String[] languages;
   private Address address;
   
   public String[] getLanguages() {
	return languages;
}

public void setLanguages(String[] languages) {
	this.languages = languages;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

   
public Student(int id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
   
public Student() {
}
@Override
public String toString() {
	return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
}


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

	
	
	
}
