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
 * @author krishnakant
 */
@Entity
@Table(name = "em_feedback_request")
@XmlRootElement
public class EmFeedbackRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "feedback_request_id")
    private Integer feedbackRequestId;
    /**
	 * @param feedbackRequestId
	 * @param feedbackForId
	 * @param feedbackFromId
	 * @param feedbackRequesterId
	 * @param feedbackStatus
	 * @param projectId
	 * @param feedbackReply
	 * @param feedbackCreatedDate
	 * @param feedbackUpdatedDate
	 */
	public EmFeedbackRequest(Integer feedbackRequestId, Integer feedbackForId, Integer feedbackFromId,
			Integer feedbackRequesterId, String feedbackStatus, Integer projectId, String feedbackReply,
			Date feedbackCreatedDate, Date feedbackUpdatedDate) {
		super();
		this.feedbackRequestId = feedbackRequestId;
		this.feedbackForId = feedbackForId;
		this.feedbackFromId = feedbackFromId;
		this.feedbackRequesterId = feedbackRequesterId;
		this.feedbackStatus = feedbackStatus;
		this.projectId = projectId;
		this.feedbackReply = feedbackReply;
		this.feedbackCreatedDate = feedbackCreatedDate;
		this.feedbackUpdatedDate = feedbackUpdatedDate;
	}

	@Basic(optional = false)
    @NotNull
    @Column(name = "feedback_for_id")
    private Integer feedbackForId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "feedback_from_id")
    private Integer feedbackFromId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "feedback_requester_id")
    private Integer feedbackRequesterId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "feedback_status")
    private String feedbackStatus;
    @Basic(optional = true)
    @Size(min = 1, max = 255)
    @Column(name = "project_id")
    private Integer projectId;
    @Basic(optional = true)
   
    @Size(min = 1, max = 255)
    @Column(name = "feedback_reply")
    private String feedbackReply;
    @Column(name = "feedback_created_date")
    @Temporal(TemporalType.DATE)
    private Date feedbackCreatedDate;
    @Column(name = "feedback_updated_date")
    @Temporal(TemporalType.DATE)
    private Date feedbackUpdatedDate;
    @Basic(optional = false)
    @Size(min = 1, max = 5)
    @Column(name = "activate_flag")
    private Integer activateFlag;

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



	public EmFeedbackRequest() {
    }

	/**
	 * @return the feedbackRequestId
	 */
	public Integer getFeedbackRequestId() {
		return feedbackRequestId;
	}

	/**
	 * @param feedbackRequestId the feedbackRequestId to set
	 */
	public void setFeedbackRequestId(Integer feedbackRequestId) {
		this.feedbackRequestId = feedbackRequestId;
	}

	/**
	 * @return the feedbackForId
	 */
	public Integer getfeedbackForId() {
		return feedbackForId;
	}

	/**
	 * @param feedbackForId the feedbackForId to set
	 */
	public void setfeedbackForId(Integer feedbackForId) {
		this.feedbackForId = feedbackForId;
	}

	/**
	 * @return the feedbackFromId
	 */
	public Integer getFeedbackFromId() {
		return feedbackFromId;
	}

	/**
	 * @param feedbackFromId the feedbackFromId to set
	 */
	public void setFeedbackFromId(Integer feedbackFromId) {
		this.feedbackFromId = feedbackFromId;
	}

	/**
	 * @return the feedbackRequesterId
	 */
	public Integer getFeedbackRequesterId() {
		return feedbackRequesterId;
	}

	/**
	 * @param feedbackRequesterId the feedbackRequesterId to set
	 */
	public void setFeedbackRequesterId(Integer feedbackRequesterId) {
		this.feedbackRequesterId = feedbackRequesterId;
	}

	/**
	 * @return the feedbackStatus
	 */
	public String getFeedbackStatus() {
		return feedbackStatus;
	}

	/**
	 * @param feedbackStatus the feedbackStatus to set
	 */
	public void setFeedbackStatus(String feedbackStatus) {
		this.feedbackStatus = feedbackStatus;
	}

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
	 * @return the feedbackReply
	 */
	public String getFeedbackReply() {
		return feedbackReply;
	}

	/**
	 * @param feedbackReply the feedbackReply to set
	 */
	public void setFeedbackReply(String feedbackReply) {
		this.feedbackReply = feedbackReply;
	}

	/**
	 * @return the feedbackCreatedDate
	 */
	public Date getFeedbackCreatedDate() {
		return feedbackCreatedDate;
	}

	/**
	 * @param feedbackCreatedDate the feedbackCreatedDate to set
	 */
	public void setFeedbackCreatedDate(Date feedbackCreatedDate) {
		this.feedbackCreatedDate = feedbackCreatedDate;
	}

	/**
	 * @return the feedbackUpdatedDate
	 */
	public Date getFeedbackUpdatedDate() {
		return feedbackUpdatedDate;
	}

	/**
	 * @param feedbackUpdatedDate the feedbackUpdatedDate to set
	 */
	public void setFeedbackUpdatedDate(Date feedbackUpdatedDate) {
		this.feedbackUpdatedDate = feedbackUpdatedDate;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
