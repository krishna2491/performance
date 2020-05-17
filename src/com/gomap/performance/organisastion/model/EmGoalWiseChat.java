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
@Table(name = "em_goal_wise_chat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmGoalWiseChat.findAll", query = "SELECT e FROM EmGoalWiseChat e")
    , @NamedQuery(name = "EmGoalWiseChat.findByGoalChatId", query = "SELECT e FROM EmGoalWiseChat e WHERE e.goalChatId = :goalChatId")
    , @NamedQuery(name = "EmGoalWiseChat.findByGoalId", query = "SELECT e FROM EmGoalWiseChat e WHERE e.goalId = :goalId")
    , @NamedQuery(name = "EmGoalWiseChat.findByEmployeeId", query = "SELECT e FROM EmGoalWiseChat e WHERE e.employeeId = :employeeId")
    , @NamedQuery(name = "EmGoalWiseChat.findByTaskAssignedById", query = "SELECT e FROM EmGoalWiseChat e WHERE e.taskAssignedById = :taskAssignedById")
    , @NamedQuery(name = "EmGoalWiseChat.findByMessageBy", query = "SELECT e FROM EmGoalWiseChat e WHERE e.messageBy = :messageBy")
    , @NamedQuery(name = "EmGoalWiseChat.findByGoalChatCreatedAdte", query = "SELECT e FROM EmGoalWiseChat e WHERE e.goalChatCreatedAdte = :goalChatCreatedAdte")
    , @NamedQuery(name = "EmGoalWiseChat.findByGoalChatUpdatedDate", query = "SELECT e FROM EmGoalWiseChat e WHERE e.goalChatUpdatedDate = :goalChatUpdatedDate")})
public class EmGoalWiseChat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "goal_chat_id")
    private Integer goalChatId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "goal_id")
    private int goalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "employee_id")
    private int employeeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "task_assigned_by_id")
    private int taskAssignedById;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "message_by")
    private String messageBy;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "message")
    private String message;
    @Column(name = "goal_chat_created_adte")
    @Temporal(TemporalType.DATE)
    private Date goalChatCreatedAdte;
    @Column(name = "goal_chat_updated_date")
    @Temporal(TemporalType.DATE)
    private Date goalChatUpdatedDate;

    public EmGoalWiseChat() {
    }

    public EmGoalWiseChat(Integer goalChatId) {
        this.goalChatId = goalChatId;
    }

    public EmGoalWiseChat(Integer goalChatId, int goalId, int employeeId, int taskAssignedById, String messageBy) {
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
        if (!(object instanceof EmGoalWiseChat)) {
            return false;
        }
        EmGoalWiseChat other = (EmGoalWiseChat) object;
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
