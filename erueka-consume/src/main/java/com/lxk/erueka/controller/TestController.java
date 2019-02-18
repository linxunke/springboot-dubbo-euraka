package com.lxk.erueka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lxk.erueka.feign.ServiceFeiginClient;

@RestController
public class TestController {
	@Autowired
	ServiceFeiginClient serviceFeiginClient;

	@RequestMapping(value="/test")
	public String test() {
		return serviceFeiginClient.test();
	}
	
	@RequestMapping(value="/test/normal",method=RequestMethod.POST)
	public String testPrint() {
		return "hello alp1";
	}
		
}
