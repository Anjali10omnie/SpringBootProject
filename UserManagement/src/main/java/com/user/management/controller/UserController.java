package com.user.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.user.management.entity.User;
import com.user.management.service.UserServices;

@Controller
public class UserController {
		
	@Autowired
	private UserServices userServices;
		@GetMapping("/base")
		public String Base()
		{
			return "Base";
			
		}
		
		@GetMapping("/")
		public String Login()
		{
			return "Login";
		}
		
		@GetMapping("/Logout")
		public String Logout()
		{
			return "Logout";
		}
		
		@GetMapping("/Registration")
		public String Registration(Model model)
		{
			model.addAttribute("user", new User());
			return "Registration";
		}
				
		@PostMapping("/createUser")
		public String createUser(@ModelAttribute ("user") User user, Model model)
		{		
			userServices.createUser(user);
			 model.addAttribute("message", "User registered successfully");
			return "/Registration";
			
		}
		
	
		
}
	


