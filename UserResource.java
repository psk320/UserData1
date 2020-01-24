package com.example.demo.user;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	
	@Autowired
	private UserDaoService service;
	
	
	@GetMapping("/users/{id}")
	public User retriveuser(@PathVariable int id)
	{
		User user=service.findOne(id);
		return user;
	}
	
	
	@GetMapping("/users")
	public List<User> retriveAll()
	{
		//System.out.println("world");
		return service.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteUser(@PathVariable int id)
	{
		User user=service.deleteById(id);
		return;
	}
}
