package com.stackroute.dao;

import java.util.List;

import com.stackroute.model.Product;

public interface ProductDao {
  boolean addProduct(Product product);
  boolean updateProduct(Product product);
  boolean deleteProduct(int productId);
  List<Product> listAllProducts();
  Product getProductById(int productId);
}
