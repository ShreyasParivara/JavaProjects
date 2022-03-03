package com.technoelevate.etrackportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.technoelevate.etrackportal.model.Admin;
import com.technoelevate.etrackportal.model.Course;
import com.technoelevate.etrackportal.model.Faculty;
import com.technoelevate.etrackportal.model.Student;
import com.technoelevate.etrackportal.service.Services;

@Controller
public class MainController {
	@Autowired
	Services service;
	static int eid;

	@GetMapping("/admin")
	public String admin() {
		return "adminlogin";
	}

	@GetMapping("/adminregister")
	public String adminRegPage() {
		return "adminRegistration";
	}

	@PostMapping("/adminreg")
	public String adminReg(Admin admin, ModelMap map) {
		if (service.saveadmin(admin)) {
			return "adminlogin";
		}
		map.addAttribute("message", "Email already Exists");
		return "emailexist";
	}

	@PostMapping("/adminAuth")
	public String adminAuth(@RequestParam String mailId, @RequestParam String password) {
		if (service.adminAuth(mailId, password)) {
			return "adminHome";
		}
		return "invalid";
	}

	@GetMapping("/course")
	public String addCoursePage(Course course) {
		return "AddCourse";
	}

	@PostMapping("/AddCourse")
	public String addCourse(Course course) {
		service.addCourse(course);
		return "adminHome";
	}

	@GetMapping("/studentReg")
	public String regStudentPage() {
		return "studentReg";
	}

	@PostMapping("/studentReg")
	public String studentReg(Student student,String courseName) {
		service.studentReg(student, courseName);
		System.out.println(courseName);
		return "adminHome";
	}

	@GetMapping("/facultyReg")
	public String facultyRegPage() {
		return "facultyReg";
	}

	@PostMapping("/facultyReg")
	public String facultyReg(Faculty faculty, ModelMap map) {
		String facultyReg = service.facultyReg(faculty);
		map.addAttribute("password", facultyReg);
		return "otp";
	}

	@GetMapping("/facultyLogin")
	public String facultyLoginPage() {
		return "facultyLogin";
	}

	@PostMapping("/facultyLogin")
	public String facultyLogin(String email, String password, ModelMap map) {
		List<Student> facultyLogin = service.facultyLogin(email, password);
		map.addAttribute("data", facultyLogin);
		if (facultyLogin != null) {
			return "facultyHome";
		}
		return "invalid";
	}

	@GetMapping("/changeFacultyPass")
	public String changeFacultyPassPage() {
		return "changeFacultyPass";
	}

	@PostMapping("/changeFacultyPass")
	public String changeFacultyPass(String email, String password) {
		if (service.changeFacultyPassword(email, password))
			return "facultyLogin";
		return "invalid";
	}

	@GetMapping("/studentDetails")
	public String studentDetails(ModelMap map) {
		map.addAttribute("data", service.studentDetails());
		return "studentDetails";
	}

	@GetMapping("/facultyDetails")
	public String facultyDetails(ModelMap map) {
		map.addAttribute("data", service.facultyDetails());
		return "facultyDetails";
	}

	@GetMapping("/delete")
	public String studentDelete(int rollno) {
		service.studentDelete(rollno);
		return "adminHome";
	}
	
	@PostMapping("/deleteFaculty")
	public String deleteFaculty(int id) {
		service.facultyDelete(id);
		return "adminHome";
	}
	
	@PostMapping("/facultyEditPage")
	public String facultyEditPage(int id) {
		eid=id;
		return "facultyEdit";
	}
	@PostMapping("/facultyEdit")
	public String facultyEdit(Faculty student) {
		service.facultyEdit(student,eid);
		return "adminHome";
	}
	
	@PostMapping("/studentEditPage")
	public String studentEditPage(int id) {
		eid=id;
		return "studentEdit";
	}
	@PostMapping("/studentEdit")
	public String studentEdit(Student student, String courseName) {
		service.studentEdit(student,courseName,eid);
		return "adminHome";
	}

}

