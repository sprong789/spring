package com.school.book.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.school.book.mapper.CatMapper2;
import com.school.book.vo.Cat;


@Service
public class CatService2 {
	
	@Autowired
	private CatMapper2 catMapper;
	
	public List<Cat> likeName(String name){
		return catMapper.likeName(name);
	}
	
	public Cat getByID(int id) {
		return catMapper.getByID(id);
	}
	
	public String getName(int id) {
		return catMapper.getName(id);
	};
	
	public List<Cat> getall() {
		List<Cat> all = catMapper.getAll();
		return all;
	}
	
	@Transactional
	public long save(Cat cat) {
		return catMapper.save(cat);
	}
}
