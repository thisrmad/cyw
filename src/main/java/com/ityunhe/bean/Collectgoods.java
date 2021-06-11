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
	 * 获取
	 * @param 
	 */
	public Integer getUid() {
		return uid;
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
	public String getGoid() {
		return goid;
	}
	/**
	 * 设置
	 * @param 
	 */
	public void setGoid(String goid) {
		this.goid = goid;
	}
	@Override
	public String toString() {
		return "Collectgoods [uid=" + uid + ", goid=" + goid + "]";
	}
	
}
