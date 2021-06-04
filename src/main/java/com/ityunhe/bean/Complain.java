package com.ityunhe.bean;



public class Complain implements java.io.Serializable {


	private Integer cid;
	private String gaid;
	private String uid;
	private String content;


	public Complain() {
	}


	public Complain(String gaid, String uid, String content) {
		this.gaid = gaid;
		this.uid = uid;
		this.content = content;
	}


	public Integer getCid() {
		return this.cid;
	}
	/**
	 * 设置
	 * @param 
	 */
	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getGaid() {
		return this.gaid;
	}
	/**
	 * 设置
	 * @param 
	 */
	public void setGaid(String gaid) {
		this.gaid = gaid;
	}

	public String getUid() {
		return this.uid;
	}
	/**
	 * 设置
	 * @param 
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}

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