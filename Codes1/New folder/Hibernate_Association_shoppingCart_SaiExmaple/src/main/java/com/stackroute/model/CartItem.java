package com.stackroute.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="cartItem")
public class CartItem {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
  private int cartItemId;
@ManyToOne
@JoinColumn(name="cartId")
@JsonIgnore
  private Cart cart;
@OneToOne
@JoinColumn(name="productId")
  private Product product;
  private int quantity;
  private double itemTotalprice;
  
  public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public double getItemTotalprice() {
	return itemTotalprice;
}

public void setItemTotalprice(double itemTotalprice) {
	this.itemTotalprice = itemTotalprice;
}

public CartItem() {
	  
  }

public CartItem( Cart cart, Product product,int quantity,
 double itemTotalprice) {
	super();
	this.cart = cart;
	this.product = product;
	this.quantity=quantity;
	this.itemTotalprice=itemTotalprice;
}

public int getCartItemId() {
	return cartItemId;
}

public void setCartItemId(int cartItemId) {
	this.cartItemId = cartItemId;
}

public Cart getCart() {
	return cart;
}

public void setCart(Cart cart) {
	this.cart = cart;
}

public Product getProduct() {
	return product;
}

public void setProduct(Product product) {
	this.product = product;
}
  
  
}
