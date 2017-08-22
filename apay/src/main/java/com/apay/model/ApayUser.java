package com.apay.model;

public class ApayUser {
	
	private String userId;
	private String password;
	private String username;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String toString() {
		return "ApayUser [userId=" + userId + ", password=" + password
				+ ", username=" + username + "]";
	}
	
	
}
