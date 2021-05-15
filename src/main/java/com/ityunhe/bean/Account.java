package com.ityunhe.bean;

import java.sql.Timestamp;

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

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpassword() {
		return this.userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getAddtime() {
		return this.addtime;
	}

	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
	}

	public String getHeadimage() {
		return this.headimage;
	}

	public void setHeadimage(String headimage) {
		this.headimage = headimage;
	}

	public String getAddress() {
		return this.address;
	}

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