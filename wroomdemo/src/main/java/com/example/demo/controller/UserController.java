package com.example.demo.controller;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.LogUser;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@org.springframework.web.bind.annotation.RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {
	@Autowired
	private UserService service;
	
	@CrossOrigin(origins="http://localhost:8080")
	@PostMapping("/save-user")
	@Transactional
	public String registerUser(@RequestBody User user)
	{
		// check if already registered
		service.saveMyUser(user);
		return "Hello" + user.getUserfname() + "your registration is succesfull";
	}
	
	@CrossOrigin(origins="http://localhost:8080")
	@PostMapping("/Login")
	@Transactional
	public User login(@RequestBody LogUser loguser)
	{
		// logic for invalid user
	   User user=  service.login(loguser.getUsermail() , loguser.getPassword());	
		   return user;
	
	   //return "Hello " + user.getUserfname()+  "your registration is succesfull";
	}
	
	

	@CrossOrigin(origins="http://localhost:8080")
	@GetMapping("/all-users")
	public Iterable<User> showAllUsers()
	{
		return service.showAllUsers();
	}
	@GetMapping("/search/{username}")
    public User searchUser(@PathVariable String username)
    {
		return service.findByUserName(username);
		
    }

	@GetMapping("/searchbystate/{stateid}")
    public List<User> searchbystate(@PathVariable int stateid)
    {
		return service.findByState(stateid);
		
    }
}
