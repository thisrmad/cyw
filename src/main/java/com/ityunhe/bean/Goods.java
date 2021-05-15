package com.ityunhe.bean;

public class Goods implements java.io.Serializable {

	private Integer goid;
	private Integer gsid;
	private String gaid;
	private String goodsname;
	private Double price;
	private Integer number;
	private String goodsimages;
	private String nutrition;
	private Integer sales;
	private String scope;

	public Goods() {
	}

	public Goods(Integer gsid, String gaid, String goodsname, Double price,
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

	public Goods(Integer gsid, String gaid, String goodsname, Double price,
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


	public Integer getGoid() {
		return this.goid;
	}

	public void setGoid(Integer goid) {
		this.goid = goid;
	}

	public Integer getGsid() {
		return this.gsid;
	}

	public void setGsid(Integer gsid) {
		this.gsid = gsid;
	}

	public String getGaid() {
		return this.gaid;
	}

	public void setGaid(String gaid) {
		this.gaid = gaid;
	}

	public String getGoodsname() {
		return this.goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getGoodsimages() {
		return this.goodsimages;
	}

	public void setGoodsimages(String goodsimages) {
		this.goodsimages = goodsimages;
	}

	public String getNutrition() {
		return this.nutrition;
	}

	public void setNutrition(String nutrition) {
		this.nutrition = nutrition;
	}

	public Integer getSales() {
		return this.sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}

	public String getScope() {
		return this.scope;
	}

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