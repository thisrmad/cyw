package com.ityunhe.bean;

import java.sql.Timestamp;


public class Comment implements java.io.Serializable {

	private Integer cid;
	private String goid;
	private String nickname;
	private String content;
	private Timestamp addtime;
	private Integer truth;
	private Integer service;
	private Integer speed;
	private Integer fresh;

	public Comment() {
	}


	public Comment(String goid, String nickname, String content,
			Timestamp addtime) {
		this.goid = goid;
		this.nickname = nickname;
		this.content = content;
		this.addtime = addtime;
	}


	public Comment(String goid, String nickname, String content,
			Timestamp addtime, Integer truth, Integer service, Integer speed,
			Integer fresh) {
		this.goid = goid;
		this.nickname = nickname;
		this.content = content;
		this.addtime = addtime;
		this.truth = truth;
		this.service = service;
		this.speed = speed;
		this.fresh = fresh;
	}


	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getGoid() {
		return this.goid;
	}

	public void setGoid(String goid) {
		this.goid = goid;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getAddtime() {
		return this.addtime;
	}

	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
	}

	public Integer getTruth() {
		return this.truth;
	}

	public void setTruth(Integer truth) {
		this.truth = truth;
	}

	public Integer getService() {
		return this.service;
	}

	public void setService(Integer service) {
		this.service = service;
	}

	public Integer getSpeed() {
		return this.speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public Integer getFresh() {
		return this.fresh;
	}

	public void setFresh(Integer fresh) {
		this.fresh = fresh;
	}


	@Override
	public String toString() {
		return "Comment [cid=" + cid + ", goid=" + goid + ", nickname=" + nickname + ", content=" + content
				+ ", addtime=" + addtime + ", truth=" + truth + ", service=" + service + ", speed=" + speed + ", fresh="
				+ fresh + "]";
	}

}