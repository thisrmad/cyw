package com.ityunhe.bean;

public class Car implements java.io.Serializable {
	private Integer uid;
	private String goid;
	private Integer number;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(Integer uid, String goid, Integer number) {
		super();
		this.uid = uid;
		this.goid = goid;
		this.number = number;
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
	 * 获取商品编号String goid 组合
	 * @param 
	 */
	public String getGoid() {
		return goid;
	}
	/**
	 * 设置商品编号String goid 组合
	 * @param goid 
	 */
	public void setGoid(String goid) {
		this.goid = goid;
	}
	/**
	 * 获取商品数量Integer number 单位千克
	 * @param 
	 */
	public Integer getNumber() {
		return number;
	}
	/**
	 * 设置商品数量Integer number 单位千克
	 * @param number
	 */
	public void setNumber(Integer number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Car [uid=" + uid + ", goid=" + goid + ", number=" + number + "]";
	}
	
}
