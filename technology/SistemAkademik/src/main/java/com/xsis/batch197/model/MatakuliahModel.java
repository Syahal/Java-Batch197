package com.xsis.batch197.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "matakuliah")
public class MatakuliahModel {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "matakuliah_seq")
	@TableGenerator(name = "matakuliah_seq", table = "tbl_sequences", pkColumnName = "seq_id", valueColumnName = "seq_value", initialValue = 0, allocationSize = 1)

	@Column(name = "id")
	private int id;

	@Column(name = "kd_mk", length = 10)
	private String kdMk;

	@Column(name = "nm_mk", length = 50)
	private String nmMk;

	@Column(name = "sks")
	private String Sks;

	@Column(name = "jurusan_id")
	private int jurusanId;
	
	@Column(name = "kelas_id")
	private int kelasId;

	@ManyToOne
	@JoinColumn(name = "jurusan_id", foreignKey = @ForeignKey(name = "fk_matakuliah_jurusan"), insertable = false, updatable = false)
	private JurusanModel jurusan;
	
	@ManyToOne
	@JoinColumn(name = "kelas_id", foreignKey = @ForeignKey(name = "fk_matakuliah_kelas"), insertable = false, updatable = false)
	private KelasModel kelas;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKdMk() {
		return kdMk;
	}

	public void setKdMk(String kdMk) {
		this.kdMk = kdMk;
	}

	public String getNmMk() {
		return nmMk;
	}

	public void setNmMk(String nmMk) {
		this.nmMk = nmMk;
	}
	
	public String getSks() {
		return Sks;
	}

	public void setSks(String sks) {
		Sks = sks;
	}

	public int getJurusanId() {
		return jurusanId;
	}

	public void setJurusanId(int jurusanId) {
		this.jurusanId = jurusanId;
	}

	public JurusanModel getJurusan() {
		return jurusan;
	}

	public void setJurusan(JurusanModel jurusan) {
		this.jurusan = jurusan;
	}

	public int getKelasId() {
		return kelasId;
	}

	public void setKelasId(int kelasId) {
		this.kelasId = kelasId;
	}

	public KelasModel getKelas() {
		return kelas;
	}

	public void setKelas(KelasModel kelas) {
		this.kelas = kelas;
	}
	
}