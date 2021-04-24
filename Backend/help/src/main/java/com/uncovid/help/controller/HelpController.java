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
import com.uncovid.help.entity.Help;
import com.uncovid.help.entity.States;
import com.uncovid.help.service.HelpService;

@RestController
@RequestMapping("/help")
@CrossOrigin(origins = "*")
public class HelpController {
	
	@Autowired
	public HelpService helpService;

//	@GetMapping("/gethelp")
//	public String getHelp() {
//		return "You were helped";
//	}
	
	@PostMapping("/givehelp")
	public JSONObject giveHelp(@RequestBody Help help) {
		JSONObject obj = new JSONObject();
		Help result =  helpService.giveHelp(help);
		if(result != null) {
			obj.put("status", "success");
		}
		else {
			obj.put("status", "error");
		}
		return obj;
	}

	@GetMapping("/listOfStates")
	public List<States> getListOfStates(){
		
		return helpService.getListOfStates();
	}
	
	@GetMapping("/listOfDistricts/{stateId}")
	public List<District> getListOfDistricts(@PathVariable int stateId){
		
		return helpService.getListOfDistricts(stateId);
	}
	
	@GetMapping("/listOfCategories")
	public List<Category> getListOfCategories(){
		return helpService.getListOfCategories();
	}
}
