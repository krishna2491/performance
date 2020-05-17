/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.master.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author krishnakant.bairagi
 *
 */
//@Entity
//@Table(name = "employee_master")
public class EmployeeMaster {
private Long emid;
private Long companyId;
private String employee_fname;
private String employee_mname;
private String employee_email;
private String employee_password;
private String employee_mobile_no;
private Date employee_created_date;
private Date employee_updated_date;
/**
 * @return the emid
 */
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "EMP_ID", unique = true, nullable = false, precision = 22, scale = 0)
public Long getEmid() {
	return emid;
}
/**
 * @param emid the emid to set
 */
public void setEmid(Long emid) {
	this.emid = emid;
}
/**
 * @return the companyId
 */
@Column(name = "company_id", nullable = true, length = 30)
public Long getCompanyId() {
	return companyId;
}
/**
 * @param companyId the companyId to set
 */
public void setCompanyId(Long companyId) {
	this.companyId = companyId;
}
/**
 * @return the employee_fname
 */
@Column(name = "employee_fname", nullable = true, length = 30)
public String getEmployee_fname() {
	return employee_fname;
}
/**
 * @param employee_fname the employee_fname to set
 */
public void setEmployee_fname(String employee_fname) {
	this.employee_fname = employee_fname;
}
/**
 * @return the employee_mname
 */

public String getEmployee_mname() {
	return employee_mname;
}
/**
 * @param employee_mname the employee_mname to set
 */
@Column(name = "employee_mname", nullable = true, length = 30)
public void setEmployee_mname(String employee_mname) {
	this.employee_mname = employee_mname;
}
/**
 * @return the employee_email
 */
@Column(name = "employee_email", nullable = true, length = 30)
public String getEmployee_email() {
	return employee_email;
}
/**
 * @param employee_email the employee_email to set
 */
public void setEmployee_email(String employee_email) {
	this.employee_email = employee_email;
}
/**
 * @return the employee_password
 */
@Column(name = "employee_password", nullable = true, length = 30)
public String getEmployee_password() {
	return employee_password;
}
/**
 * @param employee_password the employee_password to set
 */

public void setEmployee_password(String employee_password) {
	this.employee_password = employee_password;
}
/**
 * @return the employee_mobile_no
 */
@Column(name = "employee_mobile_no", nullable = true, length = 30)
public String getEmployee_mobile_no() {
	return employee_mobile_no;
}
/**
 * @param employee_mobile_no the employee_mobile_no to set
 */
public void setEmployee_mobile_no(String employee_mobile_no) {
	this.employee_mobile_no = employee_mobile_no;
}
/**
 * @return the employee_created_date
 */
@Column(name = "employee_created_date", nullable = true, length = 30)
public Date getEmployee_created_date() {
	return employee_created_date;
}
/**
 * @param employee_created_date the employee_created_date to set
 */
public void setEmployee_created_date(Date employee_created_date) {
	this.employee_created_date = employee_created_date;
}
/**
 * @return the employee_updated_date
 */
@Column(name = "employee_updated_date", nullable = true, length = 30)
public Date getEmployee_updated_date() {
	return employee_updated_date;
}
/**
 * @param employee_updated_date the employee_updated_date to set
 */
public void setEmployee_updated_date(Date employee_updated_date) {
	this.employee_updated_date = employee_updated_date;
}



}
