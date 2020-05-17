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
@Table(name = "em_goal_wise_attachment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmGoalWiseAttachment.findAll", query = "SELECT e FROM EmGoalWiseAttachment e")
    , @NamedQuery(name = "EmGoalWiseAttachment.findByGoalAttachmentId", query = "SELECT e FROM EmGoalWiseAttachment e WHERE e.goalAttachmentId = :goalAttachmentId")
    , @NamedQuery(name = "EmGoalWiseAttachment.findByGoalAttachment", query = "SELECT e FROM EmGoalWiseAttachment e WHERE e.goalAttachment = :goalAttachment")
    , @NamedQuery(name = "EmGoalWiseAttachment.findByGoalId", query = "SELECT e FROM EmGoalWiseAttachment e WHERE e.goalId = :goalId")
    , @NamedQuery(name = "EmGoalWiseAttachment.findByGoalAttachmentCreatedDate", query = "SELECT e FROM EmGoalWiseAttachment e WHERE e.goalAttachmentCreatedDate = :goalAttachmentCreatedDate")
    , @NamedQuery(name = "EmGoalWiseAttachment.findByGoalAttachmentUpdatedDate", query = "SELECT e FROM EmGoalWiseAttachment e WHERE e.goalAttachmentUpdatedDate = :goalAttachmentUpdatedDate")})
public class EmGoalWiseAttachment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "goal_attachment_id")
    private Integer goalAttachmentId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "goal_attachment")
    private String goalAttachment;
    @Basic(optional = false)
    @NotNull
    @Column(name = "goal_id")
    private int goalId;
    @Column(name = "goal_attachment_created_date")
    @Temporal(TemporalType.DATE)
    private Date goalAttachmentCreatedDate;
    @Column(name = "goal_attachment_updated_date")
    @Temporal(TemporalType.DATE)
    private Date goalAttachmentUpdatedDate;

    public EmGoalWiseAttachment() {
    }

    public EmGoalWiseAttachment(Integer goalAttachmentId) {
        this.goalAttachmentId = goalAttachmentId;
    }

    public EmGoalWiseAttachment(Integer goalAttachmentId, String goalAttachment, int goalId) {
        this.goalAttachmentId = goalAttachmentId;
        this.goalAttachment = goalAttachment;
        this.goalId = goalId;
    }

    public Integer getGoalAttachmentId() {
        return goalAttachmentId;
    }

    public void setGoalAttachmentId(Integer goalAttachmentId) {
        this.goalAttachmentId = goalAttachmentId;
    }

    public String getGoalAttachment() {
        return goalAttachment;
    }

    public void setGoalAttachment(String goalAttachment) {
        this.goalAttachment = goalAttachment;
    }

    public int getGoalId() {
        return goalId;
    }

    public void setGoalId(int goalId) {
        this.goalId = goalId;
    }

    public Date getGoalAttachmentCreatedDate() {
        return goalAttachmentCreatedDate;
    }

    public void setGoalAttachmentCreatedDate(Date goalAttachmentCreatedDate) {
        this.goalAttachmentCreatedDate = goalAttachmentCreatedDate;
    }

    public Date getGoalAttachmentUpdatedDate() {
        return goalAttachmentUpdatedDate;
    }

    public void setGoalAttachmentUpdatedDate(Date goalAttachmentUpdatedDate) {
        this.goalAttachmentUpdatedDate = goalAttachmentUpdatedDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (goalAttachmentId != null ? goalAttachmentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmGoalWiseAttachment)) {
            return false;
        }
        EmGoalWiseAttachment other = (EmGoalWiseAttachment) object;
        if ((this.goalAttachmentId == null && other.goalAttachmentId != null) || (this.goalAttachmentId != null && !this.goalAttachmentId.equals(other.goalAttachmentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gomap.performance.organisation.EmGoalWiseAttachment[ goalAttachmentId=" + goalAttachmentId + " ]";
    }
    
}
