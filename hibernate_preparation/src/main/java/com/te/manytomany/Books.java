package com.te.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Books {
	@Id
	private int bid;
	private String title;
	@ManyToMany(mappedBy = "book")
	private List<Reader> reader;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Reader> getReader() {
		return reader;
	}
	public void setReader(List<Reader> reader) {
		this.reader = reader;
	}
	

}
