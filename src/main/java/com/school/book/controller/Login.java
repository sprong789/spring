package com.school.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.book.server.LoginService;
import com.school.book.vo.UserAccount;


/**
 * 用户登录类
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/login")
public class Login {
	
	@Autowired
	private LoginService loginService;
	/**
	 * 用户登录方法
	 */
	@RequestMapping("/login")
	private int login(String name,String password) {
		return loginService.login(name,password);
	}
	
	@RequestMapping("/save")
	private UserAccount save(String name,String password) {
		return loginService.save(name,password);
	}
}
