package com.hessian.demo.inter;

import com.hessian.demo.entity.User;

public interface BasicServiceInter {

	public void setGreeting(String greeting);
	
	public String hello();
	
	public User getUser();
}
