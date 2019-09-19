package com.school.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.school.book.server.CatService;
import com.school.book.vo.Cat;

@RestController
@RequestMapping("/cat")
public class CatController {

	@Autowired
	private CatService catService;
	
	@RequestMapping("/likeNameCat")
	public List<Cat> likeNameCat(String name){
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
	public long save() {
		Cat cat = new Cat();
		cat.setCat_age(5);
		cat.setName("张");
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
		List<Cat> all = catService.getall();	
		ModelAndView rm = new ModelAndView();
		rm.setViewName("jsp/cat");
		rm.addObject("cat", all);
		return rm;
	}
}
