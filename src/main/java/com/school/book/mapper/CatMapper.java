package com.school.book.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.school.book.vo.Cat;

public interface CatMapper {
	
	@Select("select * from Cat where name = #{name}")
	public List<Cat> likeName(String name);
	
	@Select("select * from Cat where id = #{id}")
	public Cat getByID(int id);
	
	@Select("select name from Cat where id = #{id}")
	public String getName(int id);
	
	@Insert("insert into Cat(name,catAge) values(#{name},#{catAge})")
	@Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
	int save(Cat cat);
	
	@Select("select * from Cat")
	List<Cat> getAll();
}
