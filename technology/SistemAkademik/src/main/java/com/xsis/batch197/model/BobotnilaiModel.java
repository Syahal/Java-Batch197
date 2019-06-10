package com.xsis.batch197.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="bobotnilai")
public class BobotnilaiModel {
	@Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "bobotnilai_seq")
    @TableGenerator(name = "bobotnilai_seq", table = "tbl_sequences", pkColumnName = "seq_id", valueColumnName = "seq_value", initialValue = 0, allocationSize = 1)
    
	@Column(name = "id")
    private int id;
	
	@Column(name="nilai", length = 10)
	private String nilai;
	
	@Column(name="bobot",length=10)
	private int bobotNilai;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNilai() {
		return nilai;
	}

	public void setNilai(String nilai) {
		this.nilai = nilai;
	}

	public int getBobotNilai() {
		return bobotNilai;
	}

	public void setBobotNilai(int bobotNilai) {
		this.bobotNilai = bobotNilai;
	}


	
}
