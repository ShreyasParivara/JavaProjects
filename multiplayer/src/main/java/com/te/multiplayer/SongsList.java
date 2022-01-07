package com.te.multiplayer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SongsList {
	@Id 
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id; 
	private String songs;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSongs() {
		return songs;
	}
	public void setSongs(String songs) {
		this.songs = songs;
	}
	
	
	 
	

}
