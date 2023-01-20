package com.shard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shard.dto.UserRequest;
import com.shard.dto.UserResponse;
import com.shard.entity.User;
import com.shard.service.UserService;

@RestController
@RequestMapping("/api")
public class WebController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getUser(){
		return new ResponseEntity<String>("OK", 
				HttpStatus.ACCEPTED);
	}
	
	@PostMapping(value = "/user")
	public ResponseEntity<UserResponse> addUser(@RequestBody UserRequest userRequest){
		System.out.println("addUser");
		return new ResponseEntity<UserResponse>(userService.addUser(userRequest), 
				HttpStatus.ACCEPTED);
	}
	
	@GetMapping(value = "/user")
	public ResponseEntity<List<User>> getUsers(){
		return new ResponseEntity<List<User>>(userService.getUsers(), 
				HttpStatus.ACCEPTED);
	}

}
