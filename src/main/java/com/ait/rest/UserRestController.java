package com.ait.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ait.dto.SignupForm;
import com.ait.service.UserService;

@RestController
@RequestMapping("/user")
public class UserRestController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/SignUp")
	public ResponseEntity<String> signup(@RequestBody SignupForm signupForm) {
		 String status= userService.signUp(signupForm);
		 return new ResponseEntity<>(status,HttpStatus.OK);
		
	}

}
