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
public class EmTeamMemberDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer teamMemberId;
    private Integer teamId;
    private Integer employeeId;
    private Date teamMemberCreatedDate;
    private Date teamMemberUpdatedDate;
    private Integer activateFlag;

    public EmTeamMemberDto() {
    }

    public EmTeamMemberDto(Integer teamMemberId) {
        this.teamMemberId = teamMemberId;
    }

    public EmTeamMemberDto(Integer teamMemberId, Integer teamId, Integer employeeId) {
        this.teamMemberId = teamMemberId;
        this.teamId = teamId;
        this.employeeId = employeeId;
    }

    public Integer getTeamMemberId() {
        return teamMemberId;
    }

    public void setTeamMemberId(Integer teamMemberId) {
        this.teamMemberId = teamMemberId;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Date getTeamMemberCreatedDate() {
        return teamMemberCreatedDate;
    }

    public void setTeamMemberCreatedDate(Date teamMemberCreatedDate) {
        this.teamMemberCreatedDate = teamMemberCreatedDate;
    }

    public Date getTeamMemberUpdatedDate() {
        return teamMemberUpdatedDate;
    }

    public void setTeamMemberUpdatedDate(Date teamMemberUpdatedDate) {
        this.teamMemberUpdatedDate = teamMemberUpdatedDate;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmTeamMemberDto [teamMemberId=" + teamMemberId + ", teamId=" + teamId + ", employeeId=" + employeeId
				+ ", teamMemberCreatedDate=" + teamMemberCreatedDate + ", teamMemberUpdatedDate="
				+ teamMemberUpdatedDate + "]";
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
