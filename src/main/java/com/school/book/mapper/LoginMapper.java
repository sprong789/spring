package com.school.book.mapper;

import com.school.book.vo.UserAccount;

/**
 * 用户登录
 * @author Administrator
 *
 */
public interface LoginMapper {
	
	public int save(UserAccount UserAccount);
	
	public UserAccount getByUserName(String name);

	public UserAccount login(String name, String password);
	
}
