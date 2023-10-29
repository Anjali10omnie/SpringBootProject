package com.user.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class CustomController {

	@GetMapping("/")
	public String Home()
	{
		return "user/Home";
	}
}