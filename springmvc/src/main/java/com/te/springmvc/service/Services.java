package com.te.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.te.springmvc.doalayer.Dao;
import com.te.springmvc.model.Register;

@Component
public class Services {
	@Autowired
	Dao layer;
	public boolean save(Register reg) {
		if(reg!=null) {
			layer.put(reg);
			return true;
		}
		return false;
		
		
		
			
	}

}
