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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Palash
 */
@Entity
@Table(name = "em_other_skill_rating")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmOtherSkillRating.findAll", query = "SELECT e FROM EmOtherSkillRating e")
    , @NamedQuery(name = "EmOtherSkillRating.findByOtherSkillRatingId", query = "SELECT e FROM EmOtherSkillRating e WHERE e.otherSkillRatingId = :otherSkillRatingId")
    , @NamedQuery(name = "EmOtherSkillRating.findBySelfSkillRatingId", query = "SELECT e FROM EmOtherSkillRating e WHERE e.selfSkillRatingId = :selfSkillRatingId")
    , @NamedQuery(name = "EmOtherSkillRating.findByOtherSkillProficiency", query = "SELECT e FROM EmOtherSkillRating e WHERE e.otherSkillProficiency = :otherSkillProficiency")
    , @NamedQuery(name = "EmOtherSkillRating.findByGivingEmployeeId", query = "SELECT e FROM EmOtherSkillRating e WHERE e.givingEmployeeId = :givingEmployeeId")
    , @NamedQuery(name = "EmOtherSkillRating.findByOtherSkillRatingCreatedDate", query = "SELECT e FROM EmOtherSkillRating e WHERE e.otherSkillRatingCreatedDate = :otherSkillRatingCreatedDate")
    , @NamedQuery(name = "EmOtherSkillRating.findByOtherSkillRatingUpdatedDate", query = "SELECT e FROM EmOtherSkillRating e WHERE e.otherSkillRatingUpdatedDate = :otherSkillRatingUpdatedDate")})
public class EmOtherSkillRating implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "other_skill_rating_id")
    private Integer otherSkillRatingId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "self_skill_rating_id")
    private int selfSkillRatingId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "other_skill_proficiency")
    private int otherSkillProficiency;
    @Basic(optional = false)
    @NotNull
    @Column(name = "giving_employee_id")
    private int givingEmployeeId;
    @Column(name = "other_skill_rating_created_date")
    @Temporal(TemporalType.DATE)
    private Date otherSkillRatingCreatedDate;
    @Column(name = "other_skill_rating_updated_date")
    @Temporal(TemporalType.DATE)
    private Date otherSkillRatingUpdatedDate;

    public EmOtherSkillRating() {
    }

    public EmOtherSkillRating(Integer otherSkillRatingId) {
        this.otherSkillRatingId = otherSkillRatingId;
    }

    public EmOtherSkillRating(Integer otherSkillRatingId, int selfSkillRatingId, int otherSkillProficiency, int givingEmployeeId) {
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
        if (!(object instanceof EmOtherSkillRating)) {
            return false;
        }
        EmOtherSkillRating other = (EmOtherSkillRating) object;
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
