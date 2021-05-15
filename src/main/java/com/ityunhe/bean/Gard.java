package com.ityunhe.bean;

public class Gard implements java.io.Serializable {

	private Integer gaid;
	private String gradname;
	private String gradpassword;
	private String nickname;
	private String gardaddress;
	private String gradslogan;
	private String gardinfo;
	private String gradmobile;
	private String gradimages;

	public Gard() {
	}

	public Gard(String gradname, String gradpassword, String nickname,
			String gardaddress, String gardinfo) {
		this.gradname = gradname;
		this.gradpassword = gradpassword;
		this.nickname = nickname;
		this.gardaddress = gardaddress;
		this.gardinfo = gardinfo;
	}

	public Gard(String gradname, String gradpassword, String nickname,
			String gardaddress, String gradslogan, String gardinfo,
			String gradmobile, String gradimages) {
		this.gradname = gradname;
		this.gradpassword = gradpassword;
		this.nickname = nickname;
		this.gardaddress = gardaddress;
		this.gradslogan = gradslogan;
		this.gardinfo = gardinfo;
		this.gradmobile = gradmobile;
		this.gradimages = gradimages;
	}

	// Property accessors

	public Integer getGaid() {
		return this.gaid;
	}

	public void setGaid(Integer gaid) {
		this.gaid = gaid;
	}

	public String getGradname() {
		return this.gradname;
	}

	public void setGradname(String gradname) {
		this.gradname = gradname;
	}

	public String getGradpassword() {
		return this.gradpassword;
	}

	public void setGradpassword(String gradpassword) {
		this.gradpassword = gradpassword;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getGardaddress() {
		return this.gardaddress;
	}

	public void setGardaddress(String gardaddress) {
		this.gardaddress = gardaddress;
	}

	public String getGradslogan() {
		return this.gradslogan;
	}

	public void setGradslogan(String gradslogan) {
		this.gradslogan = gradslogan;
	}

	public String getGardinfo() {
		return this.gardinfo;
	}

	public void setGardinfo(String gardinfo) {
		this.gardinfo = gardinfo;
	}

	public String getGradmobile() {
		return this.gradmobile;
	}

	public void setGradmobile(String gradmobile) {
		this.gradmobile = gradmobile;
	}

	public String getGradimages() {
		return this.gradimages;
	}

	public void setGradimages(String gradimages) {
		this.gradimages = gradimages;
	}

	@Override
	public String toString() {
		return "Gard [gaid=" + gaid + ", gradname=" + gradname + ", gradpassword=" + gradpassword + ", nickname="
				+ nickname + ", gardaddress=" + gardaddress + ", gradslogan=" + gradslogan + ", gardinfo=" + gardinfo
				+ ", gradmobile=" + gradmobile + ", gradimages=" + gradimages + "]";
	}

}