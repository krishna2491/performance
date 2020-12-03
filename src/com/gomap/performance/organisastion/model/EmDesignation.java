/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gomap.performance.organisastion.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import javax.persistence.OneToMany;

/**
 *
 * @author Palash
 */
@Entity
@Table(name = "em_designation")
@XmlRootElement
public class EmDesignation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "designation_id")
    private Integer designationId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "designation_name")
    private String designationName;
    @Basic(optional = true)
   
    @Column(name = "department_id")
    private Integer departmentId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "parent_designation_id")
    private Integer parentDesignationId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "designation_level_no")
    private Integer designationLevelNo;
    
    @Column(name = "designation_created_date")
    @Temporal(TemporalType.DATE)
    private Date designationCreatedDate;
    @Column(name = "designation_updated_date")
    @Temporal(TemporalType.DATE)
    private Date designationUpdatedDate;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "activate_flag")
    private Integer activateFlag;
    
    @Column(name = "default_designation")
    private String defaultDesignation;
    
    public EmDesignation() {
    }

    public EmDesignation(Integer designationId) {
        this.designationId = designationId;
    }

   

    public Integer getDesignationId() {
        return designationId;
    }

    public void setDesignationId(Integer designationId) {
        this.designationId = designationId;
    }

    public String getDesignationName() {
        return designationName;
    }

    public void setDesignationName(String designationName) {
        this.designationName = designationName;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getParentDesignationId() {
        return parentDesignationId;
    }

    public void setParentDesignationId(Integer parentDesignationId) {
        this.parentDesignationId = parentDesignationId;
    }

    public Integer getDesignationLevelNo() {
        return designationLevelNo;
    }

    public void setDesignationLevelNo(Integer designationLevelNo) {
        this.designationLevelNo = designationLevelNo;
    }

   

    public Date getDesignationCreatedDate() {
        return designationCreatedDate;
    }

    public void setDesignationCreatedDate(Date designationCreatedDate) {
        this.designationCreatedDate = designationCreatedDate;
    }

    public Date getDesignationUpdatedDate() {
        return designationUpdatedDate;
    }

    public void setDesignationUpdatedDate(Date designationUpdatedDate) {
        this.designationUpdatedDate = designationUpdatedDate;
    }

   
   
    @Override
    public String toString() {
        return "com.gomap.performance.organisation.EmDesignation[ designationId=" + designationId + " ]";
    }
    @PrePersist
	public void prePersist() {
	    if(activateFlag == null) //We set default value in case if the value is not set yet.
	        activateFlag = 1;
	    System.out.println("coming here");
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
	 * @param designationId
	 * @param designationName
	 * @param departmentId
	 * @param parentDesignationId
	 * @param designationLevelNo
	 * @param designationCreatedDate
	 * @param designationUpdatedDate
	 * @param activateFlag
	 */
	public EmDesignation(Integer designationId, String designationName, Integer departmentId,
			Integer parentDesignationId, Integer designationLevelNo, Date designationCreatedDate,
			Date designationUpdatedDate, Integer activateFlag) {
		super();
		this.designationId = designationId;
		this.designationName = designationName;
		this.departmentId = departmentId;
		this.parentDesignationId = parentDesignationId;
		this.designationLevelNo = designationLevelNo;
		this.designationCreatedDate = designationCreatedDate;
		this.designationUpdatedDate = designationUpdatedDate;
		this.activateFlag = activateFlag;
	}

	/**
	 * @return the defaultDesignation
	 */
	public String getDefaultDesignation() {
		return defaultDesignation;
	}

	/**
	 * @param defaultDesignation the defaultDesignation to set
	 */
	public void setDefaultDesignation(String defaultDesignation) {
		this.defaultDesignation = defaultDesignation;
	}

	/**
	 * @return the designationElementMaping
	 */
		
	    
}
