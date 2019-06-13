package com.xsis.batch197.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="tbl_biodata")
public class BiodataModel {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE, generator="biodata_idx")
	@TableGenerator(name="biodata_idx", table="tbl_index", pkColumnName="index_id", valueColumnName="index_value", initialValue=0, allocationSize=1)
	@Column(name="id")
	private Long id;
	
	@NotBlank
	@NotEmpty
	@Column(name="nik", length=20, nullable=false)
	private String nik;
	
	@NotBlank
	@NotEmpty
	@Column(name="nama", length=100, nullable=false)
	private String nama;
	
	@NotBlank
	@NotEmpty
	@Column(name="alamat", length=100, nullable=false)
	private String alamat;
	
	@NotNull
	@Column(name="kelurahan_id", length=100, nullable=false)
	private Integer kelurahanId;
	
	@NotNull
	@Column(name="kecamatan_id", length=100, nullable=false)
	private Integer kecamatanId;
	
	@NotNull
	@Column(name="kota_id", length=100, nullable=false)
	private Integer kotaId;
	
	@NotNull
	@Column(name="provinsi_id", length=100, nullable=false)
	private Integer provinsiId;
	
	@NotNull
	@Column(name="jk", length=10, nullable=false)
	private String jk;
	
	@NotBlank
	@NotEmpty
	@Column(name="tpt_lahir", length=100, nullable=false)
	private String tptLahir;
	
	@NotBlank
	@NotEmpty
	@Column(name="tgl_lahir", nullable=false)
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date tglLahir;
	
	@NotNull
	@Column(name="agama", length=20, nullable=false)
	private String agama;
	
	@NotNull
	@Column(name="gol_darah", length=2, nullable=false)
	private String golDarah;
	
	@NotNull
	@Column(name="status_nikah", length=10, nullable=false)
	private String statusNikah;
	
	@NotNull
	@Column(name="warga_negara", length=5, nullable=false)
	private String wargaNegara;
	
	@ManyToOne
	@JoinColumn(name="provinsi_id", foreignKey = @ForeignKey(name="fk_bio_prop"), updatable=false, insertable=false)
	private ProvinsiModel provinsi;
	
	@ManyToOne
	@JoinColumn(name="kota_id", foreignKey = @ForeignKey(name="fk_bio_kota"), updatable=false, insertable=false)
	private KotaModel kota;
	
	@ManyToOne
	@JoinColumn(name="kecamatan_id", foreignKey = @ForeignKey(name="fk_bio_kec"), updatable=false, insertable=false)
	private KecamatanModel kecamatan;

	@ManyToOne
	@JoinColumn(name="kelurahan_id", foreignKey = @ForeignKey(name="fk_bio_kel"), updatable=false, insertable=false)
	private KelurahanModel kelurahan;
	
	@ManyToOne
	@JoinColumn(name="lookup_id", foreignKey = @ForeignKey(name="fk_bio_look"), updatable=false, insertable=false)
	private LookupModel lookup;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNik() {
		return nik;
	}

	public void setNik(String nik) {
		this.nik = nik;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public Integer getKelurahanId() {
		return kelurahanId;
	}

	public void setKelurahanId(Integer kelurahanId) {
		this.kelurahanId = kelurahanId;
	}

	public Integer getKecamatanId() {
		return kecamatanId;
	}

	public void setKecamatanId(Integer kecamatanId) {
		this.kecamatanId = kecamatanId;
	}

	public Integer getKotaId() {
		return kotaId;
	}

	public void setKotaId(Integer kotaId) {
		this.kotaId = kotaId;
	}

	public Integer getProvinsiId() {
		return provinsiId;
	}

	public void setProvinsiId(Integer provinsiId) {
		this.provinsiId = provinsiId;
	}

	public String getJk() {
		return jk;
	}

	public void setJk(String jk) {
		this.jk = jk;
	}

	public String getTptLahir() {
		return tptLahir;
	}

	public void setTptLahir(String tptLahir) {
		this.tptLahir = tptLahir;
	}

	public Date getTglLahir() {
		return tglLahir;
	}

	public void setTglLahir(Date tglLahir) {
		this.tglLahir = tglLahir;
	}

	public String getAgama() {
		return agama;
	}

	public void setAgama(String agama) {
		this.agama = agama;
	}

	public String getGolDarah() {
		return golDarah;
	}

	public void setGolDarah(String golDarah) {
		this.golDarah = golDarah;
	}

	public String getStatusNikah() {
		return statusNikah;
	}

	public void setStatusNikah(String statusNikah) {
		this.statusNikah = statusNikah;
	}

	public String getWargaNegara() {
		return wargaNegara;
	}

	public void setWargaNegara(String wargaNegara) {
		this.wargaNegara = wargaNegara;
	}
	
	public ProvinsiModel getProvinsi() {
		return provinsi;
	}

	public void setProvinsi(ProvinsiModel provinsi) {
		this.provinsi = provinsi;
	}

	public KotaModel getKota() {
		return kota;
	}

	public void setKota(KotaModel kota) {
		this.kota = kota;
	}

	public KecamatanModel getKecamatan() {
		return kecamatan;
	}

	public void setKecamatan(KecamatanModel kecamatan) {
		this.kecamatan = kecamatan;
	}

	public KelurahanModel getKelurahan() {
		return kelurahan;
	}

	public void setKelurahan(KelurahanModel kelurahan) {
		this.kelurahan = kelurahan;
	}

	public LookupModel getLookup() {
		return lookup;
	}

	public void setLookup(LookupModel lookup) {
		this.lookup = lookup;
	}
}