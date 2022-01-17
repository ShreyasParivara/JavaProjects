package com.te.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.te.crud.doa.Dao;
import com.te.crud.model.Employee;
@Service
public class Services implements CrudService {
	@Autowired
	Dao daolayer;

	@Override
	public boolean add(Employee employee) {
		if(employee==null) {
			return false;	
		}
		
		return daolayer.save(employee);
	}

	@Override
	public boolean delete(int id) {
		if(id==0) {
			return false;
		}
		return daolayer.deleteemp(id);
	}

	@Override
	public boolean update(String name,String newname) {
		if(name==null)
			return false;
		
		return daolayer.update(name,newname);
	}

	@Override
	public List<Employee> getData() {
		return daolayer.get();
		
	}

	@Override
	public Object get(int id) {
		return daolayer.getone(id);
	}

}
