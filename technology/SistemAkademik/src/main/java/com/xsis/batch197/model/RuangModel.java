package com.xsis.batch197.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "ruang")
public class RuangModel {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "ruang_seq")
	@TableGenerator(name = "ruang_seq", table = "tbl_sequences", pkColumnName = "seq_id", valueColumnName = "seq_value", initialValue = 0, allocationSize = 1)

	@Column(name = "id")
	private int id;

	@Column(name = "kd_ruang", length = 10)
	private String kdRuang;

	@Column(name = "nm_ruang", length = 20)
	private String nmRuang;

	@Column(name = "kapasitas", length = 10)
	private String kapasitas;
	
	@OneToMany(mappedBy = "ruang")
	private List<KelasModel> listKelas = new ArrayList<KelasModel>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKdRuang() {
		return kdRuang;
	}

	public void setKdRuang(String kdRuang) {
		this.kdRuang = kdRuang;
	}

	public String getNmRuang() {
		return nmRuang;
	}

	public void setNmRuang(String nmRuang) {
		this.nmRuang = nmRuang;
	}

	public String getKapasitas() {
		return kapasitas;
	}

	public void setKapasitas(String kapasitas) {
		this.kapasitas = kapasitas;
	}
	
	public List<KelasModel> getListKelas() {
		return listKelas;
	}

	public void setListKelas(List<KelasModel> listKelas) {
		this.listKelas = listKelas;
	}

}
