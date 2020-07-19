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

public class RoleElementOperationMpgDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer designationElementMpgId;
   private Integer roleElementOperationId;
   private Integer operationId;
   private Date createdDate;
   
   private Date updatedDate;
 
   private Integer activateFlag;
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


	
    

    public RoleElementOperationMpgDto() {
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
}
