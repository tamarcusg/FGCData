package com.fgc.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fgc.data.dto.RegisterDetails;
import com.fgc.data.entity.User;
import com.fgc.data.repository.UserRepository;

@Service
public class RegistrationService {
	
	@Autowired
	private UserRepository userRepository;
	
	public Boolean registerUser(RegisterDetails register) {
		
		User user = new User();
		
		user.setUsername(register.getUsername());
		user.setPassword(register.getPassword());
		user.setEmail(register.getEmail());
		user.setAccess("USER");
		user.setTotalPlusMinus(0.0);
		User result = userRepository.saveAndFlush(user);
		if (result == null) {
			return false;
		}
		
		return true;
		
	}
	
}
