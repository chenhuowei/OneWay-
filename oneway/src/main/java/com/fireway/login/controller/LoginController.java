package com.fireway.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/loginPage.html")
	public String loginPage(){
		
		return "loginPage";
	}
	
	@RequestMapping("/login.html")
	public String login(){
		
		return "redirect:home.html";
	}
	
	
	@RequestMapping("/home.html")
	public String indexPage(){
		
		return "homePage";
	}
	
}
