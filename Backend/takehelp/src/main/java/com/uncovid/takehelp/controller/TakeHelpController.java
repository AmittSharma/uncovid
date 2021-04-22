package com.uncovid.takehelp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uncovid.takehelp.entity.Help;
import com.uncovid.takehelp.service.TakeHelpService;

@RestController
@RequestMapping("/takehelp")
public class TakeHelpController {
	
	@Autowired
	public TakeHelpService takeHelpService;
	
	@GetMapping("/gethelp")
	public List<Help> getHelp() {
		return takeHelpService.getHelp();	
	}
	
}
