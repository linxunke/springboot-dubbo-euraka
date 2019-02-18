package com.lxk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.lxk")
@EnableEurekaClient
public class DubboConsumerEruekaProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboConsumerEruekaProviderApplication.class, args);
	}
}
