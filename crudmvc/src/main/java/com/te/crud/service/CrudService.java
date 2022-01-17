package com.te.crud.service;

import java.util.List;

import com.te.crud.model.Employee;

public interface CrudService {
	public boolean add(Employee employee);
	public boolean delete(int id);
	public boolean update(String name,String newname);
	public List<Employee> getData();
	public Object get(int id);
	

}
