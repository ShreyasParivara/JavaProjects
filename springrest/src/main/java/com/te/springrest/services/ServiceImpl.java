package com.te.springrest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springrest.dao.Dao;
import com.te.springrest.dto.Employee;
@Service
public class ServiceImpl implements Services {

	@Autowired
	Dao dao;
	
	@Override
	public void add(Employee emp) {
		dao.save(emp);
	}

}
