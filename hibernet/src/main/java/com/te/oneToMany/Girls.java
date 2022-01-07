package com.te.oneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToMany;
@Entity
public class Girls {
	@Id
	private int gid;
	private String name;
	
	@OneToMany(mappedBy = "girl")
	private List<Boys> boys;
	
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Boys> getBoys() {
		return boys;
	}
	public void setBoys(List<Boys> boys) {
		this.boys = boys;
	}
	

}
