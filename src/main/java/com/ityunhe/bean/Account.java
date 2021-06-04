package com.ityunhe.bean;

import java.sql.Timestamp;
/**
 * 用户账号实体类
 * @author Administrator
 */
public class Account implements java.io.Serializable {
	private Integer uid;
	private String username;
	private String userpassword;
	private String nickname;
	private Integer sex;
	private String mobile;
	private String email;
	private Timestamp addtime;
	private String headimage;
	private String address;

	public Account() {
	}

	public Account(String username, String userpassword, String nickname,
			String mobile) {
		this.username = username;
		this.userpassword = userpassword;
		this.nickname = nickname;
		this.mobile = mobile;
	}

	public Account(String username, String userpassword, String nickname,
			Integer sex, String mobile, String email, Timestamp addtime,
			String headimage, String address) {
		this.username = username;
		this.userpassword = userpassword;
		this.nickname = nickname;
		this.sex = sex;
		this.mobile = mobile;
		this.email = email;
		this.addtime = addtime;
		this.headimage = headimage;
		this.address = address;
	}


	public Integer getUid() {
		return this.uid;
	}
	/**
	 * 设置用户账号uid 自增
	 * @param uid
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
	 * 设置用户名username 唯一
	 * @param username
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
	/**
	 * 获取
	 * @param 
	 */
	public String getNickname() {
		return this.nickname;
	}
	/**
	 * 设置
	 * @param 
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * 获取
	 * @param 
	 */
	public Integer getSex() {
		return this.sex;
	}
	/**
	 * 设置
	 * @param 
	 */
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	/**
	 * 获取
	 * @param 
	 */
	public String getMobile() {
		return this.mobile;
	}
	/**
	 * 设置
	 * @param 
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * 获取
	 * @param 
	 */
	public String getEmail() {
		return this.email;
	}
	/**
	 * 设置
	 * @param 
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 获取
	 * @param 
	 */
	public Timestamp getAddtime() {
		return this.addtime;
	}
	/**
	 * 设置
	 * @param 
	 */
	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
	}
	/**
	 * 获取
	 * @param 
	 */
	public String getHeadimage() {
		return this.headimage;
	}
	/**
	 * 设置
	 * @param 
	 */
	public void setHeadimage(String headimage) {
		this.headimage = headimage;
	}
	/**
	 * 获取
	 * @param 
	 */
	public String getAddress() {
		return this.address;
	}
	/**
	 * 设置
	 * @param 
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Account [uid=" + uid + ", username=" + username + ", userpassword=" + userpassword + ", nickname="
				+ nickname + ", sex=" + sex + ", mobile=" + mobile + ", email=" + email + ", addtime=" + addtime
				+ ", headimage=" + headimage + ", address=" + address + "]";
	}
	
}