package com.hessian.demo.entity;

import java.io.Serializable;

public class User implements Serializable{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String username = "snoopy";
	
	String password = "showme";

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

	public User(String username,String password) {
		super();
		// TODO Auto-generated constructor stub
		this.username = username;
		this.password = password;
	}
	
	
}
