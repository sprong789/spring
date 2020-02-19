package com.school.book.vo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cat {
	
	@Id
	private int id;
	
	private String name;
	
	private int catAge;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCatAge() {
		return catAge;
	}
	public void setCatAge(int catAge) {
		this.catAge = catAge;
	}

	
}
