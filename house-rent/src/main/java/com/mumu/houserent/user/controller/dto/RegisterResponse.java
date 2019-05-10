package com.mumu.houserent.user.controller.dto;

public class RegisterResponse {

	private Integer id;
	@Override
	public String toString() {
		return "RegisterResponse [id=" + id + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}
