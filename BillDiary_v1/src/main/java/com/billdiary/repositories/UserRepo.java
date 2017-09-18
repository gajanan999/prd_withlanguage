package com.billdiary.repositories;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserRepo {

	
	@Id
	@Column(name="USER_ID")
	private long userId;
	
	@Column(name="userName")
	private String username;
	
	@Column(name="password")
	private String password;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
