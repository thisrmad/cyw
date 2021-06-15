package com.ityunhe.bean;

public class Order implements java.io.Serializable {

	private Integer oid;
	private Integer uid;
	private String goid;
	private Integer number;
	private String address;
	private Integer orderstatus;

	public Order() {
	}

	public Order(Integer uid, String goid, Integer number, String address,
			Integer orderstatus) {
		this.uid = uid;
		this.goid = goid;
		this.number = number;
		this.address = address;
		this.orderstatus = orderstatus;
	}
	/**
	 * 获取
	 * @param 
	 */
	public Integer getOid() {
		return this.oid;
	}
	/**
	 * 设置
	 * @param 
	 */
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	/**
	 * 获取
	 * @param 
	 */
	public Integer getUid() {
		return this.uid;
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
		return this.goid;
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
		return this.number;
	}
	/**
	 * 设置
	 * @param 
	 */
	public void setNumber(Integer number) {
		this.number = number;
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
	/**
	 * 获取
	 * @param 
	 */
	public Integer getOrderstatus() {
		return this.orderstatus;
	}
	/**
	 * 设置
	 * @param 
	 */
	public void setOrderstatus(Integer orderstatus) {
		this.orderstatus = orderstatus;
	}

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", uid=" + uid + ", goid=" + goid + ", number=" + number + ", address=" + address
				+ ", orderstatus=" + orderstatus + "]";
	}

}