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
@Table(name = "em_department")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmDepartment.findAll", query = "SELECT e FROM EmDepartment e")
    , @NamedQuery(name = "EmDepartment.findByDepartmentId", query = "SELECT e FROM EmDepartment e WHERE e.departmentId = :departmentId")
    , @NamedQuery(name = "EmDepartment.findByDepartmentName", query = "SELECT e FROM EmDepartment e WHERE e.departmentName = :departmentName")
    , @NamedQuery(name = "EmDepartment.findByDepartmentCreatedDate", query = "SELECT e FROM EmDepartment e WHERE e.departmentCreatedDate = :departmentCreatedDate")
    , @NamedQuery(name = "EmDepartment.findByDepartmentUpdatedDate", query = "SELECT e FROM EmDepartment e WHERE e.departmentUpdatedDate = :departmentUpdatedDate")})
public class EmDepartment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "department_id")
    private Integer departmentId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "department_name")
    private String departmentName;
    @Column(name = "department_created_date")
    @Temporal(TemporalType.DATE)
    private Date departmentCreatedDate;
    @Column(name = "department_updated_date")
    @Temporal(TemporalType.DATE)
    private Date departmentUpdatedDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "activate_flag")
    private Integer activateFlag;
    

    public EmDepartment() {
    }

    public EmDepartment(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public EmDepartment(Integer departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Date getDepartmentCreatedDate() {
        return departmentCreatedDate;
    }

    public void setDepartmentCreatedDate(Date departmentCreatedDate) {
        this.departmentCreatedDate = departmentCreatedDate;
    }

    public Date getDepartmentUpdatedDate() {
        return departmentUpdatedDate;
    }

    public void setDepartmentUpdatedDate(Date departmentUpdatedDate) {
        this.departmentUpdatedDate = departmentUpdatedDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (departmentId != null ? departmentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmDepartment)) {
            return false;
        }
        EmDepartment other = (EmDepartment) object;
        if ((this.departmentId == null && other.departmentId != null) || (this.departmentId != null && !this.departmentId.equals(other.departmentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gomap.performance.organisation.EmDepartment[ departmentId=" + departmentId + " ]";
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
	@PrePersist
	public void prePersist() {
	    if(activateFlag == null) //We set default value in case if the value is not set yet.
	        activateFlag = 1;
	    System.out.println("coming here");
	}    
}
