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
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import com.sun.istack.internal.NotNull;

/**
 *
 * @author Krishnakant
 */
@Entity
@Table(name = "Em_Params_Config")
@XmlRootElement
public class EmParamsConfig implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "param_Id")
    private Long paramId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "param_name")
    private String paramName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "param_type")
    private Integer paramType;
    
    @Column(name = "created_date")
    @Temporal(TemporalType.DATE)
    private Date createdDate;
    @Column(name = "updated_date")
    @Temporal(TemporalType.DATE)
    private Date updatedDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "activate_flag")
    private Integer activateFlag;
    
    

    public EmParamsConfig() {}



	/**
	 * @return the paramId
	 */
	public Long getParamId() {
		return paramId;
	}



	/**
	 * @param paramId the paramId to set
	 */
	public void setParamId(Long paramId) {
		this.paramId = paramId;
	}



	/**
	 * @return the paramName
	 */
	public String getParamName() {
		return paramName;
	}



	/**
	 * @param paramName the paramName to set
	 */
	public void setParamName(String paramName) {
		this.paramName = paramName;
	}



	/**
	 * @return the paramType
	 */
	public Integer getParamType() {
		return paramType;
	}



	/**
	 * @param paramType the paramType to set
	 */
	public void setParamType(Integer paramType) {
		this.paramType = paramType;
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
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    }
