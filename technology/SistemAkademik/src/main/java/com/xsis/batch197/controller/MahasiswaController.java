package com.xsis.batch197.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xsis.batch197.model.JurusanModel;
import com.xsis.batch197.model.MahasiswaModel;
import com.xsis.batch197.repository.JurusanRepo;
import com.xsis.batch197.repository.MahasiswaRepo;

@Controller
public class MahasiswaController {

	@Autowired
	private MahasiswaRepo mahasiswaRepo;

	@Autowired
	private JurusanRepo JurusanRepo;

	@RequestMapping(value = "/mahasiswa/homeMahasiswa")
	public String index(Model jurusan) {
		List<JurusanModel> listJurusan = JurusanRepo.findAll();
		jurusan.addAttribute("listJurusan", listJurusan);
		return "mahasiswa/homeMahasiswa";
	}

	@RequestMapping(value = "/mahasiswa/simpanMahasiswa")
	public String save(@ModelAttribute MahasiswaModel mahasiswa) {
		mahasiswaRepo.save(mahasiswa);
		return "redirect:/mahasiswa/daftarMahasiswa";
	}

	@RequestMapping(value = "/mahasiswa/daftarMahasiswa")
	public String list(Model kirim) {
		List<MahasiswaModel> listMhs = mahasiswaRepo.findAll();
		kirim.addAttribute("listMhs", listMhs);
		return "mahasiswa/daftarMahasiswa";
	}

	@RequestMapping(value = "/mahasiswa/editMahasiswa/{id}")
	public String edit(Model kirim, @PathVariable(name = "id") Integer id) {
		MahasiswaModel mahasiswaEdit = mahasiswaRepo.findById(id).orElse(null);
		kirim.addAttribute("mahasiswaEdit", mahasiswaEdit);
		
		List<JurusanModel> listJurusan = JurusanRepo.findAll();
		kirim.addAttribute("listJurusan", listJurusan);
		return "mahasiswa/editMahasiswa";
	}

	@RequestMapping(value = "/mahasiswa/hapusMahasiswa/{id}")
	public String hapus(@PathVariable(name = "id") Integer id) {
		MahasiswaModel mahasiswaEdit = mahasiswaRepo.findById(id).orElse(null);
		mahasiswaRepo.delete(mahasiswaEdit);
		return "redirect:/mahasiswa/daftarMahasiswa";
	}

}
