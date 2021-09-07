package webAppHibernate_Crud_Sai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import webAppHibernate_Crud_Sai.dao.UserDao;
import webAppHibernate_Crud_Sai.model.User;

@RestController
public class UserRestController {
	private UserDao userDao;
	@Autowired
	public UserRestController(UserDao userDao) {
		this.userDao =userDao;
		
	}
	
	@GetMapping("/")
	public List<User> listUser(){
		return userDao.listAllUsers();
	}

}
