package com.mumu.houserent.owner.controller.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class RegisterHouseRequest {

	@NotBlank
	private String city;
	@NotBlank
	private String district;
	@NotBlank
	private String subdistrict;
	@NotBlank
	private String road;
	@NotNull
	private long courtyardNo;
	
	private String community;
	@NotNull
	private long buildingNo;
	@NotNull
	private long UnitNo;
	@NotNull
	private long houseNo;
	@Override
	public String toString() {
		return "RegisterHouseRequest [city=" + city + ", district=" + district + ", subdistrict=" + subdistrict
				+ ", road=" + road + ", courtyardNo=" + courtyardNo + ", community=" + community + ", buildingNo="
				+ buildingNo + ", UnitNo=" + UnitNo + ", houseNo=" + houseNo + "]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getSubdistrict() {
		return subdistrict;
	}
	public void setSubdistrict(String subdistrict) {
		this.subdistrict = subdistrict;
	}
	public String getRoad() {
		return road;
	}
	public void setRoad(String road) {
		this.road = road;
	}
	public long getCourtyardNo() {
		return courtyardNo;
	}
	public void setCourtyardNo(long courtyardNo) {
		this.courtyardNo = courtyardNo;
	}
	public String getCommunity() {
		return community;
	}
	public void setCommunity(String community) {
		this.community = community;
	}
	public long getBuildingNo() {
		return buildingNo;
	}
	public void setBuildingNo(long buildingNo) {
		this.buildingNo = buildingNo;
	}
	public long getUnitNo() {
		return UnitNo;
	}
	public void setUnitNo(long unitNo) {
		UnitNo = unitNo;
	}
	public long getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(long houseNo) {
		this.houseNo = houseNo;
	}
}
