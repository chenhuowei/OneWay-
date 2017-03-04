package com.fireway.admin.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fireway.admin.service.AdminMenuService;
import com.google.gson.Gson;

@Controller
@RequestMapping("/adminMenu")
public class AdminMenuController {

	@Resource
	private AdminMenuService adminMenuService;
	
	@RequestMapping("/findAll.html")
	@ResponseBody
	public Object findAll(){
		return new Gson().toJson(adminMenuService.findAll());
	}
	
	
}
