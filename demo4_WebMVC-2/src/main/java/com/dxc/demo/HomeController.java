package com.dxc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dxc.model.Student;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String action1() {
		System.out.println("Inside of the action method");
		return "studentForm";
	}

	@RequestMapping(value ="dispStudent", method = RequestMethod.POST)
	public ModelAndView dispStudent(Student student) {
		ModelAndView mv = new ModelAndView("dispStudent");
		mv.addObject("stud", student);
		return mv;
		}
}

