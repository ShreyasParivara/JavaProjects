package com.te.springboot.Mycontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.te.springboot.Service.ServicesImpl;
import com.te.springboot.model.BikeParking;
import com.te.springboot.model.BikeResponse;
 
@RestController
@RequestMapping("/api/v1")
public class MyControllerImpl{
	
	@Autowired
	ServicesImpl service;

	@PostMapping("/bike")
	public ResponseEntity<BikeResponse> register(@RequestBody BikeParking bike) {
		BikeParking add = service.add(bike);
		BikeResponse response = new BikeResponse();
		response.setError(false);
		response.setData(add);
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
	@GetMapping("/bike")
	public  ResponseEntity<BikeResponse> getdata(@RequestParam Integer id) {
		BikeParking bike = service.getdata(id);
		BikeResponse response = new BikeResponse();
		response.setData(bike);
		response.setError(false);
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	@PutMapping("/bike")
	 public ResponseEntity<BikeResponse> update(@RequestBody BikeParking bike) {
		BikeParking update = service.update(bike);
		BikeResponse response = new BikeResponse();
		response.setData(update);
		response.setError(false);
		return new ResponseEntity<>(response,HttpStatus.OK);	 
	 }
	
	@GetMapping("/delete")
	public void delete(@RequestParam Integer id) {
		service.delete(id);
	}

}
