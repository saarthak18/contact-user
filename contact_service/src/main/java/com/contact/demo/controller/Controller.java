package com.contact.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.demo.entity.Contact;
import com.contact.demo.service.ContactService;

@RestController
@RequestMapping("/contact")
public class Controller {
	@Autowired
	private ContactService contactService;
	
	

	@RequestMapping("/user/{userid}")
	
	public List<Contact> getContacts(@PathVariable("userid") Long userid)
	{
		return this.contactService.getUserContacts(userid);
	}

}
