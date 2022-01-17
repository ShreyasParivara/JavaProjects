package com.te.springboot.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.te.springboot.model.BikeParking;

@Repository
public interface Dao extends JpaRepository<BikeParking, Integer> {
    
	public BikeParking findBikeParkingById(Integer id);//query will be automatically generated

}
