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
 * @author krishnakant
 */

public class FeedbackRequestParaMpgDto implements Serializable {

    private static final long serialVersionUID = 1L;
   
    private Integer feedbackRequestMpgId;
    private Integer feedbackRequestId;
	
    private Integer paramId;
   
    private Integer rating;
   
    private String description;
   
   
    private Date createdDate;
   
    private Date updatedDate;
   
    private Integer activateFlag;

    public FeedbackRequestParaMpgDto() {
    }

	/**
	 * @return the feedbackRequestMpgId
	 */
	public Integer getFeedbackRequestMpgId() {
		return feedbackRequestMpgId;
	}

	/**
	 * @param feedbackRequestMpgId the feedbackRequestMpgId to set
	 */
	public void setFeedbackRequestMpgId(Integer feedbackRequestMpgId) {
		this.feedbackRequestMpgId = feedbackRequestMpgId;
	}

	/**
	 * @return the paramId
	 */
	public Integer getParamId() {
		return paramId;
	}

	/**
	 * @param paramId the paramId to set
	 */
	public void setParamId(Integer paramId) {
		this.paramId = paramId;
	}

	/**
	 * @return the rating
	 */
	public Integer getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(Integer rating) {
		this.rating = rating;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the updatedDate
	 */
	public Date getUpdatedDate() {
		return updatedDate;
	}

	/**
	 * @param updatedDate the updatedDate to set
	 */
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
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

	public Integer getFeedbackRequestId() {
		return feedbackRequestId;
	}

	/**
	 * @param feedbackRequestId the feedbackRequestId to set
	 */
	public void setFeedbackRequestId(Integer feedbackRequestId) {
		this.feedbackRequestId = feedbackRequestId;
	}

	}
