package com.spring.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAnnotationApplication.class, args);
		
		System.out.println("hello");
	}

}
