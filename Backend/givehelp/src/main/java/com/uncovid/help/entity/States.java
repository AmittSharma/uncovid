package com.uncovid.help.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "State")
public class States {

	@Id
	@Column(name = "state_id")
	private int stateId;
	@Column(name = "state_name")
	private String stateName;
	
	private int count;
	
	public States() {
		super();
	}

	public States(int stateId, String stateName) {
		super();
		this.stateId = stateId;
		this.stateName = stateName;
	}
	
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
}
