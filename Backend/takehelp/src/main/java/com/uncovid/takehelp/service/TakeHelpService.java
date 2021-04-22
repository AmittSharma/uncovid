package com.uncovid.takehelp.service;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uncovid.takehelp.entity.Help;
import com.uncovid.takehelp.repository.TakeHelpRepository;

@Service
public class TakeHelpService {

	@Autowired
	public TakeHelpRepository takeHelpRepository;

	public List<Help> getHelp(Help helpReq) {
	
		
//		return session.createQuery("Select * from info", Help.class).getResultList();
//		return takeHelpRepository.findAll();
		return takeHelpRepository.findByDistrictId(helpReq.getDisctrictId(),helpReq.getCategoryId() );
	}
	
	
	
}
