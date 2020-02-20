package com.school.book.server;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.school.book.mapper.LoginMapper;
import com.school.book.util.IpUtil;
import com.school.book.vo.UserAccount;

@Service
public class LoginService {
	
	@Autowired
	private LoginMapper loginMapper;
	
	public UserAccount save(String userName,String password) {
		UserAccount byUserName = getByUserName(userName);
		if(byUserName !=null) {
			return byUserName;
		}
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		String ipAddr = IpUtil.getIpAddr(request);
		UserAccount userAccount = new UserAccount();
		userAccount.setUserLoginName(userName);
		userAccount.setUserLoginPassword(password);
		userAccount.setsFlag(1);
		userAccount.setIpadress(ipAddr);
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(currentTime);
		userAccount.setAddTime(dateString);
		userAccount.setUpdateTime(dateString);
		loginMapper.save(userAccount);
		return userAccount;
	}
	
	public UserAccount getByUserName(String name) {
		if(StringUtils.isEmpty(name)) {
			return null;
		}
		return loginMapper.getByUserName(name);
	}

	public int login(String name, String password) {
		
		if(StringUtils.isEmpty(name)) {
			return 0;
		}
		if(StringUtils.isEmpty(password)) {
			return 0;
		}
		UserAccount userAccount =loginMapper.login(name,password);
		if(userAccount == null) {
			return 0;
		}else {
			return 1;
		}
	}
}
