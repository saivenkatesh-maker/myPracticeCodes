package com.stackroute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stackroute.dao.UserDao;
import com.stackroute.model.User;
@Controller
public class UserController {
	private UserDao userDao;
	
    @Autowired
	public UserController(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
    
    @RequestMapping("/")
    public String loginUSer() {
    	return "index";
    }


	@PostMapping
	public String welcomePage(Model model, @RequestParam String name,@RequestParam String password) {
		
		if(userDao.RegistredLoginUser(name, password)) {
			model.addAttribute("UserName", name);
			return "Welcome";
		}
		return "InvalidUserPage";
	}
	

}
