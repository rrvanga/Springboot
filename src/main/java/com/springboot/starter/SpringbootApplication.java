package com.springboot.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.springboot")
public class SpringbootApplication {
	


	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);

	}
	


}
