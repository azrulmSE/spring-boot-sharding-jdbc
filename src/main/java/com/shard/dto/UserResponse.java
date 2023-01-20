package com.shard.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserResponse {
	
	@JsonProperty("user_id")
	private Long userId;
	
	private String message;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date date = new Date();

	public UserResponse() {
		super();
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public UserResponse(String message) {
		super();
		this.message = message;
	}

	public UserResponse(Long userId, String message) {
		super();
		this.userId = userId;
		this.message = message;
	}

}
