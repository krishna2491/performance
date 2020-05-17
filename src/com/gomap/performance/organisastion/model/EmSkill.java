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
import javax.persistence.PrePersist;
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
@Table(name = "em_skill")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmSkill.findAll", query = "SELECT e FROM EmSkill e")
    , @NamedQuery(name = "EmSkill.findBySkillId", query = "SELECT e FROM EmSkill e WHERE e.skillId = :skillId")
    , @NamedQuery(name = "EmSkill.findBySkillName", query = "SELECT e FROM EmSkill e WHERE e.skillName = :skillName")
    , @NamedQuery(name = "EmSkill.findBySkillCreatedDate", query = "SELECT e FROM EmSkill e WHERE e.skillCreatedDate = :skillCreatedDate")
    , @NamedQuery(name = "EmSkill.findBySkillUpdatedDate", query = "SELECT e FROM EmSkill e WHERE e.skillUpdatedDate = :skillUpdatedDate")})
public class EmSkill implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "skill_id")
    private Integer skillId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "skill_name")
    private String skillName;
    @Column(name = "skill_created_date")
    @Temporal(TemporalType.DATE)
    private Date skillCreatedDate;
    @Column(name = "skill_updated_date")
    @Temporal(TemporalType.DATE)
    private Date skillUpdatedDate;
    @Column(name = "activate_flag")
    @Size(min = 1, max = 5)
    private Integer activateFlag;


    public EmSkill() {
    }

    public EmSkill(Integer skillId) {
        this.skillId = skillId;
    }

    public EmSkill(Integer skillId, String skillName) {
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
        if (!(object instanceof EmSkill)) {
            return false;
        }
        EmSkill other = (EmSkill) object;
        if ((this.skillId == null && other.skillId != null) || (this.skillId != null && !this.skillId.equals(other.skillId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gomap.performance.organisation.EmSkill[ skillId=" + skillId + " ]";
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
	@PrePersist
	public void prePersist() {
	    if(activateFlag == null) //We set default value in case if the value is not set yet.
	        activateFlag = 1;
	    //System.out.println("coming here");
	}
    
}
