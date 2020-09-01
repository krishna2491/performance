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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
public class EmGoalDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer goalId;
    private Integer taskId;
    private Integer departmentId;
    private String goalHeading;
    private String goalDescription;
    private Date goalStartDate;
    private Date goalEndDate;
    private Integer employeeId;
    private String goalAttachment;
    private String goalStatus;
    private String goalApprovedStatus;
    private String confirmNote;
    private Date goalCreatedDate;
    private Date goalUpdatedDate;
    private Integer goalPercentage;
    private String comment;
    private String reply;
	/**
	 * @return the goalId
	 */
	public Integer getGoalId() {
		return goalId;
	}
	/**
	 * @param goalId the goalId to set
	 */
	public void setGoalId(Integer goalId) {
		this.goalId = goalId;
	}
	/**
	 * @return the taskId
	 */
	public Integer getTaskId() {
		return taskId;
	}
	/**
	 * @param taskId the taskId to set
	 */
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
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
	 * @return the goalHeading
	 */
	public String getGoalHeading() {
		return goalHeading;
	}
	/**
	 * @param goalHeading the goalHeading to set
	 */
	public void setGoalHeading(String goalHeading) {
		this.goalHeading = goalHeading;
	}
	/**
	 * @return the goalDescription
	 */
	public String getGoalDescription() {
		return goalDescription;
	}
	/**
	 * @param goalDescription the goalDescription to set
	 */
	public void setGoalDescription(String goalDescription) {
		this.goalDescription = goalDescription;
	}
	/**
	 * @return the goalStartDate
	 */
	public Date getGoalStartDate() {
		return goalStartDate;
	}
	/**
	 * @param goalStartDate the goalStartDate to set
	 */
	public void setGoalStartDate(Date goalStartDate) {
		this.goalStartDate = goalStartDate;
	}
	/**
	 * @return the goalEndDate
	 */
	public Date getGoalEndDate() {
		return goalEndDate;
	}
	/**
	 * @param goalEndDate the goalEndDate to set
	 */
	public void setGoalEndDate(Date goalEndDate) {
		this.goalEndDate = goalEndDate;
	}
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
	 * @return the goalAttachment
	 */
	public String getGoalAttachment() {
		return goalAttachment;
	}
	/**
	 * @param goalAttachment the goalAttachment to set
	 */
	public void setGoalAttachment(String goalAttachment) {
		this.goalAttachment = goalAttachment;
	}
	/**
	 * @return the goalStatus
	 */
	public String getGoalStatus() {
		return goalStatus;
	}
	/**
	 * @param goalStatus the goalStatus to set
	 */
	public void setGoalStatus(String goalStatus) {
		this.goalStatus = goalStatus;
	}
	/**
	 * @return the goalApprovedStatus
	 */
	public String getGoalApprovedStatus() {
		return goalApprovedStatus;
	}
	/**
	 * @param goalApprovedStatus the goalApprovedStatus to set
	 */
	public void setGoalApprovedStatus(String goalApprovedStatus) {
		this.goalApprovedStatus = goalApprovedStatus;
	}
	/**
	 * @return the confirmNote
	 */
	public String getConfirmNote() {
		return confirmNote;
	}
	/**
	 * @param confirmNote the confirmNote to set
	 */
	public void setConfirmNote(String confirmNote) {
		this.confirmNote = confirmNote;
	}
	/**
	 * @return the goalCreatedDate
	 */
	public Date getGoalCreatedDate() {
		return goalCreatedDate;
	}
	/**
	 * @param goalCreatedDate the goalCreatedDate to set
	 */
	public void setGoalCreatedDate(Date goalCreatedDate) {
		this.goalCreatedDate = goalCreatedDate;
	}
	/**
	 * @return the goalUpdatedDate
	 */
	public Date getGoalUpdatedDate() {
		return goalUpdatedDate;
	}
	/**
	 * @param goalUpdatedDate the goalUpdatedDate to set
	 */
	public void setGoalUpdatedDate(Date goalUpdatedDate) {
		this.goalUpdatedDate = goalUpdatedDate;
	}
	/**
	 * @return the goalPercantage
	 */
	public Integer getGoalPercantage() {
		return goalPercentage;
	}
	/**
	 * @param goalPercantage the goalPercantage to set
	 */
	public void setGoalPercantage(Integer goalPercentage) {
		this.goalPercentage = goalPercentage;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	/**
	 * @return the reply
	 */
	public String getReply() {
		return reply;
	}
	/**
	 * @param reply the reply to set
	 */
	public void setReply(String reply) {
		this.reply = reply;
	}

}