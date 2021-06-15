package com.ityunhe.bean;

public class Collectgoods implements java.io.Serializable {
	private Integer uid;
	private String goid;
	public Collectgoods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Collectgoods(Integer uid, String goid) {
		super();
		this.uid = uid;
		this.goid = goid;
	}
	/**
	 * 获取普通用户编号Integer uid
	 * @param 
	 */
	public Integer getUid() {
		return uid;
	}
	/**
	 * 设置普通用户编号Integer uid
	 * @param uid
	 */
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	/**
	 * 获取商品编号String goid
	 * @param 
	 */
	public String getGoid() {
		return goid;
	}
	/**
	 * 设置商品编号String goid
	 * @param goid
	 */
	public void setGoid(String goid) {
		this.goid = goid;
	}
	@Override
	public String toString() {
		return "Collectgoods [uid=" + uid + ", goid=" + goid + "]";
	}
	
}
