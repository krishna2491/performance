/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gomap.performance.organisastion.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
public class ElementMasterDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer elementId;
    private String elementName;
    private Date createdDate;
    private Date updatedDate;
    private Integer activateFlag;
    private List<OperationMasterDto> operationList;

    
    



	/**
	 * @return the operationList
	 */
	public List<OperationMasterDto> getOperationList() {
		return operationList;
	}


	/**
	 * @param operationList the operationList to set
	 */
	public void setOperationList(List<OperationMasterDto> operationList) {
		this.operationList = operationList;
	}


	public ElementMasterDto() {}


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
	 * @return the elementName
	 */
	public String getElementName() {
		return elementName;
	}


	/**
	 * @param elementName the elementName to set
	 */
	public void setElementName(String elementName) {
		this.elementName = elementName;
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
