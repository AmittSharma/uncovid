package com.uncovid.help.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HelpCategories {

	@Id
	private Integer categoryId;
	private String categoryName;
	
	public HelpCategories() {
		super();
	}

	public HelpCategories(Integer categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}
	
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	
}
