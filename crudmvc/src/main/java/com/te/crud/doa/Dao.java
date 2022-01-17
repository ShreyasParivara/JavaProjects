package com.te.crud.doa;

import java.util.List;

import javax.persistence.Persistence;

import com.te.crud.model.Employee;

public interface Dao {
	
	public boolean save(Employee employee);
	public boolean deleteemp(int id);
	public boolean update(String name,String newname);
	public List<Employee> get();
	public Object getone(int id);
	


}
