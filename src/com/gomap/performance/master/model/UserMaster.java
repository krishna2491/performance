/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.master.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import com.sun.istack.internal.NotNull;

import javafx.beans.DefaultProperty;

/**
 * @author krishnakant.bairagi
 *
 */
@Entity
@Table(name = "user_master")
public class UserMaster implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "user_id")
	private Integer userId;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 20)
	@Column(name = "name")
	private String Name;
	@NotNull
	@Size(min = 1, max = 20)
	@Column(name = "email")
	private String email;
	@NotNull
	@Size(min = 1, max = 20)
	@Column(name = "password")
	private String password;
	@NotNull
	@Column(name = "created_date")
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	
	@Column(name = "updated_date")
	@Temporal(TemporalType.DATE)
	@Basic(optional = true)
	
	private Date updatedDate;
	@NotNull
	@Size(min = 1, max = 5)
	@Column(name = "activate_flag")
	private Integer activateFlag;
	@NotNull
	@Size(min = 1, max = 5)
	@Column(name = "email_verification")
	private Integer emailVerification;
	
	@NotNull
	@Size(min = 1, max = 250)
	@Column(name = "email_token")
	private String emailToken;
	@Column(name = "token_time")
	@Temporal(TemporalType.DATE)
	private Date  tokenTime;
	/**
	 * @return the emailToken
	 */
	public String getEmailToken() {
		return emailToken;
	}
	/**
	 * @param emailToken the emailToken to set
	 */
	public void setEmailToken(String emailToken) {
		this.emailToken = emailToken;
	}
	/**
	 * @return the activateFlag
	 */
	public Integer getActivateFlag() {
		return activateFlag;
	}
	/**
	 * @param activateFlag the activateFlag to set
	 */
	public void setActivateFlag(Integer activateFlag) {
		this.activateFlag = activateFlag;
	}
	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * @return the updatedDate
	 */
	public Date getUpdatedDate() {
		return updatedDate;
	}
	/**
	 * @param updatedDate the updatedDate to set
	 */
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	/**
	 * @return the emailVerification
	 */
	public Integer getEmailVerification() {
		return emailVerification;
	}
	/**
	 * @param emailVerification the emailVerification to set
	 */
	public void setEmailVerification(Integer emailVerification) {
		this.emailVerification = emailVerification;
	}
	/**
	 * @return the tokenTime
	 */
	public Date getTokenTime() {
		return tokenTime;
	}
	/**
	 * @param tokenTime the tokenTime to set
	 */
	public void setTokenTime(Date tokenTime) {
		this.tokenTime = tokenTime;
	}
	
}
