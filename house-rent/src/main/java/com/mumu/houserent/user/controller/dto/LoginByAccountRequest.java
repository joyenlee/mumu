package com.mumu.houserent.user.controller.dto;

import javax.validation.constraints.NotBlank;

public class LoginByAccountRequest {

	@NotBlank
	private String username;
	@NotBlank
	private String password;
	@Override
	public String toString() {
		return "LoginByAccountRequest [username=" + username + ", password=" + password + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
