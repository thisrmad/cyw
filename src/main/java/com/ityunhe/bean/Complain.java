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

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getGaid() {
		return this.gaid;
	}

	public void setGaid(String gaid) {
		this.gaid = gaid;
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}


	@Override
	public String toString() {
		return "Complain [cid=" + cid + ", gaid=" + gaid + ", uid=" + uid + ", content=" + content + "]";
	}

}