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
 * @author Palash
 */
@Entity
@Table(name = "role_element_operation_mpg")
@XmlRootElement
public class RoleElementOperationMpg implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "role_element_operation_id")
    private Integer roleElementOperationId;
    /**
	 * @return the roleElementOperationId
	 */
	public Integer getRoleElementOperationId() {
		return roleElementOperationId;
	}


	/**
	 * @param roleElementOperationId the roleElementOperationId to set
	 */
	public void setRoleElementOperationId(Integer roleElementOperationId) {
		this.roleElementOperationId = roleElementOperationId;
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


	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "designation_element_mpg_id")
    private Integer designationElementMpgId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "operation_id")
    private Integer operationId;
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
    

    public RoleElementOperationMpg() {
    }


	/**
	 * @return the operationId
	 */
	public Integer getOperationId() {
		return operationId;
	}


	/**
	 * @param operationId the operationId to set
	 */
	public void setOperationId(Integer operationId) {
		this.operationId = operationId;
	}
}
