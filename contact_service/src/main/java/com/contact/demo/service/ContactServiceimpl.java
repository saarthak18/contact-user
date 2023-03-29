package com.contact.demo.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.demo.entity.Contact;

@Service
public class ContactServiceimpl implements ContactService {
	
	List<Contact> list=List.of(
			new Contact(1L,"a@gmail","Saarthak",1234L),
			new Contact(2L,"b@gmail","sanketh",1234L),
			new Contact(3L,"c@gmail","alok",4567L),
			new Contact(3L,"c@gmail","aamer",9876L)
			
			);
	
	public List<Contact> getUserContacts(Long id)
	{
		return list.stream().filter(contact->contact.getUserId().equals(id)).collect(Collectors.toList());
	}

}
