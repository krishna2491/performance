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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Palash
 */
public class EmSkillDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer skillId;
    private String skillName;
    private Date skillCreatedDate;
    private Date skillUpdatedDate;

    public EmSkillDto() {
    }

    public EmSkillDto(Integer skillId) {
        this.skillId = skillId;
    }

    public EmSkillDto(Integer skillId, String skillName) {
        this.skillId = skillId;
        this.skillName = skillName;
    }

    public Integer getSkillId() {
        return skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public Date getSkillCreatedDate() {
        return skillCreatedDate;
    }

    public void setSkillCreatedDate(Date skillCreatedDate) {
        this.skillCreatedDate = skillCreatedDate;
    }

    public Date getSkillUpdatedDate() {
        return skillUpdatedDate;
    }

    public void setSkillUpdatedDate(Date skillUpdatedDate) {
        this.skillUpdatedDate = skillUpdatedDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (skillId != null ? skillId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmSkillDto)) {
            return false;
        }
        EmSkillDto other = (EmSkillDto) object;
        if ((this.skillId == null && other.skillId != null) || (this.skillId != null && !this.skillId.equals(other.skillId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gomap.performance.organisation.EmSkill[ skillId=" + skillId + " ]";
    }
    
}
