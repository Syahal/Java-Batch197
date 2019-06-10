package com.xsis.batch197.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xsis.batch197.model.KelasModel;
import com.xsis.batch197.repository.KelasRepo;

@Controller
public class KelasController {

	@Autowired
	private KelasRepo kelasRepo;
	
	@RequestMapping(value="/kelas/homeKelas")
	public String index() {
		return "/kelas/homeKelas";
	}
	
	@RequestMapping(value="/kelas/simpanKelas")
	public String save(@ModelAttribute KelasModel kelas) {
		kelasRepo.save(kelas);
		return "redirect:/kelas/daftarKelas";
	}
	
	@RequestMapping(value="/kelas/daftarKelas")
	public String daftarKelas(Model kirim) {
		List<KelasModel> listKelas = kelasRepo.findAll();
		kirim.addAttribute("listKelas", listKelas);
		return "kelas/daftarKelas";
	}
	
	@RequestMapping(value="/kelas/editKelas/{id}")
	public String editKelas(Model kirim, @PathVariable(name="id") Integer id) {
		KelasModel editKelas=kelasRepo.findById(id).orElse(null);
		kirim.addAttribute("editKelas", editKelas);
		return"kelas/editKelas";
	}
	
	@RequestMapping(value="/kelas/hapusKelas/{id}")
	public String hapusKelas(@PathVariable(name="id") Integer id) {
		KelasModel hapusKelas = kelasRepo.findById(id).orElse(null);
		kelasRepo.delete(hapusKelas);
		return "redirect:/kelas/daftarKelas";
	}
}
