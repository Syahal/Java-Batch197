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

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "x_undangan")
public class XUndanganModel extends BaseModel{
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "x_undangan_idx")
	@TableGenerator(name = "x_undangan_idx", table = "tbl_index", pkColumnName = "index_id", valueColumnName = "index_value", initialValue = 0, allocationSize = 1)
	@Column(name = "id", length = 11)
	private Long id;

	@Column(name = "schedule_type_id", length = 11, nullable = false)
	private Long scheduleTypeId;

	@Column(name = "invitation_date", nullable = true)
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date invitationDate;

	@Column(name = "ro", length = 11, nullable = true)
	private Long ro;

	@Column(name = "tro", length = 11, nullable = true)
	private Long tro;

	@Column(name = "other_ro_tro", length = 100, nullable = true)
	private String otherRoTro;

	@Column(name = "location", length = 100, nullable = true)
	private String location;

	@Column(name = "status", length = 50, nullable = true)
	private String status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getScheduleTypeId() {
		return scheduleTypeId;
	}

	public void setScheduleTypeId(Long scheduleTypeId) {
		this.scheduleTypeId = scheduleTypeId;
	}

	public Date getInvitationDate() {
		return invitationDate;
	}

	public void setInvitationDate(Date invitationDate) {
		this.invitationDate = invitationDate;
	}

	public Long getRo() {
		return ro;
	}

	public void setRo(Long ro) {
		this.ro = ro;
	}

	public Long getTro() {
		return tro;
	}

	public void setTro(Long tro) {
		this.tro = tro;
	}

	public String getOtherRoTro() {
		return otherRoTro;
	}

	public void setOtherRoTro(String otherRoTro) {
		this.otherRoTro = otherRoTro;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
