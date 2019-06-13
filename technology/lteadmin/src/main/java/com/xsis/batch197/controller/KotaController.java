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

import com.xsis.batch197.model.KotaModel;
import com.xsis.batch197.model.ProvinsiModel;
import com.xsis.batch197.repository.KotaRepo;
import com.xsis.batch197.repository.ProvinsiRepo;

@Controller
@RequestMapping(value = "/kota")
public class KotaController {

	private static final Logger logger = LoggerFactory.getLogger(KotaController.class);

	@Autowired
	private KotaRepo kotaRepo;

	@Autowired
	private ProvinsiRepo repoProp;

	// method untuk generate kode kota automatis
	private String getKode() {
		String result = "";
		if (kotaRepo.getMaxKode() != null) {
			result = kotaRepo.getMaxKode().split("-")[1];
			result = "KT-" + String.format("%04d", (Integer.parseInt(result) + 1));
		} else {
			result = "KT-0001";
		}
		return result;
	}

	// #1. index => list data
	@GetMapping(value = "/index")
	public ModelAndView index() {
		// buat object view
		ModelAndView view = new ModelAndView("kota/index");
		return view;
	}

	// #1. index => list data
	@GetMapping(value = "/list")
	public ModelAndView list() {
		// buat object view
		ModelAndView view = new ModelAndView("kota/list");
		// load data provinsi via repository, lalu disimpan ke dalam list
		List<KotaModel> list = kotaRepo.findAll();
		// lempar data ke view, list object baru, datanya itu listkota
		view.addObject("list", list);
		return view;
	}
	
	@GetMapping(value = "/list/{key}")
	public ModelAndView list(@PathVariable("key") String key) {
		// buat object view
		ModelAndView view = new ModelAndView("kota/list");
		// load data provinsi via repository, lalu disimpan ke dalam list
		List<KotaModel> listKota = kotaRepo.search(key);
		// lemparkan data ke view, list object baru, datanya listProvinsi
		view.addObject("list", listKota);
		return view;
	}

	// #2. Membuat form Add Kota
	@GetMapping(value = "/add")
	public ModelAndView create() {
		// buat object view
		ModelAndView view = new ModelAndView("kota/create");
		// buat object kota yang akan dikirim ke view
		// object kota adalah new object dari KotaModel
		KotaModel kota = new KotaModel();
		// isi kdKota dengan method getKode()
		kota.setKdKota(getKode());
		view.addObject("kota", kota);

		// mengambil data provinsi yang sudah ada
		List<ProvinsiModel> listProp = repoProp.findAll();
		// object listProp akan dikirim ke view, agar pilihan ProvinsiId bisa terisi
		// datanya
		view.addObject("listProp", listProp);
		return view;
	}

	// #3. menangkap data dari form Add Kota
	@PostMapping(value = "/save")
	public ModelAndView save(@Valid @ModelAttribute("kota") KotaModel kota, BindingResult result) {
		if (result.hasErrors()) {
			logger.info("save kota error");
		} else {
			kotaRepo.save(kota);
		}

		ModelAndView view = new ModelAndView("kota/create");
		view.addObject("kota", kota);
		return view;
	}

	// #2. Membuat form Edit Kota
	@GetMapping(value = "/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {
		// buat object view
		ModelAndView view = new ModelAndView("kota/update");
		// mengambil data dahulu dari database via repository
		KotaModel kota = kotaRepo.findById(id).orElse(new KotaModel());
		// membuat object kota yg akan dikirim ke view
		// object kota adalah new object dari KotaModel
		view.addObject("kota", kota);

		// mengambil data propinsi yang sudah ada
		List<ProvinsiModel> listProp = repoProp.findAll();
		// object listProp akan kita kirim ke view, agar pilihan provinsiId bisa terisi
		// datanya
		view.addObject("listProp", listProp);
		return view;
	}

	// #3. menangkap data dari form Edit Kota
	@PostMapping(value = "/update")
	public ModelAndView update(@Valid @ModelAttribute("kota") KotaModel kota, BindingResult result) {
		if (result.hasErrors()) {
			logger.info("save kota error");
		} else {
			kotaRepo.save(kota);
		}

		ModelAndView view = new ModelAndView("kota/update");
		view.addObject("kota", kota);
		return view;
	}

	// #4. Membuat form Detail kota
	@GetMapping(value = "/detail/{id}")
	public ModelAndView detail(@PathVariable("id") Long id) {
		// buat object view
		ModelAndView view = new ModelAndView("kota/detail");
		// mengambil data dahulu dari database via repository
		KotaModel kota = kotaRepo.findById(id).orElse(new KotaModel());
		// membuat object kota yg akan dikirim ke view
		// object kota adalah new object dari KotaModel
		view.addObject("kota", kota);
		return view;
	}

	// #4. Membuat form Delete Kota
	@GetMapping(value = "/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {
		// buat object view
		ModelAndView view = new ModelAndView("kota/delete");
		// mengambil data dahulu dari database via repository
		KotaModel kota = kotaRepo.findById(id).orElse(new KotaModel());
		// membuat object kota yg akan dikirim ke view
		// object kota adalah new object dari KotaModel
		view.addObject("kota", kota);
		return view;
	}

	// #3. Menangkap data dari form Delete Kota
	@PostMapping(value = "/remove")
	public ModelAndView remove(@ModelAttribute("kota") KotaModel kota) {
		// remove data dari database via repo
		kotaRepo.delete(kota);
		// membuat object view
		ModelAndView view = new ModelAndView("kota/create");
		// redirect to index
		return view;
	}
}
