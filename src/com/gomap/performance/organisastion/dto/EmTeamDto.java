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
    private Integer departmentId;
    private String teamName;
    private Integer projectId;
    private Integer teamCreatedBy;
    private Integer teamUpdatedBy;
    private Date teamCreatedDate;
    private Date teamUpdatedDate;
    private Integer activateFlag;

    public EmTeamDto() {
    }

    public EmTeamDto(Integer teamId) {
        this.teamId = teamId;
    }

    public EmTeamDto(Integer teamId, Integer departmentId, String teamName, Integer projectId, Integer teamCreatedBy, Integer teamUpdatedBy, Date teamUpdatedDate) {
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
