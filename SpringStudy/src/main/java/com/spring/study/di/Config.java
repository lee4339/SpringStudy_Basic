package com.spring.study.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@ComponentScan(basePackages = "com.spring.study")
public class Config {
	
	@Bean
	public Start start() {
		return new Start();
	}
}