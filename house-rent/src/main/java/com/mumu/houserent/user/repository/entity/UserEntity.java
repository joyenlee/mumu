package com.mumu.houserent.user.repository.entity;

public class UserEntity {
	private Integer id;
	private String mobilePhone;
	private String nickname;
	private String password;
	
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", mobilePhone=" + mobilePhone + ", nickname=" + nickname + ", password="
				+ password + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
