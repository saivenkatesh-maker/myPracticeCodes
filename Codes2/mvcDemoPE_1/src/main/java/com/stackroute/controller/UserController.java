package com.stackroute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stackroute.model.User;
@Controller
public class UserController {
	private User user;
    @Autowired
	public UserController(User user) {
		super();
		this.user = user;
		user.setName("Sai Venkatesha");
	}
	@RequestMapping("/")
	public String indexPage(Model model) {
		
		model.addAttribute("userName", user.getName());
		return "index";
	}
	

}
