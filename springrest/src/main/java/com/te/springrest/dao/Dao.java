package com.te.springrest.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.te.springrest.dto.Employee;
@Repository
public interface Dao  extends CrudRepository<Employee, Integer>{

}
