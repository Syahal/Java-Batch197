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
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tbl_kelurahan")
public class KelurahanModel {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "kelurahan_idx")
	@TableGenerator(name = "kelurahan_idx", table = "tbl_index", pkColumnName = "index_id", valueColumnName = "index_value", initialValue = 0, allocationSize = 1)
	@Column(name = "id")
	private Long id;

	@NotNull
	@NotEmpty
	@NotBlank
	@Column(name = "kd_kelurahan", nullable = false, length = 10)
	private String kdKelurahan;

	@NotNull
	@NotEmpty
	@NotBlank
	@Column(name = "nm_kelurahan", nullable = false, length = 120)
	private String nmKelurahan;
	
//	@NotNull
//	@Column(name = "provinsi_id", nullable = false)
//	private Long provinsiId;
//
//	@NotNull
//	@Column(name = "kota_id", nullable = false)
//	private Long kotaId;

	@NotNull
	@Column(name = "kecamatan_id", nullable = false)
	private Long kecamatanId;
	
//	@ManyToOne
//	@JoinColumn(name = "provinsi_id", foreignKey = @ForeignKey(name = "fk_kel_prop"), updatable = false, insertable = false)
//	private ProvinsiModel provinsi;
//
//	@ManyToOne
//	@JoinColumn(name = "kota_id", foreignKey = @ForeignKey(name = "fk_kel_kota"), updatable = false, insertable = false)
//	private KotaModel kota;

	@ManyToOne
	@JoinColumn(name = "kecamatan_id", foreignKey = @ForeignKey(name = "fk_kel_kec"), updatable = false, insertable = false)
	private KecamatanModel kecamatan;
	
	@OneToMany(mappedBy = "kelurahan")
	private List<BiodataModel> listBiodata = new ArrayList<BiodataModel>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getKdKelurahan() {
		return kdKelurahan;
	}

	public void setKdKelurahan(String kdKelurahan) {
		this.kdKelurahan = kdKelurahan;
	}

	public String getNmKelurahan() {
		return nmKelurahan;
	}

	public void setNmKelurahan(String nmKelurahan) {
		this.nmKelurahan = nmKelurahan;
	}

//	public Long getProvinsiId() {
//		return provinsiId;
//	}
//
//	public void setProvinsiId(Long provinsiId) {
//		this.provinsiId = provinsiId;
//	}
//
//	public Long getKotaId() {
//		return kotaId;
//	}
//
//	public void setKotaId(Long kotaId) {
//		this.kotaId = kotaId;
//	}
//
//	public ProvinsiModel getProvinsi() {
//		return provinsi;
//	}
//
//	public void setProvinsi(ProvinsiModel provinsi) {
//		this.provinsi = provinsi;
//	}
//
//	public KotaModel getKota() {
//		return kota;
//	}
//
//	public void setKota(KotaModel kota) {
//		this.kota = kota;
//	}

	public Long getKecamatanId() {
		return kecamatanId;
	}

	public void setKecamatanId(Long kecamatanId) {
		this.kecamatanId = kecamatanId;
	}

	public KecamatanModel getKecamatan() {
		return kecamatan;
	}

	public void setKecamatan(KecamatanModel kecamatan) {
		this.kecamatan = kecamatan;
	}

	public List<BiodataModel> getListBiodata() {
		return listBiodata;
	}

	public void setListBiodata(List<BiodataModel> listBiodata) {
		this.listBiodata = listBiodata;
	}
	
}