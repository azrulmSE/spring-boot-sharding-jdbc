package com.shard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shard.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
