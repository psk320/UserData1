package com.example.demo;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Controller   
@RequestMapping(path="/demo") 
public class MainController {
	@Autowired 
	private UserRepository userRepository;

	
	
	@PostMapping(path="/add")
	@ResponseBody
	public User addNewUser (@RequestBody User u) {
//		User n = new User();
//		n.setId(u.getId());
//		n.setName(u.getName());
//		n.setEmail(u.getEmail());
//		
	userRepository.save(u);
		return u;
	}

	
	
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	
	
	
	
	@GetMapping(path="/user/{id}")
	public @ResponseBody Optional<User> getUserById(@PathVariable int id) {
		return userRepository.findById(id);
	}
}