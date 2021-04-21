package com.uncovid.takehelp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uncovid.takehelp.entity.Help;
import com.uncovid.takehelp.repository.TakeHelpRepository;

@Service
public class TakeHelpService {

	@Autowired
	public TakeHelpRepository takeHelpRepository;

	public List getHelp(Help helpReq) {
		// TODO Auto-generated method stub
		return takeHelpRepository.getHelp(helpReq);
	}
	
	
	
}
