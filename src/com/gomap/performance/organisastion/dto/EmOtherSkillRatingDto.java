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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Palash
 */
public class EmOtherSkillRatingDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer otherSkillRatingId;
    private int selfSkillRatingId;
    private int otherSkillProficiency;
    private int givingEmployeeId;
    private Date otherSkillRatingCreatedDate;
    private Date otherSkillRatingUpdatedDate;

    public EmOtherSkillRatingDto() {
    }

    public EmOtherSkillRatingDto(Integer otherSkillRatingId) {
        this.otherSkillRatingId = otherSkillRatingId;
    }

    public EmOtherSkillRatingDto(Integer otherSkillRatingId, int selfSkillRatingId, int otherSkillProficiency, int givingEmployeeId) {
        this.otherSkillRatingId = otherSkillRatingId;
        this.selfSkillRatingId = selfSkillRatingId;
        this.otherSkillProficiency = otherSkillProficiency;
        this.givingEmployeeId = givingEmployeeId;
    }

    public Integer getOtherSkillRatingId() {
        return otherSkillRatingId;
    }

    public void setOtherSkillRatingId(Integer otherSkillRatingId) {
        this.otherSkillRatingId = otherSkillRatingId;
    }

    public int getSelfSkillRatingId() {
        return selfSkillRatingId;
    }

    public void setSelfSkillRatingId(int selfSkillRatingId) {
        this.selfSkillRatingId = selfSkillRatingId;
    }

    public int getOtherSkillProficiency() {
        return otherSkillProficiency;
    }

    public void setOtherSkillProficiency(int otherSkillProficiency) {
        this.otherSkillProficiency = otherSkillProficiency;
    }

    public int getGivingEmployeeId() {
        return givingEmployeeId;
    }

    public void setGivingEmployeeId(int givingEmployeeId) {
        this.givingEmployeeId = givingEmployeeId;
    }

    public Date getOtherSkillRatingCreatedDate() {
        return otherSkillRatingCreatedDate;
    }

    public void setOtherSkillRatingCreatedDate(Date otherSkillRatingCreatedDate) {
        this.otherSkillRatingCreatedDate = otherSkillRatingCreatedDate;
    }

    public Date getOtherSkillRatingUpdatedDate() {
        return otherSkillRatingUpdatedDate;
    }

    public void setOtherSkillRatingUpdatedDate(Date otherSkillRatingUpdatedDate) {
        this.otherSkillRatingUpdatedDate = otherSkillRatingUpdatedDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (otherSkillRatingId != null ? otherSkillRatingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmOtherSkillRatingDto)) {
            return false;
        }
        EmOtherSkillRatingDto other = (EmOtherSkillRatingDto) object;
        if ((this.otherSkillRatingId == null && other.otherSkillRatingId != null) || (this.otherSkillRatingId != null && !this.otherSkillRatingId.equals(other.otherSkillRatingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gomap.performance.organisation.EmOtherSkillRating[ otherSkillRatingId=" + otherSkillRatingId + " ]";
    }
    
}
