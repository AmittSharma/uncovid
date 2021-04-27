package com.uncovid.help.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.json.simple.JSONObject;

import com.uncovid.help.entity.Category;
import com.uncovid.help.entity.District;
import com.uncovid.help.entity.TakeHelp;
import com.uncovid.help.entity.States;
import com.uncovid.help.service.HelpService;
import com.uncovid.help.entity.OtherHelp;

@RestController
@RequestMapping("/takehelp")
@CrossOrigin(origins = "*")
public class TakeHelpController {
	
	@Autowired
	public HelpService helpService;

//	@GetMapping("/gethelp")
//	public String getHelp() {
//		return "You were helped";
//	}
	
	@GetMapping("/otherHelpers")
	public List<OtherHelp> getOtherHelpers(){
		return helpService.findAll();
	}
	@PostMapping("/gethelp")
	public List<TakeHelp> getHelp(@RequestBody TakeHelp helpReq) {
		return helpService.findHelp(helpReq);	
	}
}
