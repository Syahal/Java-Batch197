package com.xsis.batch197.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xsis.batch197.model.XMenutreeModel;
import com.xsis.batch197.repository.XMenutreeRepo;

@Controller
@RequestMapping(value = "/home")
public class HomeController {
	
	@Autowired
	private XMenutreeRepo repoMenu;
	
	@GetMapping(value = "/index")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView("home/index");
		List<XMenutreeModel> listmenu = repoMenu.findAll();
		view.addObject("list", listmenu);
		return view;
	}	
}

