package com.lxk.erueka.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="CONSUMER-API")
public interface FeignClienService {
	@RequestMapping(value="/test/normal",method=RequestMethod.POST)
	public String testPrint();
}
