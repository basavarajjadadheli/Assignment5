package com.terra.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OnlineOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineOrderApplication.class, args);
	}

}
