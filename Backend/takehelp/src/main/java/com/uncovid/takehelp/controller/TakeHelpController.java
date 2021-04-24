package com.uncovid.takehelp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uncovid.takehelp.entity.Help;
import com.uncovid.takehelp.entity.OtherHelp;
import com.uncovid.takehelp.service.TakeHelpService;

@RestController
@RequestMapping("/takehelp")
@CrossOrigin(origins = "*")
public class TakeHelpController {
	
	@Autowired
	public TakeHelpService takeHelpService;
	
	@GetMapping("/gethelp")
	public List<Help> getHelp() {
		return takeHelpService.getHelp();	
	}
	
	@GetMapping("/otherHelpers")
	public List<OtherHelp> getOtherHelpers(){
		return takeHelpService.findAll();
	}
	@PostMapping("/gethelp")
	public List<Help> getHelp(@RequestBody Help helpReq) {
		return takeHelpService.findHelp(helpReq);	
	}
	
}