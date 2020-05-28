/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.master.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author krishnakant.bairagi
 *
 */

public class EmployeeMasterDto implements Serializable {
private Integer employeeId;
private Integer companyId;
private String fName;
private String mName;
private String email;
private String password;
private String mobileNo;
private Date createdDate;
private Date updatedDate;
private Integer activateFlag;
/**
 * @return the employeeId
 */
public Integer getEmployeeId() {
	return employeeId;
}
/**
 * @param employeeId the employeeId to set
 */
public void setEmployeeId(Integer employeeId) {
	this.employeeId = employeeId;
}
/**
 * @return the companyId
 */
public Integer getCompanyId() {
	return companyId;
}
/**
 * @param companyId the companyId to set
 */
public void setCompanyId(Integer companyId) {
	this.companyId = companyId;
}
/**
 * @return the fName
 */
public String getfName() {
	return fName;
}
/**
 * @param fName the fName to set
 */
public void setfName(String fName) {
	this.fName = fName;
}
/**
 * @return the mName
 */
public String getmName() {
	return mName;
}
/**
 * @param mName the mName to set
 */
public void setmName(String mName) {
	this.mName = mName;
}
/**
 * @return the email
 */
public String getEmail() {
	return email;
}
/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}
/**
 * @return the password
 */
public String getPassword() {
	return password;
}
/**
 * @param password the password to set
 */
public void setPassword(String password) {
	this.password = password;
}
/**
 * @return the mobileNo
 */
public String getMobileNo() {
	return mobileNo;
}
/**
 * @param mobileNo the mobileNo to set
 */
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
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
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "EmployeeMasterDto [employeeId=" + employeeId + ", companyId=" + companyId + ", fName=" + fName + ", mName="
			+ mName + ", email=" + email + ", password=" + password + ", mobileNo=" + mobileNo + ", createdDate="
			+ createdDate + ", updatedDate=" + updatedDate + ", activateFlag=" + activateFlag + "]";
}
}