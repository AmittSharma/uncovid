package com.uncovid.help.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uncovid.help.entity.Category;
import com.uncovid.help.entity.District;
import com.uncovid.help.entity.Help;
import com.uncovid.help.entity.HelpCategories;
import com.uncovid.help.entity.States;
import com.uncovid.help.entity.TakeHelp;
import com.uncovid.help.repository.CategoryRepository;
import com.uncovid.help.repository.DistrictRepository;
import com.uncovid.help.repository.HelpRepository;
import com.uncovid.help.repository.OtherHelpRepository;
import com.uncovid.help.repository.StateRepository;
import com.uncovid.help.repository.TakeHelpRepository;
import com.uncovid.help.entity.OtherHelp;

@Service
public class HelpService {

	@Autowired
	private StateRepository stateRepository;
	
	@Autowired
	private DistrictRepository districtRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private HelpRepository helpRepository;
	
	@Autowired
	public TakeHelpRepository takeHelpRepository;
	
	@Autowired
	public OtherHelpRepository otherHelpRepository;


	public List<States> getListOfStates() {
		// TODO Auto-generated method stub
		return stateRepository.findAll();

	}

	public List<District> getListOfDistricts(int stateId) {
		return districtRepository.findByStateId(stateId);
	}

	public List<Category> getListOfCategories() {
		return categoryRepository.findAll();
	}

	public Help giveHelp(Help help) {
		Help result = helpRepository.save(help);
		return result;
	}
	
	public List<TakeHelp> getHelp() {
		return takeHelpRepository.findAll();
//		return takeHelpRepository.findByDistrictId(helpReq.getDisctrictId(),helpReq.getCategoryId() );
	}

	public List<TakeHelp> findHelp(TakeHelp helpReq) {
		// TODO Auto-generated method stub
		return takeHelpRepository.findSpecificHelp(helpReq.getDistrictId(),helpReq.getCategoryId(), helpReq.getStateId());
	}

	public List<OtherHelp> findAll() {
		// TODO Auto-generated method stub
		return otherHelpRepository.findAll();
	}

}
