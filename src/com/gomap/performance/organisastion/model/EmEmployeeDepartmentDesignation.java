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
@Table(name = "em_employee_department_designation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmEmployeeDepartmentDesignation.findAll", query = "SELECT e FROM EmEmployeeDepartmentDesignation e")
    , @NamedQuery(name = "EmEmployeeDepartmentDesignation.findByEmpDepsId", query = "SELECT e FROM EmEmployeeDepartmentDesignation e WHERE e.empDepsId = :empDepsId")
    , @NamedQuery(name = "EmEmployeeDepartmentDesignation.findByEmployeeId", query = "SELECT e FROM EmEmployeeDepartmentDesignation e WHERE e.employeeId = :employeeId")
    , @NamedQuery(name = "EmEmployeeDepartmentDesignation.findByDepartmentId", query = "SELECT e FROM EmEmployeeDepartmentDesignation e WHERE e.departmentId = :departmentId")
    , @NamedQuery(name = "EmEmployeeDepartmentDesignation.findByDesignationId", query = "SELECT e FROM EmEmployeeDepartmentDesignation e WHERE e.designationId = :designationId")
    , @NamedQuery(name = "EmEmployeeDepartmentDesignation.findByEmpDepsCreatedBy", query = "SELECT e FROM EmEmployeeDepartmentDesignation e WHERE e.empDepsCreatedBy = :empDepsCreatedBy")
    , @NamedQuery(name = "EmEmployeeDepartmentDesignation.findByEmpDepsCreatedDate", query = "SELECT e FROM EmEmployeeDepartmentDesignation e WHERE e.empDepsCreatedDate = :empDepsCreatedDate")
    , @NamedQuery(name = "EmEmployeeDepartmentDesignation.findByEmpDepsUpdatedDate", query = "SELECT e FROM EmEmployeeDepartmentDesignation e WHERE e.empDepsUpdatedDate = :empDepsUpdatedDate")})
public class EmEmployeeDepartmentDesignation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "emp_deps_id")
    private Integer empDepsId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "employee_id")
    private int employeeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "department_id")
    private int departmentId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "designation_id")
    private int designationId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "emp_deps_created_by")
    private int empDepsCreatedBy;
    @Column(name = "emp_deps_created_date")
    @Temporal(TemporalType.DATE)
    private Date empDepsCreatedDate;
    @Column(name = "emp_deps_updated_date")
    @Temporal(TemporalType.DATE)
    private Date empDepsUpdatedDate;

    public EmEmployeeDepartmentDesignation() {
    }

    public EmEmployeeDepartmentDesignation(Integer empDepsId) {
        this.empDepsId = empDepsId;
    }

    public EmEmployeeDepartmentDesignation(Integer empDepsId, int employeeId, int departmentId, int designationId, int empDepsCreatedBy) {
        this.empDepsId = empDepsId;
        this.employeeId = employeeId;
        this.departmentId = departmentId;
        this.designationId = designationId;
        this.empDepsCreatedBy = empDepsCreatedBy;
    }

    public Integer getEmpDepsId() {
        return empDepsId;
    }

    public void setEmpDepsId(Integer empDepsId) {
        this.empDepsId = empDepsId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getDesignationId() {
        return designationId;
    }

    public void setDesignationId(int designationId) {
        this.designationId = designationId;
    }

    public int getEmpDepsCreatedBy() {
        return empDepsCreatedBy;
    }

    public void setEmpDepsCreatedBy(int empDepsCreatedBy) {
        this.empDepsCreatedBy = empDepsCreatedBy;
    }

    public Date getEmpDepsCreatedDate() {
        return empDepsCreatedDate;
    }

    public void setEmpDepsCreatedDate(Date empDepsCreatedDate) {
        this.empDepsCreatedDate = empDepsCreatedDate;
    }

    public Date getEmpDepsUpdatedDate() {
        return empDepsUpdatedDate;
    }

    public void setEmpDepsUpdatedDate(Date empDepsUpdatedDate) {
        this.empDepsUpdatedDate = empDepsUpdatedDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empDepsId != null ? empDepsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmEmployeeDepartmentDesignation)) {
            return false;
        }
        EmEmployeeDepartmentDesignation other = (EmEmployeeDepartmentDesignation) object;
        if ((this.empDepsId == null && other.empDepsId != null) || (this.empDepsId != null && !this.empDepsId.equals(other.empDepsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gomap.performance.organisation.EmEmployeeDepartmentDesignation[ empDepsId=" + empDepsId + " ]";
    }
    
}
