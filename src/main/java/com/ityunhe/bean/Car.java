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
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getGoid() {
		return goid;
	}
	public void setGoid(String goid) {
		this.goid = goid;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Car [uid=" + uid + ", goid=" + goid + ", number=" + number + "]";
	}
	
}
