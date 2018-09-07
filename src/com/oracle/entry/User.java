package com.oracle.entry;

public class User {

	private String userName;
	private String name;
	private String passWord;
	private String brithday;
	private String sex;
	private String hobby;
	private String tel;
	private String idcard;
	private String email;
	private String adressload;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getBrithday() {
		return brithday;
	}
	public void setBrithday(String brithday) {
		this.brithday = brithday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdressload() {
		return adressload;
	}
	public void setAdressload(String adressload) {
		this.adressload = adressload;
	}
	public User(String userName, String name, String passWord, String brithday, String sex, String hobby, String tel,
			String idcard, String email, String adressload) {
		super();
		this.userName = userName;
		this.name = name;
		this.passWord = passWord;
		this.brithday = brithday;
		this.sex = sex;
		this.hobby = hobby;
		this.tel = tel;
		this.idcard = idcard;
		this.email = email;
		this.adressload = adressload;
	}
	public User() {
		super();
	}

	
}
