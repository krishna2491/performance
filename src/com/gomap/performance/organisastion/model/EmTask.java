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
@Table(name = "em_task")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmTask.findAll", query = "SELECT e FROM EmTask e")
    , @NamedQuery(name = "EmTask.findByTaskId", query = "SELECT e FROM EmTask e WHERE e.taskId = :taskId")
    , @NamedQuery(name = "EmTask.findByDepartmentId", query = "SELECT e FROM EmTask e WHERE e.departmentId = :departmentId")
    , @NamedQuery(name = "EmTask.findByTaskHeading", query = "SELECT e FROM EmTask e WHERE e.taskHeading = :taskHeading")
    , @NamedQuery(name = "EmTask.findByProjectId", query = "SELECT e FROM EmTask e WHERE e.projectId = :projectId")
    , @NamedQuery(name = "EmTask.findByAssignedById", query = "SELECT e FROM EmTask e WHERE e.assignedById = :assignedById")
    , @NamedQuery(name = "EmTask.findByAssignedToId", query = "SELECT e FROM EmTask e WHERE e.assignedToId = :assignedToId")
    , @NamedQuery(name = "EmTask.findByTaskStartDate", query = "SELECT e FROM EmTask e WHERE e.taskStartDate = :taskStartDate")
    , @NamedQuery(name = "EmTask.findByTaskDueDate", query = "SELECT e FROM EmTask e WHERE e.taskDueDate = :taskDueDate")
    , @NamedQuery(name = "EmTask.findByTaskAttachment", query = "SELECT e FROM EmTask e WHERE e.taskAttachment = :taskAttachment")
    , @NamedQuery(name = "EmTask.findByTaskPriority", query = "SELECT e FROM EmTask e WHERE e.taskPriority = :taskPriority")
    , @NamedQuery(name = "EmTask.findByTaskStatus", query = "SELECT e FROM EmTask e WHERE e.taskStatus = :taskStatus")
    , @NamedQuery(name = "EmTask.findByTaskCreatedDate", query = "SELECT e FROM EmTask e WHERE e.taskCreatedDate = :taskCreatedDate")
    , @NamedQuery(name = "EmTask.findByTaskUpdatedDate", query = "SELECT e FROM EmTask e WHERE e.taskUpdatedDate = :taskUpdatedDate")})
public class EmTask implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "task_id")
    private Integer taskId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "department_id")
    private Integer departmentId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "task_heading")
    private String taskHeading;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "task_description")
    private String taskDescription;
    @Basic(optional = false)
    @NotNull
    @Column(name = "project_id")
    private Integer projectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "assigned_by_id")
    private Integer assignedById;
    @Basic(optional = false)
    @NotNull
    @Column(name = "assigned_to_id")
    private Integer assignedToId;
    @Column(name = "task_start_date")
    @Temporal(TemporalType.DATE)
    private Date taskStartDate;
    @Column(name = "task_due_date")
    @Temporal(TemporalType.DATE)
    private Date taskDueDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "task_attachment")
    private String taskAttachment;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "task_priority")
    private String taskPriority;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "task_status")
    private String taskStatus;
    @Column(name = "task_created_date")
    @Temporal(TemporalType.DATE)
    private Date taskCreatedDate;
    @Column(name = "task_updated_date")
    @Temporal(TemporalType.DATE)
    private Date taskUpdatedDate;

    @Column(name = "activate_flag")
    @Size(min = 1, max = 5)
    private Integer activateFlag;
    @Column(name = "comment")
    private String comment;
    @Column(name = "reply")
    private String reply;

    public EmTask() {
    }

    public EmTask(Integer taskId) {
        this.taskId = taskId;
    }

    public EmTask(Integer taskId, Integer departmentId, String taskHeading, Integer projectId, Integer assignedById, Integer assignedToId, String taskAttachment, String taskPriority, String taskStatus) {
        this.taskId = taskId;
        this.departmentId = departmentId;
        this.taskHeading = taskHeading;
        this.projectId = projectId;
        this.assignedById = assignedById;
        this.assignedToId = assignedToId;
        this.taskAttachment = taskAttachment;
        this.taskPriority = taskPriority;
        this.taskStatus = taskStatus;
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

    public String getTaskHeading() {
        return taskHeading;
    }

    public void setTaskHeading(String taskHeading) {
        this.taskHeading = taskHeading;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getAssignedById() {
        return assignedById;
    }

    public void setAssignedById(Integer assignedById) {
        this.assignedById = assignedById;
    }

    public Integer getAssignedToId() {
        return assignedToId;
    }

    public void setAssignedToId(Integer assignedToId) {
        this.assignedToId = assignedToId;
    }

    public Date getTaskStartDate() {
        return taskStartDate;
    }

    public void setTaskStartDate(Date taskStartDate) {
        this.taskStartDate = taskStartDate;
    }

    public Date getTaskDueDate() {
        return taskDueDate;
    }

    public void setTaskDueDate(Date taskDueDate) {
        this.taskDueDate = taskDueDate;
    }

    public String getTaskAttachment() {
        return taskAttachment;
    }

    public void setTaskAttachment(String taskAttachment) {
        this.taskAttachment = taskAttachment;
    }

    public String getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(String taskPriority) {
        this.taskPriority = taskPriority;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Date getTaskCreatedDate() {
        return taskCreatedDate;
    }

    public void setTaskCreatedDate(Date taskCreatedDate) {
        this.taskCreatedDate = taskCreatedDate;
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

	public Date getTaskUpdatedDate() {
        return taskUpdatedDate;
    }

    public void setTaskUpdatedDate(Date taskUpdatedDate) {
        this.taskUpdatedDate = taskUpdatedDate;
    }

      @Override
    public String toString() {
        return "com.gomap.performance.organisation.EmTask[ taskId=" + taskId + " ]";
    }
@PrePersist
public void prePersist() {
    if(activateFlag == null) //We set default value in case if the value is not set yet.
        activateFlag = 1;
    System.out.println("coming here");
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
