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
    private int departmentId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "team_name")
    private String teamName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "project_id")
    private int projectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "team_created_by")
    private int teamCreatedBy;
    @Basic(optional = false)
    @NotNull
    @Column(name = "team_updated_by")
    private int teamUpdatedBy;
    @Column(name = "team_created_date")
    @Temporal(TemporalType.DATE)
    private Date teamCreatedDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "team_updated_date")
    @Temporal(TemporalType.DATE)
    private Date teamUpdatedDate;

    public EmTeam() {
    }

    public EmTeam(Integer teamId) {
        this.teamId = teamId;
    }

    public EmTeam(Integer teamId, int departmentId, String teamName, int projectId, int teamCreatedBy, int teamUpdatedBy, Date teamUpdatedDate) {
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

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getTeamCreatedBy() {
        return teamCreatedBy;
    }

    public void setTeamCreatedBy(int teamCreatedBy) {
        this.teamCreatedBy = teamCreatedBy;
    }

    public int getTeamUpdatedBy() {
        return teamUpdatedBy;
    }

    public void setTeamUpdatedBy(int teamUpdatedBy) {
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
    public int hashCode() {
        int hash = 0;
        hash += (teamId != null ? teamId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmTeam)) {
            return false;
        }
        EmTeam other = (EmTeam) object;
        if ((this.teamId == null && other.teamId != null) || (this.teamId != null && !this.teamId.equals(other.teamId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gomap.performance.organisation.EmTeam[ teamId=" + teamId + " ]";
    }
    
}
