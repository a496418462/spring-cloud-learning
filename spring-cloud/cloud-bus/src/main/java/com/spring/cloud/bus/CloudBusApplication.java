package com.spring.cloud.bus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudBusApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudBusApplication.class, args);
	}
}
