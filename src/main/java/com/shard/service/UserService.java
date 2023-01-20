package com.shard.service;

import java.util.List;

import com.shard.dto.UserRequest;
import com.shard.dto.UserResponse;
import com.shard.entity.User;

public interface UserService {

	UserResponse addUser(UserRequest userRequest);

	List<User> getUsers();

}
