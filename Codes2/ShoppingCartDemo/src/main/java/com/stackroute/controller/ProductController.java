package com.stackroute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.dao.ProductDao;
import com.stackroute.model.Product;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
	
	//crud Operations
	private ProductDao productDao;
    @Autowired
	public ProductController(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}
	
	@GetMapping
	public ResponseEntity<?> listAllProducts(){
		return new ResponseEntity(productDao.listAllProducts(),HttpStatus.CREATED);
	}
	@GetMapping("/{productId}")
	public ResponseEntity<?> getProductById(@PathVariable int productId){
		
		return new ResponseEntity(productDao.getProductById(productId),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> addProduct(@RequestBody Product product) {
		productDao.addProduct(product);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<?> updateProduct(@RequestBody Product product) {
		productDao.updateProduct(product);
		return new ResponseEntity(HttpStatus.OK);
	}
	@DeleteMapping("/{productId}")
	public ResponseEntity<?> deleteProduct(@PathVariable int productId) {
		productDao.deleteProduct(productId);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	
	
}
