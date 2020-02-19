package com.school.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.school.book.server.CatService2;
import com.school.book.vo.Cat;

@RestController
@RequestMapping("/cat2")
public class CatController2 {

	@Autowired
	private CatService2 catService;
	
	@RequestMapping("/likeNameCat")
	public List<Cat> likeNameCat(String name){
		/**
		 * 第一个参数第几页
		 * 第二个参数 每页获取的条数
		 */
		PageHelper.startPage(1, 1);
		return catService.likeName(name);
	}
	
	@RequestMapping("/likeName")
	public List<Cat> likeName(String name){
		PageHelper.startPage(1, 1);
		return catService.likeName(name);
	}
	
	@RequestMapping("/getByID")
	public Cat getByID(int id) {
		return catService.getByID(id);
	}
	
	@RequestMapping("/getName")
	public String getName(int id) {
		return catService.getName(id);
	}
	
	@RequestMapping("/save")
	public long save(String name ,int catAge) {
		Cat cat = new Cat();
		cat.setCatAge(catAge);
		cat.setName(name);
		long save = catService.save(cat);
		System.out.println(save);
		return cat.getId();
	}
	
	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView rm = new ModelAndView();
		rm.setViewName("myProject/index");
		return rm;
	}
	
	@RequestMapping("/getall")
	public ModelAndView getall(Model model) {
		/**
		 * 第一个参数第几页
		 * 第二个参数 每页获取的条数
		 */
		PageHelper.startPage(1, 5);
		List<Cat> all = catService.getall();	
		ModelAndView rm = new ModelAndView();
		rm.setViewName("jsp/cat");
		rm.addObject("cat", all);
		return rm;
	}
}
