package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.configure.HelloWorld;

@SpringBootApplication
public class JavabasedpgmApplication {

	public static void main(String[] args) {
	 ApplicationContext a= SpringApplication.run(JavabasedpgmApplication.class, args);
	 HelloWorld helloworld=a.getBean(HelloWorld.class);
	 helloworld.setMessage("Hello");
	 helloworld.getMessage();
	}

}
