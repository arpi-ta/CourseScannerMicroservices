package com.arpita.CourseScannerAuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CourseScannerAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseScannerAuthApplication.class, args);
	}

}
