package com.te.springrest.controller;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.te.springrest.dto.Employee;
import com.te.springrest.services.Services;

@RestController
public class MyController {
	Services service;
	
	public void add(Employee emp) {
		service.add(emp);
		
		
	}

}
