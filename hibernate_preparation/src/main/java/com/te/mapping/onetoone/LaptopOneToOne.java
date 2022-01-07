package com.te.mapping.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LaptopOneToOne {
	@Id
	private int laptopId;
	private String laptopName;
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	public LaptopOneToOne(int laptopId, String laptopName) {
		super();
		this.laptopId = laptopId;
		this.laptopName = laptopName;
	}
	
	
	

}
