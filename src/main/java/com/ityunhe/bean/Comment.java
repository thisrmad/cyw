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

	/**
	 * 获取评价编号 Integer cid
	 * @param 
	 */
	public Integer getCid() {
		return this.cid;
	}
	/**
	 * 设置评价编号 Integer cid
	 * @param cid
	 */
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	/**
	 * 获取商品编号 String goid
	 * @param 
	 */
	public String getGoid() {
		return this.goid;
	}
	/**
	 * 设置商品编号 String goid
	 * @param goid
	 */
	public void setGoid(String goid) {
		this.goid = goid;
	}
	/**
	 * 获取普通用户昵称 String nickname
	 * @param 
	 */
	public String getNickname() {
		return this.nickname;
	}
	/**
	 * 设置普通用户昵称 String nickname
	 * @param nickname
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * 获取评价内容 String content
	 * @param 
	 */
	public String getContent() {
		return this.content;
	}
	/**
	 * 设置评价内容 String content
	 * @param content
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取评价时间 Timestamp addtime
	 * @param 
	 */
	public Timestamp getAddtime() {
		return this.addtime;
	}
	/**
	 * 设置评价时间 Timestamp addtime
	 * @param addtime
	 */
	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
	}
	/**
	 * 获取商品符合度 Integer truth
	 * @param 
	 */
	public Integer getTruth() {
		return this.truth;
	}
	/**
	 * 设置商品符合度 Integer truth
	 * @param truth
	 */
	public void setTruth(Integer truth) {
		this.truth = truth;
	}
	/**
	 * 获取服务态度 Integer service
	 * @param 
	 */
	public Integer getService() {
		return this.service;
	}
	/**
	 * 设置服务态度 Integer service
	 * @param service
	 */
	public void setService(Integer service) {
		this.service = service;
	}
	/**
	 * 获取物流发货速度 Integer speed
	 * @param 
	 */
	public Integer getSpeed() {
		return this.speed;
	}
	/**
	 * 设置物流发货速度 Integer speed
	 * @param speed
	 */
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	/**
	 * 获取商品新鲜度 Integer fresh
	 * @param 
	 */
	public Integer getFresh() {
		return this.fresh;
	}
	/**
	 * 设置商品新鲜度 Integer fresh
	 * @param fresh
	 */
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