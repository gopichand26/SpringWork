package com.dxc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.dxc")
@SpringBootApplication
public class Demo09SpringBootSecurity1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo09SpringBootSecurity1Application.class, args);
	}

}
