/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gomap.performance.organisastion.dto;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Palash
 */
public class EmEmployeeSkillMpgDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer skillMpgId;
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	private Integer skillId;
	private Integer skillProficiency;
	private Integer employeeId;
	private Date createdDate;
	private Date updatedDate;
	private Integer activateFlag;

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

	public EmEmployeeSkillMpgDto() {
	}

	/**
	 * @return the skillMpgIdR
	 */
	public Integer getSkillMpgId() {
		return skillMpgId;
	}

	/**
	 * @param skillMpgId the skillMpgId to set
	 */
	public void setSkillMpgId(Integer skillMpgId) {
		this.skillMpgId = skillMpgId;
	}

	/**
	 * @return the skillId
	 */
	public Integer getSkillId() {
		return skillId;
	}

	/**
	 * @param skillId the skillId to set
	 */
	public void setSkillId(Integer skillId) {
		this.skillId = skillId;
	}

	/**
	 * @return the skillProficiency
	 */
	public Integer getSkillProficiency() {
		return skillProficiency;
	}

	/**
	 * @param skillProficiency the skillProficiency to set
	 */
	public void setSkillProficiency(Integer skillProficiency) {
		this.skillProficiency = skillProficiency;
	}

	/**
	 * @return the employeeId
	 */
	public Integer getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmEmployeeSkillMpgDto [skillMpgId=" + skillMpgId + ", skillId=" + skillId + ", skillProficiency="
				+ skillProficiency + ", employeeId=" + employeeId + ", createdDate=" + createdDate + ", updatedDate="
				+ updatedDate + ", activateFlag=" + activateFlag + "]";
	}
}
