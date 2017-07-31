package com.test.step06.users.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UsersController {

	
	@RequestMapping("/users/signup_form")
	public String signup_form(){
		
		return "/users/signup_form";
	}
	
	@RequestMapping("/users/signin_form")
	public String signin_form(){
		
		return "/users/signin_form";
	}	

	@RequestMapping("/users/checkid")
	public String checkId(){
		
		return "/users/signin_form";
	}		
}
