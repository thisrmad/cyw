package com.ityunhe.bean;


public class Goodsclasses implements java.io.Serializable {

	private Integer gsid;
	private String classesname;
	private Integer parentid;
	private String parentidList;
	private Integer depth;

	public Goodsclasses() {
	}

	public Goodsclasses(String classesname, Integer parentid,
			String parentidList, Integer depth) {
		this.classesname = classesname;
		this.parentid = parentid;
		this.parentidList = parentidList;
		this.depth = depth;
	}

	/**
	 * 获取
	 * @param 
	 */
	public Integer getGsid() {
		return this.gsid;
	}
	/**
	 * 设置
	 * @param 
	 */
	public void setGsid(Integer gsid) {
		this.gsid = gsid;
	}
	/**
	 * 获取
	 * @param 
	 */
	public String getClassesname() {
		return this.classesname;
	}
	/**
	 * 设置
	 * @param 
	 */
	public void setClassesname(String classesname) {
		this.classesname = classesname;
	}
	/**
	 * 获取
	 * @param 
	 */
	public Integer getParentid() {
		return this.parentid;
	}
	/**
	 * 设置
	 * @param 
	 */
	public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}
	/**
	 * 获取
	 * @param 
	 */
	public String getParentidList() {
		return this.parentidList;
	}
	/**
	 * 设置
	 * @param 
	 */
	public void setParentidList(String parentidList) {
		this.parentidList = parentidList;
	}
	/**
	 * 获取
	 * @param 
	 */
	public Integer getDepth() {
		return this.depth;
	}
	/**
	 * 设置
	 * @param 
	 */
	public void setDepth(Integer depth) {
		this.depth = depth;
	}
	
	@Override
	public String toString() {
		return "Goodsclasses [gsid=" + gsid + ", classesname=" + classesname + ", parentid=" + parentid
				+ ", parentidList=" + parentidList + ", depth=" + depth + "]";
	}

}