package com.dxc.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
	
	@RequestMapping("/")
	public void sayHello() {
		System.out.println("Inside of hello action");
		
	}

}
