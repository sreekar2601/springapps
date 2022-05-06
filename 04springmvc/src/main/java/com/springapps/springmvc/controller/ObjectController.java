package com.springapps.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springapps.springmvc.dto.Employee;

@Controller
public class ObjectController {

	@RequestMapping("/readobject")
	public ModelAndView sendObject() {
		Employee emp = new Employee();
		emp.setId(234);
		emp.setName("Jonathan");
		emp.setSalary(2400);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("employee", emp);
		mv.setViewName("displayobject");
		return mv;
}
}
