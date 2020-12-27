package com.hm.internal.idm.entity;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "ROLE")
public class Role {

	@Column(name = "ROLE_ID_PK")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long id;
	@Column(name = "NAME")
    private String name;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "STATUS")
    private Character status;
    @Column(name = "ENTERPRISE_CODE")
    private String enterpriseCode;
    @Column(name = "CREATE_DATE")
    private Timestamp createdAt;

    @Column(name = "LAST_UPDATE_DATE")
    private Timestamp updatedAt;
    
    @OneToMany(mappedBy = "role", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Permission> permissions;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Character getStatus() {
		return status;
	}
	public void setStatus(Character status) {
		this.status = status;
	}
	public String getEnterpriseCode() {
		return enterpriseCode;
	}
	public void setEnterpriseCode(String enterpriseCode) {
		this.enterpriseCode = enterpriseCode;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", description=" + description + ", status=" + status
				+ ", enterpriseCode=" + enterpriseCode + "]";
	}

    
	
}

