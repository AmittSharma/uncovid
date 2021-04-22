package com.uncovid.takehelp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "info")
public class Help {
	
	@Id
	@Column(name= "info_id")
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int helpId;
	@Column(name= "dis_id")
	private int disctrictId;
	@Column(name= "cat_id")
	private int categoryId;
	@Column(name= "description")
	private String description;
	@Column(name= "paid_or_free")
	private String paidOrFree;
	@Column(name= "contact_person")
	private String contactPersonName;
	@Column(name= "contact_number")
	private int contactNumber;
	public int getHelpId() {
		return helpId;
	}
	public void setHelpId(int helpId) {
		this.helpId = helpId;
	}
	public int getDisctrictId() {
		return disctrictId;
	}
	public void setDisctrictId(int disctrictId) {
		this.disctrictId = disctrictId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPaidOrFree() {
		return paidOrFree;
	}
	public void setPaidOrFree(String paidOrFree) {
		this.paidOrFree = paidOrFree;
	}
	public String getContactPersonName() {
		return contactPersonName;
	}
	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Help(int helpId, int disctrictId, int categoryId, String description, String paidOrFree,
			String contactPersonName, int contactNumber) {
		super();
		this.helpId = helpId;
		this.disctrictId = disctrictId;
		this.categoryId = categoryId;
		this.description = description;
		this.paidOrFree = paidOrFree;
		this.contactPersonName = contactPersonName;
		this.contactNumber = contactNumber;
	}
	public Help() {
		super();
	}

	
}
