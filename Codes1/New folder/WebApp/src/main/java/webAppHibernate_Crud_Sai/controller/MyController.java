package webAppHibernate_Crud_Sai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import webAppHibernate_Crud_Sai.dao.UseDaoImpl;
import webAppHibernate_Crud_Sai.model.User;


@Controller
public class MyController {
  
	private UseDaoImpl userdao;
	
	
	@RequestMapping("/")
	public String indexPage(Model model) {
		model.addAttribute("userList", userdao.listAllUsers());
		return "index";
	}
	@PostMapping("/addUser")
	public String addUser(@RequestParam("Name") String name,
			@RequestParam("city") String city,
			@RequestParam("email") String email) {
		User existingUser = userdao.getUserByEmail(email);
		if(existingUser!=null) {
			existingUser.setName(name);
			existingUser.setCity(city);
			userdao.updateUser(existingUser);
		}else {
			User user = new User(name , city, email);
			userdao.addUser(user);
			
		}
		return "redirect:/";
	}
	@GetMapping("/deLUser/{email}")
	public String delUser(@PathVariable("email") String email) {
		userdao.deleteUser(email);
		return "redirect:/";
	}

     @Autowired
	public MyController(UseDaoImpl userdao) {
		super();
		this.userdao = userdao;
//		userdao.addUser(new User("john", "chennai", "john@gmail.com"));
//		userdao.addUser(new User("sai", "Bangalore", "sai@gmail.com"));
	}
	
	@GetMapping("/updUser/{email}")
	public String updUser(@PathVariable("email") String email, ModelMap model) {
		User userItem=userdao.getUserByEmail(email);
		model.addAttribute("userUpdate",userItem);
		model.addAttribute("userList", userdao.listAllUsers());
		return "index";
	}
}
