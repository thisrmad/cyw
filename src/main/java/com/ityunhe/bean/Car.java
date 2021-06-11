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
	/**
	 * 获取
	 * @param 
	 */
	public Integer getNumber() {
		return number;
	}
	/**
	 * 设置
	 * @param 
	 */
	public void setNumber(Integer number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Car [uid=" + uid + ", goid=" + goid + ", number=" + number + "]";
	}
	
}
