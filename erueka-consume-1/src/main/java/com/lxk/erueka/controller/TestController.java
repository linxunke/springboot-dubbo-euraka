package com.lxk.erueka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lxk.erueka.feign.FeignClienService;

@RestController
public class TestController {
	@Autowired
	FeignClienService feignClientService;
	
	@GetMapping("/")
	public String home() {
		return "hello home";
	}
	@GetMapping(value="/consume/test")
	public String test() {
		return feignClientService.testPrint();
	}
	

}
