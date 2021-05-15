package com.ityunhe.bean;

public class Collectgard implements java.io.Serializable {
	private Integer uid;
	private String gaid;
	public Collectgard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Collectgard(Integer uid, String gaid) {
		super();
		this.uid = uid;
		this.gaid = gaid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getGaid() {
		return gaid;
	}
	public void setGaid(String gaid) {
		this.gaid = gaid;
	}
	@Override
	public String toString() {
		return "Collectgard [uid=" + uid + ", gaid=" + gaid + "]";
	}
	
}
