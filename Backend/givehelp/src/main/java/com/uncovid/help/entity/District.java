package com.uncovid.help.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "district")
public class District {

	@Id
	@Column(name = "dis_id")
	private Integer districtId;
	
	@Column(name = "dis_name")
	private String districtName;
	
	@Column(name = "state_id")
	private Integer stateId;
	
	private int count;
	
	public District() {
		super();
	}
	
	public District(Integer districtId, String districtName, Integer stateId) {
		super();
		this.districtId = districtId;
		this.districtName = districtName;
		this.stateId = stateId;
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
	public Integer getStateId() {
		return stateId;
	}
	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
}
