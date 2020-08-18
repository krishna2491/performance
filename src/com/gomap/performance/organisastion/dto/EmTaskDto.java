/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gomap.performance.organisastion.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Palash
 */
public class EmTaskDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer taskId;
    private Integer departmentId;
    private String taskHeading;
    private String taskDescription;
    private Integer projectId;
    private Integer assignedById;
    private Integer assignedToId;
    private Date taskStartDate;
    private Date taskDueDate;
    private String taskAttachment;
    private String taskPriority;
    private String taskStatus;
    private Date taskCreatedDate;
    private Date taskUpdatedDate;
    private String comment;
    private String reply;

    public EmTaskDto() {
    }

    public EmTaskDto(Integer taskId) {
        this.taskId = taskId;
    }

    public EmTaskDto(Integer taskId, Integer departmentId, String taskHeading, Integer projectId, Integer assignedById, Integer assignedToId, String taskAttachment, String taskPriority, String taskStatus) {
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
