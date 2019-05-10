package com.mumu.houserent.user.controller.dto;

import javax.validation.constraints.NotBlank;

public class LoginByMobileRequest {

	@NotBlank
	private String mobilePhone;
	@NotBlank
	private String verificationCode;
	@Override
	public String toString() {
		return "LoginByMobileRequest [mobilePhone=" + mobilePhone + ", verificationCode=" + verificationCode + "]";
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
}
