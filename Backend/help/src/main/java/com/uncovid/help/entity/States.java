package com.uncovid.help.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class States {

	@Id
	private int stateId;
	private String stateName;
	
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
	
	
}
