package com.geekbrains.spring.web.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class WebAuthServiceApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(WebAuthServiceApplication.class, args);
		PasswordEncoder encoder = context.getBean(PasswordEncoder.class);
		String encode = encoder.encode("12345");
		System.out.println(encode);
	}
}
