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

import com.xsis.batch197.model.LookupModel;
import com.xsis.batch197.repositroy.LookupRepo;

@Controller
@RequestMapping(value = "/lookup")
public class LookupController {
	private static final Logger logger = LoggerFactory.getLogger(LookupController.class);

	@Autowired
	private LookupRepo repo;
	
//	private String getKode() {
//		String result = "";
//		if(repo.getMaxKode() !=null) {
//			result = repo.getMaxKode().split("-")[1];
//			result = "PR-" + String.format("%03d", (Integer.parseInt(result) + 1));
//		} else {
//			result = "PR-001";
//		}
//		return result;
//	}

	// list data
	@GetMapping(value = "/index")
	public ModelAndView index() {
		// buat object view
		ModelAndView view = new ModelAndView("lookup/index");
		return view;
	}

	@GetMapping(value = "/list")
	public ModelAndView list() {
		ModelAndView view = new ModelAndView("lookup/list");
		List<LookupModel> listLookup = repo.findAll();
		view.addObject("list", listLookup);
		return view;
	}
	
	// Form Add lookup
	@GetMapping(value = "/add")
	public ModelAndView create() {
		ModelAndView view = new ModelAndView("lookup/create");
//		LookupModel lookup = new LookupModel();
//		lookup.setKdLookup(getKode());
		view.addObject("lookup", new LookupModel());
		return view;
	}

	// save data dari form
	@PostMapping(value = "/save")
	public ModelAndView save(@Valid @ModelAttribute("lookup") LookupModel lookup, BindingResult result) {
		if (result.hasErrors()) {
			logger.info("save lookup error");
		} else {
			repo.save(lookup);
		}
		// jika tidak ada error
		ModelAndView view = new ModelAndView("lookup/create");
		view.addObject("lookup", lookup);
		return view;
	}

	// edit data form
	@GetMapping(value = "/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {
		// buat object view
		ModelAndView view = new ModelAndView("lookup/update");
		// mengambil data dahulu dari database via repository
		LookupModel lookup = repo.findById(id).orElse(new LookupModel());
		// membuat object lookup yg akan dikirim ke view
		// object lookup adalah new object dari LookupModel
		view.addObject("lookup", lookup);
		return view;
	}

	// eksekusi edit data
	@PostMapping(value = "/update")
	public ModelAndView update(@Valid @ModelAttribute("lookup") LookupModel lookup, BindingResult result) {
		if (result.hasErrors()) {
			logger.info("save lookup error");
		} else {
			repo.save(lookup);
		}
		ModelAndView view = new ModelAndView("lookup/update");
		view.addObject("lookup", lookup);
		return view;
	}

	// Form detail
	@GetMapping(value = "/detail/{id}")
	public ModelAndView detail(@PathVariable("id") Long id) {
		ModelAndView view = new ModelAndView("lookup/detail");
		LookupModel lookup = repo.findById(id).orElse(new LookupModel());
		view.addObject("lookup", lookup);
		return view;
	}

	// from delete
	@GetMapping(value = "/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {
		ModelAndView view = new ModelAndView("lookup/delete");
		LookupModel lookup = repo.findById(id).orElse(new LookupModel());
		view.addObject("lookup", lookup);
		return view;
	}

	// eksekusi delete
	@PostMapping(value = "/remove")
	public ModelAndView remove(@ModelAttribute("lookup") LookupModel lookup) {
		ModelAndView view = new ModelAndView();
		// jika tidak ada error
		repo.delete(lookup);
		view.setViewName("lookup/index");
		return new ModelAndView("redirect:/lookup/index");
	}
}