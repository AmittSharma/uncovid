package com.uncovid.help.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/help")
public class HelpController {

	@GetMapping("/gethelp")
	public String getHelp() {
		return "You were helped";
	}
}
