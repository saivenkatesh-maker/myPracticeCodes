package com.stackroute.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.stackroute.model.Product;
@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {
	
	private SessionFactory sessionFactory;
	
	@Autowired
	public ProductDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}

	public boolean addProduct(Product product) {
		 sessionFactory.getCurrentSession().save(product);
		 return true;
	}

	public boolean updateProduct(Product product) {
		sessionFactory.getCurrentSession().update(product);
		 return true;
	}

	public boolean deleteProduct(int productId) {
		sessionFactory.getCurrentSession().delete(getProductById(productId));
		 return true;
	}

	public List<Product> listAllProducts() {
		
		return sessionFactory.getCurrentSession().createQuery("from Product").list();
	}

	public Product getProductById(int productId) {
		return (Product) sessionFactory.getCurrentSession().createQuery("from Product WHERE productId="+productId).uniqueResult();
	}

}
