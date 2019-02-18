package com.lxk.priovider.service.impl;



import org.springframework.stereotype.Service;

import com.lxk.priovider.service.HelloService;
@Service("helloService")
public class HelloServiceImpl implements HelloService{

	@Override
	public String hello() {
		return "Hello World";
	}
	
}
