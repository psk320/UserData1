package com.example.demo.user;


import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	public static List<User> users=new ArrayList<>();
	private static int listCount=3;
	 static
	 {
		 users.add(new User(1,"p",new Date()));
		 users.add(new User(2,"s",new Date()));
		 users.add(new User(3,"k",new Date()));
		 
	 }
	
	public User findOne(int id)
	{
		for(User user: users)
		{
			if(user.getId()==id)
			{
				return user;
			}
		}
		return null;
	}
	
	public List<User> findAll()
	{
		return users;
	}
	
	public User save(User user)
	{
		if(user.getId() == 0 )
		{
			user.setId(++listCount);
		}
		users.add(user);
		return user;
	}
	
	
	public User deleteById(int id)
	{
		Iterator<User> iterator=users.iterator();
		while(iterator.hasNext())
		{
			User user= iterator.next();
			if(user.getId()==id)
			{
				iterator.remove();
				return user;
			}
		}
		return null;
	}
}
