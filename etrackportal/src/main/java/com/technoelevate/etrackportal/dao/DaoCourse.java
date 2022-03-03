package com.technoelevate.etrackportal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.technoelevate.etrackportal.model.Course;

public interface DaoCourse extends JpaRepository<Course, Integer> {
	
	@Query(value="from Course where courseName=:course")
	public Course getCourse(@Param(value = "course") String course);
}
