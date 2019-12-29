package com.user.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/users")
public class UserController {

	@PostMapping("/create")
	public String createUser(){
		
		return "created";
	}
}
