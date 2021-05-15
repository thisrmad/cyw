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

	public Integer getOid() {
		return this.oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getGoid() {
		return this.goid;
	}

	public void setGoid(String goid) {
		this.goid = goid;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getOrderstatus() {
		return this.orderstatus;
	}

	public void setOrderstatus(Integer orderstatus) {
		this.orderstatus = orderstatus;
	}

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", uid=" + uid + ", goid=" + goid + ", number=" + number + ", address=" + address
				+ ", orderstatus=" + orderstatus + "]";
	}

}