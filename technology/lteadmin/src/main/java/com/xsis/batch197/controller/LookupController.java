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
import com.xsis.batch197.repository.LookupRepo;

@Controller
@RequestMapping(value = "/lookup")
public class LookupController {
	private static final Logger logger = LoggerFactory.getLogger(LookupController.class);

	@Autowired
	private LookupRepo lookupRepo;

	// method untukgenerated kode lookup automatis
	private String getKode() {
		String result = "";
		if (lookupRepo.getMaxCode() != null) {
			result = lookupRepo.getMaxCode().split("-")[1];
			result = "LK-" + String.format("%02d", (Integer.parseInt(result) + 1));
		} else {
			result = "LK-01";
		}
		return result;
	}

	// #1. index => list data
	@GetMapping(value = "/index")
	public ModelAndView index() {
		// buat object view
		ModelAndView view = new ModelAndView("lookup/index");
		return view;
	}

	// #1. index => list data
	@GetMapping(value = "/list")
	public ModelAndView list() {
		// buat object view
		ModelAndView view = new ModelAndView("lookup/list");
		// load data lookup via repo, disimpan kedalam list
		List<LookupModel> listlookup = lookupRepo.findAll();
		// lemparkan data ke view, list object baru, datanya listlookup
		view.addObject("list", listlookup);
		return view;
	}

	// #2. Membuat Form Add lookup
	@GetMapping(value = "/add")
	public ModelAndView create() {
		// buat object view
		ModelAndView view = new ModelAndView("lookup/create");
		// membuat object lookup yg akan dikirim ke view
		// object lookup adalah new object dari LookupModel
		LookupModel lookup = new LookupModel();
		// isi kdLookup dengan method getKode()
		lookup.setKdLookup(getKode());
		view.addObject("lookup", lookup);
		return view;
	}

	// #3. Menangkap data dari form Add Lookup
	@PostMapping(value = "/save")
	public ModelAndView save(@Valid @ModelAttribute("lookup") LookupModel lookup, BindingResult result) {
		if (result.hasErrors()) {
			logger.info("save lookup error");
		} else {
			lookupRepo.save(lookup);
		}

		ModelAndView view = new ModelAndView("lookup/create");
		view.addObject("lookup", lookup);
		return view;
	}

	// #2. Membuat Form Edit lookup
	@GetMapping(value = "/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {
		// buat object view
		ModelAndView view = new ModelAndView("lookup/update");
		// mengambil data dahulu dari database via repository
		LookupModel lookup = lookupRepo.findById(id).orElse(new LookupModel());
		// membuat object lookup yg akan dikirim ke view
		// object lookup adalah new object dari LookupModel
		view.addObject("lookup", lookup);
		return view;
	}

	// #3. Menangkap data dari form Edit Lookup
	@PostMapping(value = "/update")
	public ModelAndView update(@Valid @ModelAttribute("lookup") LookupModel lookup, BindingResult result) {
		if (result.hasErrors()) {
			logger.info("save lookup error");
		} else {
			lookupRepo.save(lookup);
		}

		ModelAndView view = new ModelAndView("lookup/update");
		view.addObject("lookup", lookup);
		return view;
	}

	// #4. Membuat Form Detail lookup
	@GetMapping(value = "/detail/{id}")
	public ModelAndView detail(@PathVariable("id") Long id) {
		// buat object view
		ModelAndView view = new ModelAndView("lookup/detail");
		// mengambil data dahulu dari database via repository
		LookupModel lookup = lookupRepo.findById(id).orElse(new LookupModel());
		// membuat object lookup yg akan dikirim ke view
		// object lookup adalah new object dari LookupModel
		view.addObject("lookup", lookup);
		return view;
	}

	// #4. Membuat Form Delete lookup
	@GetMapping(value = "/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {
		// buat object view
		ModelAndView view = new ModelAndView("lookup/delete");
		// mengambil data dahulu dari database via repository
		LookupModel lookup = lookupRepo.findById(id).orElse(new LookupModel());
		// membuat object lookup yg akan dikirim ke view
		// object lookup adalah new object dari LookupModel
		view.addObject("lookup", lookup);
		return view;
	}

	// #3. Menangkap data dari form Delete lookup
	@PostMapping(value = "/remove")
	public ModelAndView remove(@ModelAttribute("lookup") LookupModel lookup) {
		// remove data dari database via repo
		lookupRepo.delete(lookup);
		// membuat object view
		ModelAndView view = new ModelAndView("lookup/delete");
		view.addObject("lookup", lookup);
		// redirect to index
		return view;
	}
}