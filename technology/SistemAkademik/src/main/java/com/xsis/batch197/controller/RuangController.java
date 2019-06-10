package com.xsis.batch197.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xsis.batch197.model.RuangModel;
import com.xsis.batch197.repository.RuangRepo;

@Controller
public class RuangController {

	@Autowired
	private RuangRepo ruangRepo;

	@RequestMapping(value = "/ruang/homeRuang")
	public String index() {
		return "/ruang/homeRuang";
	}

	@RequestMapping(value = "/ruang/simpanRuang")
	public String save(@ModelAttribute RuangModel ruang) {
		ruangRepo.save(ruang);
		return "redirect:/ruang/daftarRuang";
	}

	@RequestMapping(value = "/ruang/daftarRuang")
	public String daftarRuang(Model kirim) {
		List<RuangModel> ruangList = ruangRepo.findAll();
		kirim.addAttribute("ruangList", ruangList);
		return "ruang/daftarRuang";
	}

	@RequestMapping(value = "/ruang/editRuang/{id}")
	public String editRuang(Model kirim, @PathVariable(name = "id") Integer id) {
		RuangModel editRuang = ruangRepo.findById(id).orElse(null);
		kirim.addAttribute("editRuang", editRuang);
		return "ruang/editRuang";
	}
	
	@RequestMapping(value = "/ruang/hapusRuang/{id}")
	public String hapusRuang(@PathVariable(name = "id") Integer id) {
		RuangModel hapusRuang = ruangRepo.findById(id).orElse(null);
		ruangRepo.delete(hapusRuang);
		return "redirect:/ruang/daftarRuang";
	}
}
