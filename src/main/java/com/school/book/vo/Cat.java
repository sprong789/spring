package com.school.book.vo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cat {
	
	@Id
	private int id;
	
	private String name;
	
	private int cat_age;
	
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
	public int getCat_age() {
		return cat_age;
	}
	public void setCat_age(int cat_age) {
		this.cat_age = cat_age;
	}
	
}
