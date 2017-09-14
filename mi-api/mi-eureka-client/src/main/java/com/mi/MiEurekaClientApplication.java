package com.mi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient

public class MiEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiEurekaClientApplication.class, args);
	}
}
