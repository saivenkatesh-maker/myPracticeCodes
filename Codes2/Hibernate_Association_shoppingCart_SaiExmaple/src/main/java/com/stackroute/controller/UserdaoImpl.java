package com.stackroute.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stackroute.model.Cart;
import com.stackroute.model.User;
@Repository
@Transactional
public class UserdaoImpl implements UserDao {
	
	private SessionFactory sessionFactory;

	@Override
	public boolean addUser(User user) {
		Cart cart=new Cart();
		user.setCart(cart);
		cart.setUser(user);
		sessionFactory.getCurrentSession().save(user);
		return true;
	}
  @Autowired
	public UserdaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<User> listAllUser() {
		
	return sessionFactory.getCurrentSession().createQuery("from User").list();
		
	}

	@Override
	public User getUserByEmail(String email) {
		return (User) sessionFactory.getCurrentSession().createQuery("from User WHERE Email="+email).uniqueResult();
	}

	@Override
	public User getUserById(int UserId) {
		
		return (User) sessionFactory.getCurrentSession().createQuery("from User WHERE UserId="+UserId).uniqueResult();
	}

}
