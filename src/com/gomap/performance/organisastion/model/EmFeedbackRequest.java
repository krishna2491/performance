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
@Table(name = "em_feedback_request")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmFeedbackRequest.findAll", query = "SELECT e FROM EmFeedbackRequest e")
    , @NamedQuery(name = "EmFeedbackRequest.findByFeedbackRequestId", query = "SELECT e FROM EmFeedbackRequest e WHERE e.feedbackRequestId = :feedbackRequestId")
    , @NamedQuery(name = "EmFeedbackRequest.findByFeedbackFromId", query = "SELECT e FROM EmFeedbackRequest e WHERE e.feedbackFromId = :feedbackFromId")
    , @NamedQuery(name = "EmFeedbackRequest.findByFeedbackRequesterId", query = "SELECT e FROM EmFeedbackRequest e WHERE e.feedbackRequesterId = :feedbackRequesterId")
    , @NamedQuery(name = "EmFeedbackRequest.findByFeedbackStatus", query = "SELECT e FROM EmFeedbackRequest e WHERE e.feedbackStatus = :feedbackStatus")
    , @NamedQuery(name = "EmFeedbackRequest.findByFeedbackReply", query = "SELECT e FROM EmFeedbackRequest e WHERE e.feedbackReply = :feedbackReply")
    , @NamedQuery(name = "EmFeedbackRequest.findByFeedbackCreatedDate", query = "SELECT e FROM EmFeedbackRequest e WHERE e.feedbackCreatedDate = :feedbackCreatedDate")
    , @NamedQuery(name = "EmFeedbackRequest.findByFeedbackUpdatedDate", query = "SELECT e FROM EmFeedbackRequest e WHERE e.feedbackUpdatedDate = :feedbackUpdatedDate")})
public class EmFeedbackRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "feedback_request_id")
    private Integer feedbackRequestId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "feedback_from_id")
    private int feedbackFromId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "feedback_requester_id")
    private int feedbackRequesterId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "feedback_status")
    private String feedbackStatus;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "feedback_description")
    private String feedbackDescription;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "feedback_reply")
    private String feedbackReply;
    @Column(name = "feedback_created_date")
    @Temporal(TemporalType.DATE)
    private Date feedbackCreatedDate;
    @Column(name = "feedback_updated_date")
    @Temporal(TemporalType.DATE)
    private Date feedbackUpdatedDate;

    public EmFeedbackRequest() {
    }

    public EmFeedbackRequest(Integer feedbackRequestId) {
        this.feedbackRequestId = feedbackRequestId;
    }

    public EmFeedbackRequest(Integer feedbackRequestId, int feedbackFromId, int feedbackRequesterId, String feedbackStatus, String feedbackReply) {
        this.feedbackRequestId = feedbackRequestId;
        this.feedbackFromId = feedbackFromId;
        this.feedbackRequesterId = feedbackRequesterId;
        this.feedbackStatus = feedbackStatus;
        this.feedbackReply = feedbackReply;
    }

    public Integer getFeedbackRequestId() {
        return feedbackRequestId;
    }

    public void setFeedbackRequestId(Integer feedbackRequestId) {
        this.feedbackRequestId = feedbackRequestId;
    }

    public int getFeedbackFromId() {
        return feedbackFromId;
    }

    public void setFeedbackFromId(int feedbackFromId) {
        this.feedbackFromId = feedbackFromId;
    }

    public int getFeedbackRequesterId() {
        return feedbackRequesterId;
    }

    public void setFeedbackRequesterId(int feedbackRequesterId) {
        this.feedbackRequesterId = feedbackRequesterId;
    }

    public String getFeedbackStatus() {
        return feedbackStatus;
    }

    public void setFeedbackStatus(String feedbackStatus) {
        this.feedbackStatus = feedbackStatus;
    }

    public String getFeedbackDescription() {
        return feedbackDescription;
    }

    public void setFeedbackDescription(String feedbackDescription) {
        this.feedbackDescription = feedbackDescription;
    }

    public String getFeedbackReply() {
        return feedbackReply;
    }

    public void setFeedbackReply(String feedbackReply) {
        this.feedbackReply = feedbackReply;
    }

    public Date getFeedbackCreatedDate() {
        return feedbackCreatedDate;
    }

    public void setFeedbackCreatedDate(Date feedbackCreatedDate) {
        this.feedbackCreatedDate = feedbackCreatedDate;
    }

    public Date getFeedbackUpdatedDate() {
        return feedbackUpdatedDate;
    }

    public void setFeedbackUpdatedDate(Date feedbackUpdatedDate) {
        this.feedbackUpdatedDate = feedbackUpdatedDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (feedbackRequestId != null ? feedbackRequestId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmFeedbackRequest)) {
            return false;
        }
        EmFeedbackRequest other = (EmFeedbackRequest) object;
        if ((this.feedbackRequestId == null && other.feedbackRequestId != null) || (this.feedbackRequestId != null && !this.feedbackRequestId.equals(other.feedbackRequestId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gomap.performance.organisation.EmFeedbackRequest[ feedbackRequestId=" + feedbackRequestId + " ]";
    }
    
}
