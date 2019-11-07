package com.fgc.data.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fgc.data.dto.LoginDetails;
import com.fgc.data.dto.RegisterDetails;
import com.fgc.data.service.LoginService;
import com.fgc.data.service.RegistrationService;

@RestController
@RequestMapping(path="/user")
public class UserController {
	
	@Autowired
	LoginService loginService;
	
	@Autowired
	RegistrationService registrationService;
	
	@PostMapping(path="/login")
	public ResponseEntity<Boolean> login(@RequestBody LoginDetails login) {
		Boolean result = loginService.isUserValid(login);
		return new ResponseEntity<Boolean>(result, HttpStatus.OK);
	}
	
	@PostMapping(path="/register") 
	public ResponseEntity<Boolean> register(@RequestBody RegisterDetails register) {
		Boolean result = registrationService.registerUser(register);
		return new ResponseEntity<Boolean>(result, HttpStatus.OK);
	}
	
	
}
