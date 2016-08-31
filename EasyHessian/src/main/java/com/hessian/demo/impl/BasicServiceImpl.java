package com.hessian.demo.impl;

import com.hessian.demo.entity.User;
import com.hessian.demo.inter.BasicServiceInter;

public class BasicServiceImpl implements BasicServiceInter{
	
	private String _greeting = "Hello,World";
	
	@Override
	public void setGreeting(String greeting) {
		// TODO Auto-generated method stub
		_greeting = greeting;
		System.out.println("set greeting success:"+_greeting);
	}

	@Override
	public String hello() {
		return _greeting;
	}

	@Override
	public User getUser() {
		return new User("prance", "meshow");

	}

}
