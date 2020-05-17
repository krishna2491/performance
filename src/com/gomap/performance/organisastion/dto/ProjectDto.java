/**
 * Generated By Krishnakant Bairagi
 */
package com.gomap.performance.organisastion.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author krishnakant.bairagi
 *
 */
public class ProjectDto {
	private Integer projectId;
	private Integer departmentId;
	private String projectName;
	private Integer projectCreatedBy;
	private String projectPriority;
	private String projectAttachment;
	private Date projectStartDate;
    private Date projectDueDate;
    private String projectDescription;
    
	/**
	 * @return the projectId
	 */
	public Integer getProjectId() {
		return projectId;
	}
	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	/**
	 * @return the departmentId
	 */
	public Integer getDepartmentId() {
		return departmentId;
	}
	/**
	 * @param departmentId the departmentId to set
	 */
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	 * @return the projectCreatedBy
	 */
	public Integer getProjectCreatedBy() {
		return projectCreatedBy;
	}
	/**
	 * @param projectCreatedBy the projectCreatedBy to set
	 */
	public void setProjectCreatedBy(Integer projectCreatedBy) {
		this.projectCreatedBy = projectCreatedBy;
	}
	/**
	 * @return the projectPriority
	 */
	public String getProjectPriority() {
		return projectPriority;
	}
	/**
	 * @param projectPriority the projectPriority to set
	 */
	public void setProjectPriority(String projectPriority) {
		this.projectPriority = projectPriority;
	}
	/**
	 * @return the projectAttachment
	 */
	public String getProjectAttachment() {
		return projectAttachment;
	}
	/**
	 * @param projectAttachment the projectAttachment to set
	 */
	public void setProjectAttachment(String projectAttachment) {
		this.projectAttachment = projectAttachment;
	}
	/**
	 * @return the projectStartDate
	 */
	public Date getProjectStartDate() {
		return projectStartDate;
	}
	/**
	 * @param projectStartDate the projectStartDate to set
	 */
	public void setProjectStartDate(Date projectStartDate) {
		this.projectStartDate = projectStartDate;
	}
	/**
	 * @return the projectDueDate
	 */
	public Date getProjectDueDate() {
		return projectDueDate;
	}
	/**
	 * @param projectDueDate the projectDueDate to set
	 */
	public void setProjectDueDate(Date projectDueDate) {
		this.projectDueDate = projectDueDate;
	}
	/**
	 * @return the projectDescription
	 */
	public String getProjectDescription() {
		return projectDescription;
	}
	/**
	 * @param projectDescription the projectDescription to set
	 */
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

}
