package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.bean.User;
import com.demo.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;

	@RequestMapping("/")
	public String login() {
		return "index";
	}

	@RequestMapping("/form")
	public String form() {
		return "form";
	}

	@PostMapping("/processForm")
	public String submit(@ModelAttribute User user, Model m) {
		System.out.println(user);
		this.service.saveUser(user);
		return "form";
	}

	public UserController(UserService service) {
		super();
		this.service = service;
	}

	public UserController() {
		super();
	}
}
