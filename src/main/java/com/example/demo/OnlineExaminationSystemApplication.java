package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
@EnableAutoConfiguration
public class OnlineExaminationSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineExaminationSystemApplication.class, args);
		System.out.println("Hello");
	}

}
