package com.xsis.batch197.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xsis.batch197.model.BobotnilaiModel;
import com.xsis.batch197.repository.BobotnilaiRepo;

@Controller
public class BobotnilaiController {
	
	@Autowired
	private BobotnilaiRepo bobotNilaiRepo;
	
	@RequestMapping(value ="/bobotnilai/homeBobot")
	public String index() {
		return"/bobotnilai/homeBobot";
	}
	
	@RequestMapping(value = "/bobotnilai/simpanBobot")
	public String save(@ModelAttribute BobotnilaiModel bobotnilai) {
		bobotNilaiRepo.save(bobotnilai);
		return "redirect:/bobotnilai/daftarBobot";
	}
	
	@RequestMapping(value = "/bobotnilai/daftarBobot")
	public String list(Model kirim) {
		List<BobotnilaiModel> bobotnilaiList = bobotNilaiRepo.findAll();
		kirim.addAttribute("bobotnilaiList", bobotnilaiList);
		return "bobotnilai/daftarBobot";
	}
	
	@RequestMapping(value = "/bobotnilai/editBobot/{id}")
	public String edit(Model kirim, @PathVariable(name = "id") Integer id) {
		BobotnilaiModel bobotnilaiEdit = bobotNilaiRepo.findById(id).orElse(null);
		kirim.addAttribute("bobotnilaiEdit", bobotnilaiEdit);
		return "bobotnilai/editBobot";
	}
	
	@RequestMapping(value = "/bobotnilai/hapusBobot/{id}")
	public String hapus(@PathVariable(name = "id") Integer id) {
		BobotnilaiModel bobotnilaiEdit = bobotNilaiRepo.findById(id).orElse(null);
		bobotNilaiRepo.delete(bobotnilaiEdit);
		return "redirect:/bobotnilai/daftarBobot";
	}
}
