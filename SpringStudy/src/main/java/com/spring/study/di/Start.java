package com.spring.study.di;

import org.springframework.beans.factory.annotation.Autowired;

public class Start {
	
	@Autowired
	private AuthService authService;
	
	public void start() {
		authService.signin("junil", "1234");
	}
}