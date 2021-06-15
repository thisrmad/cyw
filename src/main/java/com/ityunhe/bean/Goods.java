package com.ityunhe.bean;

public class Goods implements java.io.Serializable {

	private Integer goid;
	private Integer gsid;
	private Integer gaid;
	private String goodsname;
	private Double price;
	private Integer number;
	private String goodsimages;
	private String nutrition;
	private Integer sales;
	private String scope;

	public Goods() {
	}

	public Goods(Integer gsid, Integer gaid, String goodsname, Double price,
			Integer number, String goodsimages, Integer sales, String scope) {
		this.gsid = gsid;
		this.gaid = gaid;
		this.goodsname = goodsname;
		this.price = price;
		this.number = number;
		this.goodsimages = goodsimages;
		this.sales = sales;
		this.scope = scope;
	}

	public Goods(Integer gsid, Integer gaid, String goodsname, Double price,
			Integer number, String goodsimages, String nutrition,
			Integer sales, String scope) {
		this.gsid = gsid;
		this.gaid = gaid;
		this.goodsname = goodsname;
		this.price = price;
		this.number = number;
		this.goodsimages = goodsimages;
		this.nutrition = nutrition;
		this.sales = sales;
		this.scope = scope;
	}

	/**
	 * 获取
	 * @param 
	 */
	public Integer getGoid() {
		return this.goid;
	}
	/**
	 * 设置
	 * @param 
	 */
	public void setGoid(Integer goid) {
		this.goid = goid;
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
	public Integer getGaid() {
		return this.gaid;
	}
	/**
	 * 设置
	 * @param 
	 */
	public void setGaid(Integer gaid) {
		this.gaid = gaid;
	}
	/**
	 * 获取
	 * @param 
	 */
	public String getGoodsname() {
		return this.goodsname;
	}
	/**
	 * 设置
	 * @param 
	 */
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	/**
	 * 获取
	 * @param 
	 */
	public Double getPrice() {
		return this.price;
	}
	/**
	 * 设置
	 * @param 
	 */
	public void setPrice(Double price) {
		this.price = price;
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
	public String getGoodsimages() {
		return this.goodsimages;
	}
	/**
	 * 设置
	 * @param 
	 */
	public void setGoodsimages(String goodsimages) {
		this.goodsimages = goodsimages;
	}
	/**
	 * 获取
	 * @param 
	 */
	public String getNutrition() {
		return this.nutrition;
	}
	/**
	 * 设置
	 * @param 
	 */
	public void setNutrition(String nutrition) {
		this.nutrition = nutrition;
	}
	/**
	 * 获取
	 * @param 
	 */
	public Integer getSales() {
		return this.sales;
	}
	/**
	 * 设置
	 * @param 
	 */
	public void setSales(Integer sales) {
		this.sales = sales;
	}
	/**
	 * 获取
	 * @param 
	 */
	public String getScope() {
		return this.scope;
	}
	/**
	 * 设置
	 * @param 
	 */
	public void setScope(String scope) {
		this.scope = scope;
	}

	@Override
	public String toString() {
		return "Goods [goid=" + goid + ", gsid=" + gsid + ", gaid=" + gaid + ", goodsname=" + goodsname + ", price="
				+ price + ", number=" + number + ", goodsimages=" + goodsimages + ", nutrition=" + nutrition
				+ ", sales=" + sales + ", scope=" + scope + "]";
	}

}