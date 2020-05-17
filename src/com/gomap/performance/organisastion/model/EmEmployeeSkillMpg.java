/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gomap.performance.organisastion.model;

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
@Entity
@Table(name = "em_employee_skill_mpg")
@XmlRootElement
public class EmEmployeeSkillMpg implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
	 * @return the skillMpgId
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
	public int getSkillId() {
		return skillId;
	}







	/**
	 * @param skillId the skillId to set
	 */
	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}







	/**
	 * @return the skillProficiency
	 */
	public int getSkillProficiency() {
		return skillProficiency;
	}







	/**
	 * @param skillProficiency the skillProficiency to set
	 */
	public void setSkillProficiency(int skillProficiency) {
		this.skillProficiency = skillProficiency;
	}







	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}







	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
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







	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}







	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "skill_mpg_id")
    private Integer skillMpgId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "skill_id")
    private int skillId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "skill_proficiency")
    private int skillProficiency;
    @Basic(optional = false)
    @NotNull
    @Column(name = "employee_id")
    private int employeeId;
    @Column(name = "created_date")
    @Temporal(TemporalType.DATE)
    private Date createdDate;
    @Column(name = "updated_date")
    @Temporal(TemporalType.DATE)
    private Date updatedDate;

    @Column(name = "activate_flag")
    private Integer activateFlag;

    public EmEmployeeSkillMpg() {
    }

    





    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmEmployeeSkillMpg [skillMpgId=" + skillMpgId + ", skillId=" + skillId + ", skillProficiency="
				+ skillProficiency + ", employeeId=" + employeeId + ", createdDate=" + createdDate + ", updatedDate="
				+ updatedDate + "]";
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
    
}
