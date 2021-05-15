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


	@Override
	public String toString() {
		return "Admin [uid=" + uid + ", username=" + username + ", userpassword=" + userpassword + "]";
	}

}