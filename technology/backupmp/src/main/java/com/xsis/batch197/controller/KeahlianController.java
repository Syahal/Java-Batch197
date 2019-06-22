package com.xsis.batch197.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xsis.batch197.model.XKeahlianModel;
import com.xsis.batch197.repository.XKeahlianRepo;

@Controller
@RequestMapping(value="/keahlian")
public class KeahlianController {
	private static final Logger logger = LoggerFactory.getLogger(KeahlianController.class);
	
	@Autowired
	private XKeahlianRepo keahlianRepo;
	
	//#1. index => list data
	@GetMapping(value = "/index")
	public ModelAndView index() {
		//buat object view
		ModelAndView view = new ModelAndView("keahlian/list");
		return view;
	}
	
	//#1. index => list data
	@GetMapping(value="/list")
	public ModelAndView list() {
		//buat object view
		ModelAndView view = new ModelAndView("keahlian/list");
		//load data keahlian via repo, lalu disimpan kedalam list
		List<XKeahlianModel> listkeahlian = keahlianRepo.findAll();
		//lemparkan data ke view, list a/ object baru dengan datanya itu listkeahlian
		view.addObject("list", listkeahlian);
		return view;
	}
}
