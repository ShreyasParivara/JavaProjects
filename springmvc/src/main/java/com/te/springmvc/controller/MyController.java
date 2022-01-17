package com.te.springmvc.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.protobuf.Service;
import com.te.springmvc.model.Register;
import com.te.springmvc.service.Services;

@Controller
public class MyController {
	/*
	 * return home means home.jsp it is in views folder prefix = home and suffix =
	 * .jsp it is given in dispatcher-servlet.xml <bean
	 * class="org.springframework.web.servlet.view.InternalResourceViewResolver">
	 * <property name="prefix" value="/WEB-INF/views/"></property> <property
	 * name="suffix" value=".jsp"></property>
	 */
	@RequestMapping("/spider")
	public String home() {
		return "home";
	}

	@RequestMapping(path = "/login")
	public String login() {
		return "login";
	}

	@RequestMapping(path = "/loginpage", method = RequestMethod.POST)
	public String loginpage(@RequestParam("uname") String username, @RequestParam("pass") String password) {
//		String username=req.getParameter("uname");
//		String password=req.getParameter("pass");
		if (username.isEmpty()) {
			return "error";
		}
		return "loginpage";
	}

	@RequestMapping("/error")
	public String error() {
		return "error";
	}

	@GetMapping("/reg")
	public String reg() {
		return "register";
	}

	@Autowired
	Services service;

	@PostMapping("/register")
	public String register(Register reg, ModelMap map) {
		map.addAttribute("details", reg);
		boolean s = service.save(reg);
		if(s==true) {
		return "loginpage";
		}
		else
			return "error";

	}

}
