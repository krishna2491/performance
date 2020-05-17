/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gomap.performance.organisastion.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Palash
 */
public class EmTeamDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer teamId;
    private int departmentId;
    private String teamName;
    private int projectId;
    private int teamCreatedBy;
    private int teamUpdatedBy;
    private Date teamCreatedDate;
    private Date teamUpdatedDate;

    public EmTeamDto() {
    }

    public EmTeamDto(Integer teamId) {
        this.teamId = teamId;
    }

    public EmTeamDto(Integer teamId, int departmentId, String teamName, int projectId, int teamCreatedBy, int teamUpdatedBy, Date teamUpdatedDate) {
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
        if (!(object instanceof EmTeamDto)) {
            return false;
        }
        EmTeamDto other = (EmTeamDto) object;
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
