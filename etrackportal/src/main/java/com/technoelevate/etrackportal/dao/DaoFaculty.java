package com.technoelevate.etrackportal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.technoelevate.etrackportal.model.Faculty;

public interface DaoFaculty extends JpaRepository<Faculty, Integer> {
	@Query(value = "from Faculty where emailId=:emailId")
	public Faculty getFaculty(@Param (value = "emailId")String emailId);
	

}
