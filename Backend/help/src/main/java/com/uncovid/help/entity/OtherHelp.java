package com.uncovid.help.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "other_helpers")
public class OtherHelp {
	
	@Id
	@Column(name = "other_help_id")
	private int otherHelpId;
	
	@Column(name = "description")
	private String description;
	@Column(name = "url")
	private String url;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public int getOtherHelpId() {
		return otherHelpId;
	}
	public void setOtherHelpId(int otherHelpId) {
		this.otherHelpId = otherHelpId;
	}
		public OtherHelp(int otherHelpId, String description, String url) {
		super();
		this.otherHelpId = otherHelpId;
		this.description = description;
		this.url = url;
	}
		public OtherHelp() {
		super();
	}

}
