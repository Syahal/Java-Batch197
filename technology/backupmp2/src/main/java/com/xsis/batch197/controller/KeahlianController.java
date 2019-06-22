package com.xsis.batch197.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xsis.batch197.model.XKeahlianModel;
import com.xsis.batch197.model.XSkillLevelModel;
import com.xsis.batch197.repository.XKeahlianRepo;
import com.xsis.batch197.repository.XSkillLevelRepo;

@Controller
@RequestMapping(value="/keahlian")
public class KeahlianController {
	private static final Logger logger = LoggerFactory.getLogger(XKeahlianModel.class);
	
	@Autowired
	private XKeahlianRepo keahlianRepo;
	
	@Autowired
	private XSkillLevelRepo repoSkill;
	
	// #1. index => list data
		@GetMapping(value = "/index")
		public ModelAndView index() {
			// buat object view
			ModelAndView view = new ModelAndView("keahlian/index");
			return view;
		}
	
	//#1. index => list data
	@GetMapping(value="/list/{key}")
	public ModelAndView list(@PathVariable("key") String key) {
		//buat object view
		ModelAndView view = new ModelAndView("keahlian/list");
		// load data keahlian via repo, disimpan kedalam list
		List<XKeahlianModel> listkeahlian = keahlianRepo.findAll();
		//lemparkan data ke view list object baru, datanya listkeahlian
		view.addObject("list", listkeahlian);
		return view;
	}
	
	//#2. Membuat form Add Keahlian
	@GetMapping(value="/add")
	public ModelAndView create() {
		//buat object view
		ModelAndView view = new ModelAndView("keahlian/create");
		//buat object keahlian yang akan dikirim ke view
		//object keahlian adalah new object dari XKeahlianModel
		XKeahlianModel keahlian = new XKeahlianModel();
		view.addObject("keahlian", keahlian);
		
		//mengambil data skill yang sudah ada
		List<XSkillLevelModel> listSkill = repoSkill.findAll();
		//object listSkill akan dikirim ke view, agar pilihan SKillId bisa terisi datanya
		view.addObject("listSkill", listSkill);
		return view;
	}
	
	//#3. Menangkap data dari form Add Keahlian
	@PostMapping(value="/save")
	public ModelAndView save(@Valid @ModelAttribute("keahlian") XKeahlianModel keahlian, BindingResult result) {
		if(result.hasErrors()) {
			logger.info("Save Keahlian Error");
		} else {
			keahlianRepo.save(keahlian);
		}
		ModelAndView view = new ModelAndView("keahlian/create");
		view.addObject("keahlian", keahlian);
		return view;
	}
}
