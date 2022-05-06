package com.springapps.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springapps.springmvc.dto.User;

@Controller
public class UserController {
	
	@RequestMapping("/register")
	public ModelAndView showregpage()
	{
		ModelAndView model=new ModelAndView();
		model.setViewName("userreg");
		return model;
	}
	@RequestMapping(value="/registeruser")
	public ModelAndView registeruser(@ModelAttribute("user")User user){
		System.out.println(user);
		ModelAndView model=new ModelAndView();
		model.addObject("user",user);
		model.setViewName("userregresult");
		return model;
	}
	

}
