package com.ityunhe.bean;

public class Admin implements java.io.Serializable {

	private Integer uid;
	private String username;
	private String userpassword;

	public Admin() {
	}


	public Admin(String username, String userpassword) {
		this.username = username;
		this.userpassword = userpassword;
	}

	/**
	 * 获取
	 * @param 
	 */
	public Integer getUid() {
		return this.uid;
	}
	/**
	 * 设置
	 * @param 
	 */
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	/**
	 * 获取
	 * @param 
	 */
	public String getUsername() {
		return this.username;
	}
	/**
	 * 设置
	 * @param 
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * 获取
	 * @param 
	 */
	public String getUserpassword() {
		return this.userpassword;
	}
	/**
	 * 设置
	 * @param 
	 */
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}


	@Override
	public String toString() {
		return "Admin [uid=" + uid + ", username=" + username + ", userpassword=" + userpassword + "]";
	}

}