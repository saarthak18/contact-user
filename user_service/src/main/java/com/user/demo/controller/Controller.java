package com.user.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.demo.service.UserService;
import com.user.demo.service.UserServiceimpl;
import com.user.demo.entity.*;

@RestController
@RequestMapping("/user")
public class Controller {

	@Autowired
	private UserServiceimpl userService;
	@Autowired
	private RestTemplate resttemp;
	

	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") long userId)
	{
		User user= this.userService.getUser(userId);
		
		
		List<Contact> contacts= this.resttemp.getForObject("http://contact-service/contact/user/"+userId,List.class);

	user.setContacts((java.util.List<Contact>) contacts);
		return user;
		
	}
	
}
