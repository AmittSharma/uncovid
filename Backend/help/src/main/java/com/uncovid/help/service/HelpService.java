package com.uncovid.help.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.uncovid.help.entity.Category;
import com.uncovid.help.entity.District;
import com.uncovid.help.entity.HelpCategories;
import com.uncovid.help.entity.States;
import com.uncovid.help.repository.CategoryRepository;
import com.uncovid.help.repository.DistrictRepository;
import com.uncovid.help.repository.HelpRepository;
import com.uncovid.help.repository.StateRepository;

public class HelpService {

	@Autowired
	public StateRepository stateRepository;
	
	@Autowired
	public DistrictRepository districtRepository;
	
	@Autowired
	public CategoryRepository categoryRepository;

	public List getListOfStates() {
		// TODO Auto-generated method stub
		return stateRepository.findAll();

	}

	public List<District> getListOfDistricts(Integer stateId) {
		// TODO Auto-generated method stub
		//change required
		return districtRepository.getListOfDistricts(stateId);
	}

	public List<Category> getLlistOfCategories() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

}