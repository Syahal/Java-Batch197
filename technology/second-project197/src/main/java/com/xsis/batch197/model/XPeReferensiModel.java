package com.xsis.batch197.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="x_pe_referensi")
public class XPeReferensiModel extends BaseModel{
	@Id

	@GeneratedValue(strategy = GenerationType.TABLE, generator = "x_pe_referensi_idx")
	@TableGenerator(name = "x_pe_referensi_idx", table = "tbl_index", pkColumnName = "index_id", valueColumnName = "index_value", initialValue = 0, allocationSize = 1)
	@Column(name = "id", length = 11)
	private Long id;
	
	@NotNull
	@NotBlank
	@NotEmpty
	@Column(name = "biodata_id", nullable = false, length = 11)
	private Long biodataId;
	
	@Column(name = "name", nullable = true, length = 100)
	private String name;
	
	@Column(name = "position", nullable = true, length = 100)
	private String position;
	
	@Column(name = "address_phone", nullable = true, length = 1000)
	private String addressPhone;
	
	@Column(name = "relation", nullable = true, length = 100)
	private String relation;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBiodataId() {
		return biodataId;
	}

	public void setBiodataId(Long biodataId) {
		this.biodataId = biodataId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getAddressPhone() {
		return addressPhone;
	}

	public void setAddressPhone(String addressPhone) {
		this.addressPhone = addressPhone;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}
	
}
