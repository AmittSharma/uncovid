package com.uncovid.takehelp.service;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uncovid.takehelp.entity.Help;
import com.uncovid.takehelp.entity.OtherHelp;
import com.uncovid.takehelp.repository.OtherHelpRepository;
import com.uncovid.takehelp.repository.TakeHelpRepository;

@Service
public class TakeHelpService {

	@Autowired
	public TakeHelpRepository takeHelpRepository;
	
	@Autowired
	public OtherHelpRepository otherHelpRepository;

	public List<Help> getHelp() {
		return takeHelpRepository.findAll();
//		return takeHelpRepository.findByDistrictId(helpReq.getDisctrictId(),helpReq.getCategoryId() );
	}

	public List<Help> findHelp(Help helpReq) {
		// TODO Auto-generated method stub
		return takeHelpRepository.findSpecificHelp(helpReq.getDistrictId(),helpReq.getCategoryId(), helpReq.getStateId());
	}

	public List<OtherHelp> findAll() {
		// TODO Auto-generated method stub
		return otherHelpRepository.findAll();
	}
	
	
	
}
