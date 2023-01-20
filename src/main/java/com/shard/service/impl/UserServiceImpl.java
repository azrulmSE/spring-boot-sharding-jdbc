package com.shard.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shard.dto.UserRequest;
import com.shard.dto.UserResponse;
import com.shard.entity.User;
import com.shard.repository.UserRepository;
import com.shard.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override 
	@Transactional
	public UserResponse addUser(UserRequest userRequest) {
		User user = new User(userRequest.getName());
		user = userRepository.save(user);
		return new UserResponse(user.getId(),"Successful add new user!");
	}
	
	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}

}
