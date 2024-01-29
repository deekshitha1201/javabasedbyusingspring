package com.example.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class helloconfi {
	@Bean
	public HelloWorld helloworld()
	{
		return new HelloWorld();
	}

}
