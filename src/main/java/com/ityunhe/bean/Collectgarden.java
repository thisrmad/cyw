package com.ityunhe.bean;

public class Collectgarden implements java.io.Serializable {
	private Integer uid;
	private Integer gaid;
	public Collectgarden() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Collectgarden(Integer uid, Integer gaid) {
		super();
		this.uid = uid;
		this.gaid = gaid;
	}
	/**
	 * 获取普通用户编号Integer uid 外键
	 * @param 
	 */
	public Integer getUid() {
		return uid;
	}
	/**
	 * 设置普通用户编号Integer uid 外键
	 * @param uid
	 */
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	/**
	 * 获取菜园编号Integer gaid 外键
	 * @param 
	 */
	public Integer getGaid() {
		return gaid;
	}
	/**
	 * 设置菜园编号Integer gaid 外键
	 * @param gaid 
	 */
	public void setGaid(Integer gaid) {
		this.gaid = gaid;
	}
	@Override
	public String toString() {
		return "Collectgard [uid=" + uid + ", gaid=" + gaid + "]";
	}
	
}
