package com.stackroute.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="cart")
public class Cart {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
  private int cartId;
	@OneToOne
	@JoinColumn(name="userId")
	@JsonIgnore
  private User user;
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="cartItemId")
	@JsonIgnore
  private List<CartItem> cartItem;
  
  
  public Cart() {
	  
  }
public Cart( User user,List<CartItem> cartItem) {
	super();

	this.user = user;
	this.cartItem=cartItem;
}
public int getCartId() {
	return cartId;
}
public void setCartId(int cartId) {
	this.cartId = cartId;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
  
}
