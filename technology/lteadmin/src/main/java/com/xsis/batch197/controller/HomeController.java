package com.xsis.batch197.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/home")
public class HomeController {
	
	@RequestMapping(value="/index")
	public String index() {
		return"home/index";
	}
	
	@RequestMapping(value="/index2")
	public String index2() {
		return"home/index2";
	}
	
}

