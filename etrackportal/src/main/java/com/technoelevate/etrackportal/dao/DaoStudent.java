package com.technoelevate.etrackportal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.technoelevate.etrackportal.model.Student;

public interface DaoStudent extends JpaRepository<Student, Integer> {

}
