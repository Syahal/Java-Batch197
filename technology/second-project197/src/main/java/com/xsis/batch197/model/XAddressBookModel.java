package com.xsis.batch197.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.persistence.ForeignKey;
 
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "x_addrbook")
public class XAddressBookModel extends BaseModel{
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "x_addrbook_idx")
	@TableGenerator(name = "x_addrbook_idx", table = "tbl_index", pkColumnName = "index_id", valueColumnName = "index_value", initialValue = 0, allocationSize = 1)
	@Column(name = "id" , length = 11)
	private Long id;

	@NotNull
	@NotBlank
	@NotEmpty
	@Column(name = "is_locked", nullable = false)
	private int isLocked;

	@NotNull
	@NotBlank
	@NotEmpty
	@Column(name = "email", length = 100, nullable = false)
	private String email;

	@NotNull
	@NotBlank
	@NotEmpty
	@Column(name = "abuid", length = 50, nullable = false)
	private String abuid;

	@NotNull
	@NotBlank
	@NotEmpty
	@Column(name = "abpwd", length = 50, nullable = false)
	private String abpwd;
	
	@ManyToMany
    @JoinTable(
            name="x_userrole",
            joinColumns=@JoinColumn(name="xaddrbook_id", referencedColumnName="id", foreignKey=@ForeignKey(name="fk_user_role_id")),
            inverseJoinColumns=@JoinColumn(name="xrole_id", referencedColumnName="id", foreignKey=@ForeignKey(name="fk_role_user_id")),
            foreignKey = @ForeignKey(name="fk_user_role_id"),
            inverseForeignKey = @ForeignKey(name="fk_role_user_id")
    )
    private List<XRoleModel> roleList = new ArrayList<XRoleModel>();
	
	 @Column(name="permission")
	    private String permission="";
	   
	    public XAddressBookModel() {
	        super();
	    }
	 
	    public XAddressBookModel(String email, String abuid, String abpwd, String permission) {
	        this.email = email;
	        this.abuid = abuid;
	        this.abpwd = abpwd;
	        this.permission=permission;
	        this.isLocked = 0;
	    }

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public List<String> getPermisstionList() {
		if (this.permission.length() > 0) {
			return Arrays.asList(this.permission.split(","));
		}
		return new ArrayList<>();
	}
	
	@Column(name = "attempt", length = 1)
	private Integer attempt;

	public Integer getAttempt() {
		return attempt;
	}

	public void setAttempt(Integer attempt) {
		this.attempt = attempt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getIsLocked() {
		return isLocked;
	}

	public void setIsLocked(int isLocked) {
		this.isLocked = isLocked;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAbuid() {
		return abuid;
	}

	public void setAbuid(String abuid) {
		this.abuid = abuid;
	}

	public String getAbpwd() {
		return abpwd;
	}

	public void setAbpwd(String abpwd) {
		this.abpwd = abpwd;
	}

}
