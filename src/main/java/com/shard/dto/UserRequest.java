package com.shard.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserRequest {
	
	@JsonProperty("name")
	private String name;

	public UserRequest() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserRequest(String name) {
		super();
		this.name = name;
	}

}
