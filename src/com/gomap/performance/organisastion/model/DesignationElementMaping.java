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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * @author Palash
 */
@Entity
@Table(name = "designation_element_mpg")
@XmlRootElement
public class DesignationElementMaping implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "designation_element_mpg_id")
    private Integer designationElementMpgId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "element_id")
    private Integer elementId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "designation_id")
    private Integer designationId;
//   
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
    private EmDesignation emDesignation;
    

    public DesignationElementMaping() {
    }


	/**
	 * @return the designationElementMpgId
	 */
	public Integer getDesignationElementMpgId() {
		return designationElementMpgId;
	}


	/**
	 * @param designationElementMpgId the designationElementMpgId to set
	 */
	public void setDesignationElementMpgId(Integer designationElementMpgId) {
		this.designationElementMpgId = designationElementMpgId;
	}


	/**
	 * @return the elementId
	 */
	public Integer getElementId() {
		return elementId;
	}


	/**
	 * @param elementId the elementId to set
	 */
	public void setElementId(Integer elementId) {
		this.elementId = elementId;
	}


	/**
	 * @return the designationId
	 */
	

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
	 * @return the emDesignation
	 */

	


	

	/**
	 * @return the designationId
	 */
	public Integer getDesignationId() {
		return designationId;
	}


	/**
	 * @param designationId the designationId to set
	 */
	public void setDesignationId(Integer designationId) {
		this.designationId = designationId;
	}

   }
