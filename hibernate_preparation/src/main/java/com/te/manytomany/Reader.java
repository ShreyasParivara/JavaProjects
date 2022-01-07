package com.te.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Reader {
	@Id
	private int rid;
	private String name;
	@ManyToMany
	private List<Books> book;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Books> getBook() {
		return book;
	}
	public void setBook(List<Books> book) {
		this.book = book;
	}

}
