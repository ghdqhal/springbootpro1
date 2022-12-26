package com.hbm.springproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/others/about-us")
	public String about() {
		return "others/about-us";
	}
	
	@RequestMapping("/others/classes")
	public String classes() {
		return "others/classes";
	}
	
	@RequestMapping("/others/blog")
	public String blog() {
		return "others/blog";
	}
	
	@RequestMapping("/others/contact")
	public String contact() {
		return "others/contact";
	}
}
