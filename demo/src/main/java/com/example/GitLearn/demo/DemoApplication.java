package com.example.GitLearn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		int a = 5;
		int b = 6;
		int sum = a+b;
		System.out.println("My name is Divyam Kudeshia and the sum is: " +sum);
	}

}
