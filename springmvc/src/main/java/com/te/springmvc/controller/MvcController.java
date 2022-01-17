package com.te.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MvcController {
	@RequestMapping("/test")
	public String test(Model model) {
		String s = "Avengers Assemble.....";
		model.addAttribute("message",s);//sending object 's' to jsp page(test.jsp)
		return "test";
	}
	
	@RequestMapping("/test2")
	public String test2(ModelMap model) {
		String s = "Infinity....";
		model.addAttribute("message",s);
		return "test";
	}
	@RequestMapping("/test3")
	public ModelAndView test3(ModelAndView mav) {
		String s = "Great Khali";
		mav.addObject("message",s);
		mav.setViewName("test");//jsp page
		return mav;
		
		
	}
		
	
	

}
