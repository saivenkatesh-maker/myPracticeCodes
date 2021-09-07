package com.sai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mycontroller {
	@RequestMapping("/login")
public String show() {
	return "login";
}
}
