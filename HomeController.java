package com.javainuse.springbootsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
   
	@RequestMapping("/home")
	public String home() {
		
		System.out.println("HomeController.home()");
		return "home";
	}
	public void printUser(User user){
	   System.out.print();
	}
	
}
