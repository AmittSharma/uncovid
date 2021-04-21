package com.uncovid.help.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Help {
	
	@Id
	@Column(name= "info_id")
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

}
