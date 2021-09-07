
package com.stackroute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.stackroute.dao.UserDao;

@Controller
public class UserController {
	private UserDao userDao;
	
    @Autowired
	public UserController(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
    
    @RequestMapping("/")
    public String loginUser() {
    	return "login";
    }


	@PostMapping("/login")
	public String welcomePage(Model model, @RequestParam("name") String name,@RequestParam("pass") String password) {
		boolean temp=userDao.RegistredLoginUser(password);
		if(temp==true) {
			model.addAttribute("userName", name);
			return "Welcome";
		}else {
//			System.out.println(password);
		return "InvalidUserPage";
		}
	}
	

}
