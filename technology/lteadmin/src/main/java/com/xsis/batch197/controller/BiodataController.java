package com.xsis.batch197.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xsis.batch197.model.BiodataModel;
import com.xsis.batch197.model.KecamatanModel;
import com.xsis.batch197.model.KelurahanModel;
import com.xsis.batch197.model.KotaModel;
import com.xsis.batch197.model.LookupModel;
import com.xsis.batch197.model.ProvinsiModel;
import com.xsis.batch197.repository.BiodataRepo;
import com.xsis.batch197.repository.KecamatanRepo;
import com.xsis.batch197.repository.KelurahanRepo;
import com.xsis.batch197.repository.KotaRepo;
import com.xsis.batch197.repository.LookupRepo;
import com.xsis.batch197.repository.ProvinsiRepo;

@Controller
@RequestMapping(value = "/biodata")
public class BiodataController {

	private static final Logger logger = LoggerFactory.getLogger(BiodataController.class);

	@Autowired
	private BiodataRepo bioRepo;

	@Autowired
	private ProvinsiRepo provRepo;

	@Autowired
	private KotaRepo kotaRepo;

	@Autowired
	private KecamatanRepo kecRepo;

	@Autowired
	private KelurahanRepo kelRepo;

	@Autowired
	private LookupRepo lookRepo;

	// #1. index => list data
	@GetMapping(value = "/index")
	public ModelAndView index() {

		// buat object view
		ModelAndView view = new ModelAndView("biodata/index");
		return view;
	}

	// #1. index => list data
	@GetMapping(value = "/list")
	public ModelAndView list() {
		// buat object view
		ModelAndView view = new ModelAndView("biodata/list");
		// load data provinsi via repository, lalu simpan ke dalam list
		List<BiodataModel> listBio = bioRepo.findAll(Sort.by("nama"));
		// lempar data ke view, list itu object baru, datanya itu listBio
		view.addObject("list", listBio);
		return view;
	}

	// method untuk search menu
	@GetMapping(value = "/list/{key}")
	public ModelAndView list(@PathVariable("key") String key) {
		// buat object view
		ModelAndView view = new ModelAndView("biodata/list");
		// load data biodata via repository, lalu simpan ke dalam list
		List<BiodataModel> listBio = bioRepo.search(key);
		// lemparkan data ke view, list itu object baru, datanya listBio
		view.addObject("list", listBio);
		return view;
	}

	// #2. Membuat form Add Biodata
	@GetMapping(value = "/add")
	public ModelAndView create() {
		// buat object view
		ModelAndView view = new ModelAndView("biodata/create");
		// membuat object biodata yang akan dikirim ke view
		// object biodata adalah new object dari BiodataModel
		view.addObject("biodata", new BiodataModel());

		// mengambil data provinsi yang sudah ada
		List<ProvinsiModel> listProv = provRepo.findAll();
		// object listProv akan kita kirim ke view, agar pilihan provId bisa terisi
		// datanya
		view.addObject("listProv", listProv);

		// mengambil data kota yang sudah ada
		List<KotaModel> listKota = kotaRepo.findAll();
		// object listKota akan kita kirim ke view, agar pilihan kotaId bisa terisi
		// datanya
		view.addObject("listKota", listKota);

		// mengambil data kecamatan yang sudah ada
		List<KecamatanModel> listKec = kecRepo.findAll();
		// object listKec akan kita kirim ke view, agar pilihan kecId bisa terisi
		// datanya
		view.addObject("listKec", listKec);

		// mengambil data kelurahan yang sudah ada
		List<KelurahanModel> listKel = kelRepo.findAll();
		// object listKel akan kita kirim ke view, agar pilihan kelId bisa terisi
		// datanya
		view.addObject("listKel", listKel);

		// mengambil data lookup yang sudah ada
		List<LookupModel> listLookup = lookRepo.findAll();
		// object listLookup akan kita kirim ke view, agar pilihan lookupId bisa terisi
		// datanya
		view.addObject("listLookup", listLookup);
		return view;
	}
	
	@PostMapping(value="/save")
	public ModelAndView save(@Valid @ModelAttribute("biodata") BiodataModel biodata, BindingResult result) {
		if(result.hasErrors()) {
			logger.info("Save Biodata Error");
		} else {
			bioRepo.save(biodata);
		}
		
		ModelAndView view = new ModelAndView("biodata/create");
		view.addObject("biodata", biodata);
		return view;
	}
}
