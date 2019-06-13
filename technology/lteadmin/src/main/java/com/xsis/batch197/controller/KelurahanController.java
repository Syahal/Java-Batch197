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

import com.xsis.batch197.model.KecamatanModel;
import com.xsis.batch197.model.KelurahanModel;
import com.xsis.batch197.model.KotaModel;
import com.xsis.batch197.model.ProvinsiModel;
import com.xsis.batch197.repository.KecamatanRepo;
import com.xsis.batch197.repository.KelurahanRepo;
import com.xsis.batch197.repository.KotaRepo;
import com.xsis.batch197.repository.ProvinsiRepo;

@Controller
@RequestMapping(value = "/kelurahan")
public class KelurahanController {
	private static final Logger logger = LoggerFactory.getLogger(KelurahanController.class);

	@Autowired
	private KelurahanRepo kelurahanRepo;

	@Autowired
	private KecamatanRepo repoKec;

//	@Autowired
//	private KotaRepo repoKota;
//
//	@Autowired
//	private ProvinsiRepo repoProp;

	// method untuk generate kode kelurahan automatis
	private String getKode() {
		String result = "";
		if (kelurahanRepo.getMaxKode() != null) {
			result = kelurahanRepo.getMaxKode().split("-")[1];
			result = "KEL-" + String.format("%06d", (Integer.parseInt(result) + 1));
		} else {
			result = "KEL-000001";
		}
		return result;
	}

	// #1. index => list data
	@GetMapping(value = "/index")
	public ModelAndView index() {
		// buat object view
		ModelAndView view = new ModelAndView("kelurahan/index");
		return view;
	}

	// #1. index => list data
	@GetMapping(value = "/list")
	public ModelAndView list() {
		// buat object view
		ModelAndView view = new ModelAndView("kelurahan/list");
		// load data kelurahan via repo, disimpan kedalam list
		List<KelurahanModel> listkelurahan = kelurahanRepo.findAll();
		// lemparkan data ke view, list object baru, datanya listkelurahan
		view.addObject("list", listkelurahan);
		return view;
	}
	
	@GetMapping(value = "/list/{key}")
	public ModelAndView list(@PathVariable("key") String key) {
		// buat object view
		ModelAndView view = new ModelAndView("kelurahan/list");
		// load data kelurahan via repository, lalu disimpan ke dalam list
		List<KelurahanModel> listKelurahan = kelurahanRepo.search(key);
		// lemparkan data ke view, list object baru, datanya listKelurahan
		view.addObject("list", listKelurahan);
		return view;
	}

	// #2. Membuat Form Add kelurahan
	@GetMapping(value = "/add")
	public ModelAndView create() {
		// buat object view
		ModelAndView view = new ModelAndView("kelurahan/create");
		// membuat object kelurahan yg akan dikirim ke view
		// object kelurahan adalah new object dari KelurahanModel
		KelurahanModel kelurahan = new KelurahanModel();
		// isi kdkelurahan dengan method getKode()
		kelurahan.setKdKelurahan(getKode());
		view.addObject("kelurahan", kelurahan);

//		// mengambil data provinsi yang sudah ada
//		List<ProvinsiModel> listProp = repoProp.findAll();
//		// object listProp akan dikirim ke view, agar pilihan ProvinsiId bisa terisi
//		// datanya
//		view.addObject("listProp", listProp);
//
//		// mengambil data kota yang sudah ada berdasarkan provinsi yang sudah dipilih
//		List<KotaModel> listKota = repoKota.findAll();
//		// object listKota akan kita kirim ke view, agar pilihan kotaId bisa terisi
//		// datanya
//		view.addObject("listKota", listKota);

		// mengambil data kecamatan yang sudah ada
		List<KecamatanModel> listKec = repoKec.findAll();
		// object listKec akan kita kirim ke view, agar pilihan kecamatanId bisa terisi
		// datanya
		view.addObject("listKec", listKec);
		return view;
	}

	// #3. Menangkap data dari form
	@PostMapping(value = "/save")
	public ModelAndView save(@Valid @ModelAttribute("kelurahan") KelurahanModel kelurahan, BindingResult result) {
		if (result.hasErrors()) {
			logger.info("save kelurahan error");
		} else {
			kelurahanRepo.save(kelurahan);
		}

		ModelAndView view = new ModelAndView("kelurahan/create");
		view.addObject("kelurahan", kelurahan);
		return view;
	}

	// #2. Membuat Form Add kelurahan
	@GetMapping(value = "/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {
		// buat object view
		ModelAndView view = new ModelAndView("kelurahan/update");
		// mengambil data dahulu dari database via repository
		KelurahanModel kelurahan = kelurahanRepo.findById(id).orElse(new KelurahanModel());
		// membuat object kelurahan yg akan dikirim ke view
		// object kelurahan adalah new object dari KelurahanModel
		view.addObject("kelurahan", kelurahan);

//		// mengambil data propinsi yang sudah ada
//		List<ProvinsiModel> listProp = repoProp.findAll();
//		// object listProp akan kita kirim ke view, agar pilihan provinsiId bisa terisi
//		// datanya
//		view.addObject("listProp", listProp);
//
//		// mengambil data kota yang sudah ada
//		List<KotaModel> listKota = repoKota.findAll();
//		// object listProp akan kita kirim ke view, agar pilihan kotaId bisa terisi
//		// datanya
//		view.addObject("listKota", listKota);

		// mengambil data kecamatan yang sudah ada
		List<KecamatanModel> listKec = repoKec.findAll();
		// object listKec akan kita kirim ke view, agar pilihan kecamatanId bisa terisi
		// datanya
		view.addObject("listKec", listKec);
		return view;
	}

	// #3. Menangkap data dari form
	@PostMapping(value = "/update")
	public ModelAndView update(@Valid @ModelAttribute("kelurahan") KelurahanModel kelurahan, BindingResult result) {
		if (result.hasErrors()) {
			logger.info("save kelurahan error");
		} else {
			kelurahanRepo.save(kelurahan);
		}

		ModelAndView view = new ModelAndView("kelurahan/update");
		view.addObject("kelurahan", kelurahan);
		return view;
	}

	// #4. Membuat Form Add kelurahan
	@GetMapping(value = "/detail/{id}")
	public ModelAndView detail(@PathVariable("id") Long id) {
		// buat object view
		ModelAndView view = new ModelAndView("kelurahan/detail");
		// mengambil data dahulu dari database via repository
		KelurahanModel kelurahan = kelurahanRepo.findById(id).orElse(new KelurahanModel());
		// membuat object kelurahan yg akan dikirim ke view
		// object kelurahan adalah new object dari KelurahanModel
		view.addObject("kelurahan", kelurahan);
		return view;
	}

	// #4. Membuat Form Add kelurahan
	@GetMapping(value = "/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {
		// buat object view
		ModelAndView view = new ModelAndView("kelurahan/delete");
		// mengambil data dahulu dari database via repository
		KelurahanModel kelurahan = kelurahanRepo.findById(id).orElse(new KelurahanModel());
		// membuat object kelurahan yg akan dikirim ke view
		// object kelurahan adalah new object dari KelurahanModel
		view.addObject("kelurahan", kelurahan);
		return view;
	}

	// #3. Menangkap data dari form
	@PostMapping(value = "/remove")
	public ModelAndView remove(@ModelAttribute("kelurahan") KelurahanModel kelurahan) {
		// remove data dari database via repo
		kelurahanRepo.delete(kelurahan);
		// membuat object view
		ModelAndView view = new ModelAndView("kelurahan/delete");
		view.addObject("kelurahan", kelurahan);
		// redirect to index
		return view;
	}
}