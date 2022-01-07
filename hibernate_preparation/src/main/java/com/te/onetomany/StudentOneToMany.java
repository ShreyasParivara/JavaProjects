package com.te.onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class StudentOneToMany {
	@Id
	private int sid;
	private String sname;
	@OneToMany(mappedBy = "student")
	private List<LaptopOneToMany> list;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<LaptopOneToMany> getList() {
		return list;
	}
	public void setList(List<LaptopOneToMany> list) {
		this.list = list;
	}
	
	

}
