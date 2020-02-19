package com.school.book.mapper;

import java.util.List;

import com.school.book.vo.Cat;

public interface CatMapper2 {
	
	public List<Cat> likeName(String name);
	
	public Cat getByID(int id);
	
	public String getName(int id);
	
	int save(Cat cat);
	
	List<Cat> getAll();
}
