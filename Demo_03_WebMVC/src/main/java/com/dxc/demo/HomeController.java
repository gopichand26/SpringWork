package com.dxc.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String showform() {
		return "form1";
	}
	
	public void showName(HttpServletRequest req, HttpServletResponse res) {
		
	}

}
