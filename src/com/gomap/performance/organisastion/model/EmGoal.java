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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "em_goal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmGoal.findAll", query = "SELECT e FROM EmGoal e")
    , @NamedQuery(name = "EmGoal.findByGoalId", query = "SELECT e FROM EmGoal e WHERE e.goalId = :goalId")
    , @NamedQuery(name = "EmGoal.findByTaskId", query = "SELECT e FROM EmGoal e WHERE e.taskId = :taskId")
    , @NamedQuery(name = "EmGoal.findByDepartmentId", query = "SELECT e FROM EmGoal e WHERE e.departmentId = :departmentId")
    , @NamedQuery(name = "EmGoal.findByGoalHeading", query = "SELECT e FROM EmGoal e WHERE e.goalHeading = :goalHeading")
    , @NamedQuery(name = "EmGoal.findByGoalStartDate", query = "SELECT e FROM EmGoal e WHERE e.goalStartDate = :goalStartDate")
    , @NamedQuery(name = "EmGoal.findByGoalEndDate", query = "SELECT e FROM EmGoal e WHERE e.goalEndDate = :goalEndDate")
    , @NamedQuery(name = "EmGoal.findByEmployeeId", query = "SELECT e FROM EmGoal e WHERE e.employeeId = :employeeId")
    , @NamedQuery(name = "EmGoal.findByGoalAttachment", query = "SELECT e FROM EmGoal e WHERE e.goalAttachment = :goalAttachment")
    , @NamedQuery(name = "EmGoal.findByGoalStatus", query = "SELECT e FROM EmGoal e WHERE e.goalStatus = :goalStatus")
    , @NamedQuery(name = "EmGoal.findByGoalApprovedStatus", query = "SELECT e FROM EmGoal e WHERE e.goalApprovedStatus = :goalApprovedStatus")
    , @NamedQuery(name = "EmGoal.findByGoalCreatedDate", query = "SELECT e FROM EmGoal e WHERE e.goalCreatedDate = :goalCreatedDate")
    , @NamedQuery(name = "EmGoal.findByGoalUpdatedDate", query = "SELECT e FROM EmGoal e WHERE e.goalUpdatedDate = :goalUpdatedDate")})

public class EmGoal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "goal_id")
    private Integer goalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "task_id")
    private Integer taskId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "department_id")
    private Integer departmentId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "goal_heading")
    private String goalHeading;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "goal_description")
    private String goalDescription;
    @Column(name = "goal_start_date")
    @Temporal(TemporalType.DATE)
    private Date goalStartDate;
    @Column(name = "goal_end_date")
    @Temporal(TemporalType.DATE)
    private Date goalEndDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "employee_id")
    private Integer employeeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "goal_attachment")
    private String goalAttachment;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "goal_status")
    private String goalStatus;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "goal_approved_status")
    private String goalApprovedStatus;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "confirm_note")
    private String confirmNote;
    @Column(name = "goal_created_date")
    @Temporal(TemporalType.DATE)
    private Date goalCreatedDate;
    @Column(name = "goal_updated_date")
    @Temporal(TemporalType.DATE)
    private Date goalUpdatedDate;
    @Column(name = "activate_flag")
    @Size(min = 1, max = 5)
    private Integer activateFlag;
    @Column(name = "goal_percentage")
    
    private Integer goalPercentage;
    @Column(name = "comment")
    private String comment;
    @Column(name = "reply")
    private String reply;
   
    public EmGoal() {
    }

    public EmGoal(Integer goalId) {
        this.goalId = goalId;
    }

    public EmGoal(Integer goalId, Integer taskId, Integer departmentId, String goalHeading, Integer employeeId, String goalAttachment, String goalStatus, String goalApprovedStatus) {
        this.goalId = goalId;
        this.taskId = taskId;
        this.departmentId = departmentId;
        this.goalHeading = goalHeading;
        this.employeeId = employeeId;
        this.goalAttachment = goalAttachment;
        this.goalStatus = goalStatus;
        this.goalApprovedStatus = goalApprovedStatus;
    }

    public Integer getGoalId() {
        return goalId;
    }

    public void setGoalId(Integer goalId) {
        this.goalId = goalId;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getGoalHeading() {
        return goalHeading;
    }

    public void setGoalHeading(String goalHeading) {
        this.goalHeading = goalHeading;
    }

    public String getGoalDescription() {
        return goalDescription;
    }

    public void setGoalDescription(String goalDescription) {
        this.goalDescription = goalDescription;
    }

    public Date getGoalStartDate() {
        return goalStartDate;
    }

    public void setGoalStartDate(Date goalStartDate) {
        this.goalStartDate = goalStartDate;
    }

    public Date getGoalEndDate() {
        return goalEndDate;
    }

    public void setGoalEndDate(Date goalEndDate) {
        this.goalEndDate = goalEndDate;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getGoalAttachment() {
        return goalAttachment;
    }

    public void setGoalAttachment(String goalAttachment) {
        this.goalAttachment = goalAttachment;
    }

    public String getGoalStatus() {
        return goalStatus;
    }

    public void setGoalStatus(String goalStatus) {
        this.goalStatus = goalStatus;
    }

    public String getGoalApprovedStatus() {
        return goalApprovedStatus;
    }

    public void setGoalApprovedStatus(String goalApprovedStatus) {
        this.goalApprovedStatus = goalApprovedStatus;
    }

    public String getConfirmNote() {
        return confirmNote;
    }

    public void setConfirmNote(String confirmNote) {
        this.confirmNote = confirmNote;
    }

    public Date getGoalCreatedDate() {
        return goalCreatedDate;
    }

    public void setGoalCreatedDate(Date goalCreatedDate) {
        this.goalCreatedDate = goalCreatedDate;
    }

    public Date getGoalUpdatedDate() {
        return goalUpdatedDate;
    }

    public void setGoalUpdatedDate(Date goalUpdatedDate) {
        this.goalUpdatedDate = goalUpdatedDate;
    }

   
    @Override
    public String toString() {
        return "com.gomap.performance.organisation.EmGoal[ goalId=" + goalId + " ]";
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

/**
 * @return the goalPercantage
 */
public Integer getGoalPercentage() {
	return goalPercentage;
}

/**
 * @param goalPercantage the goalPercantage to set
 */
public void setGoalPercantage(Integer goalPercentage) {
	this.goalPercentage = goalPercentage;
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
