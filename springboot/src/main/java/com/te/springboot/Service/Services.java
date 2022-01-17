package com.te.springboot.Service;

import com.te.springboot.model.BikeParking;

public interface Services {
	
	public BikeParking add(BikeParking bike);
	public BikeParking getdata(Integer id);
	public BikeParking update(BikeParking bike);
	public void delete(Integer id);

}
