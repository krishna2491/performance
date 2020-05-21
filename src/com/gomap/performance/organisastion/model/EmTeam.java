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
@Table(name = "em_team")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmTeam.findAll", query = "SELECT e FROM EmTeam e")
    , @NamedQuery(name = "EmTeam.findByTeamId", query = "SELECT e FROM EmTeam e WHERE e.teamId = :teamId")
    , @NamedQuery(name = "EmTeam.findByDepartmentId", query = "SELECT e FROM EmTeam e WHERE e.departmentId = :departmentId")
    , @NamedQuery(name = "EmTeam.findByTeamName", query = "SELECT e FROM EmTeam e WHERE e.teamName = :teamName")
    , @NamedQuery(name = "EmTeam.findByProjectId", query = "SELECT e FROM EmTeam e WHERE e.projectId = :projectId")
    , @NamedQuery(name = "EmTeam.findByTeamCreatedBy", query = "SELECT e FROM EmTeam e WHERE e.teamCreatedBy = :teamCreatedBy")
    , @NamedQuery(name = "EmTeam.findByTeamUpdatedBy", query = "SELECT e FROM EmTeam e WHERE e.teamUpdatedBy = :teamUpdatedBy")
    , @NamedQuery(name = "EmTeam.findByTeamCreatedDate", query = "SELECT e FROM EmTeam e WHERE e.teamCreatedDate = :teamCreatedDate")
    , @NamedQuery(name = "EmTeam.findByTeamUpdatedDate", query = "SELECT e FROM EmTeam e WHERE e.teamUpdatedDate = :teamUpdatedDate")})
public class EmTeam implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "team_id")
    private Integer teamId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "department_id")
    private Integer departmentId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "team_name")
    private String teamName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "project_id")
    private Integer projectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "team_created_by")
    private Integer teamCreatedBy;
    @Column(name = "team_updated_by", nullable = true)
    private Integer teamUpdatedBy;
    @Column(name = "team_created_date")
    @Temporal(TemporalType.DATE)
    private Date teamCreatedDate;
    @Column(name = "team_updated_date")
    @Temporal(TemporalType.DATE)
    private Date teamUpdatedDate;
    @Column(name = "activate_flag")
    private Integer activateFlag;

    public EmTeam() {
    }

    public EmTeam(Integer teamId) {
        this.teamId = teamId;
    }

    public EmTeam(Integer teamId, Integer departmentId, String teamName, Integer projectId, Integer teamCreatedBy, Integer teamUpdatedBy, Date teamUpdatedDate) {
        this.teamId = teamId;
        this.departmentId = departmentId;
        this.teamName = teamName;
        this.projectId = projectId;
        this.teamCreatedBy = teamCreatedBy;
        this.teamUpdatedBy = teamUpdatedBy;
        this.teamUpdatedDate = teamUpdatedDate;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getTeamCreatedBy() {
        return teamCreatedBy;
    }

    public void setTeamCreatedBy(Integer teamCreatedBy) {
        this.teamCreatedBy = teamCreatedBy;
    }

    public Integer getTeamUpdatedBy() {
        return teamUpdatedBy;
    }

    public void setTeamUpdatedBy(Integer teamUpdatedBy) {
        this.teamUpdatedBy = teamUpdatedBy;
    }

    public Date getTeamCreatedDate() {
        return teamCreatedDate;
    }

    public void setTeamCreatedDate(Date teamCreatedDate) {
        this.teamCreatedDate = teamCreatedDate;
    }

    public Date getTeamUpdatedDate() {
        return teamUpdatedDate;
    }

    public void setTeamUpdatedDate(Date teamUpdatedDate) {
        this.teamUpdatedDate = teamUpdatedDate;
    }

    
    @Override
    public String toString() {
        return "com.gomap.performance.organisation.EmTeam[ teamId=" + teamId + " ]";
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
    
}
