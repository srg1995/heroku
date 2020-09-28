package com.cristianRuizBlog.aplicacion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import src.main.java.com.cristianRuizBlog.aplicacion.repository.RoleRepository;
import src.main.java.com.cristianRuizBlog.aplicacion.service.UserService;

@Controller
public class UserController {

	private final String TAB_FORM = "formTab";
	private final String TAB_LIST = "listTab";
	
	@Autowired
	UserService userService;
	
	@Autowired
	RoleRepository roleRepository;
	
	@GetMapping({"/"})
	public String index() {
		return "holas";
	}
}


