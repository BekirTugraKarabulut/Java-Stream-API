package com.tugra.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.tugra"})
@SpringBootApplication
public class JavaStreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaStreamApplication.class, args);
	}

}
