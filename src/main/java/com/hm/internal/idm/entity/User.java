package com.hm.internal.idm.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7788053784136077793L;

	  
	@Column(name = "USER_ID_PK")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int  id;
	@Column(name = "NAME")
    private String name;
    @Column(name = "USERNAME")
    private String userName;
    @Column(name = "EMAIL_ID")
    private String emailId;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "SALT")
    private String salt;
    @Column(name = "PASSWD_CREATED")
    private Timestamp passwordCreatedDate;
    @Column(name = "CHANGE_PASSWD")
    private Boolean isChangePassword;
    @Column(name = "LOGIN_FAIL_COUNT")
    private Integer loginFailCount;
    @Column(name = "EMAIL_VERIFIED")
    private Boolean isEmailVerified;
    @Column(name = "ENTERPRISE_CODE")
    private String enterpriseCode;
    @Column(name = "STATUS")
    private Character status;
    @Column(name = "USER_TYPE")
    private Boolean userType;
    @Column(name = "PASSWORD_EXPIRY")
    private Timestamp passwordExpiryDate;
    @Column(name = "LAST_LOGIN_DATE")
    private Timestamp lastLoginDate;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public Timestamp getPasswordCreatedDate() {
		return passwordCreatedDate;
	}
	public void setPasswordCreatedDate(Timestamp passwordCreatedDate) {
		this.passwordCreatedDate = passwordCreatedDate;
	}
	public Boolean getIsChangePassword() {
		return isChangePassword;
	}
	public void setIsChangePassword(Boolean isChangePassword) {
		this.isChangePassword = isChangePassword;
	}
	public Integer getLoginFailCount() {
		return loginFailCount;
	}
	public void setLoginFailCount(Integer loginFailCount) {
		this.loginFailCount = loginFailCount;
	}
	public Boolean getIsEmailVerified() {
		return isEmailVerified;
	}
	public void setIsEmailVerified(Boolean isEmailVerified) {
		this.isEmailVerified = isEmailVerified;
	}
	public String getEnterpriseCode() {
		return enterpriseCode;
	}
	public void setEnterpriseCode(String enterpriseCode) {
		this.enterpriseCode = enterpriseCode;
	}
	public Character getStatus() {
		return status;
	}
	public void setStatus(Character status) {
		this.status = status;
	}
	public Boolean getUserType() {
		return userType;
	}
	public void setUserType(Boolean userType) {
		this.userType = userType;
	}
	public Timestamp getPasswordExpiryDate() {
		return passwordExpiryDate;
	}
	public void setPasswordExpiryDate(Timestamp passwordExpiryDate) {
		this.passwordExpiryDate = passwordExpiryDate;
	}
	public Timestamp getLastLoginDate() {
		return lastLoginDate;
	}
	public void setLastLoginDate(Timestamp lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", userName=" + userName + ", emailId=" + emailId + ", password="
				+ password + ", salt=" + salt + ", passwordCreatedDate=" + passwordCreatedDate + ", isChangePassword="
				+ isChangePassword + ", loginFailCount=" + loginFailCount + ", isEmailVerified=" + isEmailVerified
				+ ", enterpriseCode=" + enterpriseCode + ", status=" + status + ", userType=" + userType
				+ ", passwordExpiryDate=" + passwordExpiryDate + ", lastLoginDate=" + lastLoginDate + "]";
	}

  

}

