package com.spring.cloud.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;


@EnableDiscoveryClient
@SpringBootApplication
@EnableZipkinServer
public class CloudSleuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudSleuthApplication.class, args);
	}
}
