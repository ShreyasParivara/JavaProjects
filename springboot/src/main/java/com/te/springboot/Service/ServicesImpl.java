package com.te.springboot.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springboot.dao.Dao;
import com.te.springboot.model.BikeParking;

@Service
public class ServicesImpl implements Services {
	@Autowired
	Dao dao;

	@Override
	public BikeParking add(BikeParking bike) {
		if (bike != null) {
			BikeParking save = dao.save(bike);
			return save;
		}
		throw new RuntimeException("bike cannot be null");
	}

	public BikeParking getdata(Integer id) {
		if (id<0) {
			throw new RuntimeException();
		}
		BikeParking byId = dao.findBikeParkingById(id);
		return byId;
	}

	@Override
	public BikeParking update(BikeParking bike) {
		if(bike==null)
			throw new RuntimeException();
		BikeParking save = dao.save(bike);
		return save;
		
	}
	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
	}

}
