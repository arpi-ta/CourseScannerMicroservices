package com.microservices.courseScannercatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CourseScannerCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseScannerCatalogApplication.class, args);
	}

}
