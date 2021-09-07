package com.sai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {
     @RequestMapping("/welcome")
	public String show() {
		return "welcome";
	}
}
