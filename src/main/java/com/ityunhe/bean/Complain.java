package com.ityunhe.bean;



public class Complain implements java.io.Serializable {


	private Integer cid;
	private Integer gaid;
	private Integer uid;
	private String content;


	public Complain() {
	}


	public Complain(Integer gaid, Integer uid, String content) {
		this.gaid = gaid;
		this.uid = uid;
		this.content = content;
	}

	/**
	 * 获取投诉编号 Integer cid
	 * @param 
	 */
	public Integer getCid() {
		return this.cid;
	}
	/**
	 * 设置投诉编号 Integer cid
	 * @param cid
	 */
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	/**
	 * 获取菜园编号 String gaid
	 * @param 
	 */
	public Integer getGaid() {
		return this.gaid;
	}
	/**
	 * 设置菜园编号 String gaid
	 * @param gaid 
	 */
	public void setGaid(Integer gaid) {
		this.gaid = gaid;
	}
	/**
	 * 获取普通用户编号
	 * @param 
	 */
	public Integer getUid() {
		return this.uid;
	}
	/**
	 * 设置普通用户编号
	 * @param 
	 */
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	/**
	 * 获取
	 * @param 
	 */
	public String getContent() {
		return this.content;
	}
	/**
	 * 设置
	 * @param 
	 */
	public void setContent(String content) {
		this.content = content;
	}


	@Override
	public String toString() {
		return "Complain [cid=" + cid + ", gaid=" + gaid + ", uid=" + uid + ", content=" + content + "]";
	}

}