package com.stackroute.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="user")
public class User {
 @Id	
 @GeneratedValue(strategy=GenerationType.AUTO)
 
 private int userId;
 private String name;
 private String email;
 @OneToOne
 @JoinColumn(name="cartId")
 @Cascade(CascadeType.ALL)
 private Cart cart;
 
 public User() {
	 
 }
 
 public User( String name, String email,Cart cart) {
	super();
	
	this.name = name;
	this.email = email;
	this.cart=cart;
}

public Cart getCart() {
	return cart;
}

public void setCart(Cart cart) {
	this.cart = cart;
}

public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}
 
 
 
}
