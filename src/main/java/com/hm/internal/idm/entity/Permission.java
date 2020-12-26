package com.hm.internal.idm.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "PERMISSION")
@Entity
public class Permission implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5220217551871879903L;

	 @Id
	@Column(name = "P_ID_PK")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int  id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "DESCRIPTION")
	private String description;
	@Column(name = "FEATURE")
	private String feature;
	@Column(name = "STATUS")
	private Character status;
	@Column(name = "TYPE")
	private Boolean type;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	public Character getStatus() {
		return status;
	}
	public void setStatus(Character status) {
		this.status = status;
	}
	public Boolean getType() {
		return type;
	}
	public void setType(Boolean type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Permission [id=" + id + ", name=" + name + ", description=" + description + ", feature=" + feature
				+ ", status=" + status + ", type=" + type + "]";
	}
	
	
	

}
