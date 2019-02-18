package com.lxk.erueka.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="DUBBO-SERVER")
public interface ServiceFeiginClient {
	@RequestMapping(value="/consume/test",method=RequestMethod.POST)
	public String test();
}
