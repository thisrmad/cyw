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


	public Integer getGsid() {
		return this.gsid;
	}

	public void setGsid(Integer gsid) {
		this.gsid = gsid;
	}

	public String getClassesname() {
		return this.classesname;
	}

	public void setClassesname(String classesname) {
		this.classesname = classesname;
	}

	public Integer getParentid() {
		return this.parentid;
	}

	public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}

	public String getParentidList() {
		return this.parentidList;
	}

	public void setParentidList(String parentidList) {
		this.parentidList = parentidList;
	}

	public Integer getDepth() {
		return this.depth;
	}

	public void setDepth(Integer depth) {
		this.depth = depth;
	}

	@Override
	public String toString() {
		return "Goodsclasses [gsid=" + gsid + ", classesname=" + classesname + ", parentid=" + parentid
				+ ", parentidList=" + parentidList + ", depth=" + depth + "]";
	}

}