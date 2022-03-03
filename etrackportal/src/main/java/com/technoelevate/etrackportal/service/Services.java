package com.technoelevate.etrackportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.technoelevate.etrackportal.dao.DaoAdmin;
import com.technoelevate.etrackportal.dao.DaoCourse;
import com.technoelevate.etrackportal.dao.DaoFaculty;
import com.technoelevate.etrackportal.dao.DaoStudent;
import com.technoelevate.etrackportal.model.Admin;
import com.technoelevate.etrackportal.model.Course;
import com.technoelevate.etrackportal.model.Faculty;
import com.technoelevate.etrackportal.model.Student;

@Service
@Transactional
public class Services {
	@Autowired
	DaoAdmin dao;
	@Autowired
	DaoCourse daoCourse;
	@Autowired
	DaoStudent daoStudent;
	@Autowired
	DaoFaculty daoFaculty;

	public boolean saveadmin(Admin admin) {
		Admin findByEmailId = dao.findByEmailId(admin.getEmailId());
		if (findByEmailId == null) {
			dao.save(admin);
			return true;
		}
		return false;
	}

	public boolean adminAuth(String email, String password) {
		Admin admin = dao.findByEmailId(email);
		if (admin.getEmailId().equals(email) && admin.getPassword().equals(password)) {
			return true;
		}
		return false;
	}

	public void addCourse(Course course) {
		daoCourse.save(course);
	}

	public void studentReg(Student student, String courseName) {
		Course course = daoCourse.getCourse(courseName);
		System.out.println(course);
		student.setCourse(course);
		daoStudent.save(student);

	}

	public String facultyReg(Faculty faculty) {
		daoFaculty.save(faculty);
		Faculty faculty2 = daoFaculty.getFaculty(faculty.getEmailId());
		String password = faculty2.getName() + faculty2.getId();
		faculty2.setPassword(password);
		daoFaculty.save(faculty2);
		return password;
	}

	public List<Student> facultyLogin(String email, String password) {
		Faculty faculty = daoFaculty.getFaculty(email);
		if (faculty.getEmailId().equals(email) && faculty.getPassword().equals(password)) {
			List<Student> findAll = daoStudent.findAll();
			return findAll;
		}
		return null;
	}

	public boolean changeFacultyPassword(String email, String passord) {
		Faculty faculty = daoFaculty.getFaculty(email);
		if (faculty == null) {
			return false;
		}
		faculty.setPassword(passord);
		daoFaculty.save(faculty);
		return true;
	}

	public List<Student> studentDetails() {
		List<Student> findAll = daoStudent.findAll();
		return findAll;
	}

	public List<Faculty> facultyDetails() {
		List<Faculty> findAll = daoFaculty.findAll();
		return findAll;
	}

	public void studentDelete(int id) {
		daoStudent.deleteById(id);
	}

	public void facultyDelete(int id) {
		daoFaculty.deleteById(id);
	}

	public void facultyEdit(Faculty faculty,int id) {
		Faculty byId = daoFaculty.getById(id);
		if (faculty.getEmailId() != "") {
			byId.setEmailId(faculty.getEmailId());
		}
		if (faculty.getAddress() != "") {
			byId.setAddress(faculty.getAddress());
		}
		if (faculty.getName() != "") {
			byId.setName(faculty.getName());
		}
		daoFaculty.save(byId);

	}

	public void studentEdit(Student student,String course,int id) {
		Student byId = daoStudent.getById(id);
	
		if(student.getFirstName()!="") {
			byId.setFirstName(student.getFirstName());
		}
		if(student.getLastName()!="") {
			byId.setLastName(student.getLastName());
		}
		if(student.getOption()!="") {
			byId.setOption(student.getOption());
		}
		
		if(course!="") {
			Course course2 = daoCourse.getCourse(course);
			byId.setCourse(course2);
		}
		daoStudent.save(byId);

	}

}
