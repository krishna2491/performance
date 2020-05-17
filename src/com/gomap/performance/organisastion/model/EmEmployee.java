/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gomap.performance.organisastion.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;





/**
 *
 * @author Palash
 */
@Entity
@Table(name = "em_employee")
@XmlRootElement
public class EmEmployee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "employee_id")
    private Integer employeeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "designation_id")
    private int designationId;
    /**
	 * @return the designationId
	 */
	public int getDesignationId() {
		return designationId;
	}

	/**
	 * @param designationId the designationId to set
	 */
	public void setDesignationId(int designationId) {
		this.designationId = designationId;
	}

	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "employee_fname")
    private String employeeFname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "employee_mname")
    private String employeeMname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "employee_email")
    private String employeeEmail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "employee_password")
    private String employeePassword;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "employee_mobile_no")
    private String employeeMobileNo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "employee_profile_img")
    private String employeeProfileImg;
    @Column(name = "employee_created_date")
    @Temporal(TemporalType.DATE)
    private Date employeeCreatedDate;
    @Column(name = "employee_updated_date")
    @Temporal(TemporalType.DATE)
    private Date employeeUpdatedDate;
    

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "activate_flag")
    private Integer activateFlag;
    /**
	 * @return the designation
	 */
    

	public EmEmployee() {
    }

    public EmEmployee(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public EmEmployee(Integer employeeId, int designationId, String employeeFname, String employeeMname, String employeeEmail, String employeePassword, String employeeMobileNo, String employeeProfileImg) {
        this.employeeId = employeeId;
        this.designationId = designationId;
        this.employeeFname = employeeFname;
        this.employeeMname = employeeMname;
        this.employeeEmail = employeeEmail;
        this.employeePassword = employeePassword;
        this.employeeMobileNo = employeeMobileNo;
        this.employeeProfileImg = employeeProfileImg;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

   
    public String getEmployeeFname() {
        return employeeFname;
    }

    public void setEmployeeFname(String employeeFname) {
        this.employeeFname = employeeFname;
    }

    public String getEmployeeMname() {
        return employeeMname;
    }

    public void setEmployeeMname(String employeeMname) {
        this.employeeMname = employeeMname;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword;
    }

    public String getEmployeeMobileNo() {
        return employeeMobileNo;
    }

    public void setEmployeeMobileNo(String employeeMobileNo) {
        this.employeeMobileNo = employeeMobileNo;
    }

    public String getEmployeeProfileImg() {
        return employeeProfileImg;
    }

    public void setEmployeeProfileImg(String employeeProfileImg) {
        this.employeeProfileImg = employeeProfileImg;
    }

    public Date getEmployeeCreatedDate() {
        return employeeCreatedDate;
    }

    public void setEmployeeCreatedDate(Date employeeCreatedDate) {
        this.employeeCreatedDate = employeeCreatedDate;
    }

    public Date getEmployeeUpdatedDate() {
        return employeeUpdatedDate;
    }

    public void setEmployeeUpdatedDate(Date employeeUpdatedDate) {
        this.employeeUpdatedDate = employeeUpdatedDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeeId != null ? employeeId.hashCode() : 0);
        return hash;
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
}
