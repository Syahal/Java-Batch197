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
@Table(name="x_keahlian")
public class XKeahlianModel extends BaseModel{

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE, generator="x_keluarga_idx")
	@TableGenerator(name="x_keluarga_idx", table="tbl_index", pkColumnName="index_id", valueColumnName="index_value", initialValue=0, allocationSize=1)
	@Column(name="id", length=11)
	private Long id;
	
	@NotNull
	@NotBlank
	@NotEmpty
	@Column(name="biodata_id", nullable=false, length=11)
	private Long biodataId;
	
	@Column(name="skill_name", nullable=true, length=100)
	private String skillName;
	
	@Column(name="skill_level_id", nullable=true, length=11)
	private Long skillLevelId;
	
	@Column(name="notes", nullable=true, length=1000)
	private String notes;

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

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public Long getSkillLevelId() {
		return skillLevelId;
	}

	public void setSkillLevelId(Long skillLevelId) {
		this.skillLevelId = skillLevelId;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
}
