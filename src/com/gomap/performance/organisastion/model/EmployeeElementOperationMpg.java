/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.organisastion.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import com.sun.istack.internal.NotNull;

/**
 * @author Fujitsu
 *
 */
@Entity
@Table(name = "employee_element_operation_mpg")
@XmlRootElement
public class EmployeeElementOperationMpg {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "employee_element_operation_id")
	private Integer EmployeeElementOperationId;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 255)
	@Column(name = "employee_element_mpg_id")
	private Integer employeeElementMpgId;
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
	/**
	 * @return the employeeElementOperationId
	 */
	public Integer getEmployeeElementOperationId() {
		return EmployeeElementOperationId;
	}
	/**
	 * @param employeeElementOperationId the employeeElementOperationId to set
	 */
	public void setEmployeeElementOperationId(Integer employeeElementOperationId) {
		EmployeeElementOperationId = employeeElementOperationId;
	}
	/**
	 * @return the employeeElementMpgId
	 */
	public Integer getEmployeeElementMpgId() {
		return employeeElementMpgId;
	}
	/**
	 * @param employeeElementMpgId the employeeElementMpgId to set
	 */
	public void setEmployeeElementMpgId(Integer employeeElementMpgId) {
		this.employeeElementMpgId = employeeElementMpgId;
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
