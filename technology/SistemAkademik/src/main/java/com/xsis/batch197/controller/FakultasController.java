package com.xsis.batch197.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xsis.batch197.model.FakultasModel;
import com.xsis.batch197.repository.FakultasRepo;

@Controller
public class FakultasController {

	@Autowired
	private FakultasRepo fakultasRepo;

	@RequestMapping(value = "/fakultas/homeFakultas")
	public String fakultas() {
		return "/fakultas/homeFakultas";
	}

	@RequestMapping(value = "/fakultas/simpanFakultas")
	public String save(@ModelAttribute FakultasModel fakultas) {
		fakultasRepo.save(fakultas);
		return "redirect:/fakultas/daftarFakultas";
	}

	@RequestMapping(value = "/fakultas/daftarFakultas")
	public String list(Model kirim) {
		List<FakultasModel> fakultasList = fakultasRepo.findAll(); // object fakultasList bertipe data list
		kirim.addAttribute("fakultasList", fakultasList);
		return "fakultas/daftarFakultas";
	}

	@RequestMapping(value = "/fakultas/editFakultas/{id}")
	public String edit(Model kirim, @PathVariable(name = "id") Integer id) {
		FakultasModel fakultasEdit = fakultasRepo.findById(id).orElse(null);
		kirim.addAttribute("fakultasEdit", fakultasEdit);
		return "fakultas/editFakultas";
	}

	@RequestMapping(value = "/fakultas/hapusFakultas/{id}")
	public String hapus(@PathVariable(name = "id") Integer id) {
		FakultasModel fakultasHapus = fakultasRepo.findById(id).orElse(null);
		fakultasRepo.delete(fakultasHapus);
		return "redirect:/fakultas/daftarFakultas";
	}
}
