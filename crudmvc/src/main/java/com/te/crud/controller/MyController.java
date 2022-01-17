package com.te.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.te.crud.model.Employee;
import com.te.crud.service.CrudService;
import com.te.crud.service.Services;

@Controller
public class MyController {
	@Autowired
	CrudService service;

	@GetMapping("/add")
	public String add() {
		return "insert";
	}

	@PostMapping("/add")
	public String addEmp(Employee emp) {
		boolean add = service.add(emp);
		if (add == true) {
			return "success";
		}
		return "fail";
	}

	@GetMapping("/delete")
	public String deletjsp() {
		return "delete";
	}

	@PostMapping("/delete")
	public String delete(int Id) {
		if (service.delete(Id)) {
			return "success";
		}
		return "fail";

	}

	@GetMapping("/update")
	public String upd() {
		return "update";
	}

	@PostMapping("/update")
	public String update(String ename, String newname) {
		if (service.update(ename, newname)) {
			return "success";
		}
		return "fail";
	}

	@GetMapping("/getall")
	public String get(ModelMap map) {
		List list = service.getData();
		if (list == null)
			return "fail";
		map.addAttribute("data", list);
		return "show";
	}

	@GetMapping("/get")
	public String geti() {
		return "get";
	}

	@PostMapping("/get")
	public String getp(ModelMap map, int id) {
		Object list = service.get(id);
		if (list == null)
			return "fail";
		map.addAttribute("data1", list);
		return "showone";

	}

}
