package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
@Id
private String email;
private String Password;

public User() {
	
}


public String getEmail() {
	return email;
}

public User(String email, String password) {
	super();
	this.email = email;
	Password = password;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return Password;
}

public void setPassword(String password) {
	Password = password;
}

@Override
public String toString() {
	return "User [email=" + email + ", Password=" + Password + "]";
}

}
