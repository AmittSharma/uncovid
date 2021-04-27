package com.uncovid.help.entity;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "info")
public class Help {

	@Id
//	@GeneratedValue(strategy =  GenerationType.AUTO)
	@Column(name= "info_id")	
	private int helpId;

	@Column(name= "dis_id")
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "dis_id", referencedColumnName = "dis_id")
	private int districtId;

//	private String districtName;

//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "state_id", referencedColumnName = "state_id")
	@Column(name = "state_id")
	private int stateId;

//	private String stateName;

	@Column(name= "cat_id")
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "cat_id", referencedColumnName = "cat_id")
	private int categoryId;

//	private String categoryName;

	@Column(name= "description")
	private String description;

	@Column(name= "paid_or_free")
	private String paidOrFree;

	@Column(name= "contact_person")
	private String contactPersonName;

	@Column(name= "contact_number")
	private String contactNumber;

	public int getHelpId() {
		return helpId;
	}

	public void setHelpId(int helpId) {
		this.helpId = helpId;
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

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

//	public String getDistrictName() {
//		return districtName;
//	}
//
//	public void setDistrictName(String districtName) {
//		this.districtName = districtName;
//	}
//
	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
//
//	public String getStateName() {
//		return stateName;
//	}
//
//	public void setStateName(String stateName) {
//		this.stateName = stateName;
//	}
//
//	public String getCategoryName() {
//		return categoryName;
//	}
//
//	public void setCategoryName(String categoryName) {
//		this.categoryName = categoryName;
//	}

	public Help(int helpId, int districtId, String districtName, int stateId, String stateName, int categoryId,
			String categoryName, String description, String paidOrFree, String contactPersonName, String contactNumber) {
		super();
		this.helpId = helpId;
		this.districtId = districtId;
//		this.districtName = districtName;
//		this.stateId = stateId;
//		this.stateName = stateName;
		this.categoryId = categoryId;
//		this.categoryName = categoryName;
		this.description = description;
		this.paidOrFree = paidOrFree;
		this.contactPersonName = contactPersonName;
		this.contactNumber = contactNumber;
	}

	public Help() {
		super();
	}
}
