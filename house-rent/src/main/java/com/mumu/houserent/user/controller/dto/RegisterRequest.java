package com.mumu.houserent.user.controller.dto;

import javax.validation.constraints.NotBlank;

public class RegisterRequest {

	@NotBlank
	private String mobilePhone;
	@NotBlank
	private String verificationCode;
	@NotBlank
	private String nickname;
	@NotBlank
	private String password;
	@NotBlank
	private String verificationPassword;
	@Override
	public String toString() {
		return "RegisterRequest [mobilePhone=" + mobilePhone + ", verificationCode=" + verificationCode + ", nickname="
				+ nickname + ", password=" + password + ", verificationPassword=" + verificationPassword + "]";
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getVerificationCode() {
		return verificationCode;
	}
	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
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
	public String getVerificationPassword() {
		return verificationPassword;
	}
	public void setVerificationPassword(String verificationPassword) {
		this.verificationPassword = verificationPassword;
	}
}
