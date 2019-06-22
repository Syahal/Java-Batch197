package com.xsis.batch197.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xsis.batch197.model.ProvinsiModel;
import com.xsis.batch197.repositroy.ProvinsiRepo;

@Controller
@RequestMapping(value = "/provinsi")
public class ProvinsiController {
	private static final Logger logger = LoggerFactory.getLogger(ProvinsiController.class);

	@Autowired
	private ProvinsiRepo repo;

	private String getKode() {
		String result = "";
		if (repo.getMaxKode() != null) {
			result = repo.getMaxKode().split("-")[1];
			result = "PR-" + String.format("%03d", (Integer.parseInt(result) + 1));
		} else {
			result = "PR-001";
		}
		return result;
	}

	@GetMapping(value = "/index")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView("provinsi/index");
		return view;
	}

	@GetMapping(value = "/list")
	public ModelAndView list() {
		ModelAndView view = new ModelAndView("provinsi/list");
		List<ProvinsiModel> listProvinsi = repo.findAll(Sort.by("nmProvinsi"));
		view.addObject("list", listProvinsi);
		return view;
	}

	@GetMapping(value = "/list/{key}")
	public ModelAndView list(@PathVariable("key") String key) {
		// buat object view
		ModelAndView view = new ModelAndView("provinsi/list");
		// load data provinsi via repo, disimpan kedalam list
		List<ProvinsiModel> listprovinsi = repo.search(key);
		// lemparkan data ke view, list object baru, datanya listprovinsi
		view.addObject("list", listprovinsi);
		return view;
	}

	@GetMapping(value = "/add")
	public ModelAndView create() {
		ModelAndView view = new ModelAndView("provinsi/create");
		ProvinsiModel provinsi = new ProvinsiModel();
		provinsi.setKdProvinsi(getKode());
		view.addObject("provinsi", provinsi);
		return view;
	}

	@PostMapping(value = "/save")
	public ModelAndView save(@Valid @ModelAttribute("provinsi") ProvinsiModel provinsi, BindingResult result) {
		if (result.hasErrors()) {
			logger.info("save provinsi error");
		} else {
			repo.save(provinsi);
		}
		ModelAndView view = new ModelAndView("provinsi/create");
		view.addObject("provinsi", provinsi);
		return view;
	}

	@GetMapping(value = "/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {
		ModelAndView view = new ModelAndView("provinsi/update");
		ProvinsiModel provinsi = repo.findById(id).orElse(new ProvinsiModel());
		view.addObject("provinsi", provinsi);
		return view;
	}

	@PostMapping(value = "/update")
	public ModelAndView update(@Valid @ModelAttribute("provinsi") ProvinsiModel provinsi, BindingResult result) {
		if (result.hasErrors()) {
			logger.info("save provinsi error");
		} else {
			repo.save(provinsi);
		}

		ModelAndView view = new ModelAndView("provinsi/update");
		view.addObject("provinsi", provinsi);
		return view;
	}

	@GetMapping(value = "/detail/{id}")
	public ModelAndView detail(@PathVariable("id") Long id) {
		ModelAndView view = new ModelAndView("provinsi/detail");
		ProvinsiModel provinsi = repo.findById(id).orElse(new ProvinsiModel());
		view.addObject("provinsi", provinsi);
		return view;
	}

	@GetMapping(value = "/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {
		ModelAndView view = new ModelAndView("provinsi/delete");
		ProvinsiModel provinsi = repo.findById(id).orElse(new ProvinsiModel());
		view.addObject("provinsi", provinsi);
		return view;
	}

	@PostMapping(value = "/remove")
	public ModelAndView remove(@ModelAttribute("provinsi") ProvinsiModel provinsi) {
		repo.delete(provinsi);
		ModelAndView view = new ModelAndView("provinsi/delete");
		view.addObject("provinsi", provinsi);
		return view;
	}
}