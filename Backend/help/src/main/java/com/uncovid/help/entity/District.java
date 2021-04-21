package com.uncovid.help.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class District {

	@Id
	private Integer districtId;
	private String districtName;
	
	public District() {
		super();
	}
	public District(Integer districtId, String districtName) {
		super();
		this.districtId = districtId;
		this.districtName = districtName;
	}
	public Integer getDistrictId() {
		return districtId;
	}
	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	
	
}
