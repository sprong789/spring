package com.school.book.vo;

/**
 * 用户账号
 * @author Administrator
 *
 */
public class UserAccount {
	
	private int userId;
	private String userLoginName;
	private String userLoginPassword;
	private String addTime;
	private String updateTime;
	private int sFlag;
	private	String ipadress;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserLoginName() {
		return userLoginName;
	}
	public void setUserLoginName(String userLoginName) {
		this.userLoginName = userLoginName;
	}
	public String getUserLoginPassword() {
		return userLoginPassword;
	}
	public void setUserLoginPassword(String userLoginPassword) {
		this.userLoginPassword = userLoginPassword;
	}
	public String getAddTime() {
		return addTime;
	}
	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public int getsFlag() {
		return sFlag;
	}
	public void setsFlag(int sFlag) {
		this.sFlag = sFlag;
	}
	public String getIpadress() {
		return ipadress;
	}
	public void setIpadress(String ipadress) {
		this.ipadress = ipadress;
	}
	
}
