package com.user.demo.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.user.demo.entity.User;
@Service
public class UserServiceimpl  {

	
	List<User> list=List.of(
			new User(1234L,"Saarthak","1234567890"),
			new User(4567L,"Samarth","0987654321"),
			new User(9876L,"Sushruth","1230984567")
			);

	public User getUser(Long id)
	{
		
		for(int i=0;i<list.size();i++)
		{
			long x=list.get(i).getUserid();
			
			if(x==id)
			{
				return list.get(i);
			}
		}
		return null;
	}
}
