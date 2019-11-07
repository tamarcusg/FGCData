package com.fgc.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fgc.data.dto.LoginDetails;
import com.fgc.data.entity.User;
import com.fgc.data.repository.UserRepository;

@Service
public class LoginService {
	
	@Autowired
	private UserRepository userRepository;
	
	public Boolean isUserValid(LoginDetails login) {
		
		List<User> users = userRepository.findAll();
		
		for (User x : users) {
			if (x.getEmail().equalsIgnoreCase(login.getEmail()) && x.getPassword().equals(login.getPassword())) {
				return true;
			}
		}
		
		return false;
		
	}
	
}
