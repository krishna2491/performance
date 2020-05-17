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
public class EmGoalWiseChatDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer goalChatId;
    private int goalId;
    private int employeeId;
    private int taskAssignedById;
    private String messageBy;
    private String message;
    private Date goalChatCreatedAdte;
    private Date goalChatUpdatedDate;

    public EmGoalWiseChatDto() {
    }

    public EmGoalWiseChatDto(Integer goalChatId) {
        this.goalChatId = goalChatId;
    }

    public EmGoalWiseChatDto(Integer goalChatId, int goalId, int employeeId, int taskAssignedById, String messageBy) {
        this.goalChatId = goalChatId;
        this.goalId = goalId;
        this.employeeId = employeeId;
        this.taskAssignedById = taskAssignedById;
        this.messageBy = messageBy;
    }

    public Integer getGoalChatId() {
        return goalChatId;
    }

    public void setGoalChatId(Integer goalChatId) {
        this.goalChatId = goalChatId;
    }

    public int getGoalId() {
        return goalId;
    }

    public void setGoalId(int goalId) {
        this.goalId = goalId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getTaskAssignedById() {
        return taskAssignedById;
    }

    public void setTaskAssignedById(int taskAssignedById) {
        this.taskAssignedById = taskAssignedById;
    }

    public String getMessageBy() {
        return messageBy;
    }

    public void setMessageBy(String messageBy) {
        this.messageBy = messageBy;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getGoalChatCreatedAdte() {
        return goalChatCreatedAdte;
    }

    public void setGoalChatCreatedAdte(Date goalChatCreatedAdte) {
        this.goalChatCreatedAdte = goalChatCreatedAdte;
    }

    public Date getGoalChatUpdatedDate() {
        return goalChatUpdatedDate;
    }

    public void setGoalChatUpdatedDate(Date goalChatUpdatedDate) {
        this.goalChatUpdatedDate = goalChatUpdatedDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (goalChatId != null ? goalChatId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmGoalWiseChatDto)) {
            return false;
        }
        EmGoalWiseChatDto other = (EmGoalWiseChatDto) object;
        if ((this.goalChatId == null && other.goalChatId != null) || (this.goalChatId != null && !this.goalChatId.equals(other.goalChatId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gomap.performance.organisation.EmGoalWiseChat[ goalChatId=" + goalChatId + " ]";
    }
    
}
