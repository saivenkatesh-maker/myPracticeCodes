package mvcXmlconfig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mvccontroller {
	
	@RequestMapping("/index")
	public String indexPage() {
		return "index";
	}

	
}
