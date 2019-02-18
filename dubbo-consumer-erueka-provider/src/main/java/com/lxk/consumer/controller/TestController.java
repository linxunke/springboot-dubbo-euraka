package com.lxk.consumer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lxk.priovider.service.HelloService;


@RestController
public class TestController {
	@Autowired
	private HelloService helloService;
	
	
	@GetMapping(value="/consume/test")
	public String test() {
		return helloService.hello();
	}
	
	@RequestMapping(value="/con")
	public String test1() {
		return "123";
	}
	

}
