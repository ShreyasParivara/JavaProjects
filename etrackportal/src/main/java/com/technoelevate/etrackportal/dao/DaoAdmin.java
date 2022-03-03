package com.technoelevate.etrackportal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.technoelevate.etrackportal.model.Admin;
@Repository
public interface DaoAdmin extends JpaRepository<Admin, String> {
	@Query(value = "from Admin where EmailId=:EmailId")
	public Admin findByEmailId(@Param(value = "EmailId") String EmailId);
	

}
