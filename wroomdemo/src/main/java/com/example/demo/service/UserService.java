package com.example.demo.service;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;


@Service
public class UserService {

	private UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {

		this.userRepository = userRepository;
	}

	public void saveMyUser(User user) {
		
		userRepository.save(user);
	}

	public Iterable<User> showAllUsers() {
		return userRepository.findAll();
	}

	public User findByUserName(String username) {
		return userRepository.findByUsermail(username);
	}
	
	public List<User> findByState(int stateidu)
	{
		return userRepository.findByState(stateidu);
	}
public 	User login(String Usermail, String password)
{
	return userRepository.login(Usermail, password);
}
}
