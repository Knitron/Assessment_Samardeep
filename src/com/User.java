package com;

public class User {
	private String userId;
	private String password;
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + "]";
	}



	public User(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}

	
	//getter and setter of member variable
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



}
