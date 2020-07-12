/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gomap.performance.organisastion.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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

import com.gomap.performance.organisastion.model.FeedbackRequestParaMpg;

/**
 *
 * @author krishnakant
 */

public class EmFeedbackRequestDto implements Serializable {

 
   
    private Integer feedbackRequestId;
   
	public EmFeedbackRequestDto(Integer feedbackRequestId, Integer feedbackForId, Integer feedbackFromId,
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

	
    private Integer feedbackForId;
   
    private Integer feedbackFromId;
   
    private Integer feedbackRequesterId;
   
    private String feedbackStatus;
 
    private Integer projectId;
  
    
    private String feedbackReply;
    
    private Date feedbackCreatedDate;
   
    private Date feedbackUpdatedDate;
    private Integer activateFlag;
    private List<FeedbackRequestParaMpgDto> feedbackParameteres;

   
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

	/**
	 * @return the feedbackParameteres
	 */
	public List<FeedbackRequestParaMpgDto> getFeedbackParameteres() {
		return feedbackParameteres;
	}

	/**
	 * @param feedbackParameteres the feedbackParameteres to set
	 */
	public void setFeedbackParameteres(List<FeedbackRequestParaMpgDto> feedbackParameteres) {
		this.feedbackParameteres = feedbackParameteres;
	}

	public EmFeedbackRequestDto() {
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


	
}
